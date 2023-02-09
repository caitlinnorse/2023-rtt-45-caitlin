package coffee;

public class MenuItem {
	
	// this class is a POJO
	// this class can also be referred to as a bean or entity
	
	private String name;
	private double price;
	private int quantityInStock;
	
	// the constructor does not have a return type
	// by default all objects have an empty argument constructor that we do not have to code
	public MenuItem() {
		
	}
	
	// this constructor takes in two parameters that will populate member variables
	// this constructor needs to be able to tell the difference between the argument passed in and the 
	// the member variable of the class itself by using 'this'
	// it specifies the variable of the class
	// 'this.' refers to the instance of this class that is in memory
	public MenuItem(String name, double price, int quantityInStock) {
		this.name = name;
		this.price = price;
		this.quantityInStock = quantityInStock;
	}

	
	// these private variables are called member variables
	// because they are defined at the class level meaning
	// they are available to the entire class not just the code block they are defined in 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantityInStock() {
		return quantityInStock;
	}

	public void setQuantityInStock(int quantityInStock) {
		this.quantityInStock = quantityInStock;
	}
	

}
