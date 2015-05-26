package Proceso.dos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Tabla_Hexadecimal extends javax.swing.JFrame {

    String nom = null;
    int ds = 0;
    int indice = 1;
    int i = 1;

    private DefaultTableModel dtm;
    private DefaultTableModel dtm1;
    private DefaultTableModel dtm2;
    private final int cantidad = 100;

    public Tabla_Hexadecimal() {
        initComponents();
        tablamarca.setVisible(false);
        tabla1.setVisible(false);

        String[] title = {"Binarios"};
        Object[][] dato = {};
        dtm1 = new DefaultTableModel(dato, title);
        tabla1.setModel(dtm1);

        String[] titlem = {"Tabla de procesos intrrumpidos "};
        Object[][] datom = {};
        dtm2 = new DefaultTableModel(datom, titlem);
        tablamarca.setModel(dtm2);

        String[] titulos = {"indice", "Numero primo encontrado"};
        Object[][] datos = {};
        dtm = new DefaultTableModel(datos, titulos);
        //tabla3.setModel(dtm);
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
                       cad=Integer.toHexString(d);
                        
                        System.out.println(cad);
                        Object[] otraFilaDeLaTable = {"\t\t" + cad + ""};//no borrar
                        // Object[] otraFilaDeLaTable = {"\t\t" + ds+ ""};
                        labelhilo.setText("Cargando en \t" + ds + "%..." + "\t Procesando \t" + cad + "%...");
                        dtm1.addRow(otraFilaDeLaTable);

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
        tablamarca = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        labelhilo = new javax.swing.JLabel();
        TextFiel_valida = new javax.swing.JTextField();

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

        tablamarca.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablamarca);

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tabla1);

        labelhilo.setText("labelhilo");

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
                                .addComponent(binario)
                                .addGap(107, 107, 107)
                                .addComponent(btninterrumpe, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(barra1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(labelhilo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TextFiel_valida, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btninterrumpe)
                            .addComponent(binario))
                        .addGap(18, 18, 18)
                        .addComponent(TextFiel_valida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelhilo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(barra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(418, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void binarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_binarioActionPerformed
        binario.setEnabled(false);///para visiblenovisble
        btninterrumpe.setEnabled(true);///
        tabla1.setVisible(true);
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
        tablamarca.setVisible(true);
        dtm2.addRow(marcaFilaDeLaTable);
        // TODO add your handling code here:
    }//GEN-LAST:event_btninterrumpeActionPerformed

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
            java.util.logging.Logger.getLogger(Tabla_Hexadecimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabla_Hexadecimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabla_Hexadecimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabla_Hexadecimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabla_Hexadecimal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextFiel_valida;
    private javax.swing.JProgressBar barra1;
    private javax.swing.JButton binario;
    private javax.swing.JButton btninterrumpe;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelhilo;
    private javax.swing.JTable tabla1;
    private javax.swing.JTable tablamarca;
    // End of variables declaration//GEN-END:variables
}
