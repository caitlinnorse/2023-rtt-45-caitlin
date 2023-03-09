package hibernate;

import java.util.List;

import javax.management.Query;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployeeDAO {

	public void insert(Employee employee) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.save(employee);
		session.getTransaction().commit();
		session.close();
	}

	public void update(Employee employee) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.merge(employee);
		session.getTransaction().commit();
		session.close();
	}

	public void delete(Employee employee) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.delete(employee);
		session.getTransaction().commit();
		session.close();
	}

	public List<Employee> findByContactFirstName(String name) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		// this is HQL which is hibernate query language
		// also referred to as JPA
		String hql = "FROM Employee e where e.firstname = :firstName";

		TypedQuery<Employee> query = session.createQuery(hql, Employee.class);
		query.setParameter("firstName", name);

		// When we know we are getting 0 or more records we use getREsultList
		List<Employee> result = query.getResultList();

		session.close();

		return result;
	}

	public Employee findById(Integer id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		// this is HQL which is hibernate query language
		// also referred to as JPA
		String hql = "FROM Employee e where e.id = :idParam";

		TypedQuery<Employee> query = session.createQuery(hql, Employee.class);
		query.setParameter("idParam", id);
		Employee result = query.getSingleResult();

		session.close();

		return result;
	}

	public void deleteById(Integer id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		// this is HQL which is hibernate query language
		// also referred to as JPA
		String hql = "FROM Employee e where e.id = :idParam";

		Query query = (Query) session.createQuery(hql);
		((javax.persistence.Query) query).setParameter("idParam", id);

		// when we are doing an update / delete/ insert to the database with HQL
		// we use query.executeUpdate();
		session.getTransaction().begin();
		((javax.persistence.Query) query).executeUpdate();
		session.getTransaction().commit();

		session.close();

	}

}
