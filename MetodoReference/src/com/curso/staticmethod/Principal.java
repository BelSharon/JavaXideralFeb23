package com.curso.staticmethod;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Principal {

	public static void main(String[] args) {
		
		Empleado empleado = new Empleado(4, "Filologo", 500.0);
		
		// un consumer se ejecuta con el .accept
//		Consumer<Empleado> cons =
//				emp -> Empleado.incrementarSalario(emp);
				
		Consumer<Empleado> cons = Empleado::incrementarSalario;
		cons.accept(empleado);
		System.out.println(empleado);

		System.out.println("***********************");
		
//		BiFunction<Empleado, Double, Empleado> bi =
//				(emp,d) -> Empleado.decrementarSalario(emp, d);
		
		BiFunction<Empleado, Double, Empleado> bi = Empleado::decrementarSalario;
				
		Empleado empRes = bi.apply(empleado, 0.20);
		
		System.out.println(empRes);
		
		
	}

}
