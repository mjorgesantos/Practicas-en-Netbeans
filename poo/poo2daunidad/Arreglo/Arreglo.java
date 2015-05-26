 
public class Arreglo{
    
public static void main(String[]args)
{
   int contador;
   String strNombre= "Ejemplo";
   char[]charNombre = {'E','j','e','m','p','l','o'};
   System.out.println ("imprime un String caracter a caracter");
   for(contador= 0;contador< strNombre.length();contador++)
   {
       System.out.println(strNombre.charAt(contador));
   }
       System.out.println("imprime un arreglo de caracteres" );
       for(contador=0; contador<7; contador++)
   {
   System.out.println(charNombre[contador]);
   }
}
} 


   

