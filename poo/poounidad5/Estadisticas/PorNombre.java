
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class PorNombre
{ 
 private Panel pnlVista;
    private Panel pnlNomAlum;
     private Panel pnlBotones;
    private Panel pnlArea;
   
    private Label lblNombre;
     private TextField txtfNombre;
   private Button  btnConsultar;    
   private TextField txtfArea;
   
  private ManejadorBoton mb;
    private Frame frame;
    
    public  PorNombre ()
{
frame = new Frame("Por Nombre");
pnlVista = new Panel(new GridLayout(2,2)); 
pnlNomAlum = new Panel(new FlowLayout()); 
  pnlBotones = new Panel(new FlowLayout());
  pnlArea = new Panel(new FlowLayout()); 
    
     lblNombre = new Label("Nombre del Alumno");
     txtfNombre =new TextField("",20);
btnConsultar  = new Button("Consultar");
 txtfArea =new TextField("",20);
 
 
 
 mb = new ManejadorBoton();
         btnConsultar.addActionListener(mb);
         }
public void vista()
{
// private Panel pnlVista
//pnlVista.add( pnlVista);
pnlNomAlum.add(lblNombre);
pnlNomAlum.add(txtfNombre);
pnlBotones.add(btnConsultar);
pnlArea.add(txtfArea);

    pnlVista.add(lblNombre); 
 
pnlVista.add(pnlNomAlum);        
  
     //  pnlVista.add(txtfNoListaAlum); 
        pnlVista.add(pnlBotones);
         //pnlVista.add(txtfArea); 
pnlVista.add(pnlArea);
 frame.add(pnlVista);      
        frame.pack();
        frame.setLocation(5,30);
        frame.setVisible(true);
        
         }
    
 class Ocultar extends WindowAdapter{
    public void windowClosing(WindowEvent e){       
        frame.setVisible(false);
    }
 }    
    class ManejadorBoton implements ActionListener {        
        public void actionPerformed(ActionEvent e) { 
	 if(e.getActionCommand().equals("Eliminar")){
	     //txtfID.setText("Eliminando...");
 	 }
	 if(e.getActionCommand().equals("Cerrar")){				
                frame.setVisible(false);
	  }			
	 if(e.getActionCommand().equals("Limpiar")){				
	    // txtfID.setText(" ");
	  }
	}
}
	
  }

        
        