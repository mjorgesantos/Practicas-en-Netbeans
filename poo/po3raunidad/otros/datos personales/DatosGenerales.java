
import java .util.Scanner;
public class DatosGenerales
{
 public static void main(String[]args)//linea de comienzo en el programa
 {
      String Nombre;//declaracion de la variable
      Scanner leer = new Scanner (System.in);
      System.out.println("Ingrese su nombre: ");
      Nombre=leer.nextLine();
      String Numero;
      System.out.println("Ingrese su Numero de control: ");
      Numero=leer.nextLine();
      String Grupo;
      System.out.println("Ingrese su Grupo: ");
      Grupo=leer.nextLine();
      System.out.println("\n\t\t\t\t     "+Nombre);//aqui se ponene los espacios en que aparecera en mensaje
      System.out.println("\n\t\t\t\t     "+Numero);
      System.out.println("\n\t\t\t\t     "+Grupo);
     
 } 
}
