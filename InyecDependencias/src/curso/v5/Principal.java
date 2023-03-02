package curso.v5;

public class Principal {
	public static void main(String[] args) {
		
		Becario bec1 = Inyector.getBecario("Julio", TipoComputadora.Windows);
		bec1.encenderComputadora();
		
		Becario bec2 = Inyector.getBecario("Tercio", TipoComputadora.Linux);
		bec2.encenderComputadora();
		
		Becario bec3 = Inyector.getBecario("Juanito", TipoComputadora.Mac);
		bec3.encenderComputadora();
		
		Becario bec4 = Inyector.getBecario("Lalo", TipoComputadora.Pato);
		bec4.encenderComputadora();
		
		Inyector.inyectarWin(bec1);
		bec1.encenderComputadora();
		
	}//MAIN
	
}//PRINCIPAL