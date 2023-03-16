package com.curso.iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {

		
		Iterator<Empleado> iteratorEmpleados;
		
		Empleado e1 = new Empleado(1, "Patrobas", 500.0);
		Empleado e2 = new Empleado(1, "Tercio", 200.0);
		Empleado e3 = new Empleado(2, "Andronico", 300.0);
		Empleado e4 = new Empleado(3, "Epeneto", 400.0);
		Empleado e5 = new Empleado(1, "Patrobas", 500.0);
		Empleado e6 = new Empleado(4, "Filologo", 500.0);
		
		//los set no permiten duplicados
		//Set no necesariamente tiene un orden
		Set<Empleado> setEmpleados = new HashSet<>();
		setEmpleados.add(e1);
		setEmpleados.add(e2);
		setEmpleados.add(e3);
		setEmpleados.add(e4);
		setEmpleados.add(e5);
		setEmpleados.add(e6);
		
		iteratorEmpleados = setEmpleados.iterator();
		showCollection(iteratorEmpleados);
		
		//LIST
		List<Empleado> listEmpleados = new ArrayList<>();
		listEmpleados.add(e1);
		listEmpleados.add(e2);
		listEmpleados.add(e3);
		listEmpleados.add(e4);
		listEmpleados.add(e5);
		listEmpleados.add(e6);
		
		iteratorEmpleados = listEmpleados.iterator();
		showCollection(iteratorEmpleados);
		
		//QUEUE
		Queue<Empleado> quequeEmpleados = new LinkedList<>();
		quequeEmpleados.add(e1);
		quequeEmpleados.add(e2);
		quequeEmpleados.add(e3);
		quequeEmpleados.add(e4);
		quequeEmpleados.add(e5);
		quequeEmpleados.add(e6);
		
		iteratorEmpleados = quequeEmpleados.iterator();
		showCollection(iteratorEmpleados);
		
	}
	
	static void showCollection(Iterator<Empleado> iterator) {
		System.out.println("**********");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}// tienes un siguiente elemnto? si -> imprímelo

}
