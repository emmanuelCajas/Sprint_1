package tasca1.N1ejercicio1;

public abstract class Instrumento {
	
	private final String nombre;
	private final double  precio;
	
		
	public Instrumento(String nombre, double precio) {
		
		this.nombre = nombre;
		this.precio = precio;
	}
	
	//{
	//block de inicializacion, carga cada vez que se instancie un objeto de la clase
	//}
	
	static {
		System.out.println("Block static, solo se ejecuta una vez instancie la clase/o acceso a un miembro static");
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public abstract void tocar();
	
		
	@Override
	public String toString() {
		return "Instrumento [nombre=" + nombre + ", precio=" + precio + "]";
	}
	
		
}
