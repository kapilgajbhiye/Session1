package com_bridgeLab_pet_shop;

public class Pet {
	
	String name;
	String id;
	String color;
	int price;
	
	void eat() {
		System.out.println(getClass().getSimpleName() + "pet can eat");
	}
	
	void fly() {
		System.out.println(getClass().getSimpleName() + "pet can fly");
	}
	
	void swim() {
		System.out.println(getClass().getSimpleName() + "pet can swim");
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [name=" + name + ", id=" + id + ", color=" + color + ", price=" + price + "]";
	}
	
	
	
}
