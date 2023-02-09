package coffee;

import java.util.ArrayList;
import java.util.List;

public class CoffeeShop {
	
	// this is also a member variable that is private to this class
	private List<MenuItem> menuItems = new ArrayList<>();
	
	public void initialize() {
		MenuItem item1 = new MenuItem();
		item1.setName("Small Coffee");
		item1.setPrice(4.30);
		
		menuItems.add(item1);
		
		MenuItem item2 = new MenuItem();
		item2.setName("Large Coffee");
		item2.setPrice(5.99);
		
		menuItems.add(item2);
	}
	
	public void printMenuItems() {
		for (MenuItem item : menuItems) {
			System.out.println(item.getName() + ":\t" + item.getPrice());
		}
	}
}
