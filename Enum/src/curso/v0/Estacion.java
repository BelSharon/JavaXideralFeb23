package curso.v0;

public enum Estacion {
	//ELEMENTOS DE LISTA
	PRIMAVERA("depende numero de visitantes"),
	VERANO("muchos visitantes"),
	INVIERNO("pocos visitantes"),
	OTORÑO("no hay visitantes");
	
	//ATRIBUTO
	String visitantes;
	
	//CONSTRUCTOR
	private Estacion(String visitantes) {
		this.visitantes = visitantes;
	}
	
	//METODO MUETSRA VISITANTES
	public void showVisitantes() {
		System.out.println(visitantes);

	}
	
}
//EL ENUM NO PUEDE REPETIR UN ELEMENTO