import java.util.Scanner;
public class tabla {

    public static void main(String[] args) {

   System.out.println("ingrese un nunero de tipo entero");
     Scanner leer=new Scanner(System.in); 
     
     int numero=leer.nextInt(); 

    for(int i=1; i<=10; i++){
    System.out.println(i+"x"+numero+"="+numero*i ); 

    
       }

    }
}