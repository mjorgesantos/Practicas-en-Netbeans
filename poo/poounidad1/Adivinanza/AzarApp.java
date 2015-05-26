

import java.util.Random;

public class AzarApp {
  public static void main (String[] args) {
    int[] ndigitos = new int[10];
    int n;
    
    Random rnd = new Random();

// Inicializar el array
    for (int i = 0; i < 10; i++) {
        ndigitos[i] = 0;
    }

// verificar que los n�meros aleatorios est�n uniformente distribu�dos
    for (long i=0; i < 100000L; i++) {
// genera un n�mero aleatorio entre 0 y 9
        n = (int)(rnd.nextDouble() * 10.0);
//Cuenta las veces que aparece un n�mero
        ndigitos[n]++;
    }

// imprime los resultados
    for (int i = 0; i < 10; i++) {
        System.out.println(i+": " + ndigitos[i]);
    }

//Dos secuencias de 5 n�mero (distinta semilla)
    System.out.println("Primera secuencia");
    for (int i = 0; i < 5; i++) {
        System.out.print("\t"+rnd.nextDouble());
    }
    System.out.println("");

    System.out.println("Segunda secuencia");
    for (int i = 0; i < 5; i++) {
        System.out.print("\t"+rnd.nextDouble());
    }
    System.out.println("");

//Dos secuencias de 5 n�mero (misma semilla)
    rnd.setSeed(3816L);
    System.out.println("Primera secuencia");
    for (int i = 0; i < 5; i++) {
        System.out.print("\t"+rnd.nextDouble());
    }
    System.out.println("");

    rnd.setSeed(3816);
    System.out.println("Segunda secuencia");
    for (int i = 0; i < 5; i++) {
        System.out.print("\t"+rnd.nextDouble());
    }
    System.out.println("");
  }
}