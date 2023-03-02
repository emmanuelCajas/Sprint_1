package tasca1.N1ejercicio2;


public class Principal {

	public static void main(String[] args) {
		
		Coche coche1 = new Coche("hyundai", 235);
	
		//Llamanado al metodo acelerar
		System.out.println(coche1);
		coche1.acelerar();
		
		
		//Llamando al metodo frenar
		Coche.frenar();
		
		
	}
}
