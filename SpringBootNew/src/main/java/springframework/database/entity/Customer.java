package springframework.database.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Table(name = "customers")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="customer_name")
	private String customerName;
	
	@Column(name="contact_lastname")
	private String contactLastname;
	
	@Column(name="contact_firstname")
	private String contactFirstname;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="address_line1")
	private String addressLine1;
	
	@Column(name="address_line2")
	private String addressLine2;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name="country")
	private String country;
	
	@Column(name="postal_code")
	private String postalCode;
	
	// this essentially makes this a read only variabe in this entity object
	// we add the insertable = false and updatable = false
	// because we are using a @ManyToOne mapping that is on this same column
	// the other option is to simply dekete these 2 lines
	@Column(name="sales_rep_employee_id", insertable=false, updatable=false)
	private Integer salesRepEmployeeNumber;
	
	@Column(name="credit_limit", columnDefinition="decimal", precision=10, scale=2)
	private Double creditLimit;
	
	
	// salesRepEmployee allows for null values and since this is a foreign key we need to set
	// optional = true and nullable = true ti tell hibernate that null values are okay
	// To Employee
	@ToString.Exclude
	 @ManyToOne(fetch = FetchType.EAGER, optional = true, cascade = CascadeType.ALL)
	 @JoinColumn(name = "sales_rep_employee_id", nullable = true)
	    private Employee employee;
	 
	// To Payments
	 @ToString.Exclude
	 @LazyCollection(LazyCollectionOption.FALSE)
	 @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	    private List<Payment> payments = new ArrayList<Payment>();
	 
	 // To Order
//	 @ToString.Exclude
//	 @LazyCollection(LazyCollectionOption.FALSE)
//	 @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
//	    private List<Order> orders = new ArrayList<Order>();


	
	
	

}
