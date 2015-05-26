
import java.util.Scanner;
public class Calculadora
{
  
    
    public static void main(String[] args)
    {
int sumando, sumando1, sumando2;
int restando, restando1, restando2;
int multiplicando, multiplicando1, multiplicando2;
int dividiendo, dividiendo1, dividiendo2;

float sumand, sumand1, sumand2;
float restand, restand1, restand2;
float  multiplicand, multiplicand1, multiplicand2;
float dividiend, dividiend1, dividiend2;

Scanner leer =new Scanner (System.in);

System.out.println ("ingrese el primer  sumando");
sumando=leer.nextInt();
System.out.println ("ingrese el segundo sumando");
sumando1=leer.nextInt();
sumando2= sumando + sumando1;
System.out.println (sumando + "+"+ sumando1 + " = " +sumando2);
System.out.println ("ingrese el pirmer sumando");
sumand=leer.nextFloat();
System.out.println ("ingrese el segundo sumando");
sumand1=leer.nextFloat();
sumand2= sumand + sumand1;
             System.out.println (sumand+ "+"+ sumand1 + "="+ sumand2 );
  
     
System.out.println ("ingrese el primer  restando");
restando=leer.nextInt();
System.out.println ("ingrese el segundo restando");
restando1=leer.nextInt();
restando2= restando - restando1;
System.out.println (restando+ "-"+  restando1 + " = " +restando2);
System.out.println ("ingrese el pirmer restando");
restand=leer.nextFloat();
System.out.println ("ingrese el segundo restando");
restand1=leer.nextFloat();
restand2=restand - restand1;
             System.out.println (restand+ "-"+  restand1 + "="+ restand2 );
  
             
             
System.out.println ("ingrese el primer  multiplicando");
multiplicando=leer.nextInt();
System.out.println ("ingrese el segundo multiplicando");
multiplicando1=leer.nextInt();
multiplicando2= multiplicando * multiplicando1;
System.out.println (multiplicando +  multiplicando1 + " = " +multiplicando2);
System.out.println ("ingrese el pirmer multiplicando");
multiplicand=leer.nextFloat();
System.out.println ("ingrese el segundo multiplicando");
multiplicand1=leer.nextFloat();
multiplicand2=  multiplicand *  multiplicand1;
             System.out.println ( multiplicand+   multiplicand1 + "="+  multiplicand2 );
  
  

System.out.println ("ingrese el primer dividiendo");
dividiendo=leer.nextInt();
System.out.println ("ingrese el segundo dividiendo");
dividiendo1=leer.nextInt();
dividiendo2= dividiendo/ dividiendo1;
System.out.println (dividiendo +  dividiendo1+ " = " +dividiendo2);
System.out.println ("ingrese el pirmer dividiendo");
dividiend=leer.nextFloat();
System.out.println ("ingrese el segundo dividiendo");
dividiend1=leer.nextFloat();
dividiend2=  dividiend /  dividiend1;
             System.out.println ( dividiend+   dividiend1 + "="+  dividiend2 );
          }
  }