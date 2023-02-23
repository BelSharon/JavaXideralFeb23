package curso.v1;

public class Suma extends Operacion{
	
	public Suma(int x, int y) {
		super(x, y);
	}//Constructor
	
	int ejecuta() {
		return x+y;
	}
}
