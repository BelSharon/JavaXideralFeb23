package com.curso.v3;
//AGREGAMOS UNA NUEVAS EXCEPCIONES DEFINIDAS POR NOSOSTROS
public class Principal {

	public static void main(String[] args) {

		int x = 1500;
		int y = 2;
		
		int resultado = 0;
		
		try {
			
			resultado = calculaDiv(x, y);
		} catch (CeroException e) {
			
			e.printStackTrace();
		} catch (NegativoException e) {
			
			e.printStackTrace();
		} catch (UnsupportedOperationException e) {
			
			e.printStackTrace();
		}
		finally {
			
			System.out.println("Paso por el finally");
		}
		
		System.out.println(resultado);
		
		System.out.println("Fin de Programa");
	}

	//LA FUNC QUE CALCULA LA DIV TIENE DOS EXCPTION
	private static int calculaDiv(int x, int y) throws CeroException, NegativoException{
		
		if (y == 0) //CASO DIV ENTRE CERO
			throw new CeroException("No se puede dividir entre cero");
		if (y < 0) //CASO DIV ENTRE NEGATIVO
			throw new NegativoException("No se puede dividir entre negativos");
		if (x > 1000) //CASO X MAYOR A 1000
			throw new UnsupportedOperationException("X no puede ser mayor a 1000");

		return x/y;
	}

}
