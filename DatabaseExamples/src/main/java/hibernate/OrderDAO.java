package hibernate;

import javax.management.Query;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OrderDAO {

	public void insert(Order order) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.save(order);
		session.getTransaction().commit();
		session.close();
	}

	public void update(Order order) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.merge(order);
		session.getTransaction().commit();
		session.close();
	}

	public void delete(Order order) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.delete(order);
		session.getTransaction().commit();
		session.close();
	}


	public Order findById(Integer id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		// this is HQL which is hibernate query language
		// also referred to as JPA
		String hql = "FROM Order o where o.id = :idParam";

		TypedQuery<Order> query = session.createQuery(hql, Order.class);
		query.setParameter("idParam", id);
		Order result = query.getSingleResult();

		session.close();

		return result;
	}

	public void deleteById(Integer id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		// this is HQL which is hibernate query language
		// also referred to as JPA
		String hql = "FROM Order o where o.id = :idParam";

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
