import java.util.List;
import java.util.Scanner;

import jpa.dao.CourseDAO;
import jpa.dao.StudentCourseDAO;
import jpa.dao.StudentDAO;
import jpa.entitymodels.Course;
import jpa.entitymodels.Student;
import jpa.entitymodels.StudentCourse;

public class SMSRunner {
	StudentDAO studentDao = new StudentDAO();
	CourseDAO courseDao = new CourseDAO();
	StudentCourseDAO studentCourseDao = new StudentCourseDAO();

	Student s = new Student();
	Course c = new Course();
	StudentCourse m = new StudentCourse();

	public static void main(String[] args) {

		SMSRunner sms = new SMSRunner();

// TEST AREA *******************************************************************************
		// Creating and initializing varibales for new course to be added to StudentCourseTable
		StudentCourse sc1 = new StudentCourse();
		
		sc1.setStudentId(2);
		sc1.setCourseId(6);
		System.out.println(sc1);

		studentCourseDao.registerStudentToCourse(sc1);
		System.exit(99);
//*******************************************************************************************
		
		
		System.out.println("Are you a(n)");
		System.out.println("1. Student");
		System.out.println("2. quit");
		System.out.println("Please, enter 1 or 2.");

		Scanner scan = new Scanner(System.in);
		int answer = scan.nextInt();

		// If the user chose to quit the program, exit the program
		if (answer != 1) {
			System.exit(answer);
			scan.close();
		}

		// prompting the user to enter their email
		System.out.println("Enter Your Email:");
		Scanner scan2 = new Scanner(System.in);
		String username = scan2.nextLine();

		// prompting user to enter password
		System.out.println("Enter your password");
		String password = scan2.nextLine();

		// Checks to see if the email and password match a record in the Student table
		List<Student> listOfStudents = sms.studentDao.validateStudent(username, password);

		// Couldn't find the student, so exit.
		if (listOfStudents.size() == 0) {
			System.out.println("Student not found!");
			System.exit(0);
			scan2.close();
		}

		// else, found the student!
		System.out.println("\nMy Classes:");

		// Get the student record for the verified student
		Student stu = sms.studentDao.getStudentByEmail(username);

		if (stu == null) {
			System.exit(0);
		}

		int studentId = stu.getId();

		// Getting all the courses for a student with entered ID
		List<Course> courseList = sms.studentCourseDao.getStudentCourses(studentId);

		// Querying the courses the student has
		System.out.println("# \tCourse \tInstructor Name");
		for (Course course : courseList) {
			System.out.println(course.getCId() + "\t" + course.getCName() + "\t" + course.getCInstructorName());
		}

		System.out.println("\n1. Register to Class");
		System.out.println("2. Logout");

		Scanner scan3 = new Scanner(System.in);
		int option = scan3.nextInt();

		// If the user enters 2, the want to quit the program
		if (option == 2) {
			System.exit(0);
		}

		System.out.println();
		System.out.println("ID\tCOURSE NAME\tINSTRUCTOR NAME");

		// Querying he course table for all courses
		courseList = sms.courseDao.getAllCourses();
		for (Course course : courseList) {
			System.out.println(course.getCId() + "\t" + course.getCName() + "\t" + course.getCInstructorName());
		}

		System.out.println("\nWhich Course?");
		option = scan3.nextInt();

		// Initialize Course record to not found
		Course newCourse = null;

		// Go through the list of all courses to see if the id entered matches the id of
		// a course in the list
		for (Course course : courseList) {
			if (option == course.getCId()) {
				newCourse = course;
				break;
			}
		}
		// If the course is still null, course was not found
		if (newCourse == null) {
			System.out.println("Course does not exist.");
			System.exit(0);
		}
		
		// Creating and initializing varibales for new course to be added to StudentCourseTable
		StudentCourse sc = new StudentCourse();
		
		sc.setStudentId(studentId);
		sc.setCourseId(newCourse.getCId());
		System.out.println(sc);

		sms.studentCourseDao.registerStudentToCourse(sc);

		// Getting all the courses for a student with entered ID
		courseList = sms.studentCourseDao.getStudentCourses(studentId);

		// Querying the courses the student has
		System.out.println("# \tCourse \tInstructor Name");
		for (Course course : courseList) {
			System.out.println(course.getCId() + "\t" + course.getCName() + "\t" + course.getCInstructorName());
		}
		
		System.out.println("You have been signed out.");
		System.exit(0);

	}
}
