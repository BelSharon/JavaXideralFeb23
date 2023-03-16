package com.curso.hashcode.v2;

import java.util.HashSet;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {

		Empleado e1 = new Empleado(1, "Patrobas", 500.0);
		Empleado e2 = new Empleado(1, "Tercio", 200.0);
		Empleado e3 = new Empleado(2, "Andronico", 300.0);
		Empleado e4 = new Empleado(3, "Epeneto", 400.0);
		Empleado e5 = new Empleado(1, "Patrobas", 500.0);
		Empleado e6 = new Empleado(4, "Filologo", 500.0);
		
		//los set no permiten duplicados
		//Set no necesariamente tiene un orden
		Set<String> setNombres = new HashSet<>();
		
		
		setNombres.add(e1.getNombre());
		setNombres.add(e2.getNombre());
		setNombres.add(e3.getNombre());
		setNombres.add(e4.getNombre());
		setNombres.add(e5.getNombre());
		setNombres.add(e6.getNombre());
		
		setNombres.forEach(System.out::println);//imprime 5 nombres
		System.out.println("*********************");
		
		Set<Empleado> setEmpleados = new HashSet<>();
		
		setEmpleados.add(e1);
		setEmpleados.add(e2);
		setEmpleados.add(e3);
		setEmpleados.add(e4);
		setEmpleados.add(e5);
		setEmpleados.add(e6);
		
		System.out.println(e1.equals(e5));//true
		setEmpleados.forEach(System.out::println);//sin el HashCode en empleado repite a patrobas
		
	}

}
