package com.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.Optional;
import org.junit.Test;

//ESTAMO USANDO JUnit 4

public class OptionalTest {

	@Test
	public void whenCreatesEmptyOptional_thenCorrect() {
		
		//queremos validar que el optional está vacío
		Optional<String> empty =Optional.empty();
		//empty.isPresent() regresa false
		assertFalse(empty.isPresent());
	}

	@Test
	public void givenNonNull_whewnCreatesNonNullable_thenCorrect() {
		
		String nombre = "Juanito banana";
		//queremos validar que el optional no está vacío
		Optional<String> opt = Optional.of(nombre);
		//opt.isPresent() regresa true
		assertTrue(opt.isPresent());
	}
	
	@Test(expected = NullPointerException.class)
	public void givenNull_whenThrowsErrorOnCreate_thenCorrect() {
	    String name = null;
	    Optional.of(name);
	}
	
	
}
