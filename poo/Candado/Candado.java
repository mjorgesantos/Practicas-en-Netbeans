import java.util.Scanner;
public class  Candado 
{
     public static void main(String[] args)
   {
    int compara;
float contrase�a;
String jorge;
double Nombre;
String algo;
    Scanner scnrLeer=new Scanner (System.in);
     System.out.println("\t\t\tinserta contrase�a");
     // compara =scnrLeer.nextInt();
        contrase�a = scnrLeer.nextFloat();;
         
        //contrase�a =jorge;
         if (contrase�a==20)
             {
         System.out.println("\t\t\tingresa tu contrase�a ");
             }
         else
        {
        System.out.println("\t\t\tcontrase�a incorrecta");
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
