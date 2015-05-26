package javaapplication2;


import javax.swing.JOptionPane;


public class funciones extends javax.swing.JFrame {

    public funciones() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textvalor1 = new javax.swing.JTextField();
        Textvalor2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Textresultado = new javax.swing.JTextField();
        jButtonsuma = new javax.swing.JButton();
        jButtonresta = new javax.swing.JButton();
        jButtonmulti = new javax.swing.JButton();
        jButtondiv = new javax.swing.JButton();
        jButtonsalir = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("valor1");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("valor2");

        textvalor1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Textvalor2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("resultado");

        Textresultado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButtonsuma.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonsuma.setText("suma");
        jButtonsuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsumaActionPerformed(evt);
            }
        });

        jButtonresta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonresta.setText("resta");
        jButtonresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonrestaActionPerformed(evt);
            }
        });

        jButtonmulti.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonmulti.setText("multiplicacion");
        jButtonmulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonmultiActionPerformed(evt);
            }
        });

        jButtondiv.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtondiv.setText("division");
        jButtondiv.setActionCommand("division");
        jButtondiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtondivActionPerformed(evt);
            }
        });

        jButtonsalir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonsalir.setText("salir");
        jButtonsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textvalor1, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(Textvalor2)
                            .addComponent(Textresultado)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jButtonsuma)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonresta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonmulti)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonsalir)
                            .addComponent(jButtondiv))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textvalor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Textvalor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Textresultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonsuma)
                    .addComponent(jButtonresta)
                    .addComponent(jButtonmulti)
                    .addComponent(jButtondiv))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jButtonsalir)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
double a=0,b=0,c=0;
    private void jButtonsumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsumaActionPerformed
        a =Double.parseDouble(textvalor1.getText());
         b =Double.parseDouble(Textvalor2.getText());
         c=a+b;
         
   Textresultado.setText(" "+c);
      
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonsumaActionPerformed

    private void jButtonsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsalirActionPerformed
JOptionPane.showMessageDialog(null,"soy cabron ");
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonsalirActionPerformed

    private void jButtonrestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonrestaActionPerformed
    a =Double.parseDouble(textvalor1.getText());
         b =Double.parseDouble(Textvalor2.getText());
         c=a-b;
         
   Textresultado.setText(" "+c);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonrestaActionPerformed

    private void jButtonmultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonmultiActionPerformed
    a =Double.parseDouble(textvalor1.getText());
         b =Double.parseDouble(Textvalor2.getText());
         c=a*b;
         
   Textresultado.setText(" "+c);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonmultiActionPerformed

    private void jButtondivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtondivActionPerformed
    a =Double.parseDouble(textvalor1.getText());
         b =Double.parseDouble(Textvalor2.getText());
         c=a/b;
         
         
   Textresultado.setText(" "+c);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtondivActionPerformed

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
            java.util.logging.Logger.getLogger(funciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(funciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(funciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(funciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new funciones().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Textresultado;
    private javax.swing.JTextField Textvalor2;
    private javax.swing.JButton jButtondiv;
    private javax.swing.JButton jButtonmulti;
    private javax.swing.JButton jButtonresta;
    private javax.swing.JButton jButtonsalir;
    private javax.swing.JButton jButtonsuma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField textvalor1;
    // End of variables declaration//GEN-END:variables
}
