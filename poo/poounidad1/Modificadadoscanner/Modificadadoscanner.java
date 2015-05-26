import java.util.Scanner;


public class Modificadadoscanner
{
    
    public static void main(String[] args)
    {
             String Nombre;
               String Apellidos;
                Scanner leer =new Scanner (System.in);

                   System.out.println ("\t\t\t\t\t\tingrese su nombre:");
                    Nombre=leer.nextLine();
                     System.out.println ("\t\t\t\t\t\tHola\t"+Nombre);
                       Apellidos=leer.nextLine(); 
                        System.out.println ("\t\t\t\t\t\t\t"+Apellidos); 
       
   
    }
  }
