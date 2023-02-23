/*VERSIÓN TRADICIONAL
 * NO POLIMORFISMO
 * */
package curso.v0;

public class Principal {

	public static void main(String[] args) {
		
		Resta resta = new Resta(10,8);
		
		Suma suma = new Suma(5,5);
		
		System.out.println(resta);
		System.out.println(resta.ejecuta());
		
		System.out.println(suma);
		System.out.println(suma.ejecuta());
		
	}//main

}//Principal
