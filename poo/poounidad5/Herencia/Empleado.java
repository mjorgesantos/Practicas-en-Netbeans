
public class Empleado
{
    
 protected int clave;
 protected String nombre;
    public Empleado(String nombre,int clave)
    {
        this.clave=clave;
        this.nombre=nombre;
    }

    public void mostrar ()
    {
       System.out.print("Empleado: "+ nombre+"con clave" + clave);
    }
}
