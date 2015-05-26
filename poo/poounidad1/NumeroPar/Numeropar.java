
import java.util.Scanner;
public class Numeropar
 {

     public  static void main(String[] args) 
     {
         int intNumero;
         Scanner scnrLeer=new Scanner (System.in);
         System.out.println("ingrese numero");
         intNumero =scnrLeer.nextInt()
         ;
         
         if (intNumero %2==0)
          {
         System.out.println(intNumero +"Numero + es par");
          }
         else
          {
             System.out.println(intNumero+"es non");
   
          }
     }
}
