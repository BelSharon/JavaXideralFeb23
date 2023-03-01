package com.curso;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestComposite {

	@Test
	void testA() {
		double d1 = 5.0;
		
		assertEquals(d1, 5.0);
	}
	
	@Test
	void testB() {
		double d1 = 5.0;
		double d2 = 3.4;
		
		assertEquals(d1+d2, 8.4);
	}
	
	@Test
	void testLeaf() {
		double d =6.0;
		Component c1 = new leafConstante(d);
		assertEquals(d, c1.getValor());
	}

	@Test
	void testSuma() {
		double d1 =6.0;
		double d2 =8.5;
		
		Component c1 = new leafConstante(d1);
		Component c2 = new leafConstante(d2);
		Component suma = new SumaComponent(c1,c2);
		
		assertEquals(suma.getValor(), d1+d2);
	}
	
	@Test
	void testResta() {
		double d1 =6.0;
		double d2 =8.5;
		
		Component c1 = new leafConstante(d1);
		Component c2 = new leafConstante(d2);
		Component resta = new RestaComponent(c1,c2);
		
		assertEquals(resta.getValor(), d1-d2);
	}
}
