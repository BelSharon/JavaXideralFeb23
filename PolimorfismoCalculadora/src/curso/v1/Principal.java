package curso.v1;

import curso.v0.Resta;
import curso.v0.Suma;

public class Principal {

	public static void main(String[] args) {
		Operacion op1 = new Resta(10,8);
		
		Operacion op2 = new Suma(5,5);
		
		System.out.println(op1);
		System.out.println(op1.ejecuta());
		
		System.out.println(op2);
		System.out.println(op2.ejecuta());

	}

}
