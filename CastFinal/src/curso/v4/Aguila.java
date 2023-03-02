package curso.v4;

public class Aguila implements Ave {
	
	String tipo = "Aguila";
	
	@Override
	public void volar() {
		System.out.println("Volar como Aguila");
	}
	
	void volarAguila() {
		System.out.println("Método volarAguila()");
	}

}
