package com.curso.hashcode.v1;


public class Principal {

	public static void main(String[] args) {

		Empleado e1 = new Empleado(0, "Patrobas", 100.0);
		Empleado e2 = new Empleado(0, "Patrobas", 100.0);
		
		System.out.println(e1.equals(e2)); //TRUE
		//ya que hicmos una override de equals
		
	}

}
