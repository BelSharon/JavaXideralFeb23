package curso.v0;

public class Principal {

	public static void main(String[] args) {
		
		Object ave0 = new Ave();
		((Ave)ave0).volar(); //DOWNCASTING
		
		Ave ave = new Aguila();
		ave.volar();
		ave.volarAve();
		((Aguila)ave).volarAguila(); //DOWNCASTING

	}

}
