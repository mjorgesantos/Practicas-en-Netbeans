
public class miniBanio

    {
    private String completo;
  private int sencillo;
    public miniBanio(String completo)
    {
        this.completo=completo;
    }
    public String getCompleto()
    {
        return completo;
    }
    public void setCompleto(String nuevaCompleto)
    {
        completo = nuevaCompleto;
        
        }

 public  miniBanio(int  sencillo )
    {
        this.sencillo=sencillo;
    }
    public int getSencillo()
    {
        return sencillo;
    }
    public void setSencillo(int nuevaSencillo)
    {
     sencillo = nuevaSencillo;        
        
          
    }
}