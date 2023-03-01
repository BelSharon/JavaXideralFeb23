package com.curso.ejercicio;

public class CompositeMultip implements Component{
	//HAS-A
	Component comDerecho;
	Component comIzquierdo;

	public CompositeMultip(Component comDerecho, Component comIzquierdo) {
		this.comDerecho = comDerecho;
		this.comIzquierdo = comIzquierdo;
	}

	@Override
	public double getValor() {
		return comDerecho.getValor() * comIzquierdo.getValor();
	}
}
