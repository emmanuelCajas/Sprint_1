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
	

	public void calcularTotal( ArrayList<Producto> listaProductos) throws VendaBuidaException {		
		
		double suma=0;
		
		if(listaProductos.size() == 0) {
			throw new VendaBuidaException("Para hacer una venta primero debes a�adir productos");
		}else {
			for (int i = 0; i <listaProductos.size()+1; i++) {
				suma =  suma+ listaProductos.get(i).getPrecio();
			}
			precioTotalVenta=suma;
		}
				
	}

	@Override
	public String toString() {
		return "Venta [listaProductos=" + listaProductos + ", precioTotalVenta=" + precioTotalVenta + "]";
	}
		
}
