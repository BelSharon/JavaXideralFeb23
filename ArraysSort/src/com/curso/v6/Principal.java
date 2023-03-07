package com.curso.v6;

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
		
		ordenarEmpleados(arrayEmpleados,(o1,o2) -> o1.getEdad() - o2.getEdad());
		
		
		
		System.out.println("-------POR SUELDO--------");
		
		ordenarEmpleados(arrayEmpleados,(x,y) -> (int)(x.getSueldo() - y.getSueldo()));
		
		
		
		System.out.println("-------POR NOMBRE--------");
		
		ordenarEmpleados(arrayEmpleados,(emp1, emp2) -> emp1.getNombre().compareTo(emp2.getNombre()));
		
		
	}

	static void ordenarEmpleados(Empleado[] arrayEmpleados, Comparator<Empleado> comparatorEmpleado) {
		Arrays.sort(arrayEmpleados, comparatorEmpleado);
		for (Empleado e: arrayEmpleados) {
			System.out.println(e);
		}
	}
}