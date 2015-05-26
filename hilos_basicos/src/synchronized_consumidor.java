public class synchronized_consumidor extends Thread{
private synchronized_monitor buff;
private int n;
private int sleep;
public synchronized_consumidor(synchronized_monitor b, int n, int s)
{
    this.buff=b;
    this.n=n;
    this.sleep=s;
}
public void run(){
    try{
        char c;
        for(int i=0;i<n;i++){
            c=buff.sacar();
            System.out.println("consumidor: "+c);
            Thread.sleep((int)(Math.random()*sleep));
        }
    }catch(Exception ex){
        ex.printStackTrace();
        throw new RuntimeException(ex);}
    }
}
    

