//ESTE CÓDIGO ESTÁ ALTAMENTE ACOMPLAMIENTO
package curso.v0;

public class Becario {

	String nombre;
	CompuWindows compuWin = new CompuWindows("Vista");
	
	public Becario(String nombre) {
		this.nombre = nombre;
	}//CONSTRUCTOR
	
	void encenderComputadora() {
		System.out.println(nombre);
		compuWin.encender();
	}//ENCENDERCOMPUTADORA
	
}//CLASE BECARIO