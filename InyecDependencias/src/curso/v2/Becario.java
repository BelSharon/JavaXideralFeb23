package curso.v2;
//AGREGAMOS ENCAPSULAMIENTO (private + setters/getters)
public class Becario {

	private String nombre;
	private Computadora computadora; //así no apunta a nada (genera excepción),

	//CONSTRUCTOR
	public Becario(String nombre) {
		this.nombre = nombre;
	}
	
	//ENCENDERCOMPUTADORA
	void encenderComputadora() {
		System.out.println(nombre);
		computadora.encender();
	}
	
	//SETTERS Y GETTERS
	public Computadora getComputadora() {
		return computadora;
	}

	public void setComputadora(Computadora computadora) {
		this.computadora = computadora;
	}
	
}//CLASE BECARIO
