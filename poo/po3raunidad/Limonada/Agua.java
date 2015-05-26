public class Agua
{
    
    int aguaLitros;
    Limon limones;
    Azucar azucar;   
    public Agua(int aguaLitros, int cantLimones, int cantAzucar)
   {
        this.aguaLitros=aguaLitros;
        limones = new Limon(cantLimones);
        azucar = new Azucar(cantAzucar);    
   }
    public void mostrar()
       {
         System.out.println("Ingredientes para hacer una limonada");
         System.out.println("Litros de Agua " + aguaLitros);
         System.out.println("Cantidad de limones " + limones.getCantidad());
         System.out.println("Cantidad de Azucar " + azucar.getCantidad() + "cucharadas");
         
       }
  
        
 }
