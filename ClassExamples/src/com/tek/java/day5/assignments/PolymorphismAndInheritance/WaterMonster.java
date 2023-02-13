package com.tek.java.day5.assignments.PolymorphismAndInheritance;

public class WaterMonster extends Monster{
	public WaterMonster(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String attack() {
		return "Attack with Water!";
	}

}
