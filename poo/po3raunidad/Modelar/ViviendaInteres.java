

public class ViviendaInteres
{
    
     String modelar ;
miniBanio ba�o;
    MiniSalaDe sala;
    MiniCocina cocina;
    MiniRecamaraDe recamara;
    
    
       
    public ViviendaInteres(String modelar, String unminiBanio, String  unaMiniSalaDe, String  unaMiniRecamaraDe,  String unaMiniCocina )
   {
        this.modelar=modelar;
       ba�o = new miniBanio(unminiBanio);
sala=  new MiniSalaDe (unaMiniSalaDe );
cocina =new  MiniCocina ( unaMiniCocina);
recamara=new MiniRecamaraDe (unaMiniRecamaraDe);
                      
   }
    public void mostrar()
   {
         System.out.println("El vendedor muestra");
     // System.out.println("Litros de Agua " + modelar);
         System.out.println("un ba�o  " +ba�o.getCompleto());
         System.out.println("tiene una amplia " + sala.getMuebles());
System.out.println("una cocina con  " + cocina.getMiniCocina() );
System.out.println("cuenta con " + recamara.getMoviliario() );        
   }
   public static void main (String [] args)
    {
         
    ViviendaInteres casa = new ViviendaInteres ("el modelo es","peque�o","sala ","3 recamaras","cocina integral");
       ViviendaInteres  depto = new ViviendaInteres  ("el modelo es","grande","sala con cantina  ","3 recamaras peque�as","utencilios");
        casa.mostrar();
       depto.mostrar();
        
    }
}
