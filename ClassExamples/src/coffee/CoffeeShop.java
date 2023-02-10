package coffee;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoffeeShop {
	
	// this is also a member variable that is private to this class
	// the member variable can only be accessed from inside the class
	// all member variables are defined at the top of the file
	private List<MenuItem> menuItems = new ArrayList<>();
	
	// this will hold the items in the cart
	private List<MenuItem> cart = new ArrayList<>();
	
	private Scanner scan = new Scanner(System.in);
	
	public static final int PRINT_MENU = 1;
	public static final int ORDER_ITEM = 2;
	public static final int VIEW_CART = 3;
	public static final int EXIT = 4;

	
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
			System.out.println(item.getName() + ":\t" + formatPrice(item.getPrice()) + "\t" + item.getQuantityInStock());
		}
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

	}
	
	public int menuPrompt() {
		System.out.println("Welcome to Caite's Coffee Shop!\n");
		System.out.println(PRINT_MENU + ") Print Menu");
		System.out.println(ORDER_ITEM + ") Order Item");
		System.out.println(VIEW_CART + ") View Cart");
		System.out.println(EXIT + ") Exit Coffee Shop");
		System.out.print("\nMake selection: ");
		
		int selection = scan.nextInt();
		scan.nextLine();
		
		System.out.println();
		System.out.println("\nUser select menu number: " + selection);
		
		return selection;
	}
	
	public void orderItem() {
		printMenuItems();
		
		System.out.print("Enter item name: ");
		String itemName = scan.nextLine();
		//System.out.println(itemName);
		
		MenuItem selectedItem = findMenuItemByMenuName(itemName);
		if(selectedItem != null) {
			System.out.println(selectedItem.getName() + " added to your cart.\n");
			cart.add(selectedItem);
		} else {
			System.out.println(itemName + " is not a valid selection");
		}
		
	}
	// this fuction combines two activities - checking fi the itemName exists and 
	// returning the menuItem if the itemName does not exist
	// in this function the arg itemName represents the user input
	// this is a very common pattern in software engineering - everyday used
	// if the method returns null then the itemName was not found : false= null
	// if the method returns a MenuItem the itemName was found
	private MenuItem findMenuItemByMenuName(String itemName) {

		for(MenuItem menuItem : menuItems) {
			// if the incoming itemName string is not instantiated (null)
			// then it can never be equal to a menu item
			if(itemName == null) {
				return null;
			}
			
			// we want to trim any white space before or after the user input
			itemName = itemName.trim();
			
			// the menuItem.getName function returns a string 
			String name = menuItem.getName();
			
			// the string object contains a method called equalsIgnoreCase
			if (name.equalsIgnoreCase(itemName)) {
				return menuItem;
			} 
		}
		return null;
	}
	
	public void viewCart() {
		System.out.println(cart.size() + " item(s) in your cart\n");
		
		System.out.println("Item Name:" + "\tPrice:");
		System.out.println("----------" + "\t------");
		
		double totalPrice = 0;
		for(MenuItem item : cart) {
			System.out.println(item.getName() + ":\t" + formatPrice(item.getPrice()));
			totalPrice += item.getPrice();
		}
		System.out.println("----------------------");
		
		System.out.println("Total Price: " + formatPrice(totalPrice));
		System.out.println();
	}
	
	private String formatPrice(double price) {
		DecimalFormat df = new DecimalFormat("$###.00");
		String formattedPrice = df.format(price);
		return formattedPrice;

	}
}
