package tasca2.N1ejercicio1;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		
		ArrayList<Producto> listaProductos1 = new ArrayList<Producto>();
		ArrayList<Producto> listaProductos2 = new ArrayList<Producto>();
		
		Venta venta1 = new Venta();
		Venta venta2 = new Venta();
		
		
		//Enviando la Venta vacia
		try {
			venta1.calcularTotal(listaProductos2);
		} catch (VendaBuidaException e) {
			System.out.println(e.getMessage());
		}
				
		Producto producto1 = new Producto("galleta", 1.2);
		Producto producto2 = new Producto("gelatina", 5.2);
		Producto producto3 = new Producto("pepinillo", 1.5);
		Producto producto4 = new Producto("jamon", 4.5);
						
		listaProductos1.add(producto1);
		listaProductos1.add(producto2);
		
		
		listaProductos2.add(producto3);
		listaProductos2.add(producto4);
		
		
		try {
			venta1.calcularTotal(listaProductos1);
			venta2.calcularTotal(listaProductos2);
			
		} catch (VendaBuidaException e) {
			System.out.println(e.getMessage());
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}		
		
	}
	
}
