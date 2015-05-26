
public class Empresa
{
    public static void main(String[]args)
    {
        Gerente miriam = new Gerente ("Miriam",1234,"Tics");
        Empleado mario = new Empleado ("Mario", 4321);
    
        miriam.mostrar(); 
        mario.mostrar();
    }
}
