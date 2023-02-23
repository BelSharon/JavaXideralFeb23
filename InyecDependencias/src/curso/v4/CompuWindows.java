package curso.v4;

public class CompuWindows extends Computadora{

	String version;
	
	public CompuWindows(String version) {
		this.version =  version;
	}
	
	@Override
	public void encender() {
		System.out.println("Encender computadora Windows: "+ version);
	}

}
