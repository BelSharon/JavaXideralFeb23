package com.curso.objetometodo;

import java.util.function.Consumer;
import java.util.function.Function;

public class Principal {

	public static void main(String[] args) {
		
		Empleado empleado = new Empleado(4, "Filologo", 500.0);
		
//		Consumer<Double> cons = 
//				d -> empleado.incrementarSalario(d);
				
		Consumer<Double> cons = empleado::incrementarSalario;
							
		cons.accept(1.15);
		
		System.out.println(empleado);
		
		System.out.println("*******************");
		
//		Function<Double,Employee> fun = 
//				(d) -> empleado.decrementarSalario(d);
				
		Function<Double,Empleado> fun = 
							empleado::decrementarSalario;
				
		Empleado empRes = fun.apply(0.30);
		
		System.out.println(empRes);
		
	}

}
