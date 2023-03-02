package curso.v3;
//AHORA CON INTERFACES
public class Principal {

	public static void main(String[] args) {
		
Ave ave = new AguilaReal();
		
		System.out.println(Ave.tipo); //Ave
		System.out.println(((Aguila)ave).tipo); //Aguila
		System.out.println(((AguilaReal)ave).tipo); //AguilaReal
		
		ave.volar();
		((Aguila)(ave)).volarAguila();
		((AguilaReal)(ave)).volarAguilaReal();
		
		Aguila aguila = (Aguila)ave;
		aguila.volarAguila();
		
		AguilaReal aguilaReal = (AguilaReal)ave;
		aguilaReal.volarAguilaReal();
		
		
	}

}
