package calculadora;

public class calculadora1 extends javax.swing.JFrame {

    String numero1, numero2, signo;

    public calculadora1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jlcalculadoramini = new javax.swing.JLabel();
        pantalla1 = new javax.swing.JTextField();
        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        boton7 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        boton0 = new javax.swing.JButton();
        jbpunto = new javax.swing.JButton();
        jbigual = new javax.swing.JButton();
        jbsumar = new javax.swing.JButton();
        jbrestar = new javax.swing.JButton();
        jbmultiplicar = new javax.swing.JButton();
        jbdibidir = new javax.swing.JButton();
        borarcaracter = new javax.swing.JButton();
        boratodo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlcalculadoramini.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jlcalculadoramini.setText("mini calculadora");

        pantalla1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pantalla1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pantalla1ActionPerformed(evt);
            }
        });

        boton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        boton1.setText("1");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });

        boton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        boton2.setText("2");
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });

        boton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        boton3.setText("3");
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });

        boton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        boton4.setText("4");
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });

        boton5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        boton5.setText("5");
        boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ActionPerformed(evt);
            }
        });

        boton6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        boton6.setText("6");
        boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton6ActionPerformed(evt);
            }
        });

        boton7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        boton7.setText("7");
        boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton7ActionPerformed(evt);
            }
        });

        boton8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        boton8.setText("8");
        boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton8ActionPerformed(evt);
            }
        });

        boton9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        boton9.setText("9");
        boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton9ActionPerformed(evt);
            }
        });

        boton0.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        boton0.setText("0");
        boton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton0ActionPerformed(evt);
            }
        });

        jbpunto.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbpunto.setText(".");
        jbpunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbpuntoActionPerformed(evt);
            }
        });

        jbigual.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbigual.setText("=");
        jbigual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbigualActionPerformed(evt);
            }
        });

        jbsumar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbsumar.setText("+");
        jbsumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsumarActionPerformed(evt);
            }
        });

        jbrestar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbrestar.setText("-");
        jbrestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbrestarActionPerformed(evt);
            }
        });

        jbmultiplicar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbmultiplicar.setText("x");
        jbmultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbmultiplicarActionPerformed(evt);
            }
        });

        jbdibidir.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbdibidir.setText("/");
        jbdibidir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbdibidirActionPerformed(evt);
            }
        });

        borarcaracter.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        borarcaracter.setText("XC");
        borarcaracter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borarcaracterActionPerformed(evt);
            }
        });

        boratodo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        boratodo.setText("C");
        boratodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boratodoActionPerformed(evt);
            }
        });

        jButton1.setText("Salir");
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(pantalla1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(boton0)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbpunto)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jbigual)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jbdibidir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(boton7)
                                        .addGap(18, 18, 18)
                                        .addComponent(boton8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(boton9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jbmultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(boton4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(boton5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(boton6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(boton1)
                                        .addGap(18, 18, 18)
                                        .addComponent(boton2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(boton3)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jbsumar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbrestar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(borarcaracter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(boratodo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jlcalculadoramini))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlcalculadoramini)
                .addGap(18, 18, 18)
                .addComponent(pantalla1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton1)
                    .addComponent(boton3)
                    .addComponent(jbsumar)
                    .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(borarcaracter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton4)
                    .addComponent(boton5)
                    .addComponent(boton6)
                    .addComponent(jbrestar)
                    .addComponent(boratodo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton7)
                    .addComponent(boton8)
                    .addComponent(boton9)
                    .addComponent(jbmultiplicar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton0)
                    .addComponent(jbpunto)
                    .addComponent(jbigual)
                    .addComponent(jbdibidir)
                    .addComponent(jButton1))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pantalla1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pantalla1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pantalla1ActionPerformed


    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        pantalla1.setText(pantalla1.getText() + "1");

        // TODO add your handling code here:
    }//GEN-LAST:event_boton1ActionPerformed

    private void jbigualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbigualActionPerformed
        String resultado;
        numero2 = pantalla1.getText();
        if (!numero2.equals("")) {
            resultado = calculadora(numero1, numero2, signo);
            pantalla1.setText(resultado);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jbigualActionPerformed
    public static String calculadora(String numero1, String numero2, String signo) {
        Double resultado = 0.0;
        String respuesta;

        if (signo.equals("-")) {
            resultado = Double.parseDouble(numero1) - Double.parseDouble(numero2);
        }
        if (signo.equals("+")) {
            resultado = Double.parseDouble(numero1) + Double.parseDouble(numero2);
        }
        if (signo.equals("*")) {
            resultado = Double.parseDouble(numero1) * Double.parseDouble(numero2);
        }
        if (signo.equals("/")) {
            resultado = Double.parseDouble(numero1) / Double.parseDouble(numero2);
        }
        respuesta = resultado.toString();
        return respuesta;
    }


    private void jbpuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbpuntoActionPerformed
        String cadena;
        cadena = pantalla1.getText();
        if (cadena.length() <= 0) {
            pantalla1.setText("0.");
        } else {
            if (!exixtepunto(pantalla1.getText())) {
                pantalla1.setText(pantalla1.getText() + ".");
            }
        }
    }//GEN-LAST:event_jbpuntoActionPerformed


    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        pantalla1.setText(pantalla1.getText() + "2");
// TODO add your handling code here:
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
        pantalla1.setText(pantalla1.getText() + "3");        // TODO add your handling code here:
    }//GEN-LAST:event_boton3ActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
        pantalla1.setText(pantalla1.getText() + "4");
        // TODO add your handling code here:
    }//GEN-LAST:event_boton4ActionPerformed

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ActionPerformed
        pantalla1.setText(pantalla1.getText() + "5");
        // TODO add your handling code here:
    }//GEN-LAST:event_boton5ActionPerformed

    private void boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton6ActionPerformed
        pantalla1.setText(pantalla1.getText() + "6");        // TODO add your handling code here:
    }//GEN-LAST:event_boton6ActionPerformed

    private void boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton7ActionPerformed
        pantalla1.setText(pantalla1.getText() + "7");        // TODO add your handling code here:
    }//GEN-LAST:event_boton7ActionPerformed

    private void boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton8ActionPerformed
        pantalla1.setText(pantalla1.getText() + "8");        // TODO add your handling code here:
    }//GEN-LAST:event_boton8ActionPerformed

    private void boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton9ActionPerformed
        pantalla1.setText(pantalla1.getText() + "9");        // TODO add your handling code here:
    }//GEN-LAST:event_boton9ActionPerformed

    private void boton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton0ActionPerformed
        pantalla1.setText(pantalla1.getText() + "0");        // TODO add your handling code here:
    }//GEN-LAST:event_boton0ActionPerformed

    private void borarcaracterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borarcaracterActionPerformed
        String cadena;
        cadena = pantalla1.getText();
        if (cadena.length() > 0) {
            cadena = cadena.substring(0, cadena.length() - 1);
            pantalla1.setText(cadena);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_borarcaracterActionPerformed

    private void boratodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boratodoActionPerformed
        pantalla1.setText("");

        // TODO add your handling code here:
    }//GEN-LAST:event_boratodoActionPerformed

    private void jbrestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbrestarActionPerformed
        if (!pantalla1.getText().equals("")) {
            numero1 = pantalla1.getText();
            signo = "-";
            pantalla1.setText("");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jbrestarActionPerformed

    private void jbsumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsumarActionPerformed
        if (!pantalla1.getText().equals("")) {
            numero1 = pantalla1.getText();
            signo = "+";
            pantalla1.setText("");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jbsumarActionPerformed

    private void jbmultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbmultiplicarActionPerformed
        if (!pantalla1.getText().equals("")) {
            numero1 = pantalla1.getText();
            signo = "*";
            pantalla1.setText("");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jbmultiplicarActionPerformed

    private void jbdibidirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbdibidirActionPerformed
        if (!pantalla1.getText().equals("")) {
            numero1 = pantalla1.getText();
            signo = "/";
            pantalla1.setText("");
        }// TODO add your handling code here:
    }//GEN-LAST:event_jbdibidirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    public static boolean exixtepunto(String cadena) {
        boolean resultado;
        resultado = false;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.substring(1, 1 + 1).equals(".")) {
                resultado = true;
                break;
            }
        }
        return resultado;
    }

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
            java.util.logging.Logger.getLogger(calculadora1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculadora1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculadora1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculadora1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculadora1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borarcaracter;
    private javax.swing.JButton boratodo;
    private javax.swing.JButton boton0;
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jbdibidir;
    private javax.swing.JButton jbigual;
    private javax.swing.JButton jbmultiplicar;
    private javax.swing.JButton jbpunto;
    private javax.swing.JButton jbrestar;
    private javax.swing.JButton jbsumar;
    private javax.swing.JLabel jlcalculadoramini;
    private javax.swing.JTextField pantalla1;
    // End of variables declaration//GEN-END:variables
}
