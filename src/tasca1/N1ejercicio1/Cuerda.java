package tasca1.N1ejercicio1;

public class Cuerda extends Instrumento {
	public static String nombreStatic="nombre desde miembro static viento";
		

	public Cuerda(String nombre, double precio){
		super(nombre, precio);
	}
	
	public static String getNombreStatic() {
		return nombreStatic;
	}

	public static void setNombreStatic(String nombreStatic) {
		Cuerda.nombreStatic = nombreStatic;
	}
	
	@Override
	public void tocar() {
		System.out.println("Esta sonando instrumjento de Cuerda");
	}
}
