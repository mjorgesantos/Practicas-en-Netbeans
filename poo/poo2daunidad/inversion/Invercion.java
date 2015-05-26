import java.util.Scanner;


public class Invercion {

    
     public static void main(String[] args) 
    {
        String strNombre;
        Scanner scnrLeer =new Scanner (System.in);
        int contador, tamanioNombre;
        System.out.println ("escriba su nombre");
        strNombre = scnrLeer.nextLine();
        
        System.out.println ("\n");
       tamanioNombre=strNombre.length();
       contador=5;
       while (!(contador<5))
           {
        contador --;
           }
       //if (tamanioNombre <5)
       //{
       //    contador --;
           
       //}
      for (contador=(strNombre.length()-1); contador>=0; contador--)
               {
                    System.out.println(strNombre.charAt (contador));
               }

       // System.out.println(strNombre.charAt (contador--));
    
            //System.out.println(strNombre.charAt (contador));

    
    
    
}
}
