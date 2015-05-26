package Proceso;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Tabla_Binario extends javax.swing.JFrame {

    String nom = null;
    int ds = 0;
    int car = 0;
    int indice = 1;
    int i = 1;

    private DefaultTableModel d1;
    private DefaultTableModel d2;
    private final int cantidad = 100;

    public Tabla_Binario() {
        initComponents();
        t1.setVisible(false);
        t2.setVisible(false);

        String[] title = {"Binarios"};
        Object[][] dato = {};
        d2 = new DefaultTableModel(dato, title);
        t2.setModel(d2);

        String[] titlem = {"Tabla de procesos intrrumpidos B"};
        Object[][] datom = {};
        d1 = new DefaultTableModel(datom, titlem);
        t1.setModel(d1);

        

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
                        Object[] otraFilaDeLaTable = {"\t\t" + cad + ""};//no borrar
                        // Object[] otraFilaDeLaTable = {"\t\t" + ds+ ""};
                        labelhilo.setText("Cargando en \t" + ds + "%..." + "\t Procesando \t" + cad + "%...");
                        d2.addRow(otraFilaDeLaTable);

                        if (ds == 100) {
                            this.resume();
                        }

                    }
                    hilo.sleep(150);

                }//termina  while 

            } catch (java.lang.InterruptedException jsm) {
                System.out.println(jsm.getMessage());
            }
        }
    };

    @SuppressWarnings("unchecked")
    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        binario = new javax.swing.JButton();
        btninterrumpe = new javax.swing.JButton();
        barra1 = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        t1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        t2 = new javax.swing.JTable();
        labelhilo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TextFiel_valida = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        binario.setText("Binario");
        binario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                binarioActionPerformed(evt);
            }
        });
        getContentPane().add(binario);
        binario.setBounds(32, 44, 65, 23);

        btninterrumpe.setText("Inerrumpir binario");
        btninterrumpe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninterrumpeActionPerformed(evt);
            }
        });
        getContentPane().add(btninterrumpe);
        btninterrumpe.setBounds(204, 44, 130, 23);
        getContentPane().add(barra1);
        barra1.setBounds(32, 148, 237, 14);

        t1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(t1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(362, 52, 172, 175);

        t2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Binario"
            }
        ));
        jScrollPane2.setViewportView(t2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(552, 44, 109, 406);

        labelhilo.setText("labelhilo");
        getContentPane().add(labelhilo);
        labelhilo.setBounds(94, 123, 38, 14);

        jLabel1.setText("escribe si o no ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(49, 88, 71, 14);
        getContentPane().add(TextFiel_valida);
        TextFiel_valida.setBounds(138, 85, 47, 20);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(176, 524, 73, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void binarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_binarioActionPerformed
        binario.setEnabled(false);///para visiblenovisble
        btninterrumpe.setEnabled(true);///
        t2.setVisible(true);
        barra1.setVisible(true);
        if (!issuspended) {
            if (String.valueOf(TextFiel_valida.getText()).compareTo("si") == 0) {
                // JOptionPane.showMessageDialog(null, "Inicia Proceso en Binarios ");
                hilo.start();
            } else {
                // JOptionPane.showMessageDialog(null, "Proceso no iniciado ");
            }
        } else {//de lo contrario
            hilo.resume();//el hilo se reanuda
            issuspended = false;//el hilo ya no esta suspendido
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_binarioActionPerformed
    private void btninterrumpeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninterrumpeActionPerformed
        hilo.suspend();//se suspende o pausa el hilo
        issuspended = true;//el hilo esta suspendido
        binario.setText("continuar");
        binario.setEnabled(true);
        btninterrumpe.setEnabled(false);
        Object[] marcaFilaDeLaTable = {"interrumpio en " + ds};
        t1.setVisible(true);
        d1.addRow(marcaFilaDeLaTable);
        // TODO add your handling code here:
    }//GEN-LAST:event_btninterrumpeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Tabla_Binario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabla_Binario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabla_Binario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabla_Binario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabla_Binario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextFiel_valida;
    private javax.swing.JProgressBar barra1;
    private javax.swing.JButton binario;
    private javax.swing.JButton btninterrumpe;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelhilo;
    private javax.swing.JTable t1;
    private javax.swing.JTable t2;
    // End of variables declaration//GEN-END:variables
}
