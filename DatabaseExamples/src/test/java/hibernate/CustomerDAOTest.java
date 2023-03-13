package hibernate;

import org.hibernate.annotations.Parameter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CustomerDAOTest {
	private static CustomerDAO customerDao;
	
	@BeforeAll
	public static void setUp() {
		customerDao = new CustomerDAO();
	}
	
	@Test
	public void findByIdTest() {
		CustomerDAO customerDao = new CustomerDAO();
		
		// given
		Customer expected = new Customer();
		expected.setCustomerName("Atelier graphique");
		expected.setContactLastname("Schmitt");
		expected.setContactFirstname("Carine");
		
		// when
		Customer actual = customerDao.findById(103);
		
		// then
		Assertions.assertEquals(expected.getCustomerName(), actual.getCustomerName());
		Assertions.assertEquals(expected.getContactFirstname(), actual.getContactFirstname());
		Assertions.assertEquals(expected.getContactLastname(), actual.getContactLastname());

	}
	@ParameterizedTest
	@CsvSource({"103,Atelier graphique,Schmitt,Carine",
		"112,Signal Gift Stores,King,Jean"})
	@Test
	public void findByParameterizedTest() {
		CustomerDAO customerDao = new CustomerDAO();
		
		// given
		Customer expected = new Customer();
		expected.setCustomerName("Atelier graphique");
		expected.setContactLastname("Schmitt");
		expected.setContactFirstname("Carine");
		
		// when
		Customer actual = customerDao.findById(103);
		
		// then
		Assertions.assertEquals(expected.getCustomerName(), actual.getCustomerName());
		Assertions.assertEquals(expected.getContactFirstname(), actual.getContactFirstname());
		Assertions.assertEquals(expected.getContactLastname(), actual.getContactLastname());

	}

}
