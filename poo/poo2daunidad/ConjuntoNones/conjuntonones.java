import java.util.Scanner;
public class conjuntonones
{
    public static void main (String []args)
    {
        int []intConjunto;
        int contador;
        
        Scanner scnrLeer =new Scanner (System.in);
        intConjunto = new int[5]; //solicita 5 espacios en memoria para 5 enteros 
        for (contador=0; contador<5; contador++)
        {
            intConjunto [contador]= scnrLeer. nextInt();
        }
        for (contador=0; contador<5; contador++)
        {
             
       
        //IntNumero = scnrLeer.nextInt();
        if(intConjunto[contador] %2 ==1)
        {
            
         System.out.print(intConjunto[contador]);
        }
            
        
    }
}
}