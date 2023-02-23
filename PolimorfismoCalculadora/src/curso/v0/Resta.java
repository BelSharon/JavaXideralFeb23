package curso.v0;

public class Resta {
	int x;
	int y;
	
	public Resta(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}//Resta
	
	int ejecuta() {
		return x-y;
	}//ejecuta
	
	@Override
	public String toString() {
		return "Resta [x=" + x + ", y=" + y + "]";
	}//toString
	
}//resta
