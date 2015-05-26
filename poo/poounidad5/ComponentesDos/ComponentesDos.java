import java.awt.*;
public class ComponentesDos extends Frame
{ 
private Choice chcPaises;
private List listAutos;
private TextArea txtaObservaciones;
private Scrollbar ScbrMedidor;

public  ComponentesDos()
{
super ("componentes v.0.0.1");
chcPaises =new Choice();
listAutos =new List();
ScbrMedidor =new Scrollbar (Scrollbar.HORIZONTAL,0,60,0,300);
txtaObservaciones= new TextArea (5,15);
chcPaises.add("Mexico");
chcPaises.add("Alemania");
chcPaises.add("Australia");
listAutos.add("Ferrari");
listAutos.add("BMW");
listAutos.add("Audi");
}
public void vista()
{
this.add (txtaObservaciones);
add (chcPaises);
this.add(listAutos);
add (ScbrMedidor);
this.setLayout (new FlowLayout ());
pack ();
this.setVisible (true);
}
public static void main (String []args)
{
ComponentesDos minivista= new ComponentesDos();
minivista.vista();
}
}
