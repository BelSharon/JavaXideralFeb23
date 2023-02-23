package curso.v4;
//INYECTAMOS CON CONTRUCTOR
public class Becario {

	private String nombre;
	private Computadora computadora; //así no apunta a nada (genera excepción),

	//CONSTRUCTOR
	public Becario(String nombre, Computadora computadora) {
		this.nombre = nombre;
		this.computadora =computadora;
	}
	
	//ENCENDERCOMPUTADORA
	void encenderComputadora() {
		System.out.println(nombre);
		computadora.encender();
	}
	
}//CLASE BECARIO
