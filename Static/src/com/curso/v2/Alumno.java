package com.curso.v2;

public class Alumno {
		//ATRIBUTOS DE CADA OBJETO
			String nombre; //inicia en null
			//static: atributos DE LA CLASE
			private static int contador;// inicia en 0
			
			Alumno(String nombre) {
				this.nombre = nombre;
				++ contador;
			}//constructor

			@Override
			public String toString() {
				return "Alumno [nombre=" + nombre + "]";
			}//toString
			
			//METODO DE INSTANCIA
			public static int getContador() {
				return contador;
			}
}