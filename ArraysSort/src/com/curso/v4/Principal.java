package com.curso.v4;

import java.util.Arrays;
import java.util.Comparator;

//USANDO CLASES ANÓNIMAS
public class Principal {

	public static void main(String[] args) {
		
		Empleado[] arrayEmpleados = {
				new Empleado("Patrobas", 20, 567.89),
				new Empleado("Tercio", 18, 167.89),
				new Empleado("Andronico", 30, 267.89),
				new Empleado("Epeneto", 22, 967.89)				
		};
		
		System.out.println("-------POR EDAD--------");
		
		//clase anónima implementa comparator
		Comparator<Empleado> compEdad = new Comparator<Empleado>() {
			@Override
			public int compare(Empleado o1, Empleado o2) {
				return o2.getEdad() - o1.getEdad();
			}
		}; //va dentro de llaves
		
		Arrays.sort(arrayEmpleados,compEdad);
		
		for (Empleado e: arrayEmpleados) {
			System.out.println(e);
		}
		
		System.out.println("-------POR SUELDO--------");
		
		//clase anónima
		Comparator<Empleado> compSueldo = new Comparator<Empleado>() {
			@Override
			public int compare(Empleado o1, Empleado o2) {
				return (int) (o1.getSueldo() - o2.getSueldo());
			}
		};

		Arrays.sort(arrayEmpleados,compSueldo);
		
		for (Empleado e: arrayEmpleados) {
			System.out.println(e);
		}
		
		System.out.println("-------POR NOMBRE--------");
		
		//clase anónima
		Comparator<Empleado> compNombre = new Comparator<Empleado>() {
			@Override
			public int compare(Empleado o1, Empleado o2) {
				return o1.getNombre().compareTo(o2.getNombre());
			}
		};

		Arrays.sort(arrayEmpleados,compNombre);
		
		for (Empleado e: arrayEmpleados) {
			System.out.println(e);
		}
		
	}

}