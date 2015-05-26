import java.util.Scanner;
public class Calculadora
{
    public static void main(String []args)
    {
        Operacion operacion;
        float valor1, valor2, resultado=0;
        String operador, opcion;
        Scanner scnrLeer = new Scanner(System.in);

        System.out.println("Inserte el valor 1");
        valor1 = scnrLeer.nextFloat();
        do
        {            
            System.out.println("Inserte el valor 2");
            valor2 = scnrLeer.nextFloat();
            System.out.println("Inserte operacion");
			//Leer dos veces de escaner, garantiza la lectura aun cuando
			//el buffer del teclado pudo haber quedado lleno
            operador = scnrLeer.nextLine(); 
            operador = scnrLeer.nextLine();
            operacion = new Operacion(valor1, valor2, operador); 
            
            if(operador.equals("+"))
            {
                resultado = operacion.suma();
            }
            else if(operador.equals("-"))
            {
                resultado = operacion.resta();
            }
            System.out.println("Desea agregar otra operacion");            
            opcion = scnrLeer.nextLine();
            if(opcion.equals("si"))
            {
                valor1 = resultado;
            }
            
        }while(!opcion.equals("no"));
        
        System.out.println("El resultado final es: "+ resultado);
    }
}
