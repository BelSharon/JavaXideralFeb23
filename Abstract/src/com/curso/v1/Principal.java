/*VERSIÓN 1
 * Comenzamos a implementar POLIMORFISMO por medio de HERENCIA
 * */
package com.curso.v1;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		
		Animal animal;// = new Animal()
		
		animal = new Perro(); //la clase Perro también es del tipo Animal
		animal.getSound();
		
		animal = new Gato();
		animal.getSound();
		
		animal = new Pato();
		animal.getSound();
		System.out.println(animal);
		
		animal = getAnimal();
		System.out.println(animal.getClass().getSimpleName());
		animal.getSound();
		
	}//main

	private static Animal getAnimal() {
		Animal[] animals = {new Gato(), new Perro(), new Pato()};
		int entero = new Random().nextInt(animals.length); //Genera un numero aleatorio entre 0-2
		return animals[entero];
	}

	
	
}//class Principal