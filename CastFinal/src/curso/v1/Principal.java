package curso.v1;

public class Principal {

	public static void main(String[] args) {
		
		//CAST ARRIBA //UPCASTING
		Aguila aguila = new Aguila();
		aguila.volar();
		aguila.volarAve();
		aguila.volarAguila();

		Ave ave = aguila;
		ave.volar();
		ave.volarAve();
		//ave.volarAguila();

		Object object = ave;
		//object.volar();
		//object.volarAve();
	}

}
