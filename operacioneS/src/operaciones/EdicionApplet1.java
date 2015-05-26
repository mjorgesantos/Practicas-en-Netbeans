 

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class EdicionApplet1 extends Applet {
    TextField textIntro = new TextField();
    Label label1 = new Label();
    FlowLayout flowLayout1 = new FlowLayout();

    public EdicionApplet1() {
    }

    public void init() {
        try {
        jbInit();
        }
        catch (Exception e) {
        e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        int ancho = Integer.parseInt(this.getParameter("WIDTH"));
        int alto = Integer.parseInt(this.getParameter("HEIGHT"));
        this.setSize(new Dimension(ancho, alto));
        textIntro.setColumns(10);
        label1.setText("Introducir carcateres NO numéricos");
        this.setLayout(flowLayout1);
        this.add(label1, null);
        this.add(textIntro, null);
        ValidaCaracter valChar=new ValidaCaracter();
        textIntro.addKeyListener(valChar);
   }
}

 class ValidaCaracter extends KeyAdapter{
  public void keyPressed(KeyEvent ev){
    int codigo=ev.getKeyCode();
    if(codigo>=KeyEvent.VK_0 && codigo<=KeyEvent.VK_9){
        ev.consume();
    }
 }
}