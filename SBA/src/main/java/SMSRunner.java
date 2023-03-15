import java.util.List;
import java.util.Scanner;

import jpa.dao.CourseDAO;
import jpa.dao.StudentDAO;
import jpa.entitymodels.Course;
import jpa.entitymodels.Student;

public class SMSRunner {
	StudentDAO studentDao = new StudentDAO();
	CourseDAO courseDao = new CourseDAO();
	
	Student s = new Student();
	Course c = new Course();
	
	public static void main(String[] args) {
		
		SMSRunner sms = new SMSRunner();
		
		System.out.println("Are you a(n)");
		System.out.println("1. Student");
		System.out.println("2. quit");
		System.out.println("Please, enter 1 or 2.");
		
		Scanner scan = new Scanner(System.in);
		int answer = scan.nextInt();
		
		if(answer != 1) {
			System.exit(answer);
			scan.close();
		}
		
		System.out.println("Enter Your Email:");
		Scanner scan2 = new Scanner(System.in);
		
		String username = scan2.nextLine();
		
		System.out.println(sms.s.getSEmail());
		
		System.out.println("Enter your password");
		
		String password = scan2.nextLine();
		
		List<Student> listOfStudents = sms.studentDao.validateStudent(username, password);
		
		// Couldn't find the student, so exit.
		if (listOfStudents == null) {
			System.out.println("Student not found!");
			System.exit(0);
			scan2.close();
		}
		
		// else, found the student!
		System.out.println("Success " + listOfStudents.toString());
		
	}
}
