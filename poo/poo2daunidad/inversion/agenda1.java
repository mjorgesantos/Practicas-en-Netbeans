import java.util.Scanner; 

public class agenda1{ 
public static void main (String[]args ){ 
String nombre; 
String dir; 
String tel; 
char sexo; 
Scanner teclado =new Scanner(System.in); 
System.out.println("nombre"); 
nombre=teclado.next(); 
System.out.println("direcion"); 
dir=teclado.next(); 
System.out.println("telefono "); 
tel=teclado.next(); 
System.out.println("sexo"); 

sexo=teclado.next().charAt(0); 

// O tambien 
// String cadSexo=teclado.next(); 
// sexo=cadSexo.charAt(0); 
} 
} 