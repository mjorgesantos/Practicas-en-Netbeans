import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import java.util.Random; 
public class Ejemplo extends javax.swing.JFrame { 
//Timer que da "animación" a tus numeros al azar 
javax.swing.Timer timer = new javax.swing.Timer (150, new ActionListener () { 
@Override 
public void actionPerformed(ActionEvent e) { 

Random rand = new Random(); 
int azar = rand.nextInt(36)+1; 
jLabel1.setText(String.valueOf(azar)); 
} 
}); 

public Ejemplo() { 
initComponents(); 
} 

@SuppressWarnings("unchecked") 
// <editor-fold defaultstate="collapsed" desc="Generated Code"> 
private void initComponents() { 

jButton1 = new javax.swing.JButton(); 
jLabel1 = new javax.swing.JLabel(); 

setDefaultCloseOperation(javax.swing.Win... 

jButton1.setText("Jugar"); 
jButton1.addActionListener(new java.awt.event.ActionListener() { 
public void actionPerformed(java.awt.event.ActionEve... evt) { 
jButton1ActionPerformed(evt); 
} 
}); 

jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N 
jLabel1.setHorizontalAlignment(javax.swi... 
jLabel1.setText("36"); 

javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane()... 
getContentPane().setLayout(layout); 
layout.setHorizontalGroup( 
layout.createParallelGroup(javax.swing.G... 
.addGroup(layout.createSequentialGroup() 
.addGap(135, 135, 135) 
.addGroup(layout.createParallelGroup(jav... 
.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE) 
.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)) 
.addContainerGap(156, Short.MAX_VALUE)) 
); 
layout.setVerticalGroup( 
layout.createParallelGroup(javax.swing.G... 
.addGroup(javax.swing.GroupLayout.Alignm... layout.createSequentialGroup() 
.addGap(63, 63, 63) 
.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE) 
.addGap(26, 26, 26) 
.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE) 
.addContainerGap(62, Short.MAX_VALUE)) 
); 

java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().get... 
setBounds((screenSize.width-408)/2, (screenSize.height-334)/2, 408, 334); 
}// </editor-fold> 

private void jButton1ActionPerformed(java.awt.event.A... evt) { 
if(!timer.isRunning()){ 
jButton1.setText("Detener"); 
timer.start(); 
} 
else { 
jButton1.setText("Jugar"); 
timer.stop(); 
} 
} 


public static void main(String args[]) { 

java.awt.EventQueue.invokeLater(new Runnable() { 

public void run() { 
new Ejemplo().setVisible(true); 
} 
}); 
} 
// Variables declaration - do not modify 
private javax.swing.JButton jButton1; 
private javax.swing.JLabel jLabel1; 
// End of variables declaration 
} 
