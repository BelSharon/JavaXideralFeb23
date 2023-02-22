/*Aqui vemos como se recorren los bloques de iniciación
 * primero se ejecutan los bloques estáticos
 * */
package com.curso.v3;

public class Alumno {
	{
		System.out.println("PASÓ POR BLOQUE DE INICIACIÓN 1");
	}

	static {
		System.out.println("PASÓ POR BLOQUE INICIACIÓN STATIC 1");
	}
	
	String nombre;

	Alumno(String nombre) {
		System.out.println("Pasó por constructor");
		this.nombre = nombre;
	}//constructor
	
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + "]";
	}//toString
	
	{
		System.out.println("PASÓ POR BLOQUE DE INICIACIÓN 2");
	}
	
	static {
		System.out.println("PASÓ POR BLOQUE DE INICIACIÓN STATIC 2");
	}
	
}
