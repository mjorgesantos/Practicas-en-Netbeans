/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hilo_so;

/**
 *
 * @author pc2
 */
public class hilos01 extends Thread {
    String nombre;
    public hilos01 (String nombre_hilo)
    { this.nombre=nombre_hilo;    }
    
    public void run(){
        int x=0;
        int tiempo_espera;
        tiempo_espera=5000;
         System.out.println("");
        System.out.println("Ejecutandose el Hilo :"+this.nombre);
        for (x=0; x==tiempo_espera; x++)
            System.out.printf("%d",x);
        System.out.println("");
            System.out.println("Teminado:"+this.nombre);
    }
    }
        
    
