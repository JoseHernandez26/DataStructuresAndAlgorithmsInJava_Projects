
import java.io.Serializable;

public class NodoLista implements Serializable  {

Publicacion dato;

NodoLista siguiente;

public NodoLista() {}
public NodoLista(Publicacion dato) {
	this.dato=dato;
	this.siguiente=null;
	
}

	
	
}
