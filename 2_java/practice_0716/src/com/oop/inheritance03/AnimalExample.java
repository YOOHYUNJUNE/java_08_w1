package com.oop.inheritance03;

public class AnimalExample {
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.makeSound();
		
//		Dog dog = (Dog) animal; // 불가능
		
		Animal animalD = new Dog();
		animalD.makeSound(); // 멍멍
//		animalD.bite(); // 물기 아직 불가능
		
		Dog dog = (Dog) animalD;
		dog.makeSound();
		dog.bite();
		
		System.out.println();
		
		Animal animalC = new Cat(); // promotion 먼저
		Cat cat = (Cat) animalC; // casting
		cat.makeSound();
		cat.scratch();
		
		
		
		
		
	}
}
