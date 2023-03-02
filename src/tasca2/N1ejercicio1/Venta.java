package tasca2.N1ejercicio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Venta {
	
	private ArrayList<Producto> listaProductos;
	private double precioTotalVenta;
	
	public Venta() {
		
	}
	
	public Venta(ArrayList<Producto> listaProductos, double precioTotalVenta) {
		super();
		this.listaProductos = listaProductos;
		this.precioTotalVenta = precioTotalVenta;
	}
	

	public void calcularTotal( ArrayList<Producto> listaProductos) throws VendaBuidaException,ArrayIndexOutOfBoundsException {		
		
		double suma=0;
		
		
		
		if(listaProductos.size() == 0) {
			throw new VendaBuidaException("VendaBuidaException Para hacer una venta primero debes añadir productos");
			
		}else {
			for (int i = 0; i <listaProductos.size(); i++) {
				suma =  suma+ listaProductos.get(i).getPrecio();
			}
			precioTotalVenta=suma;			 
			System.out.println(listaProductos.toString() + " " + "Precio Total " + precioTotalVenta);
			throw new ArrayIndexOutOfBoundsException("ArrayIndexOutOfBoundsException atrapado");
		}
				
	}
	
}
