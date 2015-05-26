  

 import java.awt.Dimension;
 import java.awt.event.MouseEvent;
 import java.awt.event.MouseListener;
 /**
  * @web http://jc-mouse.blogspot.com/
  * @author Mouse
  */
 public class jcVistaButtons extends javax.swing.JLabel implements MouseListener {
 
     public  jcVistaButtons(){
         super();
         //se le da un tamaño        
         this.setPreferredSize(new Dimension(260,60));
         //se le coloca una imagen
         this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/jcbuttons1.png")));               
         //se cambia de cursor default por otro, el de la "manito"
         this.setCursor(new Cursor(Cursor.HAND_CURSOR));       
         //se añade los eventos del mouse
         this.addMouseListener(this);                
   }
 
     public void mouseClicked(MouseEvent e) {        
       
   }
 
     public void mousePressed(MouseEvent e) {
         this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/jcbuttons3.png"))); 
     }
 
     public void mouseReleased(MouseEvent e) {
         this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/jcbuttons2.png")));                       
     }
 
     public void mouseEntered(MouseEvent e) {
        this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/jcbuttons2.png")));                       
     }
 
     public void mouseExited(MouseEvent e) {
         this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/jcbuttons1.png")));               
     }   
    }