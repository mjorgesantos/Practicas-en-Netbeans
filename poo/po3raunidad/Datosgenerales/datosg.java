import java.util.Scanner;
public class datosg
{
      String datos;
    nombre nombres;
    grupo grupos;
   numcontrol numcontroles;
    Scanner leer = new Scanner(System.in);
   public datosg(String datos, String unnombre, String ungrupo, String unnumcontrol)
    {
        this.datos=datos;
        nombres= new nombre (unnombre);
        grupos=new grupo (ungrupo);
       numcontroles=new numcontrol(unnumcontrol);
    }
    public void mostrar()
    {

//System.out.println(nombre+ "ingresa");
System.out.println("Datos Generales ");

//System.out.println("tu nombre"+datos);
System.out.println("tu Nombre:"+nombres.getNombre());
System.out.println("tu Grupo:"+grupos.getGrupo());
System.out.println("tu Numero de control:"+numcontroles.getNumcontrol());
             //nombre=leer.nextLine();



    }
}