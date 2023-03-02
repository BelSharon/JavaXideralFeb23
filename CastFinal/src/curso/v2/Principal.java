package curso.v2;

public class Principal {

	public static void main(String[] args) {
		
		Ave ave = new Aguila();
		System.out.println(ave.tipo);
		
		System.out.println(((Aguila)ave).tipo);
		
		//El comportamiento lo toma del objecto
		//Siempre y cueando ese comportamiento se 
		//encuentre definido en la clase padre
		//Si no se encuentra definido no puede
		//ejecutar el comportamiento aun si tenga 
		//el comportamiento
		
		//Para los atributos se toma del padre 
		//es decir a la variable de Referencia.
	}

}
