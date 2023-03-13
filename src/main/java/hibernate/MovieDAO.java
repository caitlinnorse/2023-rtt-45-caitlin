package hibernate;

import javax.management.Query;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MovieDAO {
	public void insert(Movie movie) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.save(movie);
		session.getTransaction().commit();
		session.close();
	}

	public void update(Movie movie) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.merge(movie);
		session.getTransaction().commit();
		session.close();
	}

	public void delete(Movie movie) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.delete(movie);
		session.getTransaction().commit();
		session.close();
	}


	public Movie findById(Integer id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		// this is HQL which is hibernate query language
		// also referred to as JPA
		String hql = "FROM Movie m where m.id = :idParam";

		TypedQuery<Movie> query = session.createQuery(hql, Movie.class);
		query.setParameter("idParam", id);
		Movie result = query.getSingleResult();

		session.close();

		return result;
	}

	public void deleteById(Integer id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		// this is HQL which is hibernate query language
		// also referred to as JPA
		String hql = "FROM Movie m where m.id = :idParam";

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
