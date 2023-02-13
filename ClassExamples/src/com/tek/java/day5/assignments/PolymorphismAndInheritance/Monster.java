package com.tek.java.day5.assignments.PolymorphismAndInheritance;

public class Monster {
	String name;
	
	public Monster(String name) {
		this.name = name;
	}
	
	public boolean attack() {
		System.out.println("!^_&^$@+%$* I don't know how to attack!");
		return true;
	}
}
