package jpa.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import jpa.entitymodels.Course;
import jpa.entitymodels.Student;

public class StudentCourseDAO {
	public void registerStudentToCourse(Student student) {
			SessionFactory factory = new Configuration().configure().buildSessionFactory();
			Session session = factory.openSession();
			session.getTransaction().begin();
			session.save(student);
			session.getTransaction().commit();
			session.close();
		}
	
	
	public List<Course> getStudentCourses(int studentId) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		// this is HQL which is hibernate query language
		// also referred to as JPA
		String hql = "SELECT c.cId, c.cName, c.cInstructorName FROM Course c INNER JOIN Student_Course sc ON c.cId = sc.course_id INNER JOIN Student s "
				+ "ON s.sId = sc.student_id WHERE s.sId = :studentId;";

		TypedQuery<Course> query = session.createQuery(hql, Course.class);
		query.setParameter("sId", studentId);

		// When we know we are getting 0 or more records we use getREsultList
		List<Course> result = query.getResultList();

		session.close();

		return result;
	}
	

}
