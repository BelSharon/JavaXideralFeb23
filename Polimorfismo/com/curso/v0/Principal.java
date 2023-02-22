/*VERSIÓN 0
 * Esta es la forma en que usualmente instanciaríamos diferentes animales y los sonidos que hacen
 * */
package com.curso.v0;

public class Principal {

	public static void main(String[] args) {
		Perro perro = new Perro();
		perro.getSound();
		
		Gato gato= new Gato();
		gato.getSound();
		
		Pato pato = new Pato();
		pato.getSound();
	}//main

}//class Principal
