package com.curso.v1;

public class Principal {

	public static void main(String[] args) {
		Alumno a1 = new Alumno("Patrobas");
		System.out.println(a1.contador);//1
		
		Alumno a2 = new Alumno("Andronico");
		System.out.println(a2.contador);//2
		
		Alumno a3 = new Alumno("Epeneto");
		System.out.println(a3.contador);//3
		
		//lo correcto:
		System.out.println("**********");
		System.out.println(Alumno.contador);
		
//		System.out.println("**********");
//		System.out.println(a1.contador);//3
//		System.out.println(a2.contador);//3
//		System.out.println(a3.contador);//3
	}//main

}//Principal