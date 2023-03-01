package com.curso.v1;

//PRIMER VERSIÓN, TRY, CATCH, FINALLY & ARITHMETICE.
public class Principal {

	public static void main(String[] args) {
	
		int x = 5;
		int y = 0;
		
		int resultado = 0; //porque sabemos tiene error
		
		try {
			resultado = calculaDiv(x,y);
		}catch(ArithmeticException e) {
			
			System.out.println("Atrapo la exception ArithmeticException");
		}finally {
			
			System.out.println("Paso por el finally");
		}
	
		System.out.println(resultado);
		
		System.out.println("Fin de programa");
		}
	
	private static int calculaDiv(int x, int y) {
		return x/y;
	}

}
