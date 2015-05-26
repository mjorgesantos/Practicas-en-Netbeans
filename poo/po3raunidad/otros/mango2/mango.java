public class mango
{
  private String color;
  private String tipo;
  private String estado;
  private int peso;
  //---------------------------
   public mango (String color, String estado, int peso)
   {
       this.color = color;
       this.estado = estado;
       this.peso = peso;
       tipo = "exportacion";
    }
    public void probar ()
    {
        System.out.println("mmm este mango esta " + estado + " calidad de  " + tipo + " peso de " + peso + " gramos");
    }
    public static void main (String [] args)
    {
        mango manila = new mango ("Amarillo", "Maduro", 200);
        mango petacon = new mango ("Rojiverde", "Maduro", 300);
        mango mini = new mango ("Amarillo", "Maduro", 100);
        manila.probar();
        petacon.probar();
        mini.probar();
    }//fin ddee main
}//fin de clase
        
