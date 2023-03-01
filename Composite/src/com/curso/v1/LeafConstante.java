package com.curso.v1;
//LeafConstante ES UN COMPONENTE
public class LeafConstante implements Component{
	
	double valor;
	
	public LeafConstante(double valor) {
		this.valor = valor;
	}


	@Override
	public double getValor(){
		return valor;
	}
}
