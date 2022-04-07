package com_bridgeLab_pet_shop;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to my pet shop.");
		PetRepository petRepository = new PetRepository();
		
		Dog dog = new Dog();
		dog.id = "D001";
		dog.price = 10000;
		
		Cat cat = new Cat();
		cat.id = "C002";
		cat.price = 1000;
		
		Duck duck = new Duck();
		duck.id = "D003";
		duck.price = 500;
		
		Parrot parrot = new Parrot();
		parrot.id = "P004";
		parrot.price = 1000;
		
		LoveBird loveBird = new LoveBird();
		loveBird.id = "L005";
		loveBird.price = 2000;
		
		
		petRepository.add(dog);
		petRepository.add(cat);
		petRepository.add(duck);
		petRepository.add(parrot);
		petRepository.add(loveBird);
		
		UserInterface userInterface = new UserInterface();
		List petList = petRepository.getPetList();
		userInterface.print(petList);
		
	}

}
