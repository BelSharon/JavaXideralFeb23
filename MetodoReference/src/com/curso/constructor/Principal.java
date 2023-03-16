package com.curso.constructor;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class Principal {
	//SomeClas::new
	public static void main(String[] args) {
		
		//declaración normal:
//		Empleado empleado = new Empleado();
		
		//Supplier no se le pasa nada y retorna obj
//		Supplier<Empleado> sup = () -> new Empleado();
		
		Supplier<Empleado> sup =  Empleado::new;
		
		Empleado empleado = sup.get();

		System.out.println(empleado);
		System.out.println("****************");
//		Function<String, Empleado> fun = name -> new Empleado(name);
	
		Function<String, Empleado> fun = Empleado::new;
		
		empleado = fun.apply("Patrobas");
		
		System.out.println(empleado);
		System.out.println("****************");
		
//		BiFunction<Integer, String, Empleado> bifun = 
//				(i,n) -> new Empleado(i,n);
		
		BiFunction<Integer, String, Empleado> bifun = Empleado::new;
		
		empleado = bifun.apply(5,"Tercio");
		
		System.out.println(empleado);
		System.out.println("****************");
		
		//NO HAY INTERFACE FUNCIONAL QUE RECIBA 3 PARAM, LA VAMOA A INVENTAR
		TriFuncion<Integer, String, Double, Empleado> trifun = Empleado::new;
		
		empleado = trifun.apply(20,"Trilologo", 100.21);
		
		System.out.println(empleado);
		
	}

}
