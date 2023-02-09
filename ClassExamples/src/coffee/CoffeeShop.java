package coffee;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class CoffeeShop {
	
	// this is also a member variable that is private to this class
	// the member variable can only be accessed from inside the class
	private List<MenuItem> menuItems = new ArrayList<>();
	
	public void initialize() {
		// all 4 of these menu items are doing the same thing
		// just with different ways of adding them
		MenuItem item1 = new MenuItem();
		item1.setName("Small Coffee");
		item1.setPrice(4.30);
		item1.setQuantityInStock(18);
		
		menuItems.add(item1);
		
		MenuItem item2 = new MenuItem();
		item2.setName("Large Coffee");
		item2.setPrice(5.99);
		item2.setQuantityInStock(20);
		
		menuItems.add(item2);
		
		// this creates a new menu item using the constructor
		MenuItem item3 = new MenuItem("Small Cookie", 9.99, 30);
		menuItems.add(item3);
		
		// same as above but we are doing this in one line of code
		menuItems.add(new MenuItem("Egg Sandwich", 14.30, 10));
		
		
	}
	public void printMenuItems() {
		for (MenuItem item : menuItems) {
			DecimalFormat df = new DecimalFormat("$###.00");
			System.out.println(item.getName() + ":\t" + df.format(item.getPrice()) + "\t" + item.getQuantityInStock());
		}
	}
}
