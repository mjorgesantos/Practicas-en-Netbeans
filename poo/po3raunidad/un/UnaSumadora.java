import java.util.Scanner;
public class UnaSumadora
{
   private float x,y;
   Scanner  scnrLeer;
   public void suma1 () //es invocado  no depende   de algun metodo no geneta  dependencia 
   {
       scnrLeer=new Scanner (System.in);
        System.out.println ("inserte 2 numeros");
       x=scnrLeer.nextFloat();
       y=scnrLeer.nextFloat(); 
    System.out.println (x+"+"+y+"="+(x+y));
    }
public void  suma2 (float x, float y)//depende del trabajo de otro metodo 
{
System.out.println (x+"+"+y+"="+(x+y));

}
public float  suma3 ()//es invocado no depende  de algun  metodo pero  gana dependencia 
{
 scnrLeer=new Scanner (System.in);
 System.out.println ("inserte 2 numeros");
 x=scnrLeer.nextFloat();
 y=scnrLeer.nextFloat();
 System.out.print (x+"+"+y);
 return x + y;
}
public float  suma4 (float x, float y)//depende del tabajo  de otro  metodo  gana  dependencia 
{
return x+y;
}
public static void main (String []args )
{
float z,x,y;

Scanner scnrLeer2=new Scanner (System.in);
UnaSumadora s =new UnaSumadora();
System.out.println ("inserte  2 numeros");
x=scnrLeer2.nextFloat();
y=scnrLeer2.nextFloat(); 

s.suma1 ();
s.suma2 (x,y);
z=s.suma3();
System.out.println ("="+z);
z=s.suma4 (x,y);
System.out.println (x+"+"+y+"="+z);
}
}

