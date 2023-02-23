package curso.v3;

//INYECTOR DE DEPENDENCIAS
public class Inyector {

	static Computadora cw = new CompuWindows("Vista");
	static Computadora cl = new CompuLinux("Ubuntu 18");
	static Computadora cm = new CompuMac("Sierra");
	static Computadora cd = new CompuDummy("Pato 20");
	
	static Becario getBecario(String nombre, String tipoComp) {
		
		Becario b;//las variables locales no se inicializan
		
		switch (tipoComp) {
		case "Windows":
			b = new Becario(nombre, cw);
			break;
			
		case "Linux":
			b = new Becario(nombre, cl);
			break;
			
		case "Mac":
			b = new Becario(nombre, cm);
			break;
			
		default:
			b = new Becario(nombre, cd);
		}
		return b;
	}
	
}
