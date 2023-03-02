package curso.v0;

public class Principal {
	public static void main(String[] args) {
		
		Estacion e = Estacion.PRIMAVERA; //se está instanciando
		
		e = Estacion.OTORÑO;
		
		e.showVisitantes();
		//System.out.println(e);
		
		for (Estacion est: Estacion.values()) {
			System.out.println(est);
			est.showVisitantes();
		}
	}//main

}//principal
