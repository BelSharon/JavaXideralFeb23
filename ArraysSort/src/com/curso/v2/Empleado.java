package com.curso.v2;

public class Empleado implements Comparable<Empleado> {
	
	private String nombre;
	private int edad;
	private double sueldo;
	
	public Empleado(String nombre, int edad, double sueldo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sueldo = sueldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", edad=" + edad + ", sueldo=" + sueldo + "]";
	}

	//ODENAMOS POR NOMBRE
	public int compareTo(Empleado o) {
		return this.nombre.compareTo(o.nombre);
	}//STRING YA TIENE EL MÉTODO compareTo
	
	//ORDENAMOS POR SUELDO
//	@Override
//	public int compareTo(Empleado o) {
//		return (int)(this.sueldo - o.sueldo);
//	}
}
