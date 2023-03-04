package tasca6.N1ejercicio2;

public class Main {

	public static void main(String[] args) {
		
		Persona persona = new Persona("Emmanuel","Cajas",38);
		
		GenericMethods.metodoGenerico(persona, "abc", 3500);
		GenericMethods.metodoGenerico("abc", persona, 3500);
		GenericMethods.metodoGenerico(persona, 3500, "abc");
	}

}
