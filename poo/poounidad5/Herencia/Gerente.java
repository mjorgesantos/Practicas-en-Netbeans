
public class Gerente extends Empleado
{
    protected String nivel;
    public Gerente(String nombre, int clave,String nivel)
    {
        super(nombre,clave);// la primera lineaal principio del constructor del hijo siempre debe ser super
        this.nivel=nivel;
    }
    
    public void mostrar()
    {
        super.mostrar();
        System.out.println(" nivel:"+nivel);
    }   
    
}   

