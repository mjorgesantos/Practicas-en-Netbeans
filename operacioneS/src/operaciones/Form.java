package operaciones;

import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
 
public class Form {
 
    private final JFrame frame = new JFrame();
    private final JTextFieldHint textFirstName = new JTextFieldHint();
    private final JTextFieldHint textLastName = new JTextFieldHint();
 
   // public Form() {
    //}
 
    private void FondoText() {
        frame.getContentPane().setLayout(null);
 
        textFirstName.setHint("Nombres...escdfffffffffff");
        textLastName.setHint("Apellidos.ddddddddddddddddddddddd..");
 
        textFirstName.setBounds(30, 30, 200, 28);
        textLastName.setBounds(30, 60, 200, 28);
 
        frame.getContentPane().add(textFirstName);
        frame.getContentPane().add(textLastName);
    }
 
    private void showGui() {
        frame.setTitle("JTextField with ¡Hint!");
        frame.setSize(260, 140);
        frame.setLocationRelativeTo(null);
        frame.setAlwaysOnTop(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        Form form = new Form();
        form.FondoText();
        form.showGui();
    }
 
}