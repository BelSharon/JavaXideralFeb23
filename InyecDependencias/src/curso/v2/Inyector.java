package curso.v2;

//INYECTOR DE DEPENDENCIAS
public class Inyector {

	static Computadora cw = new CompuWindows("Vista");
	static Computadora cl = new CompuLinux("Ubuntu 18");
	
	//RECIBE BECARIO Y ASIGNA TIPO DE COMPU
	static void inyectarWin(Becario b) {
		b.setComputadora(cw);
	}
	
	static void inyectarLin(Becario b) {
		b.setComputadora(cl);
	}
	
}
