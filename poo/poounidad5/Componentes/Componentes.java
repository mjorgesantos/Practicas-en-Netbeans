
import java.awt.*;
public class Componentes
{
 private Label lblNombre;
 private Label lblClave;
 private TextField txtfNombre;
 private TextField txtfClave;
 private Button btnAceptar;
 private Button btnCancelar;
 private Checkbox chcbxManzana;
 private Checkbox chkbxDurazno;
 private Checkbox chkbxPera;
 private CheckboxGroup chkbxgEstadoCivil;
 private Checkbox chkbxSoltero;
 private Checkbox chkbxCasado;
 private Frame frame;
 
  public Componentes()
  {
      lblNombre =new Label ("Nombre:");
      lblClave =new Label ("Clave:");
      txtfNombre =new TextField(" ", 20);
      txtfClave =new TextField(" ", 10);
      txtfClave.setEchoChar('*'); 
btnAceptar =new Button("Aceptar");
btnCancelar =new Button("Cancelar");
      chcbxManzana= new Checkbox ("Manzana", false );
      chkbxDurazno= new Checkbox ("Durazno", false);
      chkbxPera= new Checkbox ("Pera", false);
      chkbxgEstadoCivil= new CheckboxGroup ();
      chkbxSoltero= new Checkbox ("Soltero", false,  chkbxgEstadoCivil);
      chkbxCasado= new Checkbox ("Casado", false, chkbxgEstadoCivil );
      frame= new Frame ("Componentes v. 0.01");
    }
      public void vista()
      {
          frame.add(lblNombre);
          frame.add(txtfNombre);
          frame.add(lblClave);
          frame.add(txtfClave);
          frame.add(chcbxManzana);
          frame.add(chkbxPera);
          frame.add(chkbxDurazno);
          frame.add(chkbxSoltero);
          frame.add(chkbxCasado);
          frame.add(btnAceptar);
          frame.add(btnCancelar);
          frame.setLayout (new FlowLayout());
          frame.pack();
          frame.setVisible(true);
        }// fin de vista
        public static void main (String []args)
        {
            Componentes miVista=new Componentes ();
               miVista.vista();
        }
}

      
      
