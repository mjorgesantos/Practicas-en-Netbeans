public class Principal_Hilos {

    public static void main(String[]args)throws InterruptedException{
synchronized_monitor monitor = new synchronized_monitor(3);
synchronized_consumidor consumidor=new synchronized_consumidor(monitor,6,4000);
synchronized_productor productor=new synchronized_productor(monitor,6,2000);
productor.start();
consumidor.start();

 }   
}
