package com.curso.v3;

public class Principal {

	public static void main(String[] args) {
		
		double a = 3.7;
		double b = 8.9;
		
		Component const1 = new LeafConstante(a);
		Component const2 = new LeafConstante(b);

		Component com01 = new CompositeSuma(const1, const2);
		
		System.out.println(com01.getValor());//12.6
		
		//------------------------------------
		Component const3 = new LeafConstante(4.5);
		Component const4 = new LeafConstante(2.3);
		
		Component com02 = new CompositeSuma(
				new CompositeSuma(const1 , const3), 
				new CompositeSuma(const2 , const4));
		
		System.out.println(com02.getValor());
		
		//------------------------------------
		Component com03 = new CompositeResta(
				new CompositeSuma(
						new LeafConstante(2.8) ,
						new CompositeResta(
								new LeafConstante(7.8),
								new LeafConstante(1.8)
						) 
				)
				,
				new CompositeResta(
						new CompositeResta(
								new LeafConstante(3.8),
								new CompositeSuma(
										new LeafConstante(4.8),
										new LeafConstante(8.8)
								) 
						)  ,
						new CompositeSuma(
								new LeafConstante(7.8),
								new LeafConstante(9.8)
						) 
				)
		);
		
		System.out.println(com03.getValor());//36.2
	}

}
