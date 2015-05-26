
public class Manzana extends ManzanaRoja

{
    protected int peso;
    public Manzana(int peso,String Tigre, String Roja, String Amarilla, String Verde)
    {
        super(Tigre);// la primera lineaal principio del constructor del hijo siempre debe ser super
        this.peso=peso;
    }
    
    public void mostrar()
    {
        super.mostrar();
       
        System.out.println(" sabor:"+Roja);
    }   
    
}   


