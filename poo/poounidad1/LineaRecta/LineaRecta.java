

import java.util.Scanner;
public class LineaRecta
{
public static void main (String [] args)
  {
float m1, b1, x, y=0, y1=1, y2=2, y3=3;

Scanner leer=new Scanner (System.in);
 System.out.println("Inserta el valor de m");
   m1= leer.nextFloat ();
System.out.println("inserte el valor de b");
  b1=leer.nextFloat();
   System.out.println("el valor de la recta es:");
     x=(y-b1)/m1;
System.out.println(" Para y=0, x ="+x);
  x=(y1-b1)/m1;
   System.out.println(" Para y=1, x1="+x);
    x=(y2-b1)/m1;
System.out.println(" Para y=2, x2="+x);
   x=(y3-b1)/m1;
    System.out.println(" Para y=3, x3="+x);
  }
}
