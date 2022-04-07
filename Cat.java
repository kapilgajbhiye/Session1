package com_bridgeLab_pet_shop;

public class Cat extends Pet {
	
	Cat(){
		name = "Sunny";
		color = "Black";
	}
	
	@Override
	void fly() {
		System.out.println();
	}
	
	@Override
	void swim() {
		System.out.println();
	}
	
}
