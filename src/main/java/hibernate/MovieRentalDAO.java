package hibernate;

import java.util.List;

import javax.management.Query;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MovieRentalDAO {
	public void insert(MovieRental movieRental) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.save(movieRental);
		session.getTransaction().commit();
		session.close();
	}

	public void update(MovieRental movieRental) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.merge(movieRental);
		session.getTransaction().commit();
		session.close();
	}

	public void delete(MovieRental movieRental) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.delete(movieRental);
		session.getTransaction().commit();
		session.close();
	}


	public MovieRental findById(Integer id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		// this is HQL which is hibernate query language
		// also referred to as JPA
		String hql = "FROM MovieRental mr where mr.id = :idParam";

		TypedQuery<MovieRental> query = session.createQuery(hql, MovieRental.class);
		query.setParameter("idParam", id);
		MovieRental result = query.getSingleResult();

		session.close();

		return result;
	}
	
	public MovieRental findByMovieUser(Integer movieId, Integer userId) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		// this is HQL which is hibernate query language
		// also referred to as JPA
		String hql = "FROM MovieRental mr where mr.movieId = :idParam1 AND mr.userId = :idParam2";
		TypedQuery<MovieRental> query = session.createQuery(hql, MovieRental.class);
		query.setParameter("idParam1", movieId);
		query.setParameter("idParam2", userId);
		MovieRental result = query.getSingleResult();

		session.close();

		return result;
	}

	public void deleteById(Integer id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		// this is HQL which is hibernate query language
		// also referred to as JPA
		String hql = "FROM MovieRental mr where mr.id = :idParam";

		Query query = (Query) session.createQuery(hql);
		((javax.persistence.Query) query).setParameter("idParam", id);

		// when we are doing an update / delete/ insert to the database with HQL
		// we use query.executeUpdate();
		session.getTransaction().begin();
		((javax.persistence.Query) query).executeUpdate();
		session.getTransaction().commit();

		session.close();
	}
	
	public List<MovieRental> selectAllRentals() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		// this is HQL which is hibernate query language
		// also referred to as JPA
		String hql = "FROM MovieRental";

		TypedQuery<MovieRental> query = session.createQuery(hql, MovieRental.class);

		// When we know we are getting 0 or more records we use getREsultList
		List<MovieRental> result = query.getResultList();

		session.close();

		return result;

		
	}
}
