package tasca5.N1.ejercicio3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
Modifica el ejercicio anterior. Ahora, en lugar de mostrar el resultado por la pantalla,
guarda el resultado en un archivo TXT.
*/

public class Main {


	public static void listarDirectorio(File f, String separador){
		File[] ficheros = f.listFiles();
		
		
		try {
			File archivo = new File("c:/Users/rodri/Desktop/prueba.txt");
			if(!archivo.exists()) {
				archivo.createNewFile();
				System.out.println("El archivo ha sido creado");
			}

			FileWriter fr = new FileWriter(archivo);
			BufferedWriter bw= new BufferedWriter(fr);
			PrintWriter pw = new PrintWriter(bw);
			
			for (int x=0;x<ficheros.length;x++){	
				
				String directorioFile;
				
				if(ficheros[x].isDirectory()) {
					directorioFile = "D";
				}else {
					directorioFile = "F";
				}
								
				pw.println(separador + ficheros[x].getName() + "   "+directorioFile + "   "+ficheros[x].lastModified() + "\n");
				
				System.out.println(separador + ficheros[x].getName() + "   "+directorioFile + "   "+ficheros[x].lastModified());
				if (ficheros[x].isDirectory()){
					String nuevo_separador;
					nuevo_separador = separador + " ";
					listarDirectorio(ficheros[x],nuevo_separador);
				}
			}
			bw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	
	
	public static void main(String[] args) {
		
		String sDirectorio = "c:/Users/rodri/Desktop/meses";
		File directorio = new File(sDirectorio);
		
		listarDirectorio(directorio,"");

	}
}
