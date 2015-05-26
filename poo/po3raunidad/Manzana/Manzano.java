

public class Manzano
{
    
    public static void main(String[]args)
    {
        Manzana roja= new Manzana("roja");
        Manzana amarilla= new Manzana("amarilla");
        Manzana verde= new Manzana("verde,300");
    
        roja.madurar();
        roja.madurar();
        roja.comer();
        amarilla.comer();
        verde.madurar();
        verde.comer();
    }
}
