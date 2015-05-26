

import java.util.Scanner;
public class Arreglo
{
public static void main(String []args)
{
int [][]intConjuntoA;
int repeticion, contador;
Scanner scnrLeer=new Scanner (System.in);
intConjuntoA = new int [5][5];
for (contador=0; contador<3;contador++)
{
intConjuntoA[contador]=new int [5];
}
System.out.println("Leyendo matriz");
for (repeticion=0; repeticion<5; repeticion++)
{
for (contador=0; contador<5; contador++)
{
intConjuntoA[repeticion][contador]= scnrLeer.nextInt();
}
}
for (repeticion=0; repeticion<5; repeticion++)
{
for (contador=0; contador<5; contador++)
{
System.out.print(intConjuntoA[repeticion][contador]+" ");
}
System.out.println();
}
for (contador=0; contador<3;contador++)
{
intConjuntoA[contador]=new int [5];
}
System.out.println("Leyendo matriz");
for (repeticion=0; repeticion<5; repeticion++)
{
for (contador=0; contador<5; contador++)
{
intConjuntoA[repeticion][contador]= scnrLeer.nextInt();
}
}
for (repeticion=0; repeticion<5; repeticion++)
{
for (contador=0; contador<5; contador++)
{
if (repeticion==contador)
{
System.out.print(intConjuntoA[repeticion][contador]+" ");
}
}
System.out.println(); 
}
for (contador=0; contador<3;contador++)
{
intConjuntoA[contador]=new int [5];
}
System.out.println("Leyendo matriz");
for (repeticion=0; repeticion<5; repeticion++)
{
for (contador=0; contador<5; contador++)
{
intConjuntoA[repeticion][contador]= scnrLeer.nextInt();
}
}
for (repeticion=0; repeticion<5; repeticion++)
{
for (contador=0; contador<5; contador++)
{
if (contador+repeticion==4)
{
System.out.print(intConjuntoA[repeticion][contador]+" ");
}
}
System.out.println();
}
}
}