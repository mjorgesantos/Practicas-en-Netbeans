import java.awt.*;
import java.awt.event.*;

class EventosUno extends Frame {	
	private Panel   pnlBotones;	
	private Panel   pnlBarra;	
	private Panel   pnlGeneral;
	private Button   btnAvanzar;
	private Button    btnRetroceder;
	public  Scrollbar  barra;	
	private ManejadorBoton mb;	
	
	public EventosUno() {
		pnlBotones = new Panel(new FlowLayout());
		pnlBarra   = new Panel(new BorderLayout());
		pnlGeneral = new Panel(new GridLayout(2,1,1,1));
						
		barra      = new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,100);		
		btnAvanzar = new Button("Avanzar");
		btnRetroceder = new Button("Retroceder");
		
		mb = new ManejadorBoton();
		btnAvanzar.addActionListener(mb);
		btnRetroceder.addActionListener(mb);
	}	
	public void vista()
	{
		pnlBotones.add(btnAvanzar);
		pnlBotones.add(btnRetroceder);
		pnlBarra.add(barra);
		pnlGeneral.add(pnlBarra);
		pnlGeneral.add(pnlBotones);		
		
		this.add(pnlGeneral);
		this.pack();
		this.setVisible(true);	
		
		
	
		
		
		//desde
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {			
  		        System.exit(0);
  		    }
  	    });
		
		
	}
		//hasta
// ==================================================================	
	class ManejadorBoton implements ActionListener {		
		private int i=0;
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand().equals("Avanzar")) {
				if (barra.getValue() == 100) 
					barra.setValue(100);
				else 
					i = barra.getValue();
					i += 5;
					barra.setValue(i);
				//barra.setValue(i);
			}
			if (e.getActionCommand().equals("Retroceder")) {
				if (barra.getValue() == 0) 
					barra.setValue(0);
				else
					i = barra.getValue();
					i -= 5;
					barra.setValue(i);				
			}
		}
	}
	public static void main(String []args)
	{
	  EventosUno evt = new EventosUno();
	  evt.vista();
	}
}
