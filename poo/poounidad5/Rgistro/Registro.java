
import java.awt.*;

public class Registro extends Frame
{
 private Label lblNombre;
 private Label lblTelefono;
private Label lblCorreo;
 private Label lblAficiones;
 private Label lblGenero;
 
 
 private CheckboxGroup chkbxgEstadoCivil;
 
 
 private TextField txtfNombre;
 private TextField txtfTelefono;
 private TextField txtfCorreo;
private TextField txtfAficiones; 
private TextField txtfGenero; 
 //private Frame frame;
private Checkbox chkbxSoltero;
 private Checkbox chkbxCasado;
 
  public Registro()
  {
      super("Registro v. 0.01");
       lblNombre =new Label ("Nombre:");
      lblTelefono =new Label ("Telefono:");
      lblCorreo= new Label("Correo:");
lblAficiones= new Label("Aficiones:");
lblGenero= new Label("Genero:");

//txtaAficiones= new TextArea (5,15);

 chkbxgEstadoCivil= new CheckboxGroup ();
      txtfNombre =new TextField(" ", 20);
      txtfTelefono =new TextField(" ", 15);
      txtfCorreo =new TextField(" ", 20);
 txtfAficiones=new TextField ("",33);
 txtfGenero=new TextField(" ", 20); 

   chkbxSoltero= new Checkbox ("Soltero", false,  chkbxgEstadoCivil);
      chkbxCasado= new Checkbox ("Casado", false, chkbxgEstadoCivil );
}

      public void vista()
      {
    this.add (lblNombre);
    add ( txtfNombre );
    this.add( lblTelefono);
    add ( txtfTelefono );
    this.add (lblCorreo);
    add (txtfCorreo);
     this.add (lblAficiones);
    add (txtfAficiones);
    this.add (lblGenero);
    add (lblGenero);

    this.add(chkbxSoltero);
    add (chkbxSoltero);
this.add(chkbxCasado);
    add (chkbxCasado);    
      this.setLayout (new FlowLayout ());
pack ();
this.setVisible (true);
}
public static void main (String []args)
{
Registro minivista= new Registro();
minivista.vista();
}
}

      
     