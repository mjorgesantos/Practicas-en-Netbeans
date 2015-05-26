 
 
import java.awt.Image;
import javax.swing.ImageIcon;
 
public class CargaImagenes extends javax.swing.JFrame {
    private JPanelConFondo jPanelConFondo1 = new JPanelConFondo();
    private JPanelConFondo jPanelConFondo2 = new JPanelConFondo();   
 
    public CargaImagenes() {
        //...
        cargarImagenes();
    }
 
    private void cargarImagenes() {
        Image imagenInterna = new ImageIcon(
           getClass().getResource("satelite.jpg")).getImage();
        jPanelConFondo1.setImagen(imagenInterna);
 
        Image imagenExterna = 
            new ImageIcon("tierra.jpg").getImage();
        jPanelConFondo2.setImagen(imagenExterna);
    }
 
    //...             
}