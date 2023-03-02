package curso.v5;

public class Becario {

	private String nombre;
	private Computadora computadora; //así no apunta a nada (genera excepción),

	//INYECTAMOS CON CONSTRUCTOR
	public Becario(String nombre, Computadora computadora) {
		this.nombre = nombre;
		this.computadora =computadora;
	}
	
	//ENCENDERCOMPUTADORA
	void encenderComputadora() {
		System.out.println(nombre);
		computadora.encender();
	}
	
	
	public Computadora getComputadora() {
		return computadora;
	}

	//INYECCION POR SETTER
	public void setComputadora(Computadora computadora) {
		this.computadora = computadora;
	}
	
	
}//CLASE BECARIO
