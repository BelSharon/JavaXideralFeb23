package curso.v0;

public class Principal {
	public static void main(String[] args) {
		
		Becario bec1 =new Becario("Patrobas");
		bec1.encenderComputadora();
		
		Becario bec2 =new Becario("Tercio");
		bec2.compuWin = new CompuWindows("2000");
		bec2.encenderComputadora();
		
	}//MAIN
}//PRINCIPAL
