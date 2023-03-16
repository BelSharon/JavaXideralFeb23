package com.curso.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.curso.iterator.Empleado;

public class MapDemos {

	public static void main(String[] args) {
		
		Empleado e1 = new Empleado(1, "Patrobas", 500.0);
		Empleado e2 = new Empleado(1, "Tercio", 200.0);
		Empleado e3 = new Empleado(2, "Andronico", 300.0);
		Empleado e4 = new Empleado(3, "Epeneto", 400.0);
		Empleado e5 = new Empleado(1, "Patrobas", 500.0);
		Empleado e6 = new Empleado(4, "Filologo", 500.0);
		
		Map<String, Empleado> mapaEmpleados = new HashMap<>();
		
		mapaEmpleados.put("X400", e1);
		mapaEmpleados.put("X400", e2);
		mapaEmpleados.put("X400", e5);
		mapaEmpleados.put("X400", e4);
		mapaEmpleados.put("X400", e3);
		mapaEmpleados.put("X500", e6);
		
		mapaEmpleados.forEach((k,v)->System.out.println(k+": "+v));
		
		Set<String> setString = mapaEmpleados.keySet();
		
		setString.forEach(System.out::println);
		
		Collection<Empleado> colValores = mapaEmpleados.values();
		
		colValores.forEach(System.out::println);
		
		System.out.println(colValores.getClass().getName());
		
	
	}
}
