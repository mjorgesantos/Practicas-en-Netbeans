import java.util.Scanner;

public class nuevoexam
    
      {
    public static void main (String []args)
    {
        
        String Menu;
        int compara;
        float contador;
        float a,b,c,d;
        Scanner leer = new Scanner (System.in);
        
        do {
             System.out.println ("presione\n 1 para formula\n 2 para condicion\n 3 para Tabla ");  
             Menu = leer.nextLine();
             if(Menu.equals("1"))
              
               {
              System.out.println(" formula");
              System.out.println(" a+b/c");
              System.out.println(" a*b+C/d**2");
              Menu = leer.nextLine();
              if(Menu.equals("1"))
              {
              System.out.println(" a+b+c");
              }
              }
                if(Menu.equals("2"))
                    {
                
                    Scanner scnrLeer=new Scanner (System.in);
                    System.out.println("condicion");
                    compara =scnrLeer.nextInt();
                     // Menu= leer.nextLine();
                    if(Menu.equals("1"))
                    if (compara==20)
                    {
                    System.out.println("acertaste");
                    }
                    {
                    System.out.println("fallaste");
                     }
                     }
                Menu = leer.nextLine();
                if(Menu.equals("3"))
            
            
                  {
                if(Menu.equals("3"))
                System.out.println("Tabla");
                   //else if (Menu.equals("2"))
                for (contador=1; contador <=10; contador ++)
                {
                System.out.println ("9.9X"+contador+ "=" +(contador*9.9 ));   
                }
                }
                  
        }while(Menu.equals("1") );
    }
}