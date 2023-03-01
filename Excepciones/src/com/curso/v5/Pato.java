package com.curso.v5;

public class Pato implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("Cerrar al Pato");
	}

	public void volar() {
		System.out.println("Volar Pato");
	}
}
