import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class ImagenesBasico extends JFrame {

    private BufferedImage img = null;

    public ImagenesBasico() {
         super("Usando Imagenes"); //Llamamos al Contructor de JFrame
         leerImagen();
         setSize( 301,201 );
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setVisible(true);
    }

    /**
    * Método donde cargamos la imagen

    */
    public void leerImagen(){

        try {
            img = ImageIO.read(new File("strawberry.JPG"));
        } catch (IOException ex) {
            System.out.println("No se pudo leer la imagen");
        }
    }

    public void paint(Graphics g){
        g.drawImage(img, 10, 20,getWidth()-10, getHeight()-10, null);
    }


    public static void main(String[] args) {
        new ImagenesBasico();
    }
}