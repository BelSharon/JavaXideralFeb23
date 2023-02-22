package com.curso.v0;

public class Alumno {
	//ATRIBUTOS DE CADA OBJETO
	String nombre; //inicia en null
	int contador;// inicia en 0
	
	Alumno(String nombre) {
		this.nombre = nombre;
		++ contador;
	}//constructor

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + "]";
	}//toString
	
}//clase Alumno
