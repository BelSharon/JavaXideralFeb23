package com.curso.v1;
//VERSION SIN COMPOSITE
public class Principal {

	public static void main(String[] args) {
		
		double a = 3.7;
		double b = 8.9;
		
		Component const1 = new LeafConstante(a);
		Component const2 = new LeafConstante(b);

		if (a == const1.getValor())
			System.out.println("Son iguales 1");
		
		if (b == const2.getValor())
			System.out.println("Son iguales 2");
	}

}
