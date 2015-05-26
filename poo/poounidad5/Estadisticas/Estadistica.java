

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
public class Estadistica 
{ 
 private Panel pnlVista;
    private Panel pnlGrupo;
    private Panel pnlGrupos;
    private Panel pnlBotones;
    
  private Label lblGrupo;
  private Choice chcGrupos;



    private Button  btnPorNLista;        
    private Button  btnPorNombre;
    private ManejadorBoton mb;
    private Frame frame;

public  Estadistica()
{
frame = new Frame("Estadistica V.1.1");
pnlVista = new Panel(new GridLayout(2,2)); 
pnlGrupo = new Panel(new FlowLayout()); 
pnlGrupos = new Panel(new FlowLayout()); 
pnlBotones = new Panel(new FlowLayout());
  
  
  lblGrupo = new Label("Grupo:");
  chcGrupos =new Choice();
  chcGrupos.add("2ta");
  chcGrupos.add("2tb");
  chcGrupos.add("2tc");
  
         btnPorNLista  = new Button("Por No_Lista");
         btnPorNombre  = new Button("Por Nombre");
  
        mb = new ManejadorBoton();
        btnPorNLista.addActionListener(mb);
        btnPorNombre.addActionListener(mb);


}
public void vista()
{

pnlGrupo.add(new Label("Grupo: "));
pnlGrupos.add(chcGrupos);

pnlBotones.add(btnPorNLista);
        pnlBotones.add(btnPorNombre);

        
        pnlVista.add(pnlGrupo);        
         
         pnlVista.add(pnlGrupos);      
        pnlVista.add(pnlBotones);
        
        
        frame.add(pnlVista);      
        frame.pack();
        frame.setLocation(0,60);
        frame.setVisible(true);
    }
        public static void main(String[] args) {
       Estadistica bd = new Estadistica();
        bd.vista();
        
        
    }
    
   // public static void main(String args[]){	
	PorNoLista archivo = new PorNoLista("c:\\Grupos\\2ta");
		int i;
		//for(i=0; i<archivo.getNoLineas(); i++)
		{
		  System.out.println(archivo.leeLinea(i));
		}		
	//	archivo.reemplazaLinea("0,A,a",0);
		//System.out.println(archivo.leeLinea(0));
		//System.out.println(archivo.leeLinea("C"));
				
	

    
    
public class ManejadorBoton implements ActionListener {
            
    public void actionPerformed(ActionEvent e){
        if(e.getSource().equals(btnPorNLista)){         
           PorNoLista consulta = new PorNoLista();
            consulta.vista();
        }
        
        else if(e.getSource().equals(btnPorNombre)){         
           PorNombre Nombre = new PorNombre();
       Nombre.vista();
        }    
         
        
        
        
       
        }
    }

}
