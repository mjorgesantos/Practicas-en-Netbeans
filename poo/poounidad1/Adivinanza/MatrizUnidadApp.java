public class MatrizUnidadApp {
  public static void main (String[] args) {
  


	 		
	int [] m = new int[4];
			
	for (int i=0; i < m.length; i++) {
	  System.out.print("valor a introducir en la "+(i+1) +" posicion: ");
	  m[i] = Utilidades.leerEntero();
	}
System.out.println();
for (int i=0; i < m.length; i++) {	
       System.out.println("     "+ m[i] + " * "+ i + " = "+ m[i] * i);
	  m[i] = m[i] * i;
	}
System.out.println();
	for (int i=0; i < m.length; i++) {
	  System.out.println("posicion: "+(i+1)+" valor del elemento:"+ m[i]);
	}	
}
}