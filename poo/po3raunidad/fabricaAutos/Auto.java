public class Auto
{
    
    String marca;
    Motor unMotor;
    Carroceria unaCarroceria;
    Llanta unasLlantas[];
    
       
    public Auto(String marca, String color, String marcaLlantas, int cilindros)
    
    {
        this.marca=marca;
        unMotor = new Motor(cilindros);
        unaCarroceria = new Carroceria(color);
        unasLlantas = new Llanta[4];
        
        for (int i=0;  i<4; i++)
        {
            unasLlantas[i] = new Llanta (marcaLlantas);
            
        }
    }
     public void mostrar()
     {
         System.out.println("Automovil marca: " + marca);
         System.out.println("Color: " + unaCarroceria.getColor());
         System.out.println("Llanta: " + unasLlantas[1].getMarca());
         System.out.println("Cilindros: " + unMotor.getCilindros());
     }
   
}
