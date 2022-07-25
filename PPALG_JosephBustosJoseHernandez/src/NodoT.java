import java.io.Serializable;

public class NodoT implements Serializable {
	TransaccionGUI dato;
	public String key;
	NodoT siguiente;

	public NodoT() {}
	public NodoT(TransaccionGUI dato) {
		this.dato=dato;
		this.siguiente=null;
		
	}
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}	
	
}
