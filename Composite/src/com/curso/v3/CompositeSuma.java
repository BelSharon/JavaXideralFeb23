package com.curso.v3;
//UN COMPOSITE PUEDE TENER UNO O MUCHOS COMPONENTS
//IS-A
public class CompositeSuma implements Component{

	//HAS-A
	Component comDerecho;
	Component comIzquierdo;
	
		
	public CompositeSuma(Component comDerecho, Component comIzquierdo) {
		this.comDerecho = comDerecho;
		this.comIzquierdo = comIzquierdo;
	}

	@Override
	public double getValor() {
		return comDerecho.getValor() + comIzquierdo.getValor();
	}
	
	
}