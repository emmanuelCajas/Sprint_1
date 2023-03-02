package tasca1.N1ejercicio1;

public class Percusion  extends Instrumento{
	
	private static String nombreStatic = "nombre desde miembro static percusion";
	
	public Percusion(String nombre, double precio) {
		super(nombre, precio);
	}
	
	public static String getNombreStatic() {
		return nombreStatic;
	}

	public static void setNombreStatic(String nombreStatic) {
		Percusion.nombreStatic = nombreStatic;
	}

	@Override
	public void tocar() {

		System.out.println("Esta sonando un instrumento de percusi�n");
	}

}
