import java.awt.*;
import java.awt.event.*;
public class Saluda  extends Frame {
	
private Panel  pnlBotones;
private Panel  pnlGeneral;
private Label  lblNombre;
private TextField txtfNombre ;
private Label  lblResponde;
private Button btnSaludar;

 private Frame frame;
 
  public Saluda()
  {
      super ("Bienvenidos");
      pnlBotones = new Panel(new FlowLayout());
     pnlGeneral = new Panel(new BorderLayout());
      lblNombre =new Label ("Nombre:");
      txtfNombre =new TextField(" ", 15);
      lblResponde=new Label ("¡¡¡¡Hola!!!!!");
      btnSaludar =new Button("Saludar");
     // txtSaludar.addTextListener(mt);
      //frame= new Frame ("Bienvenidos");
    }
      public void vista()
      {     
          addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {			
  		        System.exit(0);
  		    }
  	    });
    this.add(lblNombre);
    this.add(txtfNombre);
    this.add(lblResponde);
   
    pnlGeneral.add(btnSaludar,BorderLayout.NORTH); 
    pnlBotones.add(btnSaludar);
     this.add(btnSaludar);
    add(pnlGeneral);
    this.setLayout (new FlowLayout());
    this.pack();
   this.setVisible(true);
        }
        
        
        
        public static void main (String []args)
        {
            Saluda miVista=new Saluda ();
               miVista.vista();
        }
}

      
      

     