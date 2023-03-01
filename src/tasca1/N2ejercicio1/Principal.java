package tasca1.N2ejercicio1;

public class Principal {

	public static void main(String[] args) {
		
		Telefono telefono = new Telefono();
		
		telefono.llamar("611477124");
		
		Smartphone smartphone = new Smartphone();	
		smartphone.fotografiar();
		smartphone.alarma();
	}
	
}
