
public class Mango
{
    private String color;
    private String tipo;
    private String estado;
    private int peso;
    
    public Mango(String color,String estado,int peso)
    {
        this.color= color;
        this.estado= estado ;
        this.peso=peso;
        tipo="Exportacion";
    }
    
    public void probar()
    {
     System.out.println("mmm este mango esta "+ estado+",calidad de "+tipo+" y peso de "+peso+" gramos");   
    }
    public static void main(String[]args)
    {
        Mango manila = new Mango("Amarillo","Maduro",200);
        Mango petacon = new Mango("Rojiverde","Maduro",300);
        Mango mini = new Mango("Amarillo","Maduro",100);
        
        manila.probar();
        petacon.probar();
        mini.probar();
}
}