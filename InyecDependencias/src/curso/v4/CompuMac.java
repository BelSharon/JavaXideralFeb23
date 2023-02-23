package curso.v4;

public class CompuMac extends Computadora{
	String version;
	
	public CompuMac(String version) {
		this.version =  version;
	}
	
	@Override
	public void encender() {
		System.out.println("Encender computadora Mac: "+ version);
	}
}