/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package operaciones;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusListener;
import javax.swing.JTextField;

/**
 *
 * @author Jorge Santos
 */
public class cajadetext extends javax.swing.JFrame {

    private final Font fontLost = new Font("Monaco", Font.ITALIC, 10);
    private final Font fontGained = new Font("Monaco", Font.PLAIN, 12);
    private final Color colorLost = Color.LIGHT_GRAY;
    private final Color colorGained = Color.BLACK;
    private String hint;
    /**
     * Creates new form cajadetext
     */
    public cajadetext() {
       initComponents();
       // public JTextFieldHint() 
   /// addFocusListener((FocusListener) this);
    
    }
//public class JTextFieldHint extends JTextField implements FocusListener {
 
    
 
    @SuppressWarnings("LeakingThisInConstructor")
    
 
    public void setHint(String hint) {
        setForeground(colorLost);
        setFont(fontLost);
      caja.setText(hint);
        this.hint = hint;
        
     // caja.setFont(fontLost);
    }
   // this.jButtonA1.setBackground(Color.green);
 
    public String getHint() {
        return hint;
    }
 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        caja = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        caja.setText("sdfghj");
        caja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cajaMouseReleased(evt);
            }
        });
        caja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaActionPerformed(evt);
            }
        });
        caja.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cajaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cajaFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(218, Short.MAX_VALUE)
                .addComponent(caja, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(caja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(205, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cajaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cajaMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaMouseReleased

    private void cajaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cajaFocusGained

         if (caja.getText().equals(getHint())) {
            caja.setText("");
            setFont(fontGained);
            setForeground(colorGained);
        } else {
            setForeground(colorGained);
            setFont(fontGained);
            caja.setText(caja.getText());
        }
         /*
       if (jButtonA1.getText().equals("1 ocupado")) {
            this.jButtonA1.setBackground(Color.green);
            jTextFieldasiento.setText("asiento 1");
            jButtonA1.setText("1 libre");
        } else {
            this.jButtonA1.setBackground(Color.red);
            jButtonA1.setText("1 ocupado");
            jTextFieldasiento.setText("asiento 1");
        }
         */
// TODO add your handling code here:
    }//GEN-LAST:event_cajaFocusGained


    private void cajaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cajaFocusLost
 if (caja.getText().length() <= 0) {
            setHint(getHint());
        } else {
            setForeground(colorGained);
            setFont(fontGained);
            caja.setText(caja.getText());
            
        }
    
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaFocusLost

    private void cajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaActionPerformed
 //caja.setActionCommand(""+"hola");
//caja.setActionCommand(hint);
        caja.setSelectionColor(null);
       // caja.setActionCommand(hint+"texto");
        // TODO add your handling code here:
        // caja.setHint("Nombres...escdfffffffffff");
    }//GEN-LAST:event_cajaActionPerformed

    /**
     * @param args the command line arguments
     */
    private void FondoText() {
      //  frame.getContentPane().setLayout(null);
 
      //  caja.getHint("Nombres...escdfffffffffff");
       // textLastName.setHint("Apellidos.ddddddddddddddddddddddd..");
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
            java.util.logging.Logger.getLogger(cajadetext.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cajadetext.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cajadetext.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cajadetext.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cajadetext().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField caja;
    // End of variables declaration//GEN-END:variables
}
