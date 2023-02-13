package com.tek.java.day6.assignments.PolymorphismAndInterface.PolymorphismAndInterface;

public class AdultUser implements LibraryUser{
	
	int age;
	String bookType;
	

	public void setAge(int age) {
		this.age = age;
	}

	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	public void registerAccount() {
		if (age >= 12) {
			System.out.println("You have sucessfully registered under an Adult Account");
		} else {
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");
		}
		
	}
	
	public void requestBook() {
		if(bookType.equals("Fiction")) {
			System.out.println("Book Issued successfully, please return the book within 7 days");
		} else {
			System.out.println("Oops, you are allowed to take only adult Fiction books");
		}
	}

}
