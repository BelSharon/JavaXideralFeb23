package com.curso;

public class leafConstante implements Component {
	double valor;

	public leafConstante(double valor) {
		this.valor = valor;
	}

	@Override
	public Double getValor() {
		return valor;
	}

}
