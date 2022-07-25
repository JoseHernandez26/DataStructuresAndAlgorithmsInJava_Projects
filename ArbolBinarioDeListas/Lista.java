import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.swing.JOptionPane;

public class Lista implements Serializable{

	
Nodo primero;
Nodo ultimo;

	
	
public Lista()	{
primero=null;
ultimo=null;
	
	
}

//El siguiente codigo inserta un nodo al inicio de la lista
public void InsertarNodoInicio(Publicacion dato) {
Nodo NodoNuevo=new Nodo();
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


	
	
	
}
//Metodo que inserta al final de la lista
public void InsertarNodoAlFinal(Publicacion dato) {

}


//Este código te da la cantidad de nodos o tamaño de una lista enlazada
public int CantidadNodo(Nodo primero) {
	if(primero==null) {
		return 0;
		
	}
	int contador=0;
	Nodo actual=primero;
	while(actual!=null) {
		contador++;
		
		actual=actual.siguiente;
		
			
		
	}
	return contador;
	
}

public void ImprimirLista(Nodo nodo) {
	
	if(nodo==null) {
		return;
		
	}
	JOptionPane.showMessageDialog(null, nodo.dato);
	ImprimirLista(nodo.siguiente);
}


//Gira la lista 
public Nodo GirarLista(Nodo nodo) {
	if(nodo==null||nodo.siguiente==null) {
		
		return nodo;
		
	}
	Nodo temp=GirarLista(nodo.siguiente);
	nodo.siguiente.siguiente=nodo;
	nodo.siguiente=null;
	
	return temp;
	
	
	
}


public void DesplegarLista() {
Nodo actual=primero;
while(actual!=null) {
	JOptionPane.showMessageDialog(null, actual.dato);
	actual=actual.siguiente;
}

	
}

public void DesplegarListaAlrevez() {
	ImprimirLista(GirarLista(primero));
	
}
public void Mostrar(Nodo primero) {
	if(primero==null) {
		
		return;
		
	}
	
	

Nodo actual=primero;
while(actual!=null) {
	
	JOptionPane.showMessageDialog(null, actual.dato);
	actual=actual.siguiente;
}

}

//Método que remueve el primer nodo
public void EliminarNodoPrimero() {


	if(primero!=null) {
	
		primero=primero.siguiente;
	}

	
	
}
public Nodo EliminarUltimo(Nodo primero) {
	try {
	if(primero==null) {
		return primero;
		
	}
	Nodo ultimo=primero;
	Nodo AnteriorUltimo=null;
	while(ultimo.siguiente!=null) {
		
		AnteriorUltimo=ultimo;
		ultimo=ultimo.siguiente;
		
		
	}
	AnteriorUltimo.siguiente=null;
	}catch(Exception e) {}
	
	return ultimo;
	
}
public void EliminarNodo() {
	Nodo actual=new Nodo();
	Nodo anterior=new Nodo();
	actual=primero;
	anterior=null;
	int DNI=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dni del cliente a remover"));
	while(actual!=null) {
	if(actual.dato.U.DNI==DNI) {
		if(actual==primero) {
			
			primero=primero.siguiente;
			
			
		}
		else {
			
			anterior.siguiente=actual.siguiente;
			
		}
		
		
		
		
	}
	anterior=actual;
	actual=actual.siguiente;
	
		
		
		
	}
	
	
	
}

public void Guardar() throws IOException{ 
	
	Nodo gue=primero;
	File g=new File("FAK_2016.dat");
	ObjectOutputStream re = new ObjectOutputStream(new FileOutputStream(g));
	while(gue!=null){
		re.writeObject(gue);	
		gue = gue.siguiente;
	}
	JOptionPane.showMessageDialog(null, "DATOS GUARDADOS");
	re.close();
                
}
public void Recuperar() throws  IOException, ClassNotFoundException{


	Nodo Leer;
	File Salud = new File("FAK_2016.dat");
	FileInputStream in;
	in = new FileInputStream(Salud);
	ObjectInputStream ver = new ObjectInputStream(in);
	if(primero==null){
	Leer = (Nodo) ver.readObject();
	primero=Leer;
	JOptionPane.showMessageDialog(null, "Datos Recuperados....");
	}else{
	JOptionPane.showMessageDialog(null, "Los Datos ya Recuperados....");}
	ver.close();
	}



}

