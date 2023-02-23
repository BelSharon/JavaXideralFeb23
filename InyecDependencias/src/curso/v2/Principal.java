package curso.v2;

public class Principal {
	public static void main(String[] args) {
		
		Becario bec1 =new Becario("Patrobas");
		Inyector.inyectarWin(bec1);
		bec1.encenderComputadora();
		
		Becario bec2 =new Becario("Tercio");
		Inyector.inyectarLin(bec2);
		bec2.encenderComputadora();
		
	}//MAIN
	
}//PRINCIPAL