import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.awt.event.ActionEvent;

public class TransaccionGUI  implements Serializable{
	Usuarios U=new Usuarios();
	CAJEROSGUI CG=new CAJEROSGUI();
	String Numero; //Numero de transaccion
	String Fecha; //Fecha de la transaccion
	String hora; //Hora de la transaccion
	int Monto; // Monto tanto de deposito como de retiro
    int SaldoT;
	String Operacion;
 
	private JFrame frame;
	private JFrame frame1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TransaccionGUI window = new TransaccionGUI();
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
	public TransaccionGUI() {
		
	}
	
	

	public String getNumero() {
		return Numero;
	}

	public void setNumero(String numero) {
		Numero = numero;
	}

	public String getFecha() {
		return Fecha;
	}

	public void setFecha(String fecha) {
		Fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public int getMonto() {
		return Monto;
	}

	public void setMonto(int monto) {
		Monto = monto;
	}

	public int getSaldoT() {
		return SaldoT;
	}

	public void setSaldoT(int saldoT) {
		SaldoT = saldoT;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	//Ingresamos una consulta
	public void IngresarConsulta() {
	
		frame1 = new JFrame();
		frame1.setBounds(100, 100, 450, 300);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Numero Transaccion");
		lblNewLabel.setBounds(42, 39, 126, 14);
		frame1.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Fecha");
		lblNewLabel_1.setBounds(42, 92, 46, 14);
		frame1.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Hora");
		lblNewLabel_2.setBounds(42, 137, 46, 14);
		frame1.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(218, 36, 153, 20);
		frame1.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(218, 89, 153, 20);
		frame1.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(218, 137, 153, 20);
		frame1.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		frame1.setVisible(true);
		CG.Ingresar();
		JButton btnNewButton = new JButton("ACEPTAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setNumero(	textField.getText());
				 setFecha(	textField_1.getText());
				 setHora(textField_2.getText());
			
		
				
				JOptionPane.showMessageDialog(null, "Numero de transaccion: " + Numero + "\nFecha: " + Fecha + "\nHora: " + hora  + 
						"\nSaldo:" + U.Saldo);
				frame1.setVisible(false);
				
			}
		});
		btnNewButton.setBounds(257, 209, 114, 23);
		frame1.getContentPane().add(btnNewButton);	
		
		
	}
	public void Ingresar() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 558, 363);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Numero Transaccion");
		lblNewLabel.setBounds(80, 37, 120, 22);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(262, 38, 205, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Fecha");
		lblNewLabel_1.setBounds(80, 98, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(262, 95, 205, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Hora");
		lblNewLabel_2.setBounds(80, 160, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(262, 157, 205, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Monto");
		lblNewLabel_3.setBounds(80, 223, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(262, 220, 205, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		frame.setVisible(true);
		CG.Ingresar();
		JButton btnNewButton = new JButton("ACEPTAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 setNumero(	textField.getText());
				 setFecha(	textField_1.getText());
				 setHora(textField_2.getText());
				 setMonto(Integer.parseInt(textField_3.getText())); //DEPENDE DE LA OPERACCION QUE SE VA A REALIZAR
				
				frame.setVisible(false);
				
			}
		});
		btnNewButton.setBounds(289, 284, 147, 29);
		frame.getContentPane().add(btnNewButton);
		
		
		
	}

	@Override
	public String toString() {
		return "Transaccion =" + Operacion +"\n"+ U + "\nCG=" + CG + "\nNumero=" + Numero + "\nFecha=" + Fecha + "\nhora=" + hora
				+ "\nSaldoActual=" + U.Saldo;
	}
	

}
