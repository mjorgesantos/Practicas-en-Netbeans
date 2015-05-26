
import java.util.Scanner;
public class Nuevavista
    
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
            System.out.print("AXB=\n");
            System.out.print("{");
           // for(repeticion=0; repeticion<5; repeticion++)
             for(contador=0; contador<5; contador++)
             {
              // for(contador=0; contador<5; contador++)
                for(repeticion=0; repeticion<5; repeticion++)
                 {
                     

                     System.out.print("("+ intConjuntoB[contador]+","+ intConjuntoA[repeticion]+ ")");
                    }
                    System.out.print("\n");
                  
                } System.out.print("\t\t\t}");
            }
        }


