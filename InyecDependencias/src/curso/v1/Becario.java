package curso.v1;

public class Becario {

	String nombre;
	//BAJO ACOPLAMIENTO
	Computadora computadora; //así no apunta a nada (genera excepción),
	
	public Becario(String nombre) {
		this.nombre = nombre;
	}//CONSTRUCTOR
	
	void encenderComputadora() {
		System.out.println(nombre);
		computadora.encender();
	}//ENCENDERCOMPUTADORA
	
}//CLASE BECARIO
