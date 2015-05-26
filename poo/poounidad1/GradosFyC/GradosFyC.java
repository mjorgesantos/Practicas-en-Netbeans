import java.util.Scanner;

public class GradosFyC
{


    public static void main(String[] args)   
    {
 float  f=9 +32/5, c=5-32/9;
 float a=6, b=5,  e=9,  n=32, z=-32;
 
 
  
Scanner leer=new Scanner (System.in);
 System.out.println ("\t\t\tinserte la  temperatura en  grados");  
  System.out.println ( "\ninserte  temperatura en  centigrados");
 
     f=leer.nextFloat();
     f=e+n/b;

System.out.println ("\n\t\t\tgrados  Centigrados ="+ f+"\tgrados Farenheit" );
 System.out.println ( "\ninserte  temperatura en Farenheit ");
    c=leer.nextFloat();
       c=b-n/e;
 
System.out.println ("\n\t\t\tgrados  Farenheit ="+ c+"\tgrados Centigrados" );



    }
}