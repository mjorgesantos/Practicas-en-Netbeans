package Proceso.dos.exadecimal;

import Proceso.dos.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Tabla_2 extends javax.swing.JFrame {

    String nom = null;
    int dsH = 0;
   
    private DefaultTableModel dtmH;
    private DefaultTableModel dtm1H;
    private DefaultTableModel dtm2H;
    private final int cant = 100;

    public Tabla_2() {
        initComponents();
        tHex.setVisible(false);
        thexp.setVisible(false);

        String[] title = {"Hexadecimal"};
        Object[][] dato = {};
        dtm1H = new DefaultTableModel(dato, title);
        thexp.setModel(dtm1H);

        String[] titlem = {"Tabla de procesos intrrumpidos "};
        Object[][] datom = {};
        dtm2H = new DefaultTableModel(datom, titlem);
        tHex.setModel(dtm2H);

        String[] titulos = {"indice", "Numero Hexadecimal encontrado"};
        Object[][] datos = {};
        dtmH = new DefaultTableModel(datos, titulos);
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
                    int d = 0;
                    int x = 0;
                    d = dsH;
                    if (d > 0) {
                        String cad = "";
                       cad=Integer.toHexString(d);
                       
                        System.out.println(cad);
                        Object[] otraFilaDeLaTable = {" \t" + dsH + "..Es equivalente  \n"  +"\t\t.." + cad + "..en Hexadecimal"};//no borrar
                        // Object[] otraFilaDeLaTable = {"\t\t" + ds+ ""};
                        h.setText("Cargando en \t" + dsH + "%..." + "\t Procesando \t" + cad + "%...");
                        dtm1H.addRow(otraFilaDeLaTable);
                        if (dsH == 100) {
                            this.resume();
                        }
                    }
                    hilo_1.sleep(150);
                }//termina  while 
            } catch (java.lang.InterruptedException jsm) {
                System.out.println(jsm.getMessage());
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

        bExa.setText("Convertir a hexadecimal");
        bExa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExaActionPerformed(evt);
            }
        });

        bincov.setText(" Interrumpir conversión  ");
        bincov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bincovActionPerformed(evt);
            }
        });

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

        h.setText("labelhilo");

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
                                .addComponent(bExa)
                                .addGap(18, 18, 18)
                                .addComponent(bincov, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ProgrressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(h))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(125, Short.MAX_VALUE)
                        .addComponent(TextFiel_validaH, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(265, 265, 265))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bincov)
                            .addComponent(bExa))
                        .addGap(18, 18, 18)
                        .addComponent(TextFiel_validaH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(h)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ProgrressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(418, Short.MAX_VALUE))
        );

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
        tHex.setVisible(true);
        dtm2H.addRow(Table);
        // TODO add your handling code here:
    }//GEN-LAST:event_bincovActionPerformed

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
            java.util.logging.Logger.getLogger(Tabla_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabla_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabla_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabla_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabla_2().setVisible(true);
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
