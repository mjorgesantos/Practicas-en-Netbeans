/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package other;

import application.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Aplicacion_1 extends javax.swing.JFrame {
    
    ////////comienza tabla
       DefaultTableModel md;
    String data[][] = {};
    String cabeza[] = {"Pregunta", "apellidos", "Profecion"};


    public Aplicacion_1() {
        initComponents();
        ///
         md = new DefaultTableModel(data, cabeza);
        tabla.setModel(md);//termina tabla
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        uno_a = new javax.swing.JRadioButton();
        uno_b = new javax.swing.JRadioButton();
        uno_c = new javax.swing.JRadioButton();
        dos_a = new javax.swing.JRadioButton();
        dos_b = new javax.swing.JRadioButton();
        dos_c = new javax.swing.JRadioButton();
        miboton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tres_c = new javax.swing.JRadioButton();
        tres_a = new javax.swing.JRadioButton();
        tres_b = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Tendencias Tecnológicas Dinámica  ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Preguntas: ");

        buttonGroup1.add(uno_a);
        uno_a.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        uno_a.setText("a):Pantallas mas grandes , un CPU mas veloz y Baterías de larga duración.");

        buttonGroup1.add(uno_b);
        uno_b.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        uno_b.setText(" b):Mas delgados, Flexibles y curvos");
        uno_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uno_bActionPerformed(evt);
            }
        });

        buttonGroup1.add(uno_c);
        uno_c.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        uno_c.setText(" c):Mas pequeños, mejor portabilidad y S.O mas simples");

        buttonGroup2.add(dos_a);
        dos_a.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        dos_a.setText("a):Pantallas por encima de 60 pulgadas, mas delgadas e imágenes por encima del 8K");

        buttonGroup2.add(dos_b);
        dos_b.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        dos_b.setText(" b):Pantallas OLED curvas y flexibles .");

        buttonGroup2.add(dos_c);
        dos_c.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        dos_c.setText("c):Mejores sistemas operativos SMART TV para una mejor interacción con el usuario con no mas de 40 pulgadas.");

        miboton.setText("enviar");
        miboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mibotonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("¿Cual es la tendencia en un futuro cercano de los dispositivos móviles (Telefonía)?");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("¿Cuál es la tendencia en un futuro cercano de la tecnología en Televisiones Digitales?");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("¿Cuál es la tendencia en un futuro de las computadoras portátiles(Lap-Tops)?");

        buttonGroup3.add(tres_c);
        tres_c.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tres_c.setText("c):Ultra portátiles táctiles con opción a teclado físico. ");
        tres_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tres_cActionPerformed(evt);
            }
        });

        buttonGroup3.add(tres_a);
        tres_a.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tres_a.setText("a):Mas Pequeñas y delgadas con CPU y GPU mas veloces.");

        buttonGroup3.add(tres_b);
        tres_b.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tres_b.setText(" b):Nuevos sistemas operativos sin teclados físicos y con solo pantallas táctiles. ");
        tres_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tres_bActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tabla);

        jMenu2.setText("opciones");

        jMenuItem1.setText("enviar");
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("recuperar");
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("salir");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });

        jMenuItem3.setText("salir");
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dos_c)
                            .addComponent(jLabel6)
                            .addComponent(dos_a)
                            .addComponent(dos_b)
                            .addComponent(jLabel7)
                            .addComponent(uno_b)
                            .addComponent(uno_a)
                            .addComponent(uno_c)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jLabel2)))
                        .addContainerGap(417, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tres_a)
                            .addComponent(tres_b)
                            .addComponent(tres_c))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(203, 203, 203))))
            .addGroup(layout.createSequentialGroup()
                .addGap(375, 375, 375)
                .addComponent(miboton)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(uno_a)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(uno_b)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uno_c)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dos_a)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dos_b)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dos_c))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)))
                .addGap(40, 40, 40)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tres_a)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tres_b)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tres_c))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(miboton)
                .addContainerGap(264, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mibotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mibotonActionPerformed
  
        //////////
        
         String nom = uno_a.getToolTipText();
        String ape = uno_b.getText();
        String prof = uno_c.getText().toString();
        String datos[] = {nom, ape, prof};
        md.addRow(datos);
        ////termanatabla
        
        
        String opciones;
        opciones="Respuestas: ";
        
        if(this.uno_a.isSelected()==true){
            opciones=opciones+"\nRespuesta Pregunta uno: "+this.uno_a.getText();
        }
        else if(this.uno_b.isSelected()==true){
            opciones=opciones+"\nRespuesta Pregunta uno: "+this.uno_b.getText();
        }
        else{
            opciones=opciones+"\nRespuesta Pregunta uno:"+this.uno_c.getText();
        }
        
        
        //segundo termino de opciones
        if(this.dos_a.isSelected()==true){
            opciones=opciones+"\nRespuesta Pregunta dos:"+this.dos_a.getText();
        }
        else if(this.dos_b.isSelected()==true){
            opciones=opciones+"\nRespuesta Pregunta dos:"+this.dos_b.getText();
        }
        else{
            opciones=opciones+"\nRespuesta Pregunta dos:"+this.dos_c.getText();
        }
        
        ////////
         if(this.tres_a.isSelected()==true){
            opciones=opciones+"\nRespuesta Pregunta dos:"+this.tres_a.getText();
        }
        else if(this.tres_b.isSelected()==true){
            opciones=opciones+"\nRespuesta Pregunta dos:"+this.tres_b.getText();
        }
        else{
            opciones=opciones+"\nRespuesta Pregunta dos:"+this.tres_c.getText();
        }
        
        
        
        
        
        
        ////////////
        JOptionPane.showMessageDialog((this), opciones);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_mibotonActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3MouseClicked

    private void uno_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uno_bActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uno_bActionPerformed

    private void tres_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tres_cActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tres_cActionPerformed

    private void tres_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tres_bActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tres_bActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Aplicacion_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aplicacion_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aplicacion_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aplicacion_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Aplicacion_1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JRadioButton dos_a;
    private javax.swing.JRadioButton dos_b;
    private javax.swing.JRadioButton dos_c;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton miboton;
    private javax.swing.JTable tabla;
    private javax.swing.JRadioButton tres_a;
    private javax.swing.JRadioButton tres_b;
    private javax.swing.JRadioButton tres_c;
    private javax.swing.JRadioButton uno_a;
    private javax.swing.JRadioButton uno_b;
    private javax.swing.JRadioButton uno_c;
    // End of variables declaration//GEN-END:variables
}
