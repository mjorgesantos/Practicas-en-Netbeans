
import java.util.Random; 
public class Rand { 

public static void main(String[] args) { 

int x, aleatorio=0, prom=0; 
Random rand = new Random(); //Declaro objeto de clase Random() 
System.out.println("Numeros aleatorios de 1 a 100"); 

for(x=0; x<100;x++){ 
aleatorio = rand.nextInt(100); //Genero el numero diciendole que el valor maximo de numero es de 100 
System.out.println("\nNumero es:"+aleatorio); 
prom+=aleatorio; 
} 
prom = prom/100; 
System.out.println("El promedio de estos numeros es: "+prom); 

} 
} 
