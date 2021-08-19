package com.bridgelabz.birdsanctuary;

public abstract class Bird {
	public String color ;
	public String name;
	public String id;
	
	public void getSound() {
		System.out.println(name + " making sound.");
	}
	
	@Override
	public String toString() {
		return "Bird [color = " + color + ", name = " + name + ", id = " + id + "]";
	}
}
