package coffee;

public class CoffeeShopMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CoffeeShop cs = new CoffeeShop();
		cs.initialize();

		while (true) {
			int select = cs.menuPrompt();

			if (select == CoffeeShop.PRINT_MENU) {
				System.out.println("Item Name:" + "\tPrice:" + "  Quantity:");
				System.out.println("----------" + "\t------" + "\t---------");

				cs.printMenuItems();
			} else if (select == CoffeeShop.ORDER_ITEM) {
				cs.orderItem();
				System.out.println();
				
			} else if (select == CoffeeShop.VIEW_CART) {

				System.out.println("\nHere is your cart:");
				System.out.println();

				cs.viewCart();
				
			} else if (select == CoffeeShop.EXIT) {

				System.out.println("\nThank you, please come again.");
				// tell the JVM to exit with status code of success
				System.exit(0);
			}
		}

	}

}
