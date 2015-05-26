public class Manzana
{
    private String tipo;
    private int tiempoAlmacenaje;
    private int peso;
    
    public Manzana(String tipo)
    {
       this.tipo=tipo;
       peso=150;
       tiempoAlmacenaje=20;
    }
    
    public Manzana(String tipo,int peso)
{
    this.tipo=tipo;
    this.peso=peso;
    tiempoAlmacenaje= 20;
}
     public void madurar()   
    {
        tiempoAlmacenaje+=2;
    }
public void comer()
{
    System.out.println("Saboreando una deliciosa manzana "+tipo+"\n que pesa "+peso+"gramos");
}
}