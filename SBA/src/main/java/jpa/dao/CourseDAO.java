package jpa.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import jpa.entitymodels.Course;

public class CourseDAO {
	public List<Course> getAllCourses() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		String hql = "FROM Course";
		
		TypedQuery<Course> query = session.createQuery(hql, Course.class);

		// When we know we are getting 0 or more records we use getREsultList
		List<Course> result = query.getResultList();

		session.close();

		return result;
	}

}
