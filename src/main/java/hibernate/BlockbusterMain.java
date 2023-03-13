package hibernate;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;


public class BlockbusterMain {
	
	MovieDAO movieDao = new MovieDAO();
	UserDAO userDao = new UserDAO();
	MovieRentalDAO movieRentalDao = new MovieRentalDAO();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlockbusterMain bm = new BlockbusterMain();
		

		
		//Movie m = new Movie();
		User u = new User();
		MovieRental mr = new MovieRental();
		Movie movie1 = bm.movieDao.findById(2);
		User user1 = bm.userDao.findById(2);
		
		//bm.changePassword(2, "Poshword");
		
		//bm.checkout(movie1, user1);
		bm.checkin(movie1, user1);
		
		bm.displayMovies();
	}
	
	public void changePassword(int userId, String newPass) {
//		UserDAO userDao = new UserDAO();
		User user = userDao.findById(userId);
		
		user.setPassword(newPass);
		userDao.update(user);
		
	}
	
	public void checkout(Movie movie, User user) {
//		MovieDAO movieDao = new MovieDAO();
//		UserDAO userDao = new UserDAO();
//		MovieRentalDAO movieRentalDao = new MovieRentalDAO();
		
		MovieRental mr = new MovieRental();
		
		mr.setUser(user);
		mr.setMovie(movie);
		mr.setCheckoutDate(new Date());
		
		movieRentalDao.insert(mr);
		
		user.getMovieRentals().add(mr);
		movie.getMovieRentals().add(mr);
		
		userDao.update(user);
		movieDao.update(movie);
		
	}
	
	public void checkin(Movie movie, User user) {
		MovieRental mr = new MovieRental();
		
		mr = movieRentalDao.findByMovieUser(movie.getId(), user.getId());
		
		mr.setCheckinDate(new Date());
		movieRentalDao.update(mr);
		
	}
	
	public void displayMovies() {
		List<MovieRental> rentals = movieRentalDao.selectAllRentals();
		

		for(MovieRental mr : rentals) {
			if(mr.getCheckinDate() == null) {
				User u = userDao.findById(mr.getUserId());
				Movie m = movieDao.findById(mr.getMovieId());
				
				System.out.println(u.getFirstName() + " " + u.getLastName() + " is renting out " + m.getName());
			}
		}
	}
	
	

}
