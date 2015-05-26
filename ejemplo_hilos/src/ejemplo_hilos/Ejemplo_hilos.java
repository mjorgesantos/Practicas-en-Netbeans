/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_hilos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jorge
 */
public class Ejemplo_hilos {

    /**22222
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero_procesos;

        Proceso hilo0 = new Proceso("X0", 1);
        Proceso hilo1 = new Proceso("X1", 2);
        Proceso hilo2 = new Proceso("X2", 3);
        Proceso hilo3 = new Proceso("X3", 4);
        Proceso hilo4 = new Proceso("X4", 4);

        hilo0.setPriority(Thread.MIN_PRIORITY);
        hilo1.setPriority(Thread.NORM_PRIORITY);
        hilo2.setPriority(Thread.MAX_PRIORITY);
        hilo3.setPriority(8);
        hilo4.setPriority(9);

        hilo0.start();
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();


    }
}//fin hilo

class Proceso extends Thread{

String nombre_procesos;
int numero_procesos;

public Proceso (String nombre, int nProceso){
    this.nombre_procesos=nombre;
    this.numero_procesos=nProceso;
    
    
}
    @Override
public void run (){
    
    for (int i=0;i<10;i++){
        System.out.println(this.nombre_procesos+":"+i);
        try{ Thread.sleep(100);
         
        }
        catch (InterruptedException ex){
            Logger.getLogger(Proceso.class.getName()).log(Level.SEVERE,null,ex);
            
        }//fin  run
    }//fin clas proceso
            System.out.println(this.nombre_procesos+"ha terminado"+this.getName());


    }
}