package tasca1.N1ejercicio1;

public class Viento extends Instrumento {

	public Viento(String nombre, double precio) {
		super(nombre, precio);
	}
	
	
	@Override
	public void tocar() {
		System.out.println("esta sonando un instrumento de Viento");
		
	}
	
}
