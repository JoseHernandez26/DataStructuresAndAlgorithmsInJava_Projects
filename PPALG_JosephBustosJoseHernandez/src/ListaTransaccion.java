import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.swing.JOptionPane;

public class ListaTransaccion implements Serializable{
	
	
	public NodoT[] table; 		// storage for our nodes
	public int countOfNodes;
	int contador=0;
	NodoT primero;
	NodoT ultimo;
	
	NodoT primero1;
	NodoT ultimo1;
	String nom1="";
	String str="";
	int sum=0;
	 String nom; 	
	 
	 //Objetos paralelos temporales 
		TransaccionGUI T1=new TransaccionGUI(); //Objeto transaccion temporal
		TransaccionGUI T2=new TransaccionGUI();  //Objeto transaccion temporal
		TransaccionGUI T3=new TransaccionGUI();  //Objeto transaccion temporal
		TransaccionGUI T4=new TransaccionGUI(); //Objeto transaccion temporal
		
		
		
		//Modularizacion
		public int getHash( String key ) {
			int hash = ( Math.abs( key.hashCode() ) ) % table.length;
			return hash;
			
		
		}
		 public  ListaTransaccion(int size )	{
			 table = new NodoT[size];
				countOfNodes = 0;
			 
			 
			
		 }
		 
		 
		
		public ListaTransaccion()	{
			//Direcciones de busqueda por dispercion
			 this( 1601 );
		 primero=null;
		 ultimo=null;
		 primero1=null;
		 ultimo1=null;	
	
		 
		 }


		// Este método permite ubicarme un objeto por medio de una clave
		public TransaccionGUI get( String key ) {
			if ( key == null )
				throw new IllegalArgumentException( "Key is required." );
			int hash = getHash( key );
			if ( table[hash] == null ) {
				return null;
			}
			else {
				NodoT currentTable = table[hash];
				while ( currentTable != null ) {
					if ( currentTable.key.equals( key ) )
						return currentTable.dato;
				}
				return null; // not found
			}
		}
		
		//Metodo que permite buscar a un usuario por medio de una llave y mostralo 
		// con la respectiva direccion en la tabla
		public 	TransaccionGUI Buscar(String key) {
			
			
			if ( key == null )
				throw new IllegalArgumentException( "Key is required." );
			int hash = getHash( key );
			if ( table[hash] == null ) {
				return null;
			}
			else {
				NodoT currentTable = table[hash];
				while ( currentTable != null ) {
					if ( currentTable.key.equals( key ) )
		currentTable.key=currentTable.dato.U.Num_Clave;
						
					JOptionPane.showMessageDialog(null, "key:" + currentTable.key + "\nDireccion:  " + hash + "\n"+ currentTable.dato );
						return currentTable.dato;
					
					
					
				}
				return null; // not found
			}
			
		}
		
		
		
		public TransaccionGUI BuscarTransaccion(String key) {
			
			if ( key == null )
				throw new IllegalArgumentException( "Key is required." );
			int hash = getHash( key );
			if ( table[hash] == null ) {
				return null;
			}
			else {
				
				
				for (int i = 0; i < table.length; i++ ) {
					
					if ( table[i] != null ) {
					
					
						NodoT currentTable = table[i];
						while ( currentTable != null ) {
							if ( currentTable.key.equals( key ) )
								
								
								JOptionPane.showMessageDialog(null, "key:" + currentTable.key + "\nDireccion:  " + hash + "\n"+ currentTable.dato );
								currentTable = currentTable.siguiente;
						}
							
							
						}
					
					
					}
		
				
				return null; // not found
			}	
		}
		
		
		public void put ( String key,TransaccionGUI value ) {
			if ( key == null )
				throw new IllegalArgumentException( "Key is required." ); 
			
			int hash = getHash( key );
			NodoT currentTable = table[hash]; // establece un puntero a la tabla que estamos usando
			
			if ( currentTable != null ) {
				while ( currentTable.siguiente != null ) {
					currentTable = currentTable.siguiente;
					if ( currentTable.key.equals( key ) ) {
						//overwriting entry that already exists
						break;
					}
				}
			}
			
			// Ahora estoy apuntando a una tabla vacía, un nodo con la misma clave o un nodo con un siguiente vacío
			if ( table[hash] == null ) { // new Table
				currentTable = new NodoT();
				currentTable.key = key;
				currentTable.dato = value;
				table[hash] = currentTable;
				countOfNodes++;
			}
			
			else { // nuevo nodo agregado a la lista
				currentTable.siguiente = new NodoT();
				currentTable = currentTable.siguiente; //avanzar y actualizar el dato
				currentTable.key = key;
				currentTable.dato = value;
				countOfNodes++;
			}
			
			// for debug
			
		}
		
		//El siguiente codigo inserta un nodo al inicio de la lista
		 public void InsertarNodo(TransaccionGUI dato) {
				
			 NodoT NodoNuevo=new NodoT();
			 NodoNuevo.dato=dato;


			 if(primero==null) {
			 	primero=NodoNuevo;
			 	primero.siguiente=null;
			 	ultimo=primero;
			 	
			 }else {
			 	ultimo.siguiente=NodoNuevo;
			 	NodoNuevo.siguiente=null;
			 	ultimo=	NodoNuevo;
			 	
			 	
			 }




			 contador++;
			 	
			 	
			 }
		 
		 
		//El siguiente codigo inserta un nodo al inicio de la lista
		 public void InsertarNodo1(TransaccionGUI dato) {
				
			 NodoT NodoNuevo=new NodoT();
			 NodoNuevo.dato=dato;


			 if(primero1==null) {
			 	primero1=NodoNuevo;
			 	primero1.siguiente=null;
			 	ultimo1=primero1;
			 	
			 }else {
			 	ultimo1.siguiente=NodoNuevo;
			 	NodoNuevo.siguiente=null;
			 	ultimo1=	NodoNuevo;
			 	
			 	
			 }




			 contador++;
			 	
			 	
			 }
		 
		 
		 public boolean Consulta() 
		 { 
		     NodoT current = primero1;    //Initialize current 
		 	NodoT anterior=new NodoT();
		 	String DNI=JOptionPane.showInputDialog("Digite la clave");
		     while (current != null) 
		     { 
		     	try {
		         if (current.dato.U.Num_Clave.equalsIgnoreCase(DNI)) {

		        	
		         
		     T1.U=current.dato.U;
		     ConsultaDefinitivo();
		        	 if(current.dato.Fecha.equalsIgnoreCase(null)) {
		        			if(current==primero1) {
		    					
		        				current=current.siguiente;
		    					
		    					
		    				}
		    				else {
		    					
		    					anterior.siguiente=current.siguiente;
		    					
		    				}
		        		 
		        	 }
		         	
		               //data found 
		         }
		         }catch(Exception e) {}
		         current = current.siguiente;
		         
		     } 
		     return false;    //data not found 
		 }
	
	public void ConsultaDefinitivo() {
		TransaccionGUI T=new TransaccionGUI();
		T.U=T1.U;
		 T.IngresarConsulta();
         T.Operacion="Consulta";
    	T3=T;
    	InsertarNodo(T3);
    	
    	put ( T3.U.Num_Clave,T3 ) ;
		
	}
	
	//Busque y retiro de algun usuario
	 public boolean Retiro() 
	 { 
	     NodoT current = primero1;    //Initialize current 
	 	NodoT anterior=new NodoT();
	 	String DNI=JOptionPane.showInputDialog("Digite la clave");
	     while (current != null) 
	     { 
	     	try {
	         if (current.dato.U.Num_Clave.equalsIgnoreCase(DNI)) {

	        	
	         JOptionPane.showMessageDialog(null, "El saldo es de:" + current.dato.U.Saldo);
	       
	     T1.U=current.dato.U;
	 RetiroDefinitivo();
	        	 if(current.dato.Fecha.equalsIgnoreCase(null)) {
	        			if(current==primero1) {
	    					
	        				current=current.siguiente;
	    					
	    					
	    				}
	    				else {
	    					
	    					anterior.siguiente=current.siguiente;
	    					
	    				}
	        		 
	        	 }
	         	
	               //data found 
	         }
	         }catch(Exception e) {}
	         current = current.siguiente;
	         
	     } 
	     return false;    //data not found 
	 }
	 
	 
	 
	 
		public void RetiroDefinitivo() {
			TransaccionGUI T=new TransaccionGUI();
			T.U=T1.U;
			 T.IngresarConsulta();;
	         T.Operacion="Retiro";
	     T.Monto=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto a retirar"));
	         int Calculo=(int) (T.U.Saldo-T.Monto);
	         T.U.Saldo=Calculo;
	    	T2=T;
			

		InsertarNodo(T2);
		
		put ( T2.U.Num_Clave,T2 ) ;
		}
		
		
		
		
		
		
		
		 public boolean Deposito() 
		 { 
		     NodoT current = primero1;    //Initialize current 
		 	NodoT anterior=new NodoT();
		 	String DNI=JOptionPane.showInputDialog("Digite la clave");
		     while (current != null) 
		     { 
		     	try {
		         if (current.dato.U.Num_Clave.equalsIgnoreCase(DNI)) {

		        	
		         JOptionPane.showMessageDialog(null, "El saldo es de:" + current.dato.U.Saldo);
		       
		     T1.U=current.dato.U;
		     DepositoDefinitivo();
		        	 if(current.dato.Fecha.equalsIgnoreCase(null)) {
		        			if(current==primero1) {
		    					
		        				current=current.siguiente;
		    					
		    					
		    				}
		    				else {
		    					
		    					anterior.siguiente=current.siguiente;
		    					
		    				}
		        		 
		        	 }
		         	
		               //data found 
		         }
		         }catch(Exception e) {}
		         current = current.siguiente;
		         
		     } 
		     return false;    //data not found 
		 }
		 
		 
		 
		 
			public void DepositoDefinitivo() {
				TransaccionGUI T=new TransaccionGUI();
				T.U=T1.U;
				 T.IngresarConsulta();;
		         T.Operacion="Deposito";
		     T.Monto=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto a depositar"));
		         int Calculo=(int) (T.U.Saldo+T.Monto);
		         T.U.Saldo=Calculo;
		    	T4=T;
				

			InsertarNodo(T4);
			put ( T4.U.Num_Clave,T4 ) ;
			}
		 public void ImprimirLista(NodoT nodo) {
				
				if(nodo==null) {
					return;
					
				}
				JOptionPane.showMessageDialog(null, nodo.dato);
				ImprimirLista(nodo.siguiente);
			}

		 
		 
			
			public void Guardar() throws IOException{ 
				
				NodoT gue=primero;
				File g=new File("Entidad_financiera.txt");
				ObjectOutputStream re = new ObjectOutputStream(new FileOutputStream(g));
				while(gue!=null){
					re.writeObject(gue);	
					gue = gue.siguiente;
				}
				JOptionPane.showMessageDialog(null, "DATOS GUARDADOS");
				re.close();
			                
			}
			
			

			
			public void Recuperar() throws  IOException, ClassNotFoundException{


				NodoT Leer;
				File Salud = new File("Entidad_financiera.txt");
				FileInputStream in;
				in = new FileInputStream(Salud);
				ObjectInputStream ver = new ObjectInputStream(in);
				if(primero==null){
				Leer = (NodoT) ver.readObject();
				primero=Leer;
				JOptionPane.showMessageDialog(null, "Datos Recuperados....");
				}else{
				JOptionPane.showMessageDialog(null, "Los Datos ya Recuperados....");}
				ver.close();
				}
			

	
	
	
}
