package com.balvin.singleton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareTest {
	private static List<Animal> lstAnimal = new ArrayList<Animal>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lstAnimal.add(new Animal(101, "Cat"));
		lstAnimal.add(new Animal(10, "Dog"));
		lstAnimal.add(new Animal(128, "Lion"));
		lstAnimal.add(new Animal(982, "Tiger"));
		lstAnimal.add(new Animal(63, "Giraff"));
		
		//Collections.sort(lstAnimal);
		//Collections.sort(lstAnimal, new AnimalIdCompare());
		Collections.sort(lstAnimal, new AnimalNameCompare());
				
		for (Animal animal : lstAnimal) {
			System.out.println("Id is : "+animal.getAnimalId() + " Name is : "+animal.getAnimalName());		
		}
	}
}

class Animal implements Comparable<Animal>{
	private int animalId;
	private String animalName;
	
	public Animal(int animalId, String animalName){
		this.animalId = animalId;
		this.animalName=animalName;
	}
	
	public int getAnimalId() {
		return animalId;
	}
	public void setAnimalId(int animalId) {
		this.animalId = animalId;
	}
	public String getAnimalName() {
		return animalName;
	}
	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}

	@Override
	public int compareTo(Animal o) {
		// TODO Auto-generated method stub
		
		if(animalId == o.animalId){
			return 0;	
		}else if(animalId > o.animalId){
			return 1;
		}else{
			return -1;
		}		
	}	
}

class AnimalIdCompare implements Comparator<Animal>{

	@Override
	public int compare(Animal o1, Animal o2) {
		// TODO Auto-generated method stub
		if(o1.getAnimalId() == o2.getAnimalId()){
			return 0;	
		}else if(o1.getAnimalId() > o2.getAnimalId()){
			return 1;
		}else{
			return -1;
		}	
	}
	
}

class AnimalNameCompare implements Comparator<Animal>{

	@Override
	public int compare(Animal o1, Animal o2) {
		// TODO Auto-generated method stub
		return o1.getAnimalName().compareTo(o2.getAnimalName());
	}
	
}
