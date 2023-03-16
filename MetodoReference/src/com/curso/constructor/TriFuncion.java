package com.curso.constructor;

@FunctionalInterface
public interface TriFuncion<T,U,V,R> {
	//T, U, V y R son generics
	
	R apply(T t, U u, V v);

}
