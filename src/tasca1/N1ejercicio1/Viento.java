package tasca1.N1ejercicio1;

public class Viento extends Instrumento {

	private static String nombreStatic = "nombre desde miembro static viento";
	
	public Viento(String nombre, double precio) {
		super(nombre, precio);
	}
				
	public static String getNombreStatic() {
		return nombreStatic;
	}

	public static void setNombreStatic(String nombreStatic) {
		Viento.nombreStatic = nombreStatic;
	}

	@Override
	public void tocar() {
		System.out.println("esta sonando un instrumento de Viento");
		
	}
	
}
