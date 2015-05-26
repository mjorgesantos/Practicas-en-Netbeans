public class TiendaManzana
{
    public static void main(String[]args)
    {
      //ManzanaVerde  Verde = new ManzanaVerde ("sabor"+"deliciosa");
      ManzanaTigre tigre = new ManzanaTigre("\tdeliciosa con precio de:"+20+"$ Kilo ");
    ManzanaVerde  verde = new ManzanaVerde ("\tdeliciosa con precio de:"+23+"$Kilo ");
 ManzanaRoja roja = new ManzanaRoja("\tdeliciosa con precio de:"+25+"$Kilo ");  
 ManzanaAmarilla amarilla = new ManzanaAmarilla("deliciosa con precio de:"+27+"$Kilo ");  
    
    tigre.mostrar();
         verde.mostrar(); 
         roja.mostrar();
        amarilla.mostrar();
    }
}
