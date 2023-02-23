package tasca5.N1.ejercicio2;

import java.io.File;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		
		File directorio = new File("c:/Users/rodri/Desktop");
		File[] listaDirectorios = directorio.listFiles();
		
		Arrays.sort(listaDirectorios);
		
		
			for (File listado : listaDirectorios) {
				System.out.println(listado);
			}
	
	}
}
