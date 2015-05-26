

public class Baño
{
  
    private String completo;
  private int sencillo;
    public Baño(String completo)
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

 public  Baño(int  sencillo )
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