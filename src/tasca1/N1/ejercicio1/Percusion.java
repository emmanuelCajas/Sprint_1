package tasca1.N1.ejercicio1;

public class Percusion  extends Instrumento{

	public Percusion(String nombre, double precio) {
		super(nombre, precio);
	}
	
	@Override
	public void tocar() {

		System.out.println("Esta sonando un instrumento de percusión");
		
	}

}
