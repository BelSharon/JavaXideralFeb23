package curso.v5;

public class Inyector {

	static Computadora cw = new CompuWindows("Vista");
	static Computadora cl = new CompuLinux("Ubuntu 18");
	static Computadora cm = new CompuMac("Sierra");
	static Computadora cd = new CompuDummy("Pato 20");
	
	static Becario getBecario(String nombre, TipoComputadora tipoComp) {
		
		//VARIABLES LOCALES NO SE INICIALIZAN
		Becario b; 
		
		switch (tipoComp) {
		
		case Windows:
			return new Becario(nombre, cw); //cambiamos instancias por return
			
		case Linux:
			return new Becario(nombre, cl);
		
		case Mac:
			return new Becario(nombre, cm);
			
		default:
			return new Becario(nombre, cd);
		}
	}
	
	static void inyectarWin(Becario b) {
		b.setComputadora(cw);
	}
	
	static void inyectarLin(Becario b) {
		b.setComputadora(cl);
	}
	
	static void inyectarMac(Becario b) {
		b.setComputadora(cm);
	}
	
}
