package com.curso;

public class RestaComponent implements Component {

	Component c1;
	Component c2;
	
	public RestaComponent(Component c1, Component c2) {
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public Double getValor() {
		return c1.getValor() - c2.getValor();
	}

}
