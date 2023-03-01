package tasca1.N1ejercicio1;

public class Cuerda extends Instrumento {
		
	public Cuerda(String nombre, double precio){
		super(nombre, precio);
	}
	@Override
	public void tocar() {
		System.out.println("Esta sonando instrumjento de Cuerda");
		
	}
}
