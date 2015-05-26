
public class saludador
{


private String nombre;
private String saludo;
public String getNombre ()
{
      return nombre;
}
  public void setNombre (String nuevonombre)
{
 nombre = nuevonombre; 
}  

public String getSaludo ()
{
return saludo;
}
public void setSaludo (String nuevoSaludo)
{
nombre=nuevoSaludo; 
}  

public void saludo ()
{
System.out.println (nombre + "  saluda");
 }  
public static void main(String[] args) 
{
saludador chabelo =new saludador();
saludador nedFlanders =new saludador ();
saludador indio= new saludador ();

  chabelo.setSaludo ("hola cuates......");
  nedFlanders.setSaludo ("Buenos   diajirijillas");
  indio.setSaludo ("Quiobo amigo");
  
  chabelo.saludo ();
  nedFlanders.saludo ();
  indio.saludo ();
}
}




 


