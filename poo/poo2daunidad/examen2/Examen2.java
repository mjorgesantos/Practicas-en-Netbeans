
import java.util.Scanner;
public class Examen2
    {
        public static void main(String []args)
        {
             int contador, repeticion;
             int []intConjuntoA;
             int []intConjuntoB;
             intConjuntoA=new int[5];
             intConjuntoB=new int[5];
             Scanner scnrLeer= new Scanner(System.in);
             for(contador=0; contador<5; contador++)
            {
                intConjuntoA[contador]= scnrLeer.nextInt();
                intConjuntoB[contador]= scnrLeer.nextInt();
            }
             for(repeticion=0; repeticion<5; repeticion++)
             {
                 for(contador=0; contador<5; contador++)
                 {
                     System.out.print("("+ intConjuntoA[repeticion]+","+ intConjuntoB[contador]+ ")");
                    }
                    System.out.print("\n");
                }
            }
        }
             