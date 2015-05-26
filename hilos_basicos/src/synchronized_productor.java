
public class synchronized_productor extends Thread{
private synchronized_monitor buff;
private int n;
private int sleep;
public synchronized_productor(synchronized_monitor b, int n, int s)
{
    this.buff=b;
    this.n=n;
    this.sleep=s;
}
public void run(){
    try{
        char c;
        for(int i=0;i<n;i++){
            c=(char)('A'+i);
            buff.poner(c);
            
            System.out.println("Produje: "+c);
            Thread.sleep((int)(Math.random()*sleep));
        }
    }
        catch(Exception ex)
                {
        ex.printStackTrace();
        throw new RuntimeException(ex);}
    }
}
    
