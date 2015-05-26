
public class Batimovil

{
    
    String batman;
    Motor unMotor;
    Carroceria unaCarroceria;
    Llanta unasLlantas[];
    Transformaciones transformacion;
    velocidad unkilometros;
       
    public  Batimovil(String batman, String color, String marcaLlantas, int cilindros, String avion, String kilometros)
    
    {
        this.batman=batman;
        unMotor = new Motor(cilindros);
        unaCarroceria = new Carroceria(color);
      transformacion=new Transformaciones (avion);
        unkilometros= new velocidad (kilometros);
        unasLlantas = new Llanta[6];

        for (int i=0;  i<6; i++)
        {
            unasLlantas[i] = new Llanta (marcaLlantas);
            
        }
    }
     public void mostrar()
     
     {
         System.out.println("Batman");
         System.out.println("Tiene un: " + batman);
         System.out.println("Color: " + unaCarroceria.getColor());
         System.out.println("Llantas: " + unasLlantas[1].getMarca());
         System.out.println("Cilindros: " + unMotor.getCilindros());
         System.out.println("Se transforma en: " + transformacion.getAvion());
         System.out.println("Alcansa una velocidad  de: " + unkilometros.getKilometros());
        }
   
}
