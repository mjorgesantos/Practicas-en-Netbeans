

public class casa
{
    

String comoescasa;
Jardin jardincito;
cocina cocinita;
//cochera guardar;
Sala salita;
Patio patiecito;
Baño bañito;
Recamaras recamarita;

 public casa( String comoescasa, String unJardincito, String unaCocinita, String unaSalita, String unPatiecito, String unBañito, String unasRecamarita)  
 //public casa( String comoescasa, String unJardincito, String unaCocinita, String guardar, String unaSalita, int unPatiecito, String unBañito, String unasRecamarita)  
 {
       this.comoescasa=comoescasa;
       jardincito=new Jardin (unJardincito);
        cocinita =new cocina (unaCocinita);
          //guardar =new cochera (guardar);
          salita =new Sala (unaSalita);
       patiecito =new Patio (unPatiecito);
       bañito    =new Baño (unBañito);
      recamarita =new Recamaras (unasRecamarita);
}
public void mostrar()
{

         System.out.println("como es mi casa en 20 amños");
         //System.out.println("lo que tiene mi casa "+comoescasa);
System.out.println("tiene un gran jardin "+jardincito.getTipoplantas());
System.out.println("una amplia"+salita.getCantina()); 
System.out.println(" patio con  fuente    "+patiecito.getTamañometros()); 
System.out.println("2 baños `"+bañito.getCompleto());
System.out.println("segundo piso "+recamarita.getClosets());
System.out.println("una cocina "+cocinita.getCosinaintegral());
 }
}