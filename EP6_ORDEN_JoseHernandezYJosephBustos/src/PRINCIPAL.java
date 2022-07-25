import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class PRINCIPAL {
ListaP LP=new ListaP();
LISTA LC=new LISTA();
LISTA LV=new LISTA();
LISTA F= new LISTA();
LISTA A[]=new LISTA[400];
int Contador=0;
Compras C1=new Compras();
Ventas V1=new Ventas();
	private JFrame frame;

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
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 624, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("PRODUCTOS");
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PRODUCTO P=new PRODUCTO();
				P.Ingreso();
				LP.IngresarNodo(P);
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 14));
		btnNewButton.setBounds(136, 11, 300, 33);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("INGRESAR COMPRAS");
		btnNewButton_1.setBackground(new Color(192, 192, 192));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				Compras C=new Compras();
				
				C.Ingreso();
			    
				
			
				LC.InsertarCompra(C);

	F.InsertarFACTURA(C);
			
			}
		});
		btnNewButton_1.setFont(new Font("Arial Black", Font.PLAIN, 14));
		btnNewButton_1.setBounds(136, 139, 300, 33);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("INGRESAR VENTAS");
		btnNewButton_2.setBackground(new Color(192, 192, 192));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				Ventas V=new Ventas();
				V.Ingreso();
				
				V1=V;
				
		
				LV.InsertarVentas(V);
				
				F.InsertarFACTURA(V);
				
			}
		});
		btnNewButton_2.setFont(new Font("Arial Black", Font.PLAIN, 14));
		btnNewButton_2.setBounds(136, 255, 300, 33);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("SALIR");
		btnNewButton_3.setBackground(new Color(192, 192, 192));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnNewButton_3.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnNewButton_3.setBounds(478, 399, 89, 33);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("MOSTRAR BODEGA(QUICKSORT)");
		btnNewButton_4.setBackground(new Color(192, 192, 192));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LP.quickSort(LP.primero);
				LP.Mostrar(LP.primero);
				JOptionPane.showMessageDialog(null, "Numero de comparaciones:" + LP.com);
				JOptionPane.showMessageDialog(null, "Numero de intercambios:" + LP.inter);
				
				
				
			}
		});
		btnNewButton_4.setFont(new Font("Arial Black", Font.PLAIN, 14));
		btnNewButton_4.setBounds(136, 76, 300, 33);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("MOSTAR VENTAS(SHELL)");
		btnNewButton_5.setBackground(new Color(192, 192, 192));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			LV.primero1=LV.ShellSort(LV.primero1);
			LV.ImprimirListaVentas(LV.primero1);
			
			JOptionPane.showMessageDialog(null, "Cantidad de comparaciones:" + LV.ComSH);
			JOptionPane.showMessageDialog(null, "Cantidad de intercambios:" + LV.interSH);
		
			}
		});
		btnNewButton_5.setFont(new Font("Arial Black", Font.PLAIN, 14));
		btnNewButton_5.setBounds(136, 312, 300, 33);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("MOSTRAR COMPRAS(INSERTION)");
		btnNewButton_6.setBackground(new Color(192, 192, 192));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LC.insertionSort(LC.primero);
				LC.ImprimirLista(LC.primero);
				JOptionPane.showMessageDialog(null, "Cantidad de comparaciones:" + LC.ComIN);
				JOptionPane.showMessageDialog(null, "Cantidad de Intercambio:" + LC.interIN);
				
			}
		});
		btnNewButton_6.setFont(new Font("Arial Black", Font.PLAIN, 14));
		btnNewButton_6.setBounds(136, 196, 300, 33);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("MOSTRAR FACTURAS(MERGE)");
		btnNewButton_7.setBackground(new Color(192, 192, 192));
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 F.primero3 = F.mergeSort(F.primero3); 
				 F.primero3 = F.mergeSort1(F.primero3); 
				F.ImprimirListaF(F.primero3);

			
			}
		});
		btnNewButton_7.setFont(new Font("Arial Black", Font.PLAIN, 14));
		btnNewButton_7.setBounds(136, 371, 300, 33);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("ELIMINAR FACTURA");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				F.EliminarNodo();
			}
		});
		btnNewButton_8.setBackground(new Color(192, 192, 192));
		btnNewButton_8.setFont(new Font("Arial Black", Font.PLAIN, 14));
		btnNewButton_8.setBounds(136, 415, 300, 35);
		frame.getContentPane().add(btnNewButton_8);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	public void MERGE() {
		
		
		
		
	}
}
