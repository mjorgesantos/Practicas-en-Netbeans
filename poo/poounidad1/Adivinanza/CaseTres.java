
 
import javax.swing.JOptionPane;
public class CaseTres {
    public void CaseTres()
    {
       JOptionPane.showMessageDialog(null, "Programa de menu ");  
    }

    public static void main(String[] args) {
         int opc;
     opc=Integer.parseInt(JOptionPane.showInputDialog("Eliga una opcion a realizar: \n"+ "1.-Costo Soriana\n"+ "2.-Promedio\n"+"3.-Trabajadores"));
     
     switch(opc)
     {
         case 1 :
             double a,b;
             double c,e,f,g;
             double x=1.16,y=.35,w=.60;// para ponerlo en doble  Double.parseDouble
             a=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo del producto"));
             b=Double.parseDouble(JOptionPane.showInputDialog("Ingrese cantidad del producto"));
             c=a*x;
             JOptionPane.showMessageDialog(null, "El resiltado con iva incluido es:" + c );
              e=b*c;//productos por costo
             if(b>=30)
             {
                 f=e*y;//descuento
                 g=e-f;//proctos menos descuento
                 
                 JOptionPane.showMessageDialog(null, "El descuento realizado seria 35 % :" + g );
             }else if(b>=4500000)
             {
                f=e*w;
                g=e-f;
                JOptionPane.showMessageDialog(null, "El descuento realizado seria de 60% :" + g );
             }else if(b<30)
             {
                 
                 JOptionPane.showMessageDialog(null, "No se realiza descuento" + e );
             }
             break;
             
         case 2:
             double h,i,j,k,l,m,n,o;
              h=Double.parseDouble(JOptionPane.showInputDialog("Ingrese primera calificacion"));
              i=Double.parseDouble(JOptionPane.showInputDialog("Ingrese segunda calificacion"));
              j=Double.parseDouble(JOptionPane.showInputDialog("Ingrese tercera calificacion"));
              k=Double.parseDouble(JOptionPane.showInputDialog("Ingrese cuarta calificacion"));
              l=Double.parseDouble(JOptionPane.showInputDialog("Ingrese quinta calificacion"));
              m=Double.parseDouble(JOptionPane.showInputDialog("Ingrese sexta calificacion"));
             n=h+i+j+k+l+m;
             o=n/6;
              JOptionPane.showMessageDialog(null, "Promedio final" + o );
             break;
             
         case 3:
             double p,q,r,s,t;
             p=Double.parseDouble(JOptionPane.showInputDialog("Ingrese las horas trabajadas"));
             q=p*78;
             JOptionPane.showMessageDialog(null, "El pago por las horas trabajadas" + q );
             if(p==48)
             
             {
              JOptionPane.showMessageDialog(null, "Pago por puntualidad 685 supago seria" + (q+685) );   
             }
      }
        
    }
}
