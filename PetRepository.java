package com_bridgeLab_pet_shop;

import java.util.ArrayList;
import java.util.List;

public class PetRepository {
	private List petList = new ArrayList();
	
	public List getPetList() {
		return petList;
	}
	
	void add(Pet pet) {
		petList.add(pet);
	}
}
