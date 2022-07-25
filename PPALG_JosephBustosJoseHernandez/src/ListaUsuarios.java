import java.io.Serializable;

import javax.swing.JOptionPane;

public class ListaUsuarios implements Serializable {
	int contador=0;
	NodoU primero; // cabeza de la lista 
	NodoU ultimo; // cola de la lista
	String nom1="";
	String str="";
	int sum=0;
	 String nom; 	

     int compCounter;
    int SwapCounter;
	 public ListaUsuarios()	{
		 
		 // Contructor para crear un nodo
	        // siguiente por defecto ya inicializado
	        //como nulo
		 
		 primero=null;
		 ultimo=null;
		 	
		 }


	//El siguiente codigo inserta un nodo al inicio de la lista
	 public void InsertarNodoEmpleado(Usuarios dato) {
			
		 NodoU NodoNuevo=new NodoU();
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
	 
	 
	 
	 public boolean Buscar() 
	 { 
	     NodoU current = primero;    //Initialize current 
	     
	 	String DNI=JOptionPane.showInputDialog("Ingrese el numero de clave");
	     while (current != null) 
	     { 
	     	try {
	         if (current.dato.Num_Clave.equalsIgnoreCase(DNI)) {
	        	 
	        	 
	         	JOptionPane.showMessageDialog(null, current.dato);
	               //data found 
	         }
	         }catch(Exception e) {}
	         current = current.siguiente;
	         
	     } 
	     return false;    //data not found 
	 }
	 public void EliminarNodo() {
			NodoU actual=new NodoU();
			NodoU anterior=new NodoU();
			actual=primero;
			anterior=null;
			String DNI=JOptionPane.showInputDialog("Ingrese el numero de telefono a remover");
			while(actual!=null) {
				try {
			if(actual.dato.Num_Clave.equalsIgnoreCase(DNI)) {
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
	 

public void ImprimirLista(NodoU nodo) {
	
	if(nodo==null) {
		return;
		
	}
	JOptionPane.showMessageDialog(null, nodo.dato);
	ImprimirLista(nodo.siguiente);
}


NodoU paritionLast(NodoU start, NodoU end) 
{ 
    if(start == end ||  
       start == null || end == null) 
        return start; 
  
    NodoU pivot_prev = start; 
    NodoU curr = start;  
    int pivot =  (int) end.dato.Saldo;  
      
 // iterar hasta la una antes del final,
// no es necesario repetir hasta el final
 // porque final es pivote
    
    while(start != end ) 
    { 
    	compCounter++;
    
        if(start.dato.Saldo<pivot) 
        {  
            // keep tracks of last modified item 
            pivot_prev = curr;  
            int temp = (int) curr.dato.Saldo; 
            curr.dato.Saldo= start.dato.Saldo;  
            start.dato.Saldo= temp;  
            curr= curr.siguiente;  
            SwapCounter++;
            
        } 
        start = start.siguiente;  
    } 
      
    // swap the position of curr i.e. 
    // next suitable index and pivot 
    
   int temp = (int) curr.dato.Saldo;  
    curr.dato.Saldo = pivot;  
    end.dato.Saldo = temp;  

    // return one previous to current 
    // because current is now pointing to pivot 
    SwapCounter++;
    return pivot_prev; 
} 

public void Quicksort(NodoU start, NodoU end) 
{ 

    if(start == end ) 
        return; 
          
    // split list and partion recurse 
    NodoU pivot_prev = paritionLast(start, end); 
    Quicksort(start, pivot_prev); 
      
    // if pivot is picked and moved to the start, 
    // that means start and pivot is same  
    // so pick from next of pivot 
    if( pivot_prev != null &&  
        pivot_prev == start ) 
        Quicksort(pivot_prev.siguiente, end); 
          
    // if pivot is in between of the list, 
    // start from next of pivot,  
    // since we have pivot_prev, so we move two nodes 
    else if(pivot_prev != null &&  
            pivot_prev.siguiente != null) 
        Quicksort(pivot_prev.siguiente.siguiente, end); 
    
    
    
}


public void ImprimirLista1(NodoU nodo) {
	
	if(nodo==null) {
		return;
		
	}
	JOptionPane.showMessageDialog(null, nodo.dato);
	ImprimirLista(nodo.siguiente);
}
	
	
}
