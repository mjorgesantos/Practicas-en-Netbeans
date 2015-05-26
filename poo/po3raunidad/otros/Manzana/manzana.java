public class manzana
{
  private int almacenaje;
  private int peso;
  private String tipo;
  //----------------------sobrecarga al constructor
  public manzana (String tipo, int pero)
  {
      almacenaje=20;
      this.tipo=tipo;
      this.peso=peso;
    }
    public manzana (String tipo)
    {
        this.peso=200;
        this.tipo=tipo;
        almacenaje=20;
    }
    public void madurar()
    {
      almacenaje+=2;
    }
    public void comer()
    {
        System.out.println("mmm manzanita "+ tipo +"ln que pesa" + peso + "gramos");
    }
}//fin de manzana
