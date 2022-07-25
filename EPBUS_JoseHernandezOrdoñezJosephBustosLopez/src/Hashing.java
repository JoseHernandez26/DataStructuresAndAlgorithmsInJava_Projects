import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class Hashing {
	int descuento=0;
	String str="";
	JTextField tf = new JTextField(20);
	public Nodo[] table; 		// storage for our nodes
	public int countOfNodes;	// track number of nodes
	

	
	
	public int getHash( String key ) {
		int hash = ( Math.abs( key.hashCode() ) ) % table.length;
		return hash;
		
	
	}
	
	/**
	 * Contructor con 10000 direcciones
	 */
	public Hashing() {
		this( 100001 );
	}
	
	public Hashing( int size ) {
		table = new Nodo[size];
		countOfNodes = 0;
	}
	
	// Este método permite ubicarme un objeto por medio de una clave
	public Cliente get( String key ) {
		if ( key == null )
			throw new IllegalArgumentException( "Key is required." );
		int hash = getHash( key );
		if ( table[hash] == null ) {
			return null;
		}
		else {
			Nodo currentTable = table[hash];
			while ( currentTable != null ) {
				if ( currentTable.key.equals( key ) )
					return currentTable.value;
			}
			return null; // not found
		}
	}
	

	//ESTE ES EL HASHING BUSQUEDA
	public Cliente Buscar(String key) {
		
		
		if ( key == null )
			throw new IllegalArgumentException( "Key is required." );
		int hash = getHash( key );
		if ( table[hash] == null ) {
			return null;
		}
		else {
			Nodo currentTable = table[hash];
			while ( currentTable != null ) {
				if ( currentTable.key.equals( key ) )
	currentTable.key=currentTable.value.Num_Cliente;
					
				currentTable.value.Monto=(int) (currentTable.value.Monto-(currentTable.value.Monto*0.20));
				JOptionPane.showMessageDialog(null, "key:" + currentTable.key + "\nDireccion:  " + hash + "\n"+ currentTable.value );
				JOptionPane.showMessageDialog(null, "Usted ha sido premiado por FESAGO" );
				JOptionPane.showMessageDialog(null, "Saldo a pagar:" + currentTable.value.Monto);
				
				String Operadora=currentTable.value.Operadora;
				 
					return currentTable.value;
				
				
				
			}
			return null; // not found
		}
		
	}

	public Cliente Buscar2(String key) {
		
		
		if ( key == null )
			throw new IllegalArgumentException( "Key is required." );
		int hash = getHash( key );
		if ( table[hash] == null ) {
			return null;
		}
		else {
			Nodo currentTable = table[hash];
			while ( currentTable != null ) {
				if ( currentTable.key.equals( key ) )
	currentTable.key=currentTable.value.Operadora;
					
				

				str=str+currentTable.value.Nombre+"\n";
			
	
				JTextArea Area= new JTextArea(10,20);
				
				JScrollPane scroll;
				scroll=new JScrollPane(Area);
				scroll.setViewportView(Area);
				scroll.setBounds(130, 130, 160, 60);
				
				Area.setText( str);
				
				Area.setLineWrap(true);
				Area.setWrapStyleWord(true);
				JOptionPane.showMessageDialog(null,scroll,"CLIENTES DE OPERADORA",JOptionPane.INFORMATION_MESSAGE);
				
				currentTable = currentTable.next;
					return currentTable.value;
				
				
				
			}
			JTextArea Area= new JTextArea(10,20);
			
			JScrollPane scroll;
			scroll=new JScrollPane(Area);
			scroll.setViewportView(Area);
			scroll.setBounds(130, 130, 160, 60);
			
			Area.setText( str);
			
			Area.setLineWrap(true);
			Area.setWrapStyleWord(true);
			JOptionPane.showMessageDialog(null,scroll,"CLIENTES DE OPERADORA",JOptionPane.INFORMATION_MESSAGE);
				
				
			return null; // not found
		}
		
	}

	
	public Cliente Buscar3(String key) {
		
		if ( key == null )
			throw new IllegalArgumentException( "Key is required." );
		int hash = getHash( key );
		if ( table[hash] == null ) {
			return null;
		}
		else {
			
			
			for (int i = 0; i < table.length; i++ ) {
				
				if ( table[i] != null ) {
				
				
					Nodo currentTable = table[i];
					while ( currentTable != null ) {
						if ( currentTable.key.equals( key ) )
							
						
						JOptionPane.showMessageDialog(null, currentTable.value.Nombre);
							
							currentTable = currentTable.next;
					}
					
						
						
					}
				
				
				}
	
			
			return null; // not found
		}	
	}
	
	

	public void Insertar( String key, Cliente value ) {
		if ( key == null )
			throw new IllegalArgumentException( "Key is required." ); 
		
		int hash = getHash( key );
		Nodo currentTable = table[hash]; 
		
		if ( currentTable != null ) {
			while ( currentTable.next != null ) {
				currentTable = currentTable.next;
				if ( currentTable.key.equals(key) ) {
				
					break;
				}
			}
		}
		
	
		if ( table[hash] == null ) { // new Table
			currentTable = new Nodo();
			currentTable.key = key;
			currentTable.value = value;
			table[hash] = currentTable;
			countOfNodes++;
		}
		
		else { 
			currentTable.next = new Nodo();
			currentTable = currentTable.next;
			currentTable.key = key;
			currentTable.value = value;
			countOfNodes++;
		}
		
	
		
	}
	

	//Mostrar datos
	public void Mostrar() {
	
		for (int i = 0; i < table.length; i++ ) {
			
			if ( table[i] != null ) {
			
			
				Nodo currentTable = table[i];
				while ( currentTable != null ) {
					JOptionPane.showMessageDialog(null, "Key:" + currentTable.key + ":" + currentTable.value );
					
					currentTable = currentTable.next;
				}
			
			
			}
		}
	}
	
	

	
}
