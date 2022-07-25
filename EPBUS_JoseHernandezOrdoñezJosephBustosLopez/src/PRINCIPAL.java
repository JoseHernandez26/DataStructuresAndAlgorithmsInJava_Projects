import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PRINCIPAL {
Hashing H1=new Hashing();
Hashing H2=new Hashing();
	private JFrame frame;
	private JFrame frame1;
	private JFrame frame2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PRINCIPAL window = new PRINCIPAL();
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
	public PRINCIPAL() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 610, 344);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("INSERTAR CLIENTE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cliente C=new Cliente();
				C.Ingreso();

frame2 = new JFrame();
frame2.setBounds(100, 100, 534, 225);
frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame2.getContentPane().setLayout(null);
frame2.setVisible(true);
JLabel lblNewLabel = new JLabel("Seleccione la Operadora de Cliente");
lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 15));
lblNewLabel.setBounds(120, 32, 308, 14);
frame2.getContentPane().add(lblNewLabel);

JButton btnNewButton = new JButton("Kolbi");
btnNewButton.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		C.Operadora="Kolbi";
		  H2.Insertar(C.Operadora, C);
		
		frame2.setVisible(false);
		
	}
});
btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 11));
btnNewButton.setBounds(38, 132, 134, 23);
frame2.getContentPane().add(btnNewButton);

JButton btnNewButton_1 = new JButton("Claro");
btnNewButton_1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
			C.Operadora="Claro";
			  H2.Insertar(C.Operadora, C);
		
		frame2.setVisible(false);
	}
	
	
	
});
btnNewButton_1.setFont(new Font("Arial Black", Font.PLAIN, 11));
btnNewButton_1.setBounds(205, 132, 134, 23);
frame2.getContentPane().add(btnNewButton_1);

JButton btnNewButton_2 = new JButton("Movistar");
btnNewButton_2.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		
		
		C.Operadora="Movistar";
		  H2.Insertar(C.Operadora, C);
		
		frame2.setVisible(false);
	}
});
btnNewButton_2.setFont(new Font("Arial Black", Font.PLAIN, 11));
btnNewButton_2.setBounds(375, 132, 115, 23);
frame2.getContentPane().add(btnNewButton_2);
				
				 
				H1.Insertar(C.Num_Cliente, C);
				
		     
				
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnNewButton.setBounds(131, 55, 327, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("LOCALIZAR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Num=JOptionPane.showInputDialog(null,"Ingrese el numero del cliente");
				H1.Buscar(Num);

			
				
				
				
			}
		});
		btnNewButton_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnNewButton_1.setBounds(131, 107, 327, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("MOSTRAR CLIENTES POR OPERADORA");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				frame1 = new JFrame();
				frame1.setBounds(100, 100, 450, 221);
				frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame1.getContentPane().setLayout(null);
			  frame1.setVisible(true);
				JLabel lblNewLabel = new JLabel("SELECCIONE LA OPERADORA ");
				lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 15));
				lblNewLabel.setBounds(77, 25, 314, 14);
				frame1.getContentPane().add(lblNewLabel);
			
				JComboBox comboBox = new JComboBox();
				comboBox.setBounds(77, 81, 252, 22);
				frame1.getContentPane().add(comboBox);
				comboBox.addItem("Kolbi");
				comboBox.addItem("Claro");
				comboBox.addItem("Movistar");
				comboBox.setSelectedItem("");
				JButton btnNewButton = new JButton("ACEPTAR");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
					
						
						H2.Buscar3(comboBox.getSelectedItem().toString());
						frame1.setVisible(false);
					}
				});
				btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 12));
				btnNewButton.setBounds(148, 148, 107, 23);
				frame1.getContentPane().add(btnNewButton);
				
				
			}
		});
		btnNewButton_2.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnNewButton_2.setBounds(131, 167, 327, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("SALIR");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnNewButton_3.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnNewButton_3.setBounds(465, 259, 103, 35);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("MOSTRAR");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				H1.Mostrar();
			
			}
		});
		btnNewButton_4.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnNewButton_4.setBounds(131, 225, 327, 23);
		frame.getContentPane().add(btnNewButton_4);
	}
}
