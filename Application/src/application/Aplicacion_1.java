/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Aplicacion_1 extends javax.swing.JFrame {
String opciones;


    ////////comienza tabla
    DefaultTableModel md;
    String data[][] = {};
    String cabeza[] = {"¿Cual es la tendencia en un futuro cercano de los dispositivos móviles (Telefonía)?",
        "¿Cuál es la tendencia en un futuro cercano de la tecnología en Televisiones Digitales?",
        "¿Cuál es la tendencia en un futuro de las computadoras portátiles(Lap-Tops)?", "Tiempod e Respuestas "};

    public Aplicacion_1() {
        initComponents();
        setTitle("Tendencias Tecnológicas Dinámica ");
        ///
        md = new DefaultTableModel(data, cabeza);

        tabla.setModel(md);
        // tabla.setModel(md);//termina tabla
    }
    @SuppressWarnings("unchecked")
    public boolean issuspended = false;//para saber si el hilo esta suspendido o pausado
    int hora = 0, min = 0, seg = 0, ds = 0;//unidades de medida
    Thread hilo = new Thread() {

        public void run() {
            try {
                while (true) {//ciclo infinito
                    if (ds == 99) {//si los decisegundos son iguales a 99
                        ds = 0;//decisegundo vuelve a empezar en cero
                        seg++;//y aumenta un segundo
                    }
                    if (seg == 59) {//si los segundos son iguales a 59
                        seg = 0;//segundo vuelve a empezar en cero
                        min++;//y aumenta un minuto
                    }
                    if (min == 59) {//si los minutos son iguales a 59
                        min = 0;//minuto vuelve a empezar en cero
                        hora++;//y aumenta una hora
                    }
                    ds++;//aumentan las decimas de segundo

                    lblTime.setText(hora + ":" + min + ":" + seg + ":" + ds);//se muestra en el jlabel
                    //int as=0;
                 /*
                  * int a=0;
                  *int a= integer.parserString (a);
                     * String numCadena ,as; numCadena = null; as=null; int hora
                     * = Integer.parseInt(numCadena); int min =
                     * Integer.parseInt(numCadena); int seg =
                     * Integer.parseInt(numCadena); as=numCadena;
                     *
                     */

                    hilo.sleep(10);//que duerma una decima de segundo
                }
            } catch (java.lang.InterruptedException ie) {
                System.out.println(ie.getMessage());
            }
        }
    };
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
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
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
        lblTime = new javax.swing.JLabel();
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

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application/Recursos/fondo.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(824, 550));
        setMinimumSize(new java.awt.Dimension(824, 550));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        buttonGroup1.add(uno_a);
        uno_a.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        uno_a.setText("a):Pantallas mas grandes , un CPU mas veloz y Baterías de larga duración.");
        uno_a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uno_aActionPerformed(evt);
            }
        });

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
        uno_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uno_cActionPerformed(evt);
            }
        });

        buttonGroup2.add(dos_a);
        dos_a.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        dos_a.setText("a):Pantallas por encima de 60 pulgadas, mas delgadas e imágenes por encima del 8K");

        buttonGroup2.add(dos_b);
        dos_b.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        dos_b.setText(" b):Pantallas OLED curvas y flexibles .");

        buttonGroup2.add(dos_c);
        dos_c.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        dos_c.setText("c):Mejores sistemas operativos SMART TV para una mejor interacción con el usuario con no mas de 40 pulgadas.");

        miboton.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        miboton.setText("Enviar");
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

        lblTime.setFont(new java.awt.Font("Sitka Small", 1, 30)); // NOI18N
        lblTime.setText("0:0:0:0");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(659, 659, 659)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(uno_a))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(uno_b))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(uno_c))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(dos_a))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(dos_b))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(dos_c))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(tres_a))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(tres_b))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(tres_c))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(162, 162, 162)
                        .addComponent(miboton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(314, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel5)
                .addGap(0, 0, 0)
                .addComponent(jLabel1)
                .addGap(7, 7, 7)
                .addComponent(uno_a)
                .addGap(3, 3, 3)
                .addComponent(uno_b)
                .addGap(0, 0, 0)
                .addComponent(uno_c)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(7, 7, 7)
                .addComponent(dos_a)
                .addGap(3, 3, 3)
                .addComponent(dos_b)
                .addGap(3, 3, 3)
                .addComponent(dos_c)
                .addGap(40, 40, 40)
                .addComponent(jLabel7)
                .addGap(7, 7, 7)
                .addComponent(tres_a)
                .addGap(3, 3, 3)
                .addComponent(tres_b)
                .addGap(3, 3, 3)
                .addComponent(tres_c)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(miboton)
                    .addComponent(lblTime))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(315, 315, 315))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mibotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mibotonActionPerformed

        hilo.suspend();//se suspende el hilo.. (NO utilizamos hilo.stop() porque si lo usamos, el hilo se "muere")
        ds = seg = min = hora = 0;//todas las unidades en cero
        lblTime.setText(ds + ":" + seg + ":" + min + ":" + hora);//cronometro en cero

        //   lblTime.setText("0:0:0:0");//cronometro en cero
        issuspended = true;//el hilo esta suspendido

        // miboton.setEnabled(false);
        miboton.setEnabled(true);
        //////////
        String a = uno_a.getText();
        String b = uno_b.getText();
        String c = uno_c.getText().toString();
        String d = lblTime.getText();

        // hora + ":" + min + ":" + seg + ":" + ds
        //  JOptionPane.showMessageDialog(null, "interrumpio en \t" + seg + "%");
        String datos[] = {b, b, c, d};
        md.addRow(datos);
        ////termanatabla

       
                //String opciones;
        opciones = "Respuestas: ";

        if (this.uno_a.isSelected() == true) {
            opciones = opciones + "\nRespuesta Pregunta uno: " + this.uno_a.getText();
        } else if (this.uno_b.isSelected() == true) {
            opciones = opciones + "\nRespuesta Pregunta uno: " + this.uno_b.getText();
        } else {
            opciones = opciones + "\nRespuesta Pregunta uno:" + this.uno_c.getText();
        }
        //segundo termino de opciones
        if (this.dos_a.isSelected() == true) {
            opciones = opciones + "\nRespuesta Pregunta dos:" + this.dos_a.getText();
        } else if (this.dos_b.isSelected() == true) {
            opciones = opciones + "\nRespuesta Pregunta dos:" + this.dos_b.getText();
        } else {
            opciones = opciones + "\nRespuesta Pregunta dos:" + this.dos_c.getText();
        }

        ////////
        if (this.tres_a.isSelected() == true) {
            opciones = opciones + "\nRespuesta Pregunta dos:" + this.tres_a.getText();
        } else if (this.tres_b.isSelected() == true) {
            opciones = opciones + "\nRespuesta Pregunta dos:" + this.tres_b.getText();
        } else {
            opciones = opciones + "\nRespuesta Pregunta dos:" + this.tres_c.getText();
        }

        ////////////
        JOptionPane.showMessageDialog((this), opciones);

        // TODO add your handling code here:
    }//GEN-LAST:event_mibotonActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3MouseClicked

    private void uno_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uno_bActionPerformed
        miboton.setEnabled(true);
        ///  btnPausa.setEnabled(true);
        if (!issuspended) {//si no esta suspendido o pausado
            hilo.start();//el hilo empieza

        } else {//de lo contrario
            hilo.resume();//el hilo se reanuda
            issuspended = false;//el hilo ya no esta suspendido

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_uno_bActionPerformed

    private void tres_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tres_cActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tres_cActionPerformed

    private void tres_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tres_bActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tres_bActionPerformed

    private void uno_aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uno_aActionPerformed
//uno_a.setEnabled(false);
        //              uno_b.setEnabled(false);
        miboton.setEnabled(true);
        ///  btnPausa.setEnabled(true);
        if (!issuspended) {//si no esta suspendido o pausado
            hilo.start();//el hilo empieza

        } else {//de lo contrario
            hilo.resume();//el hilo se reanuda
            issuspended = false;//el hilo ya no esta suspendido

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_uno_aActionPerformed

    private void uno_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uno_cActionPerformed
        miboton.setEnabled(true);
        ///  btnPausa.setEnabled(true);
        if (!issuspended) {//si no esta suspendido o pausado
            hilo.start();//el hilo empieza

        } else {//de lo contrario
            hilo.resume();//el hilo se reanuda
            issuspended = false;//el hilo ya no esta suspendido
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_uno_cActionPerformed

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
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JLabel lblTime;
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
