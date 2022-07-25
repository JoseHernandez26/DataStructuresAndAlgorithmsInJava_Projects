import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.swing.JOptionPane;

public class Lista implements Serializable{


NodoLista primero;
NodoLista ultimo;

int contador=0;
	
	
public Lista()	{
primero=null;
ultimo=null;
	
	
}

//El siguiente codigo inserta un nodo al inicio de la lista
public void InsertarNodoInicio(Publicacion dato) {
NodoLista NodoNuevo=new NodoLista(dato);
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

public void DesplegarLista() {
NodoLista actual=primero;
while(actual!=null) {
	JOptionPane.showMessageDialog(null, actual.dato);
	actual=actual.siguiente;
}

	
}
//Metodo que inserta al final de la lista
public void InsertarNodoAlFinal(Publicacion dato) {

}


//Este código te da la cantidad de nodos o tamaño de una lista enlazada

//


public String Mostrar() {
	
	String respuesta = " ";

	if(contador==0) {
		return respuesta="Lista vacia";
		
	}else {
		
		NodoLista aux=primero;
		
		while(aux!=null) {
			   respuesta=aux.dato.toString();
			   
				aux=aux.siguiente;
				

				}
	}
	return respuesta;

	

	
	
}
public void MostrarLista() {
	JOptionPane.showMessageDialog(null, toString());
}
//Gira la lista 










//Método que remueve el primer nodo


}
