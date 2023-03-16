package com.curso.hashcode;


public class Principal {

	public static void main(String[] args) {

		Empleado e1 = new Empleado(0, "Patrobas", 100.0);
		Empleado e2 = new Empleado(0, "Patrobas", 100.0);
		Empleado e3 = e1;
		
		System.out.println(e1.equals(e2)); //false (apuntan a objetos diferentes)
		System.out.println(e3.equals(e1));//true

	}

}
