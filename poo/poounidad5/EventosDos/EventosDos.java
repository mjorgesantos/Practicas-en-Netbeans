
import java.awt.*;
import java.awt.event.*;

class EventosDos extends Frame {
	private String cadena;	
	private Panel  pnlTxtArriba;	
	private Panel  pnlBtnEscribir;	
	private Panel  pnlGeneral;
	
	private TextField txtArriba;
	private TextArea  txtAbajo;	
	private Button  btnLimpiar;
		
	private ManejadorTexto mt;	
	private ManejadorBoton mb;
		
	public EventosDos() {
		
		pnlGeneral = new Panel(new BorderLayout());
				
		txtArriba = new TextField("fdADF",30);
		txtAbajo  = new TextArea("",20,30);		
		btnLimpiar = new Button("Limpiar");
		
		mt = new ManejadorTexto();
		mb = new ManejadorBoton();
				
		txtArriba.addTextListener(mt);
		btnLimpiar.addActionListener(mb);
	}
	public void vista()
	{
		pnlGeneral.add(txtArriba,BorderLayout.NORTH); 		
		pnlGeneral.add(btnLimpiar,BorderLayout.CENTER); 
		pnlGeneral.add(txtAbajo,BorderLayout.SOUTH); 
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {			
  		        System.exit(0);
  		    }
  	    });
		add(pnlGeneral);		
		pack();
		setVisible(true);
		
	}
		
	class ManejadorTexto implements TextListener {
		private String cadena;
		public void textValueChanged(TextEvent e) {			
		cadena = txtArriba.getText();			
			txtAbajo.setText(cadena);
		}					
	}
	
	class ManejadorBoton implements ActionListener {		
		public void actionPerformed(ActionEvent e) {			
		//	txtArriba.setText("");
		txtAbajo.setText("jgjhjg");
		}
	}
	public static void main(String []args)
	{
	  EventosDos evt = new EventosDos();
	  evt.vista();
	}
}

