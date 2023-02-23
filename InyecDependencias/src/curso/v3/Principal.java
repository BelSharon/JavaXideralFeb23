package curso.v3;

public class Principal {
	public static void main(String[] args) {
		
		Becario bec1 = Inyector.getBecario("Julio", "Windows");
		bec1.encenderComputadora();
		
		Becario bec2 = Inyector.getBecario("Tercio", "Mac");
		bec2.encenderComputadora();
		
		Becario bec3 = Inyector.getBecario("Juanito", "Linux");
		bec3.encenderComputadora();
		
		Becario bec4 = Inyector.getBecario("Lalo", "Dummy");
		bec4.encenderComputadora();
		
	}//MAIN
	
}//PRINCIPAL