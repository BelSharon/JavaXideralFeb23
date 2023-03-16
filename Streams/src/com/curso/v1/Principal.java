package com.curso.v1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Principal {

	private static Empleado[] arrayOfEmps = { 
			new Empleado(0, "Patrobas", 100.0), 
			new Empleado(1, "Tercio", 200.0),
			new Empleado(2, "Andronico", 300.0), 
			new Empleado(3, "Epeneto", 400.0),
			new Empleado(4, "Filologo", 500.0) };

	public static void main(String[] args) {
		
		List<Empleado> listEmpleados = Arrays.asList(arrayOfEmps);
		
		//LO CONVERTIMOS A STREAM
		Stream<Empleado> streamEmp = listEmpleados.stream();
		
		//EL STREAM NO SE EJECUTA HASTA QUE NO HAYA UNA OP TERMINAL
		listEmpleados = streamEmp.filter(emp -> emp.getSalary() > 300).collect(Collectors.toList()); //si es final	

		//IMPRIMIMOS EL RESULTADO
		listEmpleados.forEach(System.out::println);
		System.out.println("**************************");

		
		Stream<Empleado> streamEmp2 = Arrays.stream(arrayOfEmps);
		
		List<String> listaNombres2 = streamEmp2.map(emp -> emp.getNombre())
				.collect(Collectors.toList());
		listaNombres2.forEach(System.out::println);
		System.out.println("**************************");

		
		Stream<Empleado> streamEmp3 = Arrays.stream(arrayOfEmps);
		
		listaNombres2 = streamEmp3
				.peek((emp)->{
					System.out.println(emp);
				})
				.map(emp -> emp.getNombre())
				.collect(Collectors.toList());
		
		System.out.println(listaNombres2);

		
	}
}
