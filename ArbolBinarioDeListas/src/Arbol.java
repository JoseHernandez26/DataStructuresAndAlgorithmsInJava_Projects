import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

import javax.swing.JOptionPane;

public class Arbol {
nodo raiz;

int steps=0;




public Arbol() {
raiz=null;	
	
	
}



public void insert(Lista dato)
{
	
    raiz= insertar(dato);

}


//Método para insertar una lista enlazada a un arbol
private nodo insertar(Lista data)
 {
	
	 if (raiz== null) {
         raiz= new nodo(data);
         return raiz;
     }
	Queue<nodo> nodoproceso=new LinkedList<>();
	
	while(true) {
		nodo aux=nodoproceso.poll();
     if (aux == null) {
         aux = new nodo(data);
     
     return aux;
 }
         if (aux.HijoDerecho == null) {
             aux.HijoDerecho = insertar( data);
             return aux.HijoDerecho;
         }
         
         if(aux.HijoIzquierdo == null) {
             aux.HijoIzquierdo= insertar( data);    
             return aux.HijoIzquierdo;
         }
         
         nodoproceso.add(aux.HijoDerecho); 
         nodoproceso.add(aux.HijoIzquierdo); 
     }
 }
     
 

public void InsertarNodo(Lista dato) {
nodo nuevo=new nodo(dato);	
	if(raiz==null) {
		raiz=nuevo;
		
		
		
		
		
	}else {
		
		nodo aux=raiz;
		nodo padre;
		
		while(true) {
			
			padre=aux;
			if(aux==null) {
				padre.HijoIzquierdo=nuevo;
				
				
				return;
			}else {
				
				aux=aux.HijoDerecho;
				if(aux==null) {
					padre.HijoDerecho=nuevo;
					return;
				}
			}
		}
	}
	
}

public void InOrden(nodo r) {
	InOrden(r.HijoIzquierdo);

r.dato.DesplegarLista();


InOrden(r.HijoDerecho);
				
				
}
	


public void PreOrden(nodo r) {
	if(r!=null) {

r.dato.DesplegarLista();
	
		PreOrden(r.HijoIzquierdo);
		
		PreOrden(r.HijoDerecho);
	}
	
}
public void PosOrden(nodo r) {
	if(r!=null) {
		
		PreOrden(r.HijoIzquierdo);
		
		PreOrden(r.HijoDerecho);
		

r.dato.DesplegarLista();	

	}
	
	
	
	
	
	
	
}

public boolean Buscar() {
	nodo aux=raiz;
	
int DNI=DNI=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dni a buscar del cliente"));

if(aux==null) {
	return false;
	
}
Queue <nodo>q=new LinkedList<nodo>();
q.add(aux);
while(!q.isEmpty()) {
	nodo t=q.remove();
	if(t.dato.primero.dato.U.DNI==DNI) {
		JOptionPane.showMessageDialog(null, t.dato.primero.dato);
		
		
		
	}
	
	if(t.HijoIzquierdo!=null) {
		q.add(t.HijoIzquierdo);
		
	}
	if(t.HijoDerecho!=null) {
		q.add(t.HijoDerecho);
		
	}
	
}
return false;
	
}
public nodo ObtenernodoReemplazo(nodo nodoreem) {
	nodo reemplazarPadre=nodoreem;
	nodo  reemplazo=nodoreem;
	nodo aux=nodoreem.HijoDerecho;
	while(aux!=null) {
		reemplazarPadre=reemplazo;
		reemplazo=aux;
		aux=aux.HijoIzquierdo;
		
		
	}
	if(reemplazo!=nodoreem.HijoDerecho) {
		reemplazarPadre.HijoIzquierdo=reemplazo.HijoDerecho;
		reemplazo.HijoDerecho=nodoreem.HijoDerecho;
		
	}
	return reemplazo;
}
public void Eliminar() {
nodo aux=raiz;
nodo padre=raiz;
boolean EsHijoIzquierdo=true;
int DNI=DNI=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dni del cliente a remover"));
if(aux.dato.primero.dato.U.DNI==DNI) {
	
	if(aux.HijoIzquierdo==null && aux.HijoDerecho==null) {
		if(aux==raiz) {
			raiz=null;
			
		}else if(EsHijoIzquierdo) {
			padre.HijoIzquierdo=aux.HijoIzquierdo;
			
		}else {
			padre.HijoDerecho=aux.HijoIzquierdo;
			
			
		}
		
	}else {
		nodo reemplazo=ObtenernodoReemplazo(aux);
		if(aux==raiz) {
			raiz=reemplazo;
			
		}else if(EsHijoIzquierdo) {
			padre.HijoIzquierdo=reemplazo;
			
			
		}else {
			
			padre.HijoDerecho=reemplazo;
			
		}
		reemplazo.HijoIzquierdo=aux.HijoIzquierdo;
	}
	
}	
}

}


