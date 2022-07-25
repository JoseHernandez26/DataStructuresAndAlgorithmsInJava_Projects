import javax.swing.JOptionPane;

public class ListaP {
	nodoP primero;
	nodoP ultimo;
	int lenght; //Cantidad de nodos
	int com=0;
	int inter=0;
	
	
	
	
	public ListaP() {
		
		primero=null;
		ultimo=null;
		lenght=0;
	}
	
	public boolean EstaVacio() {
		
		return lenght==0;

		}

	public int lenght() {
		
		return lenght;
	}
	
	
	
	public void InsertarNodoInicio(PRODUCTO dato) {
		nodoP NodoNuevo=new nodoP();
		NodoNuevo.dato=dato;


		if(primero==null) {
			primero=NodoNuevo;
			primero.Siguiente=null;
			ultimo=primero;
			
		}else {
			ultimo.Siguiente=NodoNuevo;
			NodoNuevo.Siguiente=null;
			ultimo=	NodoNuevo;
			
			
		}



			
			
			
		}
	public void IngresarNodo(PRODUCTO dato) 
	{ 
	    /* 1. allocate node  
	    * 2. put in the data */
	   nodoP new_Node = new nodoP(dato); 
	  
	    /* 3. Make next of new node as head and previous as NULL */
	    new_Node.Siguiente= primero; 
	    new_Node.anterior= null; 
	  
	    /* 4. change prev of head node to new node */
	    if (primero!= null) 
	        primero.anterior = new_Node; 
	  
	    /* 5. move the head to point to the new node */
	    primero= new_Node; 
	}
	
	
		
	//QuickSort de mayor a menor
	nodoP lastNode(nodoP node){ 
	    while(node.Siguiente!=null) 
	        node = node.Siguiente; 
	    return node; 
	}
	public void Mostrar(nodoP node) 
	{ 
	   nodoP last = null; 
	 
	    while (node != null) { 
	    	
	    	JOptionPane.showMessageDialog(null, node.dato);
	       
	        last = node; 
	        node = node.Siguiente; 
	    } 
	   
	    } 

	
	
	nodoP partition(nodoP l,nodoP h) 
	{ 
	   // set pivot as h element 
	    int x = h.dato.Cantidad; 
	      
	    // similar to i = l-1 for array implementation 
	   nodoP i = l.anterior; 
	      
	    // Similar to "for (int j = l; j <= h- 1; j++)" 
	    for(nodoP j=l; j!=h; j=j.Siguiente) 
	    { 
	        com++;
	        if(j.dato.Cantidad <= x) 
	        { 
	            // Similar to i++ for array 
	            i = (i==null) ? l : i.Siguiente; 
	            int temp = i.dato.Cantidad; 
	            i.dato.Cantidad = j.dato.Cantidad; 
	            j.dato.Cantidad = temp; 
	       inter++;
	        } 
	    } 
	    i = (i==null) ? l : i.Siguiente;  // Similar to i++ 
	    int temp = i.dato.Cantidad; 
	    i.dato.Cantidad = h.dato.Cantidad; 
	    h.dato.Cantidad = temp; 
	    inter++;
	    return i; 
	} 

	public void _quickSort(nodoP l,nodoP h) 
	{ 
	    if(h!=null && l!=h && l!=h.Siguiente){ 
	        nodoP temp = partition(l,h); 
	        _quickSort(l,temp.anterior); 
	        _quickSort(temp.Siguiente,h); 
	    } 
	} 
	  
	// The main function to sort a linked list. It mainly calls _quickSort() 
	public void quickSort(nodoP node) 
	{ 
		
		
	    // Find last node 
	   nodoP head = lastNode(node); 
	      
	    // Call the recursive QuickSort 
	    _quickSort(node,head); 
	    
	} 

	
}
