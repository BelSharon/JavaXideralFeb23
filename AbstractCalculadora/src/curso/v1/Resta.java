//CLASE HIJA
package curso.v1;

public class Resta extends Operacion{

	public Resta(int x, int y) {
		super(x, y);
	}//Constructor
	
	int ejecuta() {
		return x-y;
	}
		
}
