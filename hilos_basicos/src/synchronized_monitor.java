

public class synchronized_monitor {
   
    private char [] buff =null;
    private int tope=0;
    private boolean lleno = false;
    private boolean vacio = true ;
    public  synchronized_monitor (int capacidad){
        buff= new char [capacidad];}
     public synchronized void poner (char c) throws InterruptedException  
    {
        while (lleno)
                {this.wait();}
         buff [++tope]=c;
         vacio=false;
         lleno= tope >= buff.length;
         this.notifyAll();
            
        }
     public synchronized char sacar () throws InterruptedException  
     {
         while (vacio)
                {wait();}
         tope--;
         char c= buff [tope];
         lleno=false;
         vacio =tope<=0;
         notifyAll();
         return c;
         
         }
    }
    
    

