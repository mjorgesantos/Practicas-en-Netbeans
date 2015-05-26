

public class Sala

{
    private String cantina;
   private int muebles;
   
   public Sala(String cantina)
    {
        this.cantina=cantina;
    }
    public String getCantina()
    {
        return cantina;
    }
    public void setCantina(String nuevaCantina)
    {
        cantina= nuevaCantina;
    }

 public Sala(int muebles)
    {
        this.muebles=muebles;
    }
    public int getMuebles()
    {
        return muebles;
    }
    public void setMuebles(int nuevaMuebles)
    {
        muebles= nuevaMuebles;
    }

}