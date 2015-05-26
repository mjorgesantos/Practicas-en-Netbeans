
 
import java.util.Scanner;
public class LetraMedia {

    public static void main(String[] args)
    {
    
    String strNombre;
    Scanner scnrLeer=new Scanner(System.in);
    int contador,tamanioNombre;
    System.out.println("Escriba su nombre");
    strNombre=scnrLeer.nextLine();
    System.out.println("\n");
      tamanioNombre= strNombre.length();
      contador=0;
      while(!(contador==tamanioNombre/2))
      {
          contador++;
      }
      if(tamanioNombre%2==0)
      {
          contador--;
          System.out.print(strNombre.charAt(contador++));
      }
          System.out.println(strNombre.charAt(contador));
    }
}
   

