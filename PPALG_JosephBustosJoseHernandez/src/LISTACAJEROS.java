import java.io.Serializable;

import javax.swing.JOptionPane;

public class LISTACAJEROS implements Serializable{

//Nodos de almacenamiento en primero y ultimo	
NodoC primero;
NodoC ultimo;


int inter=0;
int Com=0;
	
public LISTACAJEROS()	{
primero=null;
ultimo=null;
	
	
}
	
//El siguiente codigo inserta un nodo al inicio de la lista
public void InsertarNodoInicio(CAJEROSGUI dato) {
NodoC NodoNuevo=new NodoC();
NodoNuevo.dato=dato;

//1 y 2: Asignar el nodo y
//Poner en los datos * /


if(primero==null) {
	primero=NodoNuevo;
	primero.siguiente=null;
	ultimo=primero;
	
}else {
	/// * 3. Haz el siguiente nodo nuevo como head * /
	
	ultimo.siguiente=NodoNuevo;
	NodoNuevo.siguiente=null;
/// * 4. Mueva la cabeza para apuntar al nuevo Nodo * /
	ultimo=	NodoNuevo;
	
	
}



	
	
	
}
public void ImprimirLista(NodoC nodo) {
	
	if(nodo==null) {
		return;
		
	}
	JOptionPane.showMessageDialog(null, nodo.dato);
	ImprimirLista(nodo.siguiente);
}

public boolean 	BuscarCajero() 
{ 
    NodoC current = primero;    //Initialize current 
    
	int DNI=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el  codigo del cajero a buscar"));
    while (current != null) 
    { 
    	try {
        if (current.dato.CodigoCajero==DNI) {
        	JOptionPane.showMessageDialog(null, current.dato);
              //data found 
        }
        }catch(Exception e) {}
        current = current.siguiente;
        
    } 
    return false;    //data not found 
}
	


public void EliminarNodo() {
	NodoC actual=new NodoC();
	NodoC anterior=new NodoC();
	actual=primero;
	anterior=null;
int DNI=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de telefono a remover"));
	while(actual!=null) {
		try {
	if(actual.dato.CodigoCajero==DNI) {
		if(actual==primero) {
			
			actual=actual.siguiente;
			
			
		}
		else {
			
			anterior.siguiente=actual.siguiente;
			
		}
		
	}
		
		
		
	}catch(Exception e) {}
	anterior=actual;
	actual=actual.siguiente;
	
		
		
		
	}
	
	
	
}
	
	
	
	
	
}
