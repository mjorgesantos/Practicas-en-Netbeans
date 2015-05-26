import java.util.Scanner;
public class Desiciones 
{
   public static void main(String[] args) 
   {
       
    String strNombre;
    int intOpcion;
    
    Scanner scnrLeer=new Scanner (System.in);
     System.out.println("Es tu nombre");
      strNombre=scnrLeer.nextLine();
       System.out.println("1  Escribir nombre arriba");
        System.out.println("2  Escribir nombre abajo");
         System.out.println("3  Escribir nombre enmedio"); 
     
         intOpcion = scnrLeer.nextInt();
         if (intOpcion==1)  
                 {
            System.out.println(strNombre); 
                 } 
     else if (intOpcion==2)
                {
             System.out.println("\n\n\n\n\n\n\n\n\n\n"+strNombre);
                   
                } 
     else if (intOpcion==3)     
               {            
            System.out.println("\n\n\n\n\t\t\t"+strNombre);          
               }  
  
         else

               {
          System.out.println("Opcion No soportada");     
           } 

     } 
 } 
