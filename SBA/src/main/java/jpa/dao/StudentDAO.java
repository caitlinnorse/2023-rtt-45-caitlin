package jpa.dao;

import java.util.List;

import javax.management.Query;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import jpa.entitymodels.Student;

public class StudentDAO {
		
		public List<Student> getAllStudents() {
			SessionFactory factory = new Configuration().configure().buildSessionFactory();
			Session session = factory.openSession();
			
			String hql = "FROM Student";
			
			TypedQuery<Student> query = session.createQuery(hql, Student.class);

			// When we know we are getting 0 or more records we use getREsultList
			List<Student> result = query.getResultList();

			session.close();

			return result;
		}

		public List<Student> getStudentByEmail(String email) {
			SessionFactory factory = new Configuration().configure().buildSessionFactory();
			Session session = factory.openSession();

			// this is HQL which is hibernate query language
			// also referred to as JPA
			String hql = "FROM Student s where s.email = :sEmail";

			TypedQuery<Student> query = session.createQuery(hql, Student.class);
			query.setParameter("sEmail", email);

			// When we know we are getting 0 or more records we use getREsultList
			List<Student> result = query.getResultList();

			session.close();

			return result;
		}
		

		public List<Student> validateStudent(String email, String password) {
			SessionFactory factory = new Configuration().configure().buildSessionFactory();
			Session session = factory.openSession();

			// this is HQL which is hibernate query language
			// also referred to as JPA
			String hql = "FROM Student s where s.sEmail = :email AND s.sPass = :password";

			TypedQuery<Student> query = session.createQuery(hql, Student.class);
			query.setParameter("email", email).setParameter("password", password);

			// When we know we are getting 0 or more records we use getREsultList
			List<Student> result = query.getResultList();

			session.close();

			return result;
		}





	

}
