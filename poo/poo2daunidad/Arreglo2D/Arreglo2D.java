
import java.util.Scanner;
public class Arreglo2D
    {
        public static void main(String []args)
        {
            int repeticion, contador;
            int [][] intConjuntoA;
            Scanner scnrLeer=new Scanner(System.in);
            intConjuntoA=new int [3][3];
            for (contador =0; contador<3; contador++)
            {
                intConjuntoA [contador]=new int[3];
            }
            System.out.println("Leyendo la matriz");
            for (repeticion=0; repeticion<3; repeticion++)
            {
                for (contador=0;contador<3; contador++)
                {
                    intConjuntoA [repeticion][contador]=scnrLeer.nextInt();
                }
            }
            for (repeticion=0;repeticion<3;repeticion++)
            {
                for(contador=0;contador<3;contador++)
                {
                    System.out.print(intConjuntoA[repeticion][contador]+" ");
                }
                System.out.println();
            }
        }
    }

            




