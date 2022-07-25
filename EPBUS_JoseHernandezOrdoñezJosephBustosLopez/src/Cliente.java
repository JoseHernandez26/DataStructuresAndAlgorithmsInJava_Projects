import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cliente {
	String R;
	String Nombre;
	String Num_Cliente;
	String Num_Telefono;
	String Operadora;
	int Monto;
	String LLAVE;
	
	private JFrame frame;
	private JFrame frame2;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */



	public Cliente() {
	
	}

	/**
	 * Initialize the contents of the frame.
	 */
	

public void Ingresar() {
		frame = new JFrame();
		frame.setBounds(100, 100, 496, 449);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		JLabel lblNewLabel = new JLabel("NOMBRE");
		lblNewLabel.setBounds(24, 43, 88, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(232, 40, 198, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("NUMERO DE CLIENTE");
		lblNewLabel_1.setBounds(24, 97, 128, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(232, 94, 198, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("NUMERO DE TELEFONO");
		lblNewLabel_2.setBounds(24, 163, 138, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(232, 160, 198, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("MONTO");
		lblNewLabel_3.setBounds(24, 228, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(232, 225, 198, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(231, 292, 199, 22);
		frame.getContentPane().add(comboBox);
		comboBox.addItem("Kolbi");
		comboBox.addItem("Claro");
		comboBox.addItem("Movistar");
		
		
		JLabel lblNewLabel_4 = new JLabel("OPERADORA");
		lblNewLabel_4.setBounds(24, 296, 71, 14);
		frame.getContentPane().add(lblNewLabel_4);
		comboBox.setSelectedItem("");
		
		JButton btnNewButton = new JButton("ACEPTAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Nombre=textField.getText();
			Num_Cliente=textField_1.getText();
				Num_Telefono=textField_2.getText();
				Monto=Integer.parseInt(textField_3.getText());
				Operadora=comboBox.getSelectedItem().toString();
				
			
				frame.setVisible(false);
				
			}
		});
		btnNewButton.setBounds(302, 376, 128, 23);
		frame.getContentPane().add(btnNewButton);
	}

public void Ingreso() {
	Nombre=JOptionPane.showInputDialog("Ingrese el nombre del cliente");
	Num_Cliente=JOptionPane.showInputDialog("Ingrese el numero de cliente");
	Num_Telefono=JOptionPane.showInputDialog("Ingrese el numero de telefono");
Monto=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto de saldo"));


/*
JComboBox comboBox = new JComboBox();
comboBox.setBounds(77, 81, 252, 22);
frame.getContentPane().add(comboBox);
JLabel lblNewLabel = new JLabel("SELECCIONE LA OPERADORA");
lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 15));
lblNewLabel.setBounds(77, 25, 314, 14);
frame.getContentPane().add(lblNewLabel);
comboBox.addItem("Kolbi");
comboBox.addItem("Claro");
comboBox.addItem("Movistar");


JButton btnNewButton = new JButton("ACEPTAR");
btnNewButton.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		String R=(String) comboBox.getSelectedItem();
		setOperadora(comboBox.getSelectedItem().toString());
		frame.setVisible(false);
	
	}
});

btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 12));
btnNewButton.setBounds(148, 148, 107, 23);
frame.getContentPane().add(btnNewButton);
*/
}
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getNum_Cliente() {
		return Num_Cliente;
	}

	public void setNum_Cliente(String num_Cliente) {
		Num_Cliente = num_Cliente;
	}

	public String getNum_Telefono() {
		return Num_Telefono;
	}

	public void setNum_Telefono(String num_Telefono) {
		Num_Telefono = num_Telefono;
	}

	public String getOperadora() {
		return Operadora;
	}

	public void setOperadora(String operadora) {
		Operadora = operadora;
	}

	public int getMonto() {
		return Monto;
	}

	public void setMonto(int monto) {
		Monto = monto;
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public JTextField getTextField_1() {
		return textField_1;
	}

	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}

	public JTextField getTextField_2() {
		return textField_2;
	}

	public void setTextField_2(JTextField textField_2) {
		this.textField_2 = textField_2;
	}

	public JTextField getTextField_3() {
		return textField_3;
	}

	public void setTextField_3(JTextField textField_3) {
		this.textField_3 = textField_3;
	}
	
	
	public String toString() {
		return "\nCliente \nNombre=" + Nombre + "\nNumero del cliente=" + Num_Cliente + "\nNumero de telefono=" + Num_Telefono
				+ "\nOperadora=" + Operadora + "\nMonto del saldo=" + Monto ;
	}
	
}
