 import java.io.*;

public class Archivo{  
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
    public Archivo(String nombre){ 	//Constructor Archivo   
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
		Archivo archivo = new Archivo("c:\\work\\prueba");
		int i;
		for(i=0; i<archivo.getNoLineas(); i++)
		{
		  System.out.println(archivo.leeLinea(i));
		}		
		archivo.reemplazaLinea("0,A,a",0);
		System.out.println(archivo.leeLinea(0));
		System.out.println(archivo.leeLinea("C"));
				
	}
}
