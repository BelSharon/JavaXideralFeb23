package com.curso.v0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//MI VERSIÓN
public class Principal {
	
	private static Empleado[] arrayOfEmps = { 
			new Empleado(0, "Patrobas", 100.0), 
			new Empleado(1, "Tercio", 200.0),
			new Empleado(2, "Andronico", 300.0), 
			new Empleado(3, "Epeneto", 400.0),
			new Empleado(4, "Filologo", 500.0) };

	public static void main(String[] args) {
		
		List<Empleado> listEmpleados = Arrays.asList(arrayOfEmps);
		List<String> nombres = new ArrayList<>();
		
		for (Empleado e: arrayOfEmps) {
			if(e.getNombre().length() > 6) {
				if(e.getSalary() < 400) {
					e.setSalary(e.getSalary() + 200);
					//System.out.println(e);
					//falta ordenarlos
				}
			}
			
		}
		//1.Filtrar los que ganan menos de 400
		//2.Incrementar su sueldo en 200
		//3.Filtrar los que tengan una longitud mayor a 6 en su nombre
		//4.Ordernar por nombre
		//5.Obtener una lista de los nombres: List<String> nombres

	}

}
