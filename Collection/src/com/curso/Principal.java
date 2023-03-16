package com.curso;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		//COLLECTION TIPO LIST
		List<Empleado> list = new ArrayList<>();
		
		list.add(new Empleado(0, "Patrobas", 100.0));
		list.add(new Empleado(1, "Tercio", 200.0));
		list.add(new Empleado(2, "Andronico", 300.0));
		list.add(new Empleado(3, "Epeneto", 400.0));
	
		list.forEach(System.out::println);
		
		Empleado e = new Empleado(4, "Filologo", 500.0);
		
		list.add(e);//lo agrega al final de la lista
		System.out.println("************");
		list.forEach(System.out::println);

	}

}
