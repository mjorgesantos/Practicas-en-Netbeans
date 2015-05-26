package Proceso;


import Final.*;
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
        int dsH = 0;
   
    private DefaultTableModel dtmH;
    private DefaultTableModel dtm1H;
    private DefaultTableModel dtm2H;
    private final int cant = 100;


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
     public boolean is = false;
    Thread hilo_1 = new Thread() 
    {
        //@Override
        public void run() {
            try {
                while (true) {
                    if (dsH == 101) {
                    }
                    dsH++;
                    ProgrressBarH.setValue(dsH);
                    is = true;
                    if (dsH == 101) {
                        JOptionPane.showMessageDialog(null, "Termina proceso en Hexadecimal  ");
                        hilo_1.stop();
                    }
                    int dh = 0;
                    
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
                           // this.resume();
                        }

                    }
                    hilo_1.sleep(150);

                }//termina  while 

            } catch (java.lang.InterruptedException jsmh) {
                System.out.println(jsmh.getMessage());
            }
        }
    };

    
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
        bExa = new javax.swing.JButton();
        bincovH = new javax.swing.JButton();
        ProgrressBarH = new javax.swing.JProgressBar();
        jScrollPane3 = new javax.swing.JScrollPane();
        tHex = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        thexp = new javax.swing.JTable();
        h = new javax.swing.JLabel();
        TextFiel_validaH = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        binario.setText("Binario");
        binario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                binarioActionPerformed(evt);
            }
        });

        btninterrumpe.setText("Inerrumpir binario");
        btninterrumpe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninterrumpeActionPerformed(evt);
            }
        });

        t1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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

        t2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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

        jButton1.setText("salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        bExa.setText("Convertir a hexadecimal");
        bExa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExaActionPerformed(evt);
            }
        });

        bincovH.setText(" Interrumpir conversión  ");
        bincovH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bincovHActionPerformed(evt);
            }
        });

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
        jScrollPane3.setViewportView(tHex);

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
        jScrollPane4.setViewportView(thexp);

        h.setText("labelhilo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(binario)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(labelhilo)))
                .addGap(6, 6, 6)
                .addComponent(TextFiel_valida, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(btninterrumpe, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(barra1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bExa)
                        .addGap(11, 11, 11)
                        .addComponent(bincovH, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(TextFiel_validaH, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(h)))
                .addGap(5, 5, 5)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(ProgrressBarH, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(611, 611, 611)
                .addComponent(jButton1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(binario)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)
                        .addGap(21, 21, 21)
                        .addComponent(labelhilo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(TextFiel_valida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btninterrumpe)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(barra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bExa)
                            .addComponent(bincovH))
                        .addGap(17, 17, 17)
                        .addComponent(TextFiel_validaH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(h))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(ProgrressBarH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(jButton1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void binarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_binarioActionPerformed
        binario.setEnabled(false);///para visiblenovisble
        btninterrumpe.setEnabled(true);///
        t2.setVisible(true);
        barra1.setVisible(true);
        if (!issuspended) {
          //  if (String.valueOf(TextFiel_valida.getText()).compareTo("si") == 0) {
                // JOptionPane.showMessageDialog(null, "Inicia Proceso en Binarios ");
                hilo.start();
            
        } 
        else {//de lo contrario
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

    private void bExaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExaActionPerformed
        bExa.setEnabled(false);///para visiblenovisble
        bincovH.setEnabled(true);///
        thexp.setVisible(true);
        ProgrressBarH.setVisible(true);
        if (! is) {
            if (String.valueOf(TextFiel_validaH.getText()).compareTo("si") == 0)
            {TextFiel_validaH.setText("");
                // JOptionPane.showMessageDialog(null, "Inicia Proceso en Binarios ");

                hilo_1.start();

            } 
        } else {//de lo contrario

            hilo_1.resume();//el hilo se reanuda
             is= false;//el hilo ya no esta suspendido
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_bExaActionPerformed

    private void bincovHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bincovHActionPerformed
        hilo_1.suspend();//se suspende o pausa el hilo
        is = true;//el hilo esta suspendido
        bExa.setText("continuar");
        bExa.setEnabled(true);
        bincovH.setEnabled(false);
        Object[] Table = {"interrumpio en " + dsH};
        dtm2H.addRow(Table);
        tHex.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_bincovHActionPerformed

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
    private javax.swing.JProgressBar ProgrressBarH;
    private javax.swing.JTextField TextFiel_valida;
    private javax.swing.JTextField TextFiel_validaH;
    private javax.swing.JButton bExa;
    private javax.swing.JProgressBar barra1;
    private javax.swing.JButton binario;
    private javax.swing.JButton bincovH;
    private javax.swing.JButton btninterrumpe;
    private javax.swing.JLabel h;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel labelhilo;
    private javax.swing.JTable t1;
    private javax.swing.JTable t2;
    private javax.swing.JTable tHex;
    private javax.swing.JTable thexp;
    // End of variables declaration//GEN-END:variables
}
