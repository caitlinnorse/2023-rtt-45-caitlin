package com.tek.java.day5.assignments.PolymorphismAndInheritance;

public class FireMonster extends Monster{
	public FireMonster(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}


	String name;
	
	
	@Override
	public boolean attack() {
		System.out.println("Attack with Fire!");
		return true;
	}

}
