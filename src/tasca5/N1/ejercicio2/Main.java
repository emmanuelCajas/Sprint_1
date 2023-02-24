package tasca5.N1.ejercicio2;

import java.io.File;
import java.util.Arrays;

public class Main {

	public static void listarDirectorio(File f, String separador){
		File[] ficheros = f.listFiles();
				
		for (int x=0;x<ficheros.length;x++){	
			
			String directorioFile;
			
			if(ficheros[x].isDirectory()) {
				directorioFile = "D";
			}else {
				directorioFile = "F";
			}
			
			System.out.println(separador + ficheros[x].getName() + "   "+directorioFile + "   "+ficheros[x].lastModified());
			
			if (ficheros[x].isDirectory()){
				String nuevo_separador;
				nuevo_separador = separador + " ";
				listarDirectorio(ficheros[x],nuevo_separador);
			}
		}	
	}
	
	
	public static void main(String[] args) {
		
		String sDirectorio = "c:/Users/rodri/Desktop/eclipse/Sprint_1";
		File directorio = new File(sDirectorio);
		
		listarDirectorio(directorio,"");

	}

//	public static void listar(File directorio, String separador) {
//
//		File[] ficheros = directorio.listFiles();
//		Arrays.sort(ficheros);
//		for (int i = 0; i < ficheros.length; i++) {
//
//			if (ficheros[i].isDirectory()) {
//				
//				System.out.println(ficheros[i].getName() + "  D");
//				String nuevoSeparador;
//				nuevoSeparador = separador + " ";
//				
//				listar(ficheros[i],nuevoSeparador);
//			}else {
//				System.out.println(ficheros[i].getName() + "  F");
//			}
//		}
//
//	}
//
//	public static void main(String[] args) {
//
//		File directorio = new File("c:/Users/rodri/Desktop/eclipse/Sprint_1");
//		String separador ="";
//		listar(directorio,separador);
//
//	}
}
