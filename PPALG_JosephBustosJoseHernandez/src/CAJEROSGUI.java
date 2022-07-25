import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.awt.event.ActionEvent;

public class CAJEROSGUI implements Serializable{
	int CodigoCajero;
	String direccion;
    

	String Numero; //Numero de transaccion
	String Fecha; //Fecha de transaccion	
	String hora;  //Hora de transaccion
	int Monto; // Monto tanto de deposito como de retiro
    int SaldoT; //Saldo total
	
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;


	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CAJEROSGUI window = new CAJEROSGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CAJEROSGUI() {
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	//Ingreso de datos
public void Ingresar() {
		frame = new JFrame();
		frame.setBounds(100, 100, 504, 234);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CODIGO");
		lblNewLabel.setBounds(57, 44, 80, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(200, 41, 141, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("DIRECCION");
		lblNewLabel_1.setBounds(57, 107, 92, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(200, 107, 141, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		frame.setVisible(true);
		JButton btnNewButton = new JButton("ACEPTAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setCodigoCajero(Integer.parseInt(textField .getText())) ;
				 setDireccion(textField_1.getText()) ;
				
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(335, 161, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}

	public int getCodigoCajero() {
		return CodigoCajero;
	}

	public void setCodigoCajero(int codigoCajero) {
		CodigoCajero = codigoCajero;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "\nCAJERO \nCodigoCajero=" + CodigoCajero + "\ndireccion=" + direccion ;
	}
	
	
}
