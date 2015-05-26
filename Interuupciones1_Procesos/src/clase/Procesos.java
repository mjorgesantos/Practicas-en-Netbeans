package clase;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Procesos extends javax.swing.JFrame {

    String nom = null;
    int ds = 0;
    int car = 0;
    int indice = 1;
    int i = 1;
    String nom_Hexadecimal = null;
    int conteoHexadecimal = 0;
    private DefaultTableModel d1;
    private DefaultTableModel d2;
    private DefaultTableModel d3;
    private DefaultTableModel dtm1H;
    private DefaultTableModel dtm2H;
    private final int cant = 100;
    private final int cantidad = 100;

    public Procesos() {
        initComponents();
        t1.setVisible(false);
        t2.setVisible(false);
        c1.setVisible(false);
        c2.setVisible(false);
        b1.setVisible(false);
        b2.setVisible(false);
        t1.setVisible(false);
        t2.setVisible(false);
        t3.setVisible(false);
        t4.setVisible(false);
        String[] title = {"Binarios"};
        Object[][] dato = {};
        d2 = new DefaultTableModel(dato, title);
        t2.setModel(d2);

        String[] titlem = {"Tabla de procesos Interrumpidos "};
        Object[][] datom = {};
        d1 = new DefaultTableModel(datom, titlem);
        t1.setModel(d1);
        String[] titleHexadecimal = {"Hexadecimal"};
        Object[][] datoHexadecimal = {};
        dtm1H = new DefaultTableModel(datoHexadecimal, titleHexadecimal);
        t4.setModel(dtm1H);
        String[] title_Hexadecimal = {"Tabla de procesos Interrumpidos "};
        Object[][] datom_Hexadecimal = {};
        dtm2H = new DefaultTableModel(datom_Hexadecimal, title_Hexadecimal);
        t3.setModel(dtm2H);
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
                    b1.setValue(ds);
                    issuspended = true;
                    if (ds == 101) {
                        
                        hilo.stop();
                        JOptionPane.showMessageDialog(null, "Termina proceso en Binario  ");
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
                        d2.addRow(otraFilaDeLaTable);
                        
                        ////////////////////
                        
                        
                        /*
                         * 
                         */
                        
                        
                        
                        if (ds == 100) {
                            c1.setVisible(false);
                            b2.setVisible(true);
                            t4.setVisible(true);
                            c2.setVisible(true);
                            hilo_Hexadecimal.start();
                        }
                    }
                    hilo.sleep(200);
                }
            } catch (java.lang.InterruptedException jsm) {
                System.out.println(jsm.getMessage());
            }
        }
    };
    @SuppressWarnings("unchecked")
    public boolean issuspended_Hexadecimal = false;
    Thread hilo_Hexadecimal = new Thread() {
        @Override
        public void run() {
            try {
                while (true) {
                    if (conteoHexadecimal == 101) {
                       /// JOptionPane.showMessageDialog(null, "Termina proceso en Binario  ");
                    }
                    conteoHexadecimal++;
                    b2.setValue(conteoHexadecimal);
                    issuspended_Hexadecimal = true;
                    if (conteoHexadecimal == 101) {
                       JOptionPane.showMessageDialog(null, "Termina proceso en Hexadecimal  ");
                        hilo_Hexadecimal.stop();
                        
                    }
                    int d = 0;
                    int x = 0;
                    d = conteoHexadecimal;
                    if (d > 0) {
                        String cad = "";
                        cad = Integer.toHexString(d);
                        System.out.println(cad);
                        Object[] otraFilaDeLaTable = {" \t" + conteoHexadecimal + "=   \n" + cad + "\n  Hexadecimal"};//no borrar
                        Hexadecima_label.setText("Cargando en \t" + conteoHexadecimal + "%..." + "\t Procesando \t" + cad + "%...");
                        dtm1H.addRow(otraFilaDeLaTable);
                        
                        
                       if (conteoHexadecimal == 100) {
                            
                           hilo.resume();
                            
                             b1.setVisible(true);
                        t2.setVisible(true);
                        c1.setVisible(true);
                        }
                        
                        
                     else {
                            if (conteoHexadecimal == 100) {
                                JOptionPane.showMessageDialog(null, "Inicia proceso en Binario  ");
                        b1.setVisible(true);
                        t2.setVisible(true);
                        c1.setVisible(true);
                        hilo.start();
                    }
                             
                       }
                        

                  // }

                   
                    //////////
                       
                    //////////
                }
                hilo_Hexadecimal.sleep(200);
            }
        }
        catch (java.lang.InterruptedException jsm

        
            ) {
                System.out.println(jsm.getMessage());
        }
    }
};
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        binario = new javax.swing.JButton();
        btninterrumpe = new javax.swing.JButton();
        b1 = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        t1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        t2 = new javax.swing.JTable();
        labelhilo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        botonconvertir_Hexadecimal = new javax.swing.JButton();
        boto_interumpir_Hexadecimal = new javax.swing.JButton();
        b2 = new javax.swing.JProgressBar();
        jScrollPane3 = new javax.swing.JScrollPane();
        t3 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        t4 = new javax.swing.JTable();
        Hexadecima_label = new javax.swing.JLabel();
        c1 = new javax.swing.JLabel();
        c2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 630));
        setMinimumSize(new java.awt.Dimension(900, 630));
        setPreferredSize(new java.awt.Dimension(1049, 596));
        getContentPane().setLayout(null);

        binario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        binario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clase/recursos/b (1).gif"))); // NOI18N
        binario.setText("Binario");
        binario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                binarioActionPerformed(evt);
            }
        });
        getContentPane().add(binario);
        binario.setBounds(30, 60, 129, 55);

        btninterrumpe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btninterrumpe.setText("Interrumpir Binario");
        btninterrumpe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninterrumpeActionPerformed(evt);
            }
        });
        getContentPane().add(btninterrumpe);
        btninterrumpe.setBounds(350, 60, 210, 25);

        b1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(b1);
        b1.setBounds(32, 148, 360, 20);

        t1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
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
        jScrollPane1.setBounds(582, 50, 200, 90);

        t2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
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
        jScrollPane2.setBounds(800, 40, 109, 230);

        labelhilo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelhilo.setText("                                   0.0.0");
        getContentPane().add(labelhilo);
        labelhilo.setBounds(34, 123, 340, 17);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(460, 560, 73, 31);

        botonconvertir_Hexadecimal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonconvertir_Hexadecimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clase/recursos/b (2).gif"))); // NOI18N
        botonconvertir_Hexadecimal.setText(" Hexadecimales");
        botonconvertir_Hexadecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonconvertir_HexadecimalActionPerformed(evt);
            }
        });
        getContentPane().add(botonconvertir_Hexadecimal);
        botonconvertir_Hexadecimal.setBounds(50, 320, 187, 55);

        boto_interumpir_Hexadecimal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        boto_interumpir_Hexadecimal.setText(" Interrumpir Conversión  ");
        boto_interumpir_Hexadecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto_interumpir_HexadecimalActionPerformed(evt);
            }
        });
        getContentPane().add(boto_interumpir_Hexadecimal);
        boto_interumpir_Hexadecimal.setBounds(320, 320, 230, 25);

        b2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(b2);
        b2.setBounds(30, 420, 370, 20);

        t3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        t3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(t3);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(550, 280, 210, 90);

        t4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        t4.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(t4);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(770, 280, 200, 270);

        Hexadecima_label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Hexadecima_label.setText("                                    0.0.0");
        getContentPane().add(Hexadecima_label);
        Hexadecima_label.setBounds(30, 400, 260, 17);

        c1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clase/recursos/ajax-loader.gif"))); // NOI18N
        getContentPane().add(c1);
        c1.setBounds(410, 140, 112, 32);

        c2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clase/recursos/ajax-loader.gif"))); // NOI18N
        getContentPane().add(c2);
        c2.setBounds(420, 410, 32, 32);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clase/recursos/label1.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(160, 0, 190, 130);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clase/recursos/engrane.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(360, 190, 200, 140);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clase/recursos/fondo.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(4, 0, 1040, 660);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void binarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_binarioActionPerformed
        JOptionPane.showMessageDialog(null, "Inicia  proceso en Binario  ");
        binario.setEnabled(false);///para visiblenovisble
        btninterrumpe.setEnabled(true);///
        //t1.setVisible(true);
        t2.setVisible(true);
        b1.setVisible(true);
        if (!issuspended) {
            hilo.start();
            c1.setVisible(true);
        } else {
            hilo.resume();
            issuspended = false;
            }
        // TODO add your handling code here:
    }//GEN-LAST:event_binarioActionPerformed
    private void btninterrumpeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninterrumpeActionPerformed

        t1.setVisible(true);
        hilo.suspend();
        issuspended = true;
        binario.setText("continuar");
        binario.setEnabled(true);
        btninterrumpe.setEnabled(false);
        Object[] marcaFilaDeLaTable = {"Interrumpió en " + ds};
        t1.setVisible(true);
        d1.addRow(marcaFilaDeLaTable);
        if (conteoHexadecimal == 100) {
            hilo.resume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btninterrumpeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonconvertir_HexadecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonconvertir_HexadecimalActionPerformed
/////////////////////////////////
        
        t1.setVisible(true);
        hilo.suspend();
        issuspended = true;
        binario.setText("continuar");
        binario.setEnabled(true);
        btninterrumpe.setEnabled(false);
        Object[] marcaFilaDeLaTable = {"Interrumpió en " + ds};
        t1.setVisible(true);
        d1.addRow(marcaFilaDeLaTable);
        if (conteoHexadecimal == 100) {
            hilo.resume();
        }

        //////////////////////////////
        
        JOptionPane.showMessageDialog(null, "Inicia proceso en Hexadecimal  ");
        botonconvertir_Hexadecimal.setEnabled(false);
        boto_interumpir_Hexadecimal.setEnabled(true);
        t4.setVisible(true);
        b2.setVisible(true);
        if (!issuspended_Hexadecimal) {
            hilo_Hexadecimal.start();
            c2.setVisible(true);
        } else {
            hilo_Hexadecimal.resume();
            issuspended_Hexadecimal = false;
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_botonconvertir_HexadecimalActionPerformed
    private void boto_interumpir_HexadecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto_interumpir_HexadecimalActionPerformed
        JOptionPane.showMessageDialog(null, "A Interrumpido  ");
        hilo_Hexadecimal.suspend();//se suspende o pausa el hilo
        issuspended_Hexadecimal = true;//el hilo esta suspendido
        botonconvertir_Hexadecimal.setText("continuar");
        botonconvertir_Hexadecimal.setEnabled(true);
        boto_interumpir_Hexadecimal.setEnabled(false);
        Object[] Table = {"interrumpio en " + conteoHexadecimal};
        t3.setVisible(true);
        dtm2H.addRow(Table);
        // TODO add your handling code here:
    }//GEN-LAST:event_boto_interumpir_HexadecimalActionPerformed

    /**
     *
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
            java.util.logging.Logger.getLogger(Procesos.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 

catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Procesos.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 

catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Procesos.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 

catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Procesos.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Procesos().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Hexadecima_label;
    private javax.swing.JProgressBar b1;
    private javax.swing.JProgressBar b2;
    private javax.swing.JButton binario;
    private javax.swing.JButton boto_interumpir_Hexadecimal;
    private javax.swing.JButton botonconvertir_Hexadecimal;
    private javax.swing.JButton btninterrumpe;
    private javax.swing.JLabel c1;
    private javax.swing.JLabel c2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel labelhilo;
    private javax.swing.JTable t1;
    private javax.swing.JTable t2;
    private javax.swing.JTable t3;
    private javax.swing.JTable t4;
    // End of variables declaration//GEN-END:variables
}
