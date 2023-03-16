package com.curso.clasemetodo;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class Principal {

	public static void main(String[] args) {
		
		Empleado empleado = new Empleado(4, "Filologo", 500.0);
		
//		BiConsumer<Employee,Double> bicons = 
//		(e,d) -> e.incrementarSalario(d);
		
		BiConsumer<Empleado,Double> bicons = Empleado::incrementarSalario;

		bicons.accept(empleado,1.15);

		System.out.println(empleado);

		System.out.println("*******************");

		//BiFunction<Employee,Double,Employee> bifun = 
		//		(e,d) -> e.decrementarSalario(d);

		BiFunction<Empleado,Double,Empleado> bifun = 
				Empleado::decrementarSalario;

		Empleado empRes = bifun.apply(empleado,0.30);

		System.out.println(empRes);
		
	}

}
