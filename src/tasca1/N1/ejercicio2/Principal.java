package tasca1.N1.ejercicio2;


public class Principal {

	public static void main(String[] args) {
		
		Coche coche1 = new Coche("hyundai", 235);
	
		System.out.println(coche1);
		coche1.acelerar(); 
		Coche.frenar();
		
		
	}
}
