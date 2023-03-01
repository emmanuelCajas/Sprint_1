package tasca1.N2ejercicio1;

public class Smartphone extends Telefono implements Camara, Reloj {

	@Override
	public void alarma() {
		System.out.println("Esta sonando la alarma");
		
	}

	@Override
	public void fotografiar() {
		System.out.println("Se esta haciendo una foto");
		
	}
	
}
