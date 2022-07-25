
public class nodo {
CRCOVID19 dato;
nodo HijoIzquierdo, HijoDerecho;
nodo parent;

public nodo(CRCOVID19 dato) {
	this.dato=dato;
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
