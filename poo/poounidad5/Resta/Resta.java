

import java.awt.*;
import java.awt.event.*;

public class Resta extends Frame 

{
         private Label     lblMinuendo;
         private Label     lblSustraendo;
         private TextField txtfMinuendo;
         private TextField txtfSustraendo;
         private TextField  txtArea;
         private Panel pnlVista;
    
          private Panel     pnlMinuendo;
          private Panel     pnlSustraendo;
          private Panel     pnlArea;

          private Panel     pnlBoton;
          private Button    btnLimpiar;
          private Button    btnRestar; 
          private ManejadorBoton mb; 
          private float op1,op2;
          private float suma;
    
         public Resta() 
    {
         super ("Restar V.0.01");
        pnlVista = new Panel(new GridLayout());
        pnlMinuendo  = new Panel( new FlowLayout()); 
        pnlSustraendo  = new Panel( new FlowLayout()); 
        pnlBoton = new Panel ( new FlowLayout());
          //  lblMensaje = new Label ("");
        pnlArea  = new Panel( new FlowLayout()); 
        pnlVista=new Panel (new GridLayout (4,1));
        
        
        lblMinuendo    = new Label ("Munuendo");   
        lblSustraendo    = new Label ("Sustraendo:");
        btnLimpiar   = new Button("Limpiar");
        btnRestar   = new Button("Restar");
        txtArea  = new TextField("",10);
        mb           = new ManejadorBoton();
               
        btnLimpiar.addActionListener(mb);
        btnRestar.addActionListener(mb);
     }
    public void vista()
    {
       lblMinuendo  = new Label("Minuendo:");
       txtfMinuendo = new  TextField("", 10);
       lblSustraendo  = new Label("Sustraendo:");
       txtfSustraendo = new  TextField("", 10);
       txtArea  = new TextField("",20);
       pnlMinuendo.add(lblMinuendo);  
       pnlMinuendo.add(txtfMinuendo); 
       pnlSustraendo.add(lblSustraendo);  
       pnlSustraendo.add(txtfSustraendo);
       pnlArea.add(txtArea);
      
       pnlVista.add(pnlMinuendo,BorderLayout.NORTH); 
       pnlVista.add(pnlSustraendo,BorderLayout.NORTH); 
       pnlBoton.add(btnRestar);
       pnlBoton.add(btnLimpiar);
       pnlVista.add(pnlBoton,BorderLayout.CENTER); 
       pnlVista.add(pnlBoton);
        pnlVista.add(pnlArea,BorderLayout.NORTH); 
      
     
             
       addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {          
                System.exit(0);
            }
        });
        add(pnlVista);        
        pack();
        setVisible(true);
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

    public static void main(String []args)
    {
      Resta evt = new Resta();
      evt.vista();
    }
}


    