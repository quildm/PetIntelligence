package com.codingdojo.models;

public class DogObj extends Animal implements pet {

	public DogObj(String name, String breed, Double weight) {
		this.name = name;
		this.breed = breed;
		this.weight = weight;
	}
		

	@Override
	public String showAffection() {
		return this.name+ "wagged its tail. Then bit you.";
	}

}
