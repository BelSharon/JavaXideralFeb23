package com.curso.v5;

import java.util.Arrays;
import java.util.Comparator;

//USANDO LAMBDAS (PARADIFMA FUNTIONAL)
public class Principal {

	public static void main(String[] args) {
		
		Empleado[] arrayEmpleados = {
				new Empleado("Patrobas", 20, 567.89),
				new Empleado("Tercio", 18, 167.89),
				new Empleado("Andronico", 30, 267.89),
				new Empleado("Epeneto", 22, 967.89)				
		};
		
		System.out.println("-------POR EDAD--------");
		
		Comparator<Empleado> compEdad = 
				(o1,o2) -> o1.getEdad() - o2.getEdad();
		
		Arrays.sort(arrayEmpleados,compEdad);
		
		for (Empleado e: arrayEmpleados) {
			System.out.println(e);
		}
		
		System.out.println("-------POR SUELDO--------");
		
		Comparator<Empleado> compSueldo = 
				(x,y) -> (int)(x.getSueldo() - y.getSueldo());

		Arrays.sort(arrayEmpleados,compSueldo);
		
		for (Empleado e: arrayEmpleados) {
			System.out.println(e);
		}
		
		System.out.println("-------POR NOMBRE--------");
		
		Comparator<Empleado> compNombre = 
				(emp1, emp2) -> emp1.getNombre().compareTo(emp2.getNombre());

		Arrays.sort(arrayEmpleados,compNombre);
		
		for (Empleado e: arrayEmpleados) {
			System.out.println(e);
		}
		
	}

}