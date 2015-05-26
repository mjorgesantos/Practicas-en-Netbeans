import java.awt.*;
import java.awt.event.*;
public class Restar extends Frame 
{
private Panel  pnlBotones;
private Panel  pnlGeneral;

private Label  lblMinuendo;
private Label lblSustraendo;

private TextField txtfMinuendo ;
private TextField txtfSustraendo;
private TextField  txtArea;	
private Button btnRestar;
private Button  btnLimpiar;
private String cadena;		
 private Frame frame;

private ManejadorBoton mb;
  private float op1,op2;
private float suma;
 
 
 public Restar ()
 {
      super ("Restar V.0.01");
      
       pnlBotones = new Panel(new FlowLayout());
     pnlGeneral = new Panel(new BorderLayout());
     lblMinuendo =new Label ("Minuendo");
     txtfMinuendo =new TextField(" ", 15);
     
     
     lblSustraendo =new Label ("Sustraendo");
     txtfSustraendo =new TextField(" ", 15);
     
      btnLimpiar=new Button ("Limpiar");
      btnRestar =new Button("Restar");
      
      txtArea  = new TextField("R=",2);	
      
      mb = new ManejadorBoton();	
      
		btnLimpiar.addActionListener(mb);
		btnRestar.addActionListener(mb);
     
      }
      public void vista()
      {
     
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {			
  		        System.exit(0);
  		    }
  	    });
		
		this.add(lblMinuendo);
    this.add(txtfMinuendo);
		
		
		this.add(lblSustraendo);
    this.add(txtfSustraendo);
		
		
		 pnlGeneral.add(pnlBotones,BorderLayout.CENTER); 
    pnlBotones.add(btnRestar);
		
		pnlGeneral.add(pnlBotones,BorderLayout.CENTER); 
    pnlBotones.add(btnLimpiar);
		
     
     pnlGeneral.add(txtArea,BorderLayout.SOUTH);
    pnlBotones.add(btnRestar);
     
     

add(pnlGeneral);
     
     
     this.setLayout (new FlowLayout());
    this.pack();
   this.setVisible(true);
        }



class ManejadorBoton implements ActionListener {		
		public void actionPerformed(ActionEvent e) {	
 if (e.getActionCommand().equals("Restar")) {
   
     op1=Float.parseFloat(txtfMinuendo.getText());
op2=Float.parseFloat(txtfSustraendo.getText());
suma=op1-op2;
    // txtArea.setText("Resultado" + txtfMinuendo.getText() +txtfSustraendo.getText());
			txtArea.setText("Resultado" + suma);
			}
			if (e.getActionCommand().equals("Limpiar")) {
				txtArea.setText("");
			    txtfMinuendo.setText("");	
			    txtfSustraendo.setText("");
			    
			  
			}
			
		}
	}

   
   public static void main (String []args)
        {
            Restar evt = new Restar();
	  evt.vista();
            Restar miVista=new Restar ();
            
               miVista.vista();
        }
}
   
     
     