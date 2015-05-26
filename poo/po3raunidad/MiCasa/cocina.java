
public class cocina
{
  
   private String cosinaintegral;
   private int utencilios;
    public cocina (int utencilios)
    {
        this.utencilios=utencilios;
    }
    public int getUtencilios()
    {
        return utencilios;
    }
    public void setcocina(int nuevaCocina)
    {
      utencilios = nuevaCocina;
    }
    
      public cocina (String cosinaintegral)
    {
        this.cosinaintegral=cosinaintegral;
    }
    public String  getCosinaintegral()
    {
        return cosinaintegral;
    }
    public void setcocina(String nuevaCosinaintegral)
    {
    cosinaintegral = nuevaCosinaintegral;
      
      
    }
}