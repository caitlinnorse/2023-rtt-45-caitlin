package com.tek.java.day5.assignments.PolymorphismAndInheritance;

public class StoneMonster extends Monster {
	public StoneMonster(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean attack() {
		System.out.println("Attack with Stone!");
		return true;
	}


}
