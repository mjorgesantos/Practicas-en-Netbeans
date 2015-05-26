package Proceso;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class TablaNumeros extends Thread implements ActionListener {

    String nom = null;
    int ds = 0;
    int indice = 1;
    int i = 1;
    private JProgressBar barra = new JProgressBar();
    private JProgressBar barra1 = new JProgressBar();
    private JFrame ventana = new JFrame("Procesos");
    private JButton iniciar = new JButton("Iniciar  busqueda de nº primos");
    private JButton salir = new JButton("Salir");
    private JButton adjuntar = new JButton("Cargar tabla en Binarios");
    private JLabel accion = new JLabel("Aguardando interacción del usuario");
    private JLabel porcentaje = new JLabel("");
    private JLabel cargando = new JLabel("cargando");
    private JLabel labelnombre = new JLabel("Escribe Si / No para Cargar Numeros Binarios");
    private JTextField nombre = new JTextField(30);
    private JLabel labelhilo = new JLabel("");//////////////////////
    private JTable tabla = new JTable();
    private JTable tabla1 = new JTable();
    private JScrollPane scrollPane = new JScrollPane(tabla);
    private JScrollPane scrollPane1 = new JScrollPane(tabla1);
    private DefaultTableModel dtm;
    private DefaultTableModel dtm1;
    private final int cantidad = 100;

    public TablaNumeros() {
        ventana.setLayout(null);
        setActionListeners(this);
        ventana.setSize(800, 700);
        labelnombre.setBounds(60, 100, 400, 20);
        nombre.setBounds(320, 100, 100, 25);////
        
     adjuntar.setBounds(70, 50, 200, 40);
       iniciar.setBounds(290, 50, 200, 40);
        
        labelhilo.setBounds(100, 180, 400, 20);
        barra1.setBounds(20, 200, 500, 15);
        accion.setBounds(20, 220, 250, 20);
        scrollPane.setBounds(20, 270, 500, 270);
        scrollPane1.setBounds(550, 15, 150, 520);
        barra.setBounds(20, 550, 500, 15);
       // iniciar.setBounds(280, 100, 240, 40);
        porcentaje.setBounds(20, 550, 400, 20);
        porcentaje.setHorizontalAlignment(porcentaje.CENTER);
        ventana.add(accion);
        ventana.add(salir);
        ventana.add(iniciar);
        ventana.add(scrollPane);
        ventana.add(scrollPane1);
        ventana.add(porcentaje);
        ventana.add(barra);
        ventana.add(barra1);
        ventana.add(cargando);
        ventana.add(adjuntar);
        ventana.add(nombre);
        ventana.add(labelnombre);
        ventana.add(labelhilo);
        barra.setMaximum(cantidad);
        barra1.setMaximum(cantidad);
        barra.setVisible(false);
        barra1.setVisible(false);
        scrollPane1.setVisible(false);
        scrollPane.setVisible(false);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        String[] title = {"Binarios"};
        Object[][] dato = {};
        dtm1 = new DefaultTableModel(dato, title);
        tabla1.setModel(dtm1);
        String[] titulos = {"indice", "Numero primo encontrado"};
        Object[][] datos = {};
        dtm = new DefaultTableModel(datos, titulos);
        tabla.setModel(dtm);
    }

    public void setActionListeners(ActionListener lis) {
        iniciar.addActionListener(lis);
        adjuntar.addActionListener(lis);
    }
    
    
    
    
    private void resumeNow() { //Con este metodo reanudo el Thread
    //if (this != null) { // evitar NullPointerException
    
        if (ds==100) { // evitar NullPointerException
    this.resume();
    }
  }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == iniciar) {
            scrollPane.setVisible(true);
            barra.setVisible(true);
            hilo.suspend();/////esta linea  te marca cuando  se hace la interrupcion de el proceso de registrar
            JOptionPane.showMessageDialog(null, "Inicia busqueda de nº primos  ");
            iniciar.setText("Iniciado");
            accion.setText("Obteniendo nº primos");
            this.start();
        }
        if (e.getSource() == adjuntar) {
            
            this.suspend();
            this.resume();
            if (String.valueOf(nombre.getText()).compareTo("si") == 0) {
                JOptionPane.showMessageDialog(null, "Inicia Proceso en Binarios ");
                hilo.start();
                scrollPane1.setVisible(true);
            barra1.setVisible(true);
                
            } else {
                JOptionPane.showMessageDialog(null, "Proceso no iniciado ");
            }
            
        }
    }

    public boolean issuspended = false;
    Thread hilo = new Thread() {
        @Override
        public void run() {
            try {
                while (true) {
                    if (ds == 101) {
                    }
                    ds++;
                    barra1.setValue(ds);
                    issuspended = true;
                    if (ds == 101) {
                        JOptionPane.showMessageDialog(null, "Termina proceso en Binario  ");
                                   hilo.stop();
                    }
                    int d = 0;
                    int x = 0;
                    d = ds;
                    if (d > 0) {
                        String cad = "";
                        while (d > 0) {
                            if (d % 2 == 0) {
                                cad = "0" + cad;
                            } else {
                                cad = "1" + cad;
                            }
                            d = (int) d / 2;
                        }
                        System.out.println(cad);
                        Object[] otraFilaDeLaTable = {"\t\t" + cad + ""};
                        labelhilo.setText("Cargando en \t" + ds + "%..." + "\t Procesando \t" + cad + "%...");
                        dtm1.addRow(otraFilaDeLaTable);
    if (ds == 100) {//////1100100
        //  System.out.println("ds"+ds);
         // JOptionPane.showMessageDialog(null, "XD ");
     this.resume ();            }
                            
                        
                    }
                    hilo.sleep(150);
             
                }//termina  while 
                
            } catch (java.lang.InterruptedException jsm) {
                System.out.println(jsm.getMessage());
            }
        }
    };

    public void run() {
        while (indice < cantidad + 1) {
            if (esPrimo(i)) {
                Object[] otraFilaDeLaTabla = {"Cargando en \t" + indice + "\t %", i};
                dtm.addRow(otraFilaDeLaTabla);
                barra.setValue(indice);
                porcentaje.setText(("Cargando en \t " + (indice * 100) / cantidad) + "%");
                indice++;
                try {
                    Thread.sleep(100);
                                 } catch (InterruptedException ex) {
                    Logger.getLogger(TablaNumeros.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            i++;
        }
        JOptionPane.showMessageDialog(null, "Termina proceso de busqueda  ");
        barra.setValue(indice);
        porcentaje.setText("100%");
        iniciar.setText("Finalizado");
        adjuntar.setText("Finalizado");
        accion.setText("Se encontraron " + cantidad + " nº primos");
        if (cantidad == 100) {
            JOptionPane.showMessageDialog(null, "Contunuar  proceso Binario ");
            hilo.resume();
                }//---------------
    
    }

    public static boolean esPrimo(int numero) {
        int contador = 0;
        for (int j = numero; j >= 1; j--) {
            if ((numero % j) == 0) {
                contador++;
            }
        }
        if (contador == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] arg) {
        new TablaNumeros();
    }
}
