import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Stack;
import java.awt.event.ActionEvent;


public class PRINCIPAL {
	Arbol ABB=new Arbol();
	private JFrame frame;
	int C1=ABB.evaluacion;
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
		frame.setBounds(100, 100, 692, 455);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("INSERTAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Canton C=new Canton();
			C.Ingresar();
			ABB.InsertarNodo(C);
			
			
			}
		});
		btnNewButton.setBounds(32, 42, 224, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("BUSCAR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ABB.Buscar();
			}
		});
		btnNewButton_1.setBounds(32, 90, 224, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("MOSTRAR NIVEL CANTON");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ABB.Imprimirnivel();
				
				
			}
		});
		btnNewButton_2.setBounds(32, 141, 224, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("ELIMINAR CANTON");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
		
				
				
			ABB.BuscarEvaluacion();
	
			
	
			}
				
		});
		btnNewButton_3.setBounds(32, 191, 224, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("MOSTRAR IN ORDEN");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ABB.InOrden(ABB.raiz);
				
				JOptionPane.showMessageDialog(null, "Total de casos activos:" + ABB.addBT2(ABB.raiz) + "\nTotal de casos recuperados:" +  
						ABB.addBT3(ABB.raiz)  + "\nTotal del pais:" +  ABB.addBT4(ABB.raiz)   );
			}
		});
		btnNewButton_4.setBounds(32, 248, 224, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("MOSTRAR PREORDEN");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ABB.PreOrden(ABB.raiz);
			
				JOptionPane.showMessageDialog(null, "Total de casos activos:" + ABB.addBT2(ABB.raiz) + "\nTotal de casos recuperados:" +  
						ABB.addBT3(ABB.raiz)  + "\nTotal del pais:" +  ABB.addBT4(ABB.raiz)   );
			}
		});
		btnNewButton_5.setBounds(32, 306, 224, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("MOSTRAR POSTORDEN");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ABB.PosOrden(ABB.raiz);
		
				JOptionPane.showMessageDialog(null, "Total de casos activos:" + ABB.addBT2(ABB.raiz) + "\nTotal de casos recuperados:" +  
						ABB.addBT3(ABB.raiz)  + "\nTotal del pais:" +  ABB.addBT4(ABB.raiz)   );
			}
		});
		btnNewButton_6.setBounds(32, 352, 224, 23);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("ALTURA NODO");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ABB.BuscarAlturaNodo();
			}
		});
		btnNewButton_7.setBounds(366, 42, 224, 23);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("ALTURA ARBOL");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ABB.height1();
			}
		});
		btnNewButton_8.setBounds(366, 90, 224, 23);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("CAMINO Y LONGITUD");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ABB.BuscarEvaluacion1();
				ABB.BuscarEvaluacion2();
			   int C1=ABB.C1;
			   int C2=ABB.C2;
				ABB.find(C1,ABB.raiz);
				ABB.find(C2,ABB.raiz);
				for(int i=0; i<ABB.List.size(); i++ ) {
					
					JOptionPane.showMessageDialog(null, ABB.List.get(i));
				}
				ABB.Distancia();
				
			
			}
		});
		btnNewButton_9.setBounds(366, 141, 224, 23);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("CASOS ACTIVOS");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int nivel=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el nivel"));
				ABB.printGivenLevel(ABB.raiz, nivel);
				
			}
		});
		btnNewButton_10.setBounds(366, 191, 224, 23);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("RECUPERADOS");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int nivel=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el nivel"));
				ABB.printGivenLevel1(ABB.raiz, nivel);
			}
		});
		btnNewButton_11.setBounds(366, 248, 224, 23);
		frame.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_13 = new JButton("SALIR");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnNewButton_13.setBounds(414, 306, 137, 48);
		frame.getContentPane().add(btnNewButton_13);
	}
}
