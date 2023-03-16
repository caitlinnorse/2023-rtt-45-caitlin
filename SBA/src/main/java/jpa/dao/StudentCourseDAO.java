package jpa.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import jpa.entitymodels.Course;
import jpa.entitymodels.StudentCourse;

public class StudentCourseDAO {
	public void registerStudentToCourse(StudentCourse studentCourse) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.save(studentCourse);
		session.getTransaction().commit();
		session.close();
	}
	
	
	public List<Course> getStudentCourses(int studentId) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		// this is HQL which is hibernate query language
		// also referred to as JPA
		//String hql = "FROM Course c INNER JOIN StudentCourse sc ON c.cId = sc.courseId INNER JOIN Student s "
		//		+ "ON s.id = sc.studentId WHERE s.id = :studentId";

		String hql = "SELECT c FROM Course c " +
    					"INNER JOIN c.studentCourses sc " +
    					"WHERE sc.studentId = :studentId";


		 
//
//		String hql = "FROM Course c INNER JOIN StudentCourse sc ON c.cId = sc.courseId INNER JOIN Student s "
//				+ "ON s.id = sc.studentId WHERE s.id = :studentId";
		TypedQuery<Course> query = session.createQuery(hql, Course.class);
		query.setParameter("studentId", studentId);

		// When we know we are getting 0 or more records we use getREsultList
		List<Course> result = query.getResultList();

		session.close();

		return result;
	}
	

}
