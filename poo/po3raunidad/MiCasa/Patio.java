

public class Patio
{
  
    private String tamañometros;
  private int fuenteenmedio;
    public Patio(String tamañometros)
    {
        this.tamañometros=tamañometros;
    }
    public String getTamañometros()
    {
        return tamañometros;
    }
    public void setCompleto(String nuevaTamañometros)
    {
      tamañometros = nuevaTamañometros;
        
        }

 public  Patio(int  fuenteenmedio )
    {
        this.fuenteenmedio=fuenteenmedio;
    }
    public int getFuenteenmedio()
    {
        return fuenteenmedio;
    }
    public void setSencillo(int nuevaFuenteenmedio)
    {
  fuenteenmedio = nuevaFuenteenmedio;        
        
          
    }
}