package curso.v0;

public class CompuWindows {

	String version;
	
	public CompuWindows(String version) {
		this.version =  version;
	}
	
	void encender() {
		System.out.println("Encender computadora Windows: "+ version);
	}
}
