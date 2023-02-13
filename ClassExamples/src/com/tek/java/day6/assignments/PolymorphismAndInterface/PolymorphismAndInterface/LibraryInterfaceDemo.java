package com.tek.java.day6.assignments.PolymorphismAndInterface.PolymorphismAndInterface;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Test case 1
		KidUser k = new KidUser();
		k.setAge(10);
		
		k.registerAccount();
		
		k.setBookType("Kids");
		k.requestBook();
		
		System.out.println();

		KidUser k1 = new KidUser();
		k1.setAge(18);
		
		k1.registerAccount();
				
		k1.setBookType("Fiction");
		k1.requestBook();
		
		System.out.println("--------------------------------------------------------------");
		
		AdultUser a = new AdultUser();
		a.setAge(5);
		a.registerAccount();
		
		a.setBookType("Kids");
		a.requestBook();
		
		System.out.println();
		
		AdultUser a1 = new AdultUser();
		a1.setAge(23);
		a1.registerAccount();
		
		a1.setBookType("Fiction");
		a1.requestBook();
		
		
	}

}
