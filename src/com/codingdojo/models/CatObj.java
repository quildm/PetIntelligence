package com.codingdojo.models;

public class CatObj extends Animal implements pet {

	public CatObj(String name, String breed, Double weight) {
		this.name = name;
		this.breed = breed;
		this.weight = weight;
	}

	@Override
	public String showAffection() {
		
		return String.format("Your %s cat, %s, looked at you. Then clawed you.", breed, name);
	}

}
