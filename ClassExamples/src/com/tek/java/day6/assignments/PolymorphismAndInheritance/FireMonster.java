package com.tek.java.day6.assignments.PolymorphismAndInheritance;

public class FireMonster extends Monster{
	public FireMonster(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	String name;
	
	
	@Override
	public String attack() {
		return "Attack with Fire!";
	}

}
