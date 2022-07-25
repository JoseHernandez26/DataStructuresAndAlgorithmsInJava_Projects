import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class PRINCIPAL {

	private JFrame frame; //Ventana principal
	private JFrame frame1; //Ventana de usuarios
	private JFrame frame2; //Ventana de cajeros
	private JFrame frame3; //Ventana de cajeros
	 int exchanges= 0; //Intercambios metodo shell
	   int comparisons= 0; //Intercambios comparaciones
ListaUsuarios LU=new ListaUsuarios();
LISTACAJEROS LC=new LISTACAJEROS();
int contador;
Usuarios US[]=new Usuarios[200];
ListaTransaccion LT=new ListaTransaccion();
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
		frame.getContentPane().setBackground(new Color(192, 192, 192));
		frame.setBackground(new Color(0, 139, 139));
		frame.setBounds(100, 100, 696, 290);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("ADMINISTRAR USUARIOS");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame1 = new JFrame();
				frame1.setBounds(100, 100, 450, 300);
				frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame1.getContentPane().setLayout(null);
			frame1.setVisible(true);
				JButton btnNewButton = new JButton("INGRESAR");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Usuarios U=new Usuarios();
						TransaccionGUI T=new TransaccionGUI();
					U.Ingresar();
					
					T.U=U;
					US[contador]=U;
						LU.InsertarNodoEmpleado(U);
						LT.InsertarNodo1(T);
						
						
						contador++;
						
					}
				});
				btnNewButton.setBounds(113, 27, 182, 23);
				frame1.getContentPane().add(btnNewButton);
				
				JButton btnNewButton_1 = new JButton("MOSTRAR");
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						LU.ImprimirLista(LU.primero);
						
						
					}
				});
				btnNewButton_1.setBounds(113, 73, 182, 23);
				frame1.getContentPane().add(btnNewButton_1);
				
				JButton btnNewButton_2 = new JButton("BUSCAR");
				btnNewButton_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						LU.Buscar();
					}
				});
				btnNewButton_2.setBounds(113, 122, 182, 23);
				frame1.getContentPane().add(btnNewButton_2);
				
				JButton btnNewButton_3 = new JButton("ELIMINAR");
				btnNewButton_3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						LU.EliminarNodo();
					}
				});
				btnNewButton_3.setBounds(113, 171, 182, 23);
				frame1.getContentPane().add(btnNewButton_3);
				frame1.setVisible(true);
				JButton btnNewButton_4 = new JButton("REGRESAR");
				btnNewButton_4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
					frame1.setVisible(false);	
						
						
						
					}
				});
				btnNewButton_4.setBounds(138, 219, 128, 31);
				frame1.getContentPane().add(btnNewButton_4);
				
				
				
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(128, 0, 0));
		btnNewButton.setBounds(10, 22, 286, 39);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ADMINISTRAR CAJEROS");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame2 = new JFrame();
				frame2.setBounds(100, 100, 468, 300);
				frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame2.getContentPane().setLayout(null);
				frame2.setVisible(true);
				JButton btnNewButton = new JButton("REGISTRAR CAJEROS");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					CAJEROSGUI CG=new CAJEROSGUI();
					CG.Ingresar();
					LC.InsertarNodoInicio(CG);	
					
						
					}
				});
				btnNewButton.setBounds(142, 26, 182, 23);
				frame2.getContentPane().add(btnNewButton);
				
				JButton btnNewButton_1 = new JButton("BUSCAR");
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						LC.BuscarCajero();
						
					}
				});
				btnNewButton_1.setBounds(142, 114, 182, 23);
				frame2.getContentPane().add(btnNewButton_1);
				
				JButton btnNewButton_2 = new JButton("MOSTRAR");
				btnNewButton_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						
						
						LC.ImprimirLista(LC.primero);
					}
				});
				btnNewButton_2.setBounds(142, 71, 182, 23);
				frame2.getContentPane().add(btnNewButton_2);
				
				JButton btnNewButton_3 = new JButton("ELIMINAR");
				btnNewButton_3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						LC.EliminarNodo();
					}
				});
				btnNewButton_3.setBounds(142, 167, 182, 23);
				frame2.getContentPane().add(btnNewButton_3);
				
				JButton btnNewButton_4 = new JButton("REGRESAR");
				btnNewButton_4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						frame2.setVisible(false);
					}
				});
				btnNewButton_4.setBounds(292, 227, 107, 23);
				frame2.getContentPane().add(btnNewButton_4);
				
				
				
				
			}
		});
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(128, 0, 0));
		btnNewButton_1.setBounds(10, 58, 286, 39);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("TRANSACCIONES");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame3 = new JFrame();
				frame3.setBounds(100, 100, 565, 350);
				frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame3.getContentPane().setLayout(null);
				frame3.setVisible(true);
				JButton btnNewButton = new JButton("CONSULTA");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						LT.Consulta();
					
						
						
					}
				});
				btnNewButton.setBounds(144, 55, 255, 23);
				frame3.getContentPane().add(btnNewButton);
				
				JButton btnNewButton_1 = new JButton("RETIRAR");
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						LT.Retiro();
					  
						
						
					}
				});
				btnNewButton_1.setBounds(144, 112, 255, 23);
				frame3.getContentPane().add(btnNewButton_1);
				
				JButton btnNewButton_2 = new JButton("DEPOSITAR");
				btnNewButton_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						LT.Deposito();
						
					}
				});
				btnNewButton_2.setBounds(144, 175, 255, 23);
				frame3.getContentPane().add(btnNewButton_2);
				
				JButton btnNewButton_3 = new JButton("REGRESAR");
				btnNewButton_3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						
						
						frame3.setVisible(false);
					}
				});
				btnNewButton_3.setBounds(219, 264, 104, 23);
				frame3.getContentPane().add(btnNewButton_3);
				
				JButton btnNewButton_4 = new JButton("MOSTRAR");
				btnNewButton_4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						
						LT.ImprimirLista(LT.primero);
					}
				});
				btnNewButton_4.setBounds(144, 220, 255, 23);
				frame3.getContentPane().add(btnNewButton_4);
				
				
				
			}
		});
		btnNewButton_2.setBackground(new Color(128, 0, 0));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBounds(10, 93, 286, 39);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("GUARDAR TRANSACCIONES");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				try {
					LT.Guardar();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(128, 0, 0));
		btnNewButton_3.setBounds(10, 129, 286, 39);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("RECUPERAR");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					LT.Recuperar();
				} catch (ClassNotFoundException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setBackground(new Color(128, 0, 0));
		btnNewButton_4.setBounds(10, 164, 286, 39);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnBusquedahash = new JButton("BUSQUEDA(HASH)");
		btnBusquedahash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String DNI=JOptionPane.showInputDialog("Ingrese el numero de clave del cliente a buscar");
				LT.BuscarTransaccion(DNI);
				
				
				
				
			}
		});
		btnBusquedahash.setForeground(new Color(255, 255, 255));
		btnBusquedahash.setBackground(new Color(128, 0, 0));
		btnBusquedahash.setBounds(411, 22, 254, 39);
		frame.getContentPane().add(btnBusquedahash);
		
		JButton btnNewButton_5 = new JButton("CLIENTE(AplicarQuicksort)");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NodoU n = LU.primero; 
			    while(n.siguiente != null) {
			        n= n.siguiente; 
			    }
				LU.Quicksort(LU.primero, n);
				

				JOptionPane.showMessageDialog(null, "Aplicacion completada");
			}
		});
		btnNewButton_5.setForeground(new Color(255, 255, 255));
		btnNewButton_5.setBackground(new Color(128, 0, 0));
		btnNewButton_5.setBounds(411, 58, 254, 39);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("CLIENTE(AplicarShell)");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				ShellSort(US);

			JOptionPane.showMessageDialog(null, "Aplicacion completada");
				
			
				
			}
		});
		btnNewButton_6.setBackground(new Color(128, 0, 0));
		btnNewButton_6.setForeground(new Color(255, 255, 255));
		btnNewButton_6.setBounds(411, 93, 254, 39);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("MOSTRAR CLIENTES ORDENADOS");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "ShellSort");
				printArray(US) ;
				
				JOptionPane.showMessageDialog(null, "QuickSort");
				LU.ImprimirLista1(LU.primero);

		        JOptionPane.showMessageDialog(null,"Numeros de intercambios:" + LU.SwapCounter);
		        
		        JOptionPane.showMessageDialog(null,"Numeros de comparaciones:" + LU.SwapCounter);
				
			}
		});
		btnNewButton_7.setForeground(new Color(255, 255, 255));
		btnNewButton_7.setBackground(new Color(128, 0, 0));
		btnNewButton_7.setBounds(411, 129, 254, 39);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("SALIR");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				System.exit(0);
			}
		});
		btnNewButton_8.setForeground(new Color(255, 255, 255));
		btnNewButton_8.setBackground(new Color(128, 0, 0));
		btnNewButton_8.setBounds(411, 164, 254, 39);
		frame.getContentPane().add(btnNewButton_8);
	}
	
	
	
	
	
	
	
	
	public int ShellSort(Usuarios arr[]) {
		
	        int n = arr.length; 
	  
	        // Start with a big gap, then reduce the gap 
	        for (int gap = n/contador; gap > 0; gap /= 2) 
	        { 
	        	 comparisons++;
	            // Do a gapped insertion sort for this gap size. 
	            // The first gap elements a[0..gap-1] are already 
	            // in gapped order keep adding one more element 
	            // until the entire array is gap sorted 
	            for (int i = gap; i < n; i += 1) 
	            { 
	            	
	                // add a[i] to the elements that have been gap 
	                // sorted save a[i] in temp and make a hole at 
	                // position i 
	                Usuarios temp = arr[i]; 
	  
	                // shift earlier gap-sorted elements up until 
	                // the correct location for a[i] is found 
	                try {
	                int j; 
	                for (j = i; j >= gap && arr[j - gap].Saldo > temp.Saldo; j -= gap) 
	                	
	                    arr[j] = arr[j - gap]; 
	  
	                // put temp (the original a[i]) in its correct 
	                // location 
	                arr[j] = temp; 
	                exchanges++;
	                }catch(Exception e1) {}
	            } 
	         
	        } 
	        return 0; 
	    } 
		
		
	public void printArray(Usuarios arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<contador; ++i) {
        	JOptionPane.showMessageDialog(null, arr[i] );
           
        }
        
        
        JOptionPane.showMessageDialog(null,"Numeros de intercambios:" + exchanges );
        
        JOptionPane.showMessageDialog(null,"Numeros de comparaciones:" + comparisons );
    }

		
	}

