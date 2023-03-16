package com.curso.v1;

public class Empleado {

	private int id;
	private String nombre;
	private double salary;
	
	public Empleado(int id, String nombre, double salary) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", salary=" + salary + "]";
	}

	public Object incrementarSalario(double i) {
		salary += i;
		return this;
	}
	
	
}
