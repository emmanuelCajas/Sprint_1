package tasca5.N1.ejercicio1;

import java.io.File;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		
		File directorio = new File("c:/Users/formacio/Desktop");
		String[] listaDirectorios = directorio.list();
		
		Arrays.sort(listaDirectorios);
		
		if(directorio.isDirectory()) {
			for (String listado : listaDirectorios) {
				System.out.println(listado);
			}
		}else {
			System.out.println("La ruta ingresada no es un directorio");
		}
	}
}
