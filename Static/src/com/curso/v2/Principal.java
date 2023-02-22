package com.curso.v2;

public class Principal {

	public static void main(String[] args) {
		System.out.println(Alumno.getContador());//0
		
		Alumno a1 = new Alumno("Patrobas");

		Alumno a2 = new Alumno("Andronico");

		Alumno a3 = new Alumno("Epeneto");

		System.out.println(Alumno.getContador());//3
	}//main

}//Principal9i