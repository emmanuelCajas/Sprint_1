package tasca6.N1ejercicio1;

public class Main {

	public static void main(String[] args) {
		
		NoGenericMethods objeto1 = new NoGenericMethods("Emmanuel","Cajas","Ballesteros");
		System.out.println(objeto1);
		NoGenericMethods objeto2 = new NoGenericMethods("Cajas","Ballesteros","Emmanuel");
		System.out.println(objeto2);
		NoGenericMethods objeto3 = new NoGenericMethods("Ballesteros","Cajas","Emmanuel");
		System.out.println(objeto3);
		
	}
}
