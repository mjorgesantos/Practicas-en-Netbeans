

//package formulario;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{
    JLabel l1,l2,l3,l4;
    JTextField t1,t2,t3,t4;
    JButton b1,b2,b3;  
    public Formulario (){
        l1=new JLabel("Nombre de Personal");
        l2=new JLabel("Estatura");
        l3=new JLabel("Correo");
        l4=new JLabel("Sexo");
        t1=new JTextField(20);
        t2=new JTextField(20);
        t3=new JTextField(20);
        t4=new JTextField(20);
        b1=new JButton("Validar");
        b2=new JButton("Limpiar");
        b3=new JButton("Salir");
        setLayout(new FlowLayout());
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
        add(b1);
        add(b2);
        add(b3);
    }
    public void actionPerformed(ActionEvent Val){
        if(Val.getSource()==b1){
            String nom=null,n="Emilio",est=null,es="1.50"
                    ,em=null,e="emilio_j@hotmail.com",sex=null,se="Masculino";
            nom=t1.getText();
            est=t2.getText();
            em=t3.getText();
            sex=t4.getText();
            if(nom.equals(n)){
                JOptionPane.showMessageDialog(null,"Pesonal Correcto ?");
                if(est.equals(es)){
                    JOptionPane.showMessageDialog(null,"Estatura Correcta ?");
                    if(em.equals(e)){
                        JOptionPane.showMessageDialog(null,"Correo Correcta ?");
                        if(sex.equals(se)){
                        JOptionPane.showMessageDialog(null,"Sexo Correcto ?");
                        JOptionPane.showMessageDialog(null,"Hola ?");
                    }else{
                    JOptionPane.showMessageDialog(null,"Sexo Incorrecto :(");
                }
                    }else{
                    JOptionPane.showMessageDialog(null,"Estatura Incorrecta :(");
                }
                }else{
                    JOptionPane.showMessageDialog(null,"Correo Incorrecto :(");
                }
            }else{
                JOptionPane.showMessageDialog(null,"Personal Incorrecto :(");
            }
        }
        if(Val.getSource()==b2){
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
              b2.setBackground(Color.pink);
        }
        if(Val.getSource()==b3){
            this.dispose();
        }
    }
    public static void main(String[]args){
        Formulario c1=new Formulario();
        c1.setTitle("Validacion");
        c1.setSize(250,280);
        c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c1.setVisible(true);
    } 
}

