package hibernate;

import java.util.Date;

public class OneToManyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerDAO customerDao = new CustomerDAO();
		EmployeeDAO employeeDao = new EmployeeDAO();
		PaymentDAO paymentDao = new PaymentDAO();
		OrderDAO orderDao = new OrderDAO();
		OrderDetailDAO orderDetailDao = new OrderDetailDAO();
		ProductDAO productDao = new ProductDAO();


		//Employee e = employeeDao.findById(1166);
		//System.out.println(e);
		
//		for (Customer customer : e.getCustomers()) {
//			System.out.println(customer);
//		}
//		
//		Customer customer = new Customer();
//		customer.setCustomerName("Hibernate Customer");
//		customer.setContactFirstname("First Name");
//		customer.setContactLastname("Last Name");
//		customer.setPhone("555-555-1212");
//		customer.setAddressLine1("Address Line 1");
//		customer.setCity("Philadelphia");
//		customer.setState("PA");
//		customer.setCountry("USA");
//		
//		customer.setEmployee(e);
//		
//		
//		e.getCustomers().add(customer);
////		employeeDao.update(e);
		System.out.println(productDao.findById(2));
		
		Customer c = customerDao.findById(112);

//		
//		Order order = new Order();
//		order.setOrderDate(new Date());
//		order.setRequiredDate(new Date());
//		order.setStatus("Hello");
//		order.setCustomer(c);
//		
//		orderDao.insert(order);
//		c.getOrders().add(order);
//		customerDao.update(c);
		
		
//		for(Order o : c.getOrders()) {
//			System.out.println(o);
//		}
		
		Order order1 = orderDao.findById(10100);
		
		Product product = new Product();
		product.setProductCode("Hello");
		product.setProductName("Memecar");
		product.setProductLineId(2);
		product.setProductScale("Big");
		product.setProductVendor("Pepsi");
		product.setProductDescription("It good");
		product.setQuantityInStock(33);
		product.setBuyPrice(69.00);
		product.setMsrp(33.33);
		
		productDao.insert(product);
		
		
//		OrderDetail od1 = new OrderDetail();
//		od1.setOrderLineNumber(3);
//		od1.setPriceEach(42.00);
		
//		for(OrderDetail od : order1.getOrderDetails()) {
//			System.out.println(od);
//		}
		
//		Payment p = new Payment();
//		p.setAmount(50000.55);
//		p.setPaymentDate(new Date());
//		p.setCustomer(c);
//		p.setCheckNumber("123455");
//		
//		paymentDao.insert(p);
//		
//		c.getPayments().add(p);
//		customerDao.update(c);
//		
//		for(Payment payment : c.getPayments()) {
//			System.out.println(payment);
//		}

	}

}
