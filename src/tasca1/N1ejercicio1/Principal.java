package tasca1.N1ejercicio1;

public class Principal {

	public static void main(String[] args) {
		
		Cuerda cuerda1 = new Cuerda("Guitarra", 200.0 );
		System.out.println(cuerda1);
		Viento viento1 = new Viento("Trompeta", 300.0);
		System.out.println(viento1);
		Percusion percusion1 = new Percusion("Bateria", 1400.0);
		System.out.println(percusion1);

		System.out.println("");
		
		//Accediendo desde miebro static
		System.out.println(Cuerda.getNombreStatic());
		System.out.println(Percusion.getNombreStatic());
		System.out.println(Viento.getNombreStatic());
		
	}

}
