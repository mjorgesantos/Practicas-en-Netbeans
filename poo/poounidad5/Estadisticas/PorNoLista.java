import java.io.*;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class PorNoLista
{ 
     private Panel pnlVista;
     private Panel pnlListaAlum;
     private Panel pnlBotones;
     private Panel pnlArea;
   
     private Label lblNoListaAlum;
     private TextField txtfNoListaAlum;
     private Button  btnConsultar;    
     private TextField txtfArea;
   
     private ManejadorBoton mb;
     private Frame frame;
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////7
     


//public class Archivo{  
    private String nombre;
    private String []archivo;
    private int noLineas;
 
 //-------------------------------------------------------------------------------------------
    //////Metodos privados
//********************************************************************************************
    private String[] leeArchivo(){    	
    	String linea = new String();	
        String[] arch = new String[70]; 
        
        try{
            BufferedReader entradaDesdeArchivo = new BufferedReader(new FileReader(nombre));
            int i=0;	
            while((linea = entradaDesdeArchivo.readLine())!= null) {
            	arch[i] = new String(linea); 
            	i++;	               
            }
            entradaDesdeArchivo.close();
        	return arch;
    	}
    	catch(FileNotFoundException ex){
            //ex.printStackTrace();
            return null;
    	}
    	catch(IOException ex){
            //ex.printStackTrace();
            return null;
        }	
    } 
//********************************************************************************************
	//Lee el numero de lineas que posee un archivo        
    private int leeNoLineas(){ 
    	String linea = new String();               
        try{
            BufferedReader entradaDesdeArchivo = new BufferedReader(new FileReader(nombre));
            int i=0;	
            while((linea = entradaDesdeArchivo.readLine())!= null) {
            	i++;	               
            }
            entradaDesdeArchivo.close();
        	return i;
    	}
    	catch(FileNotFoundException ex){
            ex.printStackTrace();
            return -1;
    	}
    	catch(IOException ex){
            ex.printStackTrace();
            return -1;
        }	
    }
//********************************************************************************************    
//---------Metodos Publicos
/////////////////////////////////////////////////////////////////////////////////////////////
    public PorNoLista(String nombre){ 	//Constructor Archivo   
      	this.nombre =nombre+".csv";
      	archivo = leeArchivo();
      	noLineas = leeNoLineas();
    }    
/////////////////////////////////////////////////////////////////////////////////////////////    
    //Regresa el numero de lineas que posee un archivo
    public int getNoLineas(){
    	return noLineas;
    }  
    
/////////////////////////////////////////////////////////////////////////////////////////////    
    //Como alternativa la constructor, permite p?sar los datos de inicio de archivo   
    public void setArchivo(String nombre){
    	this.nombre = nombre+".csv";
    	archivo = leeArchivo();
        noLineas = leeNoLineas();
    }
      
  
	public String leeLinea(int numeroLinea){
		return archivo[numeroLinea];
    }
    public String leeLinea(String cadena){
        	for(int i=0; i<noLineas; i++){
            	if(archivo[i].indexOf(cadena,0)!=-1){
            		return archivo[i];
            	}		               
            }
		return null;	
    }
    public void reemplazaLinea(String nuevalinea, int noLinea){
        archivo[noLinea] = nuevalinea;         		
    }
	public int getNoLinea(String nombre){
        for(int i=0; i<noLineas; i++){
            if(archivo[i].indexOf(nombre,0)!=-1){
            	return i;
            }		               
        }
		return -1;	
    } 
    
    public void cerrar(){
        try{
            FileWriter salida = new FileWriter(nombre);
            for(int i=0; i<noLineas; i++){
                salida.write(archivo[i]);
                salida.write(0xD); salida.write(0xA);
            }
            salida.close();
        }
    	catch(IOException ex){
            ex.printStackTrace();
    	  }
    }

	public static void main(String args[]){	
	PorNoLista archivo = new PorNoLista("c:\\Grupos\\2ta");
		int i;
		for(i=0; i<archivo.getNoLineas(); i++)
		{
		  System.out.println(archivo.leeLinea(i));
		}		
		archivo.reemplazaLinea("0,A,a",0);
		System.out.println(archivo.leeLinea(0));
		System.out.println(archivo.leeLinea("C"));
				
	} 
     public  PorNoLista ()
     
{
frame = new Frame("Por Numero de Lista");
pnlVista = new Panel(new GridLayout(2,2)); 
pnlListaAlum = new Panel(new FlowLayout()); 
  pnlBotones = new Panel(new FlowLayout());
  pnlArea = new Panel(new FlowLayout()); 
    
     lblNoListaAlum = new Label("No Lista Alumno");
     txtfNoListaAlum =new TextField("",20);
btnConsultar  = new Button("Consultar");
 txtfArea =new TextField("",20);
 
 
 
 mb = new ManejadorBoton();
         btnConsultar.addActionListener(mb);
         }
public void vista()
{
// private Panel pnlVista
//pnlVista.add( pnlVista);
pnlListaAlum.add(lblNoListaAlum);
pnlListaAlum.add(txtfNoListaAlum);
pnlBotones.add(btnConsultar);
pnlArea.add(txtfArea);

    pnlVista.add(lblNoListaAlum); 
 
pnlVista.add(pnlListaAlum);        
  
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
	 //if(e.getActionCommand().equals("Cerrar")){				
     //           frame.setVisible(false);
	  //}			
	 //if(e.getActionCommand().equals("Limpiar")){				
	    // txtfID.setText(" ");
	  }
	}
}
	  
 // }

        
        