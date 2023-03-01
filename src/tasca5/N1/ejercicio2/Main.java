package tasca5.N1.ejercicio2;

import java.io.File;

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
		
		String sDirectorio = "c:/Users/rodri/Desktop/meses";
		File directorio = new File(sDirectorio);
		
		listarDirectorio(directorio,"");

	}


}
