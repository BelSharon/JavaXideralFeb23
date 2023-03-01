package com.curso.ejercicio;

public class Principal {

	public static void main(String[] args) {
		
		Component com03 = new CompositeMultip(
				new CompositeDiv(
						new LeafConstante(2.8) ,
						new CompositeResta(
								new CompositeMultip(
										new LeafConstante(5.8), 
										new LeafConstante(6.8)),
								new LeafConstante(1.8)
						) 
				)
				,
				new CompositeSuma(
						new CompositeMultip(
								new LeafConstante(3.8),
								new CompositeResta(
										new LeafConstante(4.8),
										new LeafConstante(8.8)
								) 
						)  ,
						new CompositeDiv(
								new LeafConstante(7.8),
								new LeafConstante(9.8)
						) 
				)
		);
		
		System.out.println(com03.getValor());//-1.0715044785182937
	}

}
