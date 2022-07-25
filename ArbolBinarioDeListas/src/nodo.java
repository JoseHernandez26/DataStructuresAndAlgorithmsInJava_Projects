
public class nodo {
	Lista dato;
nodo HijoIzquierdo, HijoDerecho;
nodo parent;


public nodo() {}
public nodo(Lista dato) {
	this.dato=(Lista) dato;
	this.HijoDerecho=null;
	this.HijoIzquierdo=null;
	
	
}

public nodo getParent() {
	return parent;
}

public void setParent(nodo parent) {
	this.parent = parent;
}


}
