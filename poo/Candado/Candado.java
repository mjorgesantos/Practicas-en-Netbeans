import java.util.Scanner;
public class  Candado 
{
     public static void main(String[] args)
   {
    int compara;
float contraseña;
String jorge;
double Nombre;
String algo;
    Scanner scnrLeer=new Scanner (System.in);
     System.out.println("\t\t\tinserta contraseña");
     // compara =scnrLeer.nextInt();
        contraseña = scnrLeer.nextFloat();;
         
        //contraseña =jorge;
         if (contraseña==20)
             {
         System.out.println("\t\t\tingresa tu contraseña ");
             }
         else
        {
        System.out.println("\t\t\tcontraseña incorrecta");
       }
       
       
       
        Scanner leer =new Scanner (System.in);
      System.out.println ("ingrese su nombre:");
   //Nombre=leer.nextLine();
   // System.out.println (Nombre);
       
  Nombre = scnrLeer.nextDouble();;

    if (Nombre ==34)
       {
       
       System.out.println("\t\t\tingresa tu usuario ");
             }
         else
        {
        System.out.println("\t\t\t usuario incorrecto");
       }
       

    }
 }
