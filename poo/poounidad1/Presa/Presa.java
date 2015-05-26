import java.util.Scanner;

   public class Presa
{
  
    
    public static void main(String[] args)
    {
        String sensor;
        int actuador =10;
        Scanner leer=new Scanner (System.in);

  System.out.println ("presione + para incrementar - para decrementar  s para salir ");
  System.out.println ("presion:"+actuador);

  sensor=leer.nextLine();
  while  (! sensor.equals ("s"))
           {
             if (sensor. equals ("+"))
     
           { 
              actuador ++;
           }
              else if (sensor.equals ("-"))
          
               {
              actuador --;
              System.out.println ("presione + para incrementar - para decrementar   ");
              System.out.println ("presio:"+ actuador);
              sensor=leer.nextLine();
                }
             System.out.println ("see you");
            }
        }
    }