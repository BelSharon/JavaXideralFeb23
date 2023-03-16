package com.curso;

import java.util.Optional;

public class Principal {

	public static void main(String[] args) {
		
		//whenCreatesEmptyOptional_thenCorrect
		Optional<String> empty = Optional.empty();
		boolean resultado = empty.isPresent();
		System.out.println(resultado); //false

		//givenNonNull_whenCreatesNonNullable_thenCorrect
		String name = "baeldung";
		Optional<String> opt = Optional.of(name);
		resultado = opt.isPresent();
		System.out.println(resultado); //true

		//givenNull_whenThrowsErrorOnCreate_thenCorrect
		name = null;
		try {
			Optional.of(name);
		}catch(NullPointerException e) {
			System.out.println("Se genero un NullPointerException");
		}

		System.out.println("Fin de Programa");
	}

}
