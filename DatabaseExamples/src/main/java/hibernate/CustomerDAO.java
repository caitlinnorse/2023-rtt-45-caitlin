package hibernate;

import java.util.List;

import javax.management.Query;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CustomerDAO {
	
	public void insert(Customer customer) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.save(customer);
		session.getTransaction().commit();
		session.close();
	}
	
	public void update(Customer customer) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.merge(customer);
		session.getTransaction().commit();
		session.close();
	}
	
	public void delete(Customer customer) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.delete(customer);
		session.getTransaction().commit();
		session.close();
	}

	public List<Customer> findByContactFirstName(String name) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		// this is HQL which is hibernate query language
		// also referred to as JPA
		String hql = "FROM Customer c where c.contactFirstname = :firstName";

		TypedQuery<Customer> query = session.createQuery(hql, Customer.class);
		query.setParameter("firstName", name);

		// When we know we are getting 0 or more records we use getREsultList
		List<Customer> result = query.getResultList();

		session.close();

		return result;
	}

	public Customer findById(Integer id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		// this is HQL which is hibernate query language
		// also referred to as JPA
		String hql = "FROM Customer c where c.id = :idParam";

		TypedQuery<Customer> query = session.createQuery(hql, Customer.class);
		query.setParameter("idParam", id);
		Customer result = query.getSingleResult();

		session.close();

		return result;
	}
	
	public void deleteById(Integer id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		// this is HQL which is hibernate query language
		// also referred to as JPA
		String hql = "FROM Customer c where c.id = :idParam";

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
