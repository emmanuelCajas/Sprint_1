package tasca1.N1ejercicio2;

public class Coche {
	
	private static final String marca = "Kia";
	private static String modelo = "Sportage";
	private final int potencia;
	

		
	public Coche(String modelo, int potencia){
		//this.marca = marca; 		  //no se puede cambiar ya que marca esta inicializado como constante
		Coche.modelo   = modelo;	  //Si se cambia el modelo, cambia el modelo asignado a la clase no al objeto y todos los ojetos intanciados de esa clase cambian
		this.potencia = potencia; 	  //Puede inicializarce solo cuando se crea el objeto, luego no se puede modificar
	}

	public static String getModelo() {
		return modelo;
	}

	public static void setModelo(String modelo) {
		Coche.modelo = modelo;
	}

	public static String getMarca() {
		return marca;
	}

	public int getPotencia() {
		return potencia;
	}
	
	
	public static void frenar(){
		System.out.println("El vehiculo esta frenando...");
	}
	
	public void acelerar() {
		System.out.println("El vehiculo esta acelerando...");
	}

	@Override
	public String toString() {
		return "Coche [Marca=" + marca + " modelo=" + modelo + " potencia=" + potencia + "]";
	}




	
	
}
