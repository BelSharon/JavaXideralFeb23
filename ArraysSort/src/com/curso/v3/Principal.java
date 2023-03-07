package com.curso.v3;

import java.util.Arrays;

public class Principal {
	
	public static void main(String[] args) {
		
		Empleado[] arrayEmpleados = {
				new Empleado("Patrobas", 20, 567.89),
				new Empleado("Tercio", 18, 167.89),
				new Empleado("Andronico", 30, 267.89),
				new Empleado("Epeneto", 22, 967.89)				
		};
		
		Arrays.sort(arrayEmpleados,new OrdenarEdad());
		
		for (Empleado e: arrayEmpleados) {
			System.out.println(e);
		}
		
		System.out.println("---------------");

		Arrays.sort(arrayEmpleados,new OrdenarSueldo());
		
		for (Empleado e: arrayEmpleados) {
			System.out.println(e);
		}
		
		System.out.println("---------------");

		Arrays.sort(arrayEmpleados,new OrdenarNombre());
		
		for (Empleado e: arrayEmpleados) {
			System.out.println(e);
		}

	}

}
