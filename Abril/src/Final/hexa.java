package Final;

import Proceso.TablaNumeros;
import static Proceso.TablaNumeros.esPrimo;
import Proceso.dos.exadecimal.*;
import Proceso.dos.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class hexa extends javax.swing.JFrame {

    String nom = null;
    int dsH = 0;
   
    private DefaultTableModel dtmH;
    private DefaultTableModel dtm1H;
    private DefaultTableModel dtm2H;
    private final int cant = 100;

    public hexa() {
        initComponents();
        tHex.setVisible(false);
        thexp.setVisible(false);

        String[] titleh = {"Hexadecimal......h"};
        Object[][] datoh = {};
        dtm1H = new DefaultTableModel(datoh, titleh);
        thexp.setModel(dtm1H);

        String[] titlemh = {"Tabla de procesos intrrumpidos "};
        Object[][] datomh = {};
        dtm2H = new DefaultTableModel(datomh, titlemh);
        tHex.setModel(dtm2H);

        String[] titulosh = {"indice", "Numero Hexadecimal encontrado"};
        Object[][] datosh = {};
        dtmH = new DefaultTableModel(datosh, titulosh);
        //tabla3.setModel(dtm);
//        scrollPane1.setVisible(false);

    }
    public boolean is = false;
    Thread hilo_1 = new Thread() {
        @Override
        public void run() {
            try {
                while (true) {
                    if (dsH == 101) {
                    }
                    dsH++;
                    ProgrressBar.setValue(dsH);
                    is = true;
                    if (dsH == 101) {
                        JOptionPane.showMessageDialog(null, "Termina proceso en Hexadecimal  ");
                        hilo_1.stop();
                    }
                    int dh = 0;
                    int x = 0;
                    dh = dsH;
                    if (dh > 0) {
                        String cadh = "";
                       cadh=Integer.toHexString(dh);
                        
                        System.out.println(cadh);
                        Object[] otraFilaDeLaTableh = {" \t" + dsH + "..Es equivalente  \n"  +"\t\t.." + cadh + "..en Hexadecimal"};//no borrar
                        // Object[] otraFilaDeLaTable = {"\t\t" + ds+ ""};
                        h.setText("Cargando en \t" + dsH + "%..." + "\t Procesando \t" + cadh + "%...");
                        dtm1H.addRow(otraFilaDeLaTableh);

                        if (dsH == 100) {
                            this.resume();
                        }

                    }
                    hilo_1.sleep(150);

                }//termina  while 

            } catch (java.lang.InterruptedException jsmh) {
                System.out.println(jsmh.getMessage());
            }
        }
    };

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bExa = new javax.swing.JButton();
        bincov = new javax.swing.JButton();
        ProgrressBar = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        tHex = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        thexp = new javax.swing.JTable();
        h = new javax.swing.JLabel();
        TextFiel_validaH = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        bExa.setText("Convertir a hexadecimal");
        bExa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExaActionPerformed(evt);
            }
        });
        getContentPane().add(bExa);
        bExa.setBounds(32, 44, 149, 23);

        bincov.setText(" Interrumpir conversión  ");
        bincov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bincovActionPerformed(evt);
            }
        });
        getContentPane().add(bincov);
        bincov.setBounds(199, 44, 155, 23);
        getContentPane().add(ProgrressBar);
        ProgrressBar.setBounds(32, 148, 237, 14);

        tHex.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tHex.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Marcacion de interrupcion"
            }
        ));
        jScrollPane1.setViewportView(tHex);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(360, 52, 121, 175);

        thexp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        thexp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Indice", "Hexadecimal"
            }
        ));
        jScrollPane2.setViewportView(thexp);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(499, 44, 246, 183);

        h.setText("labelhilo");
        getContentPane().add(h);
        h.setBounds(94, 123, 38, 14);
        getContentPane().add(TextFiel_validaH);
        TextFiel_validaH.setBounds(125, 85, 95, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bExaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExaActionPerformed
        bExa.setEnabled(false);///para visiblenovisble
        bincov.setEnabled(true);///
        thexp.setVisible(true);
        ProgrressBar.setVisible(true);
        if (!is) {
            if (String.valueOf(TextFiel_validaH.getText()).compareTo("si") == 0) 
                        {TextFiel_validaH.setText("");
                // JOptionPane.showMessageDialog(null, "Inicia Proceso en Binarios ");

                hilo_1.start();

            } else {
                // JOptionPane.showMessageDialog(null, "Proceso no iniciado ");
            }
        } else {//de lo contrario

            hilo_1.resume();//el hilo se reanuda
            is = false;//el hilo ya no esta suspendido
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_bExaActionPerformed

    private void bincovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bincovActionPerformed
        hilo_1.suspend();//se suspende o pausa el hilo
        is = true;//el hilo esta suspendido
        bExa.setText("continuar");
        bExa.setEnabled(true);
        bincov.setEnabled(false);
        Object[] Table = {"interrumpio en " + dsH};
         dtm2H.addRow(Table);
        tHex.setVisible(true);
       
        // TODO add your handling code here:
    }//GEN-LAST:event_bincovActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
    
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
        accion.setText("Se encontraron " + cantidad + " nº primos");////////////////////////
        if (cantidad == 100) {
            JOptionPane.showMessageDialog(null, "Continuar  proceso Binario ");
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

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(hexa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hexa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hexa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hexa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hexa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar ProgrressBar;
    private javax.swing.JTextField TextFiel_validaH;
    private javax.swing.JButton bExa;
    private javax.swing.JButton bincov;
    private javax.swing.JLabel h;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tHex;
    private javax.swing.JTable thexp;
    // End of variables declaration//GEN-END:variables
}
