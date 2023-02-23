package com.curso.v1;

/*Hacemos la clase tipo abstract
 * No se pueden crear instancias de una clase abstracta*/
public abstract class Animal {
	
	abstract void getSound();

	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
	
}//Animal