import javax.swing.JOptionPane;

public class LISTA {


	
	
	  nodoCompra sorted; 
nodoCompra primero;
nodoCompra ultimo;


nodoFA primero3;
nodoFA ultimo3;
nodoV primero1;
nodoV ultimo1;




int interIN=0;
int ComIN=0;

int interSH=0;
int ComSH=0;
	
public LISTA()	{
primero=null;
ultimo=null;


	
}

public void InsertarCompra(Compras dato) {
nodoCompra NodoNuevo=new nodoCompra();
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


public void InsertarFACTURA(FACTURAS dato) {
nodoFA NodoNuevo=new nodoFA();
NodoNuevo.dato=dato;


if(primero3==null) {
	primero3=NodoNuevo;
	primero3.siguiente=null;
	ultimo3=primero3;
	
}else {
	ultimo3.siguiente=NodoNuevo;
	NodoNuevo.siguiente=null;
	ultimo3=	NodoNuevo;
	
	
}
}





public void ImprimirListaF(nodoFA nodo) {
	
	if(nodo==null) {
		return;
		
	}
	
	JOptionPane.showMessageDialog(null, nodo.dato.toString());

	ImprimirListaF(nodo.siguiente);
}





public void InsertarVentas(Ventas dato) {
nodoV NodoNuevo=new nodoV();
NodoNuevo.dato=dato;


if(primero1==null) {
	primero1=NodoNuevo;
	primero1.siguiente=null;
	ultimo1=primero1;
	
}else {
	ultimo1.siguiente=NodoNuevo;
	NodoNuevo.siguiente=null;
	ultimo1=	NodoNuevo;
	
	
}



	
	
	
}


	
	

public void insertionSort(nodoCompra headref)  
{ 
   
    sorted = null; 
    nodoCompra current = headref; 
  
    while (current != null)  
    { 
    	ComIN++;
   
      
        nodoCompra next = current.siguiente; 
        sortedInsert(current);
        current = next; 
       
    } 
    // Update head_ref to point to sorted linked list 
   primero = sorted; 
} 


void sortedInsert(nodoCompra newnode)  
{ 
    if (sorted == null || sorted.dato.Calculo() >= newnode.dato.Calculo())  
    { 
        newnode.siguiente = sorted; 
        sorted = newnode; 
        interIN++;
    } 
    else 
    { 
        nodoCompra current = sorted; 
        /* Locate the node before the point of insertion */
        while (current.siguiente != null && current.siguiente.dato.Calculo() < newnode.dato.Calculo())  
        { 
        
            current = current.siguiente; 
        	interIN++;
        } 
        newnode.siguiente = current.siguiente; 
        current.siguiente = newnode; 
        
     	interIN++;
    } 
}

public void ImprimirLista(nodoCompra nodo) {
	
	if(nodo==null) {
		return;
		
	}
	JOptionPane.showMessageDialog(null, nodo.dato);
	ImprimirLista(nodo.siguiente);
}




public void ImprimirListaVentas(nodoV nodo) {
	
	if(nodo==null) {
		return;
		
	}
	JOptionPane.showMessageDialog(null, nodo.dato);
	ImprimirListaVentas(nodo.siguiente);
}


public int findlength(nodoV head) 
{ 
    nodoV curr = head; 
    int cnt = 0; 
    while (curr != null) 
    { 
        cnt++; 
        curr = curr.siguiente; 
    } 
    return cnt; 
} 


nodoV ShellSort(nodoV head) 
{ 
 
   nodoV prev = head; 
   nodoV curr = head.siguiente; 
  
    while(curr != null) 
    { 
    	 ComSH++;
         
        if(curr.dato.TotalIV() < prev.dato.TotalIV()) 
        { 
         
            prev.siguiente = curr.siguiente; 
         
            curr.siguiente = head; 
            head = curr; 
              
            // Update current 
            curr = prev; 
            interSH++;
            
        } 
          
        // Nothing to do if current element 
                    // is at right place 
        else
        prev = curr; 
      
        // Move current 
        curr = curr.siguiente; 
        interSH++;
        
    } 
    return head; 
} 




nodoFA sortedMerge(nodoFA a,nodoFA b) 
{ 
 nodoFA result = null; 
    /* Base cases */
    if (a == null) 
        return b; 
    if (b == null) 
        return a; 

    /* Pick either a or b, and recur */
    if (a.dato.Calculo()<=b.dato.Calculo() ) { 
        result = a; 
        result.siguiente = sortedMerge(a.siguiente, b); 
    } 
    else { 
        result = b; 
        result.siguiente = sortedMerge(a, b.siguiente); 
    } 
    return result; 
} 
nodoFA getMiddle(nodoFA h) 
{ 
    // Base case 
    if (h == null) 
        return h; 
nodoFA fastptr = h.siguiente; 
    nodoFA slowptr = h; 

    // Move fastptr by two and slow ptr by one 
    // Finally slowptr will point to middle node 
    while (fastptr != null) { 
        fastptr = fastptr.siguiente; 
        if (fastptr != null) { 
            slowptr = slowptr.siguiente; 
            fastptr = fastptr.siguiente; 
        } 
    } 
    return slowptr; 
} 
nodoFA mergeSort(nodoFA h) 
{ 
    // Base case : if head is null 
    if (h == null || h.siguiente == null) { 
        return h; 
    } 

    // get the middle of the list 
  nodoFA middle = getMiddle(h); 
  nodoFA nextofmiddle = middle.siguiente; 

    // set the next of middle node to null 
    middle.siguiente = null; 

    // Apply mergeSort on left list 
   nodoFA left = mergeSort(h); 

    // Apply mergeSort on right list 
  nodoFA right = mergeSort(nextofmiddle); 

    // Merge the left and right lists 
  nodoFA sortedlist = sortedMerge(left, right); 
    return sortedlist; 
} 
  


nodoFA sortedMerge1(nodoFA a,nodoFA b) 
{ 
 nodoFA result = null; 
    /* Base cases */
    if (a == null) 
        return b; 
    if (b == null) 
        return a; 

    /* Pick either a or b, and recur */
    if (a.dato.TotalIV()<=b.dato.TotalIV() ) { 
        result = a; 
        result.siguiente = sortedMerge(a.siguiente, b); 
    } 
    else { 
        result = b; 
        result.siguiente = sortedMerge(a, b.siguiente); 
    } 
    return result; 
} 
nodoFA getMiddle1(nodoFA h) 
{ 
    // Base case 
    if (h == null) 
        return h; 
nodoFA fastptr = h.siguiente; 
    nodoFA slowptr = h; 

    // Move fastptr by two and slow ptr by one 
    // Finally slowptr will point to middle node 
    while (fastptr != null) { 
        fastptr = fastptr.siguiente; 
        if (fastptr != null) { 
            slowptr = slowptr.siguiente; 
            fastptr = fastptr.siguiente; 
        } 
    } 
    return slowptr; 
} 
nodoFA mergeSort1(nodoFA h) 
{ 
    // Base case : if head is null 
    if (h == null || h.siguiente == null) { 
        return h; 
    } 

    // get the middle of the list 
  nodoFA middle = getMiddle1(h); 
  nodoFA nextofmiddle = middle.siguiente; 

    // set the next of middle node to null 
    middle.siguiente = null; 

    // Apply mergeSort on left list 
   nodoFA left = mergeSort1(h); 

    // Apply mergeSort on right list 
  nodoFA right = mergeSort1(nextofmiddle); 

    // Merge the left and right lists 
  nodoFA sortedlist = sortedMerge1(left, right); 
    return sortedlist; 



}

public void EliminarNodo() {
	nodoFA actual=new nodoFA();
	nodoFA anterior=new nodoFA();
	actual=primero3;
	anterior=null;
	String DNI=JOptionPane.showInputDialog("Ingrese el numero de factura ");
	while(actual!=null) {
		try {
	if(actual.dato.Num_Factura.equalsIgnoreCase(DNI)) {
		if(actual==primero3) {
			
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
