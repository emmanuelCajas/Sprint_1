package tasca4.N1.ejercicio2;

import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		
		 Integer dni = 12345678;
		 
		 Integer resto = dni%23;
		 System.out.println(resto);
		 
		 HashMap<Integer,String> tablaLetrasDNI = new HashMap<>();
		 
		 tablaLetrasDNI.put(0,"T");
		 tablaLetrasDNI.put(1,"R");
		 tablaLetrasDNI.put(2,"W");
		 tablaLetrasDNI.put(3,"A");
		 tablaLetrasDNI.put(4,"G");
		 tablaLetrasDNI.put(5,"M");
		 tablaLetrasDNI.put(6,"Y");
		 tablaLetrasDNI.put(7,"F");
		 tablaLetrasDNI.put(8,"P");
		 tablaLetrasDNI.put(9,"D");
		 tablaLetrasDNI.put(10,"X");
		 tablaLetrasDNI.put(11,"B");
		 tablaLetrasDNI.put(12,"N");
		 tablaLetrasDNI.put(13,"J");
		 tablaLetrasDNI.put(14,"Z");
		 tablaLetrasDNI.put(15,"S");
		 tablaLetrasDNI.put(16,"Q");
		 tablaLetrasDNI.put(17,"V");
		 tablaLetrasDNI.put(18,"H");
		 tablaLetrasDNI.put(19,"L");
		 tablaLetrasDNI.put(20,"C");
		 tablaLetrasDNI.put(21,"K");
		 tablaLetrasDNI.put(22,"E");
		 
		 String numeroDNI="";
		 
		 numeroDNI = dni + tablaLetrasDNI.get(resto).toUpperCase();
		 System.out.println(numeroDNI);
		 
		 //if(resto.equals(tablaLetrasDNI.)) {}
		 
		 
	}
}
