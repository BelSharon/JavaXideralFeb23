package curso.v4;

public class AguilaCalva extends Aguila{

	String tipo = "AguilaCalva";

	@Override
	public void volar() {
		System.out.println("Volar como Aguila Calva");
	}

	void volarAguilaCalva() {
		System.out.println("Método volarAguilaCalva()");
	}
}
