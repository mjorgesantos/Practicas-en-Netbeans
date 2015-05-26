
public class Aplicacion
{
private String colorRojo;
private String colorVerde;
private String colorAmarillo;
public Aplicacion (String colorRojo, String colorVerde,String colorAmarillo )
{
this.colorRojo=colorRojo;
this.colorVerde=colorVerde;
this.colorAmarillo=colorAmarillo;
}
public String getColorRojo ()
{
   return colorRojo;
}
  public void setColorRojo (String nuevocolorRojo)
{
colorRojo = nuevocolorRojo; 
}  

public String getColorVerde ()
{
return colorVerde;
}
public void setColorVerde (String nuevocolorVerde)
{
colorVerde=nuevocolorVerde; 
}  
public String getColorAmarillo ()
{
return colorAmarillo;
}
public void setColorAmarillo (String nuevocolorAmarillo)
{
colorAmarillo=nuevocolorAmarillo; 
}  
public void semaforo ()
{
System.out.println ("Usted solicito  conducir al semaforo   que esta en ");
System.out.println ("Rojo en"+colorRojo);
System.out.println ("verde en "+colorVerde);
System.out.println ("Amarillo en "+colorAmarillo);
 }  
public static void main(String[] args) 
{
Aplicacion quecolor=new Aplicacion (" 2 minutos","3 minutos","5 minutos");
quecolor.semaforo();
Aplicacion enunsemaforoesta =new Aplicacion(" 5 minutos","4 minutos","2 minutos");
 enunsemaforoesta .semaforo();
}
}
