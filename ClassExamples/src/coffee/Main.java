package coffee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CoffeeShop cs = new CoffeeShop();
		cs.initialize();
		
		System.out.println("Item Name:" + "\tPrice:" + "  Quantity:");
		System.out.println("----------" + "\t------" + "\t---------");

		cs.printMenuItems();
	}

}
