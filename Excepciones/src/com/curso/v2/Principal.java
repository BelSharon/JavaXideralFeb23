package com.curso.v2;

public class Principal {

	public static void main(String[] args) {

		int x = 10;
		int y = 0;
		
		int resultado = 0;
		
		try {

			resultado = calculaDiv(x,y);
		} catch (CeroException e) {

			//imprimir el registro del stack donde se ha iniciado la excepción
			e.printStackTrace();
		}
	
		System.out.println(resultado);
		
		System.out.println("Fin de Programa");
	}

	//LA FUNC QUE CALCULA LA DIV MANDA EXCEPTION A MAIN
	private static int calculaDiv(int x, int y) throws CeroException{
		if (y==0) 
			throw new CeroException("No se puede dividir entre cero");
		return x/y;
	}

}
