import java.util.Scanner;
public class Adivinanza 
{
     public static void main(String[] args)
   {
    int compara;
    Scanner scnrLeer=new Scanner (System.in);
     System.out.println("\t\t\t¿Cual  es mi edad?");
      compara =scnrLeer.nextInt();
         
         
         if (compara==20)
             {
         System.out.println("\t\t\tacertaste");
             }
         else
        {
        System.out.println("\t\t\t!!!fallaste");
       }
    }
 }
