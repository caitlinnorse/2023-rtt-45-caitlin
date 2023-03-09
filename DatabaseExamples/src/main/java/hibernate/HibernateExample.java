package hibernate;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateExample {

	public static void main(String[] args) {
		CustomerDAO customerDao = new CustomerDAO();
		
		// NOTE - we are not going to set the id column because hibernate / MySQL will
		// automatically generate it for us
		Customer customer = new Customer();
		customer.setCustomerName("Hibernate Customer");
		customer.setContactFirstname("First Name");
		customer.setContactLastname("Last Name");
		customer.setPhone("555-555-1212");
		customer.setAddressLine1("Address Line 1");
		customer.setCity("Philadelphia");
		customer.setState("PA");
		customer.setCountry("USA");
		
		
		customerDao.insert(customer);

//		Customer first = customerDao.findById(497);
//		System.out.println(first.toString());

//		List<Customer> firstNames = he.findByContactFirstName("Leslie");
//		for(Customer c : firstNames) {
//			System.out.println(c);
//		}
		
		Customer first = customerDao.findById(103);
		System.out.println(first.toString());
		
		first.setAddressLine2("This is an update");
		first.setPostalCode("18966");
		first.setCreditLimit(100000.35);
		
		customerDao.update(first);
		//customerDao.delete(first);

	}

	
}
