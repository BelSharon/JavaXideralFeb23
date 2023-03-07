package com.curso.v0;

import java.util.Arrays;

public class Principal {
	
	public static void main(String[] args) {

		String[] arrayNombres = {
				"Patrobas","Tercio","Andronico","Epeneto"
		};
		
		Arrays.sort(arrayNombres); //ordena el arreglo
		
		System.out.println(Arrays.toString(arrayNombres));
		
		System.out.println("--------------------------");
		
		Empleado[] arrayEmpleados = {
				new Empleado("Patrobas", 20, 567.89),
				new Empleado("Tercio", 18, 167.89),
				new Empleado("Andronico", 30, 267.89),
				new Empleado("Epeneto", 22, 967.89)				
		};
		
		//PARA PODER ORDENAR HAY QUE REGRESAR A LA CLASE (comereTo)
		Arrays.sort(arrayEmpleados);// si no arroja error de casteo

		//System.out.println(Arrays.toString(arrayEmpleados));
		
		for (Empleado e: arrayEmpleados) {
			System.out.println(e);
		}

		
	}

}