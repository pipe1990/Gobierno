package View;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaEmergente extends JFrame {
	
	//ETIQUETA
	private JLabel mensaje;
	
	//BOTON
	private JButton listo;
	
	public VentanaEmergente() {
		
		setTitle("Atencion!");
		setSize(200, 100);
		getContentPane().setLayout(null);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		elementos();
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(false);
			
	}
	
	public void elementos(){
		
		//ETIQUETA 
		mensaje = new JLabel("Se eliminara a la persona!");
		mensaje.setBounds(20, 5, 200, 20);
		add(mensaje);
		
		//BOTON LISTO
		listo = new JButton("Listo");
		listo.setActionCommand("LISTO");
		listo.setBounds(50, 30, 100, 30);
		listo.setVisible(true);
		add(listo);
		
	}

	//GETTERS Y SETTERS
	public JLabel getMensaje() {
		return mensaje;
	}

	public void setMensaje(JLabel mensaje) {
		this.mensaje = mensaje;
	}

	public JButton getListo() {
		return listo;
	}

	public void setListo(JButton listo) {
		this.listo = listo;
	}

	
}

