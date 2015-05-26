import java.util.Scanner;
public class AregloEntero
{
    public static void main (String []args)
    {
        int [] intConjunto;
        int contador;
        Scanner scnrLeer =new Scanner (System.in);
        intConjunto = new int[5]; //solicita 5 espacios en memoria para 5 enteros 
        for (contador=0; contador<5; contador++)
        {
            intConjunto [contador]= scnrLeer. nextInt();
        }
        for (contador=0; contador<5; contador++)
        {
            System.out.print(intConjunto[contador]);
        }
    }
}