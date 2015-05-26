package Proceso.dos.exadecimal;

import Proceso.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class binario extends javax.swing.JFrame {

    String nom = null;
    int ds = 0;
    int car = 0;
    int indice = 1;
    int i = 1;

    private DefaultTableModel d1;
    private DefaultTableModel d2;
    private DefaultTableModel d3;
    private DefaultTableModel d4;
    private final int cantidad = 100;

    public binario() {
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

        String[] titulos = {"Tabla de procesos intrrumpidos E"};
        Object[][] datos = {};
        d3 = new DefaultTableModel(datos, titulos);
        t4.setModel(d3);
        
        String[] tit = {"indice", "Exadecimal"};
        Object[][] dat = {};
        d4 = new DefaultTableModel(dat, tit);
        t3.setModel(d4);
//        scrollPane1.setVisible(false);

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
    public boolean issuspen = false;
    Thread hilo1 = new Thread() {
        //  @Override
        public void runn() {

            try {
                while (true) {
                    if (car == 101) {
                    }
                    car++;
                    barra2.setValue(car);
                    issuspen = true;
                    if (car == 101) {
                        JOptionPane.showMessageDialog(null, "Termina proceso en Binario  ");
                        hilo1.stop();
                    }

                    String numero = "";
                    int d = 0;
                    d = car;

                    numero = Integer.toHexString(d);
                    System.out.println("Decimal a Hexadecimal: " + numero);
                    Object[] oFilaDeLaTable = {"\t\t" + numero + ""};//no borrar
                    // Object[] otraFilaDeLaTable = {"\t\t" + ds+ ""};
                    lblporcentaje.setText("Cargando en \t" + d + "%..." + "\t Procesando \t" + numero + "%...");
                    d4.addRow(oFilaDeLaTable);

                    if (car == 100) {
                        this.resume();
                    }

                    hilo1.sleep(150);

                }//termina  while 

            } catch (java.lang.InterruptedException jsm) {
                System.out.println(jsm.getMessage());
            }
        }
    };

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        binario = new javax.swing.JButton();
        interexa = new javax.swing.JButton();
        btninterrumpe = new javax.swing.JButton();
        Exadecimal = new javax.swing.JButton();
        barra1 = new javax.swing.JProgressBar();
        barra2 = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        t1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        t2 = new javax.swing.JTable();
        labelhilo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TextFiel_valida = new javax.swing.JTextField();
        lblporcentaje = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        t4 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        t3 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        binario.setText("Binario");
        binario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                binarioActionPerformed(evt);
            }
        });

        interexa.setText("Interrumpir Exadecimal");
        interexa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                interexaActionPerformed(evt);
            }
        });

        btninterrumpe.setText("Inerrumpir binario");
        btninterrumpe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninterrumpeActionPerformed(evt);
            }
        });

        Exadecimal.setText("Exadecimal");
        Exadecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExadecimalActionPerformed(evt);
            }
        });

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

        labelhilo.setText("labelhilo");

        jLabel1.setText("escribe si o no ");

        lblporcentaje.setText("jLabel2");

        t4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane3.setViewportView(t4);

        t3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "tabla de interrupciones  de proceso exadecimal"
            }
        ));
        jScrollPane4.setViewportView(t3);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Exadecimal)
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(108, 108, 108)
                                        .addComponent(interexa))
                                    .addComponent(barra2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(binario)
                                        .addGap(107, 107, 107)
                                        .addComponent(btninterrumpe, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(barra1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(TextFiel_valida, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addComponent(labelhilo))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(126, 126, 126)
                                        .addComponent(lblporcentaje)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(91, 91, 91)))
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(342, 342, 342))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btninterrumpe)
                                    .addComponent(binario))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel1))
                                    .addComponent(TextFiel_valida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(labelhilo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(barra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblporcentaje)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addComponent(barra2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(interexa)
                            .addComponent(Exadecimal))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(359, Short.MAX_VALUE))
        );

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

    private void ExadecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExadecimalActionPerformed
        Exadecimal.setEnabled(false);///para visiblenovisble
        interexa.setEnabled(true);///
        t4.setVisible(true);
        barra2.setVisible(true);
        if (!issuspen) {
             
        } else {//de lo contrario
            hilo1.resume();//el hilo se reanuda
            issuspen = false;//el hilo ya no esta suspendido
        }

        
// TODO add your handling code here:
    }//GEN-LAST:event_ExadecimalActionPerformed

    private void interexaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_interexaActionPerformed
        hilo1.suspend();//se suspende o pausa el hilo
        issuspen = true;//el hilo esta suspendido
        Exadecimal.setText("continuar");
        Exadecimal.setEnabled(true);
       interexa.setEnabled(false);

       Object[] exaFilaDeLaTable = {"interrumpio en " + car};
        t3.setVisible(true);
        d4.addRow(exaFilaDeLaTable);

        // TODO add your handling code here:
    }//GEN-LAST:event_interexaActionPerformed

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
            java.util.logging.Logger.getLogger(binario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(binario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(binario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(binario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new binario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exadecimal;
    private javax.swing.JTextField TextFiel_valida;
    private javax.swing.JProgressBar barra1;
    private javax.swing.JProgressBar barra2;
    private javax.swing.JButton binario;
    private javax.swing.JButton btninterrumpe;
    private javax.swing.JButton interexa;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel labelhilo;
    private javax.swing.JLabel lblporcentaje;
    private javax.swing.JTable t1;
    private javax.swing.JTable t2;
    private javax.swing.JTable t3;
    private javax.swing.JTable t4;
    // End of variables declaration//GEN-END:variables
}
