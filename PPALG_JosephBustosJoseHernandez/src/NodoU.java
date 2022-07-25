import java.io.Serializable;

public class NodoU implements Serializable {
Usuarios dato; // Tipo de dato

	NodoU siguiente; //puntero

	public NodoU() {}
	public NodoU(Usuarios dato) {
		this.dato=dato;
		this.siguiente=null;
		
	}
	
	
	
	
	
}
