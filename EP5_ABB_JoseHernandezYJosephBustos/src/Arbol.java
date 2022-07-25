
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

import javax.swing.JOptionPane;




public class Arbol {
nodo raiz;

int steps=0;
int evaluacion=0;
int Canton1=0;
int Canton2=0;
int C1=0;
int C2=0;
int tamaño=0;
ArrayList<Object> List=new ArrayList<Object>();
public Arbol() {
raiz=null;	
	
	
}
int res;

public  nodo lastNode; 
public  nodo parentOfLastNode; 

public void InsertarNodo(CRCOVID19 dato) {
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

//ACTIVOS
public int addBT2(nodo root)  
{  
if (root == null)  
   return 0;  
return (root.dato.Casos_Activos + addBT(root.HijoIzquierdo) +  
                  addBT(root.HijoDerecho));  
}

//RECUPERADOS
public int addBT3(nodo root)  
{  
if (root == null)  
 return 0;  
return (root.dato.Casos_Recuperados + addBT(root.HijoIzquierdo) +  
                addBT(root.HijoDerecho));  
}

//Pais
public int addBT4(nodo root)  
{  
if (root == null)  
return 0;  
return (root.dato.Num_Habitantes+ addBT(root.HijoIzquierdo) +  
              addBT(root.HijoDerecho));  
}



public void InOrden(nodo r) {
	
	if(r!=null) {
		InOrden(r.HijoIzquierdo);
		JOptionPane.showMessageDialog(null, r.dato);
		
		InOrden(r.HijoDerecho);
	}

}

public void PreOrden(nodo r) {
	if(r!=null) {
		JOptionPane.showMessageDialog(null, r.dato);
		PreOrden(r.HijoIzquierdo);
		
		PreOrden(r.HijoDerecho);
	}
	
}
public void PosOrden(nodo r) {
	if(r!=null) {
		
		PreOrden(r.HijoIzquierdo);
		
		PreOrden(r.HijoDerecho);
		JOptionPane.showMessageDialog(null, r.dato);
	}
	
}


public boolean Buscar() {
	nodo aux=raiz;
	
int DNI=DNI=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de habitantes del pais que decea encontrar"));

if(aux==null) {
	return false;
	
}
Queue <nodo>q=new LinkedList<nodo>();
q.add(aux);
while(!q.isEmpty()) {
	nodo t=q.remove();
	if(t.dato.Num_Habitantes==DNI) {
		JOptionPane.showMessageDialog(null, t.dato);
		
		
		
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


public void Eliminar(int DNI) {
nodo aux=raiz;
nodo padre=raiz;
boolean EsHijoIzquierdo=true;
if(aux.dato.Num_Habitantes==DNI) {
	
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










//This method mainly calls deleteRec() 
public void deleteKey(int key) 
{ 
   raiz = deleteRec(raiz, key); 
}




int minValue(nodo root) 
{ 
    int minv = root.dato.Num_Habitantes; 
    while (root.HijoIzquierdo != null) 
    { 
        minv = root.HijoIzquierdo.dato.Num_Habitantes; 
        root = root.HijoIzquierdo; 
    } 
    return minv; 
} 



public void inorder() 
{ 
    inorderRec(raiz); 
} 

// A utility function to do inorder traversal of BST 
void inorderRec(nodo root) 
{ 
    if (root != null) 
    { 
        inorderRec(root.HijoIzquierdo)
        ;
        
        inorderRec(root.HijoDerecho); 
    } 
} 

public void deleteLastNode(nodo root,int val) 
{ 

    int levelOfLastNode = height(root); 

    // Get all nodes at last level 
    getLastNodeAndItsParent(root, 
                            levelOfLastNode, 
                            null); 
if(lastNode.dato.Num_Habitantes==val) {
	 if (lastNode != null
		        && parentOfLastNode != null) { 

		        if (parentOfLastNode.HijoDerecho!= null) 
		            parentOfLastNode.HijoDerecho = null; 
		        else
		            parentOfLastNode.HijoIzquierdo = null; 
		    } 
	
}
   
    
} 

// Method to keep track of parents 
// of every node 
public void getLastNodeAndItsParent(nodo root, 
                                    int level, 
                                    nodo parent) 
{ 

    if (root == null) 
        return; 

    // The last processed node in 
    // Level Order Traversal has to 
    // be the node to be deleted. 
    // This will store the last 
    // processed node and its parent. 
    if (level == 1) { 
        lastNode = root; 
        parentOfLastNode = parent; 
    } 
    getLastNodeAndItsParent(root.HijoIzquierdo, 
                            level - 1, 
                            root); 
    getLastNodeAndItsParent(root.HijoDerecho, 
                            level - 1, 
                            root); 
} 
public void Eliminar() {
	int val=evaluacion;
	
	nodo aux=raiz;
	deleteKey(val) ;
	deleteLastNode(aux,val) ;
	
	
	

}




public nodo delete(nodo node, int val) {
    if(node == null) {
      return node;
    }
    
    if(val < node.dato.Num_Habitantes) {
      node.HijoIzquierdo = delete(node.HijoIzquierdo, val);
    } else if(val > node.dato.Num_Habitantes) {
      node.HijoDerecho = delete(node.HijoDerecho, val);
    } else {
      if(node.HijoIzquierdo == null || node.HijoDerecho == null) {
        nodo temp = node.HijoIzquierdo!= null ? node.HijoIzquierdo : node.HijoDerecho;

        if(temp == null) {
          return null;
        } else {
          return temp;
        }
      } else {
        nodo successor = getSuccessor(node);
        node.dato.Num_Habitantes = successor.dato.Num_Habitantes;
        node.HijoDerecho = delete(node.HijoDerecho, successor.dato.Num_Habitantes);
        return node;
      }
    }
    
    return node;
  }
  
  public nodo getSuccessor(nodo node) {
 nodo padre=node,sucesor=node;
 
 nodo actual=node.HijoDerecho;
 while(actual!=null) {
	 padre=sucesor;
	 sucesor=actual;
	 actual=actual.HijoIzquierdo;
	 
	 
 }
 if(sucesor!=node.HijoDerecho) {
	 padre.HijoIzquierdo=sucesor.HijoDerecho;
	 sucesor.HijoDerecho=node.HijoDerecho;
	 
	 
 }
 return sucesor;
 
  }







/* A recursive function to insert a new key in BST */
nodo deleteRec(nodo root, int key) 
{ 
    /* Base Case: If the tree is empty */
    if (root == null)  return root; 

    /* Otherwise, recur down the tree */
    

    if (key < root.dato.Num_Habitantes) 
        root.HijoIzquierdo = deleteRec(root.HijoIzquierdo, key); 
    else if (key > root.dato.Num_Habitantes) 
        root.HijoDerecho = deleteRec(root.HijoDerecho, key); 

    // if key is same as root's key, then This is the node 
    // to be deleted 
    else
    { 
        // node with only one child or no child 
        if (root.HijoIzquierdo == null) 
            return root.HijoDerecho; 
        else if (root.HijoDerecho == null) 
            return root.HijoIzquierdo; 

 
        root.dato.Num_Habitantes = minValue(root.HijoDerecho); 

        // Delete the inorder successor 
        root.HijoDerecho = deleteRec(root.HijoDerecho, root.dato.Num_Habitantes); 
    } 

    return root; 
} 






//Me retorna la altura de un nodo en específico


int getLevelUtil(nodo node, String data, int level)  
{ 
    if (node == null) 
        return 0; 

    if (node.dato.nombre.equalsIgnoreCase(data)) 
        return level; 

    int downlevel = getLevelUtil(node.HijoIzquierdo, data, level + 1); 
    if (downlevel != 0) 
        return downlevel; 

    downlevel = getLevelUtil(node.HijoDerecho, data, level + 1); 
    return downlevel; 
} 

/* Returns level of given data value */
int getLevel(nodo node, String data)  
{ 
    return getLevelUtil(node, data, 1); 
} 
 
public void Imprimirnivel() {
	
String DNI=JOptionPane.showInputDialog("Ingrese el canton");
	
	
 
        int level = getLevel(raiz, DNI); 
       
        if (level != 0) 
        	 JOptionPane.showMessageDialog(null, "El nivel del canton en la estructura es: "
                     + getLevel(raiz, DNI));
        else
        	 JOptionPane.showMessageDialog(null, "No hay datos ingresados "
                     + getLevel(raiz, DNI)); 
    
}      

//Cálculo de Numero de nodos hijos de un arbol binario





public boolean BuscarEvaluacion() {
	
	nodo aux=raiz;
	int value=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de habitantes del canton a eliminar"));


if(aux==null) {
	return false;
	
}
Queue <nodo>q=new LinkedList<nodo>();
q.add(aux);
while(!q.isEmpty()) {
	nodo t=q.remove();
	if(t.dato.Num_Habitantes==value) {
		if(t.dato.Casos_Activos<=5){
			JOptionPane.showMessageDialog(null, "Casos activos del canton son igual o menos a 5, se procede a eliminar");
			evaluacion=t.dato.Num_Habitantes;
			JOptionPane.showMessageDialog(null, value);
		
			
			Eliminar60(value);
		deleteLastNode(aux,value);
		}
		if(t.dato.Casos_Activos>5) {
			JOptionPane.showMessageDialog(null, "Se mantiene el canton,casos activo mayor de 5 ");
			
			
		}
		
		
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


//Me retorna la altura de un nodo en específico
public boolean BuscarAlturaNodo() {
	nodo aux=raiz;
	
	

	if(aux==null) {
		return false;
		
	}
String DNI=JOptionPane.showInputDialog("Ingrese el Canton a buscar su altura");
	Queue <nodo>q=new LinkedList<nodo>();
	q.add(aux);
	while(!q.isEmpty()) {
		nodo t=q.remove();
		if(t.dato.nombre.equalsIgnoreCase(DNI)) {
			
			JOptionPane.showMessageDialog(null, "La altura del nodo es:" + height(t));
			
			
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

public int height(nodo nodo) {
	int height=0;
	if(nodo!=null) {
		if(nodo.HijoIzquierdo!=null) {
			height=Math.max(height, height(nodo.HijoIzquierdo));
			
		}
		if(nodo.HijoDerecho!=null) {
			height=Math.max(height, height(nodo.HijoDerecho));
		}
		height++;
		
		
	}
	return height;
	
}





//Permite encontrar la altura del arbol binario

public int EncontrarAltura(nodo nodo) {
	if(Interno(nodo)) {
		
		return-1;
		
		
	}

	return max(EncontrarAltura(nodo.HijoIzquierdo),EncontrarAltura(nodo.HijoDerecho))+1;
	



}
public boolean Interno(nodo nodo) {
	return !Hoja(raiz);
	
}

private int max(int a , int b) {
	// TODO Auto-generated method stub
	return a>b?a:b;
}
public boolean Hoja(nodo nodo) {
	
	return raiz.HijoIzquierdo== null&& raiz.HijoDerecho==null;
}




public void height1() {
	JOptionPane.showMessageDialog(null,	"La altura del arbol es:" + height(raiz) );

	
}

public boolean BuscarEvaluacion1() {
	nodo aux=raiz;
	
String DNI=JOptionPane.showInputDialog("Ingrese el nombre del canton a evaluar longitud");

if(aux==null) {
	return false;
	
}
Queue <nodo>q=new LinkedList<nodo>();
q.add(aux);
while(!q.isEmpty()) {
	nodo t=q.remove();
	if(t.dato.nombre.equalsIgnoreCase(DNI)) {
		
			
		Canton1=t.dato.Num_Habitantes;
	
		C1=t.dato.Num_Habitantes;
		
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
public boolean BuscarEvaluacion2() {
	nodo aux=raiz;
	
String DNI=JOptionPane.showInputDialog("Ingrese el nombre del segundo canton a evaluar longitud");

if(aux==null) {
	return false;
	
}
Queue <nodo>q=new LinkedList<nodo>();
q.add(aux);
while(!q.isEmpty()) {
	nodo t=q.remove();
	if(t.dato.nombre.equalsIgnoreCase(DNI)) {
		
			
		Canton2=t.dato.Num_Habitantes;
	C2=t.dato.Num_Habitantes;
		
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




public int findDistance(nodo root,int n1, int n2) {
	
	
	
	int x = Pathlength(root, n1) - 1;
	int y = Pathlength(root, n2) - 1;
	int lcaData = findLCA(root, n1, n2).dato.Num_Habitantes;
	int lcaDistance = Pathlength(root, lcaData) - 1;
	return (x + y) - 2 * lcaDistance;
}

public int Pathlength(nodo root, int n1) {
	if (root != null) {
		
		
		int x = 0;
		if ((root.dato.Num_Habitantes==n1) || (x = Pathlength(root.HijoIzquierdo, n1)) > 0
				|| (x = Pathlength(root.HijoDerecho, n1)) > 0) {
		
		
			
			return x +1;
			
		}
		
		return 0;
	}
	return 0;
}


//Imprimi el camino entre dos nodos ; es decir los nodos que que se visitan para llegar ahi

public void find(int search,nodo nodo) {
	
	try {
	if(!List.contains(nodo.dato)) {
		
		List.add(nodo.dato);
		steps++;
		
		
	}
	else {
		
		steps--;
	}
}catch(Exception e) {}
	try {
	if(nodo.dato.Num_Habitantes==search) {
		return;
		
		
		
	}
	if(search >nodo.dato.Num_Habitantes) {
		find(search,nodo.HijoDerecho);
		
	}
	if(search <nodo.dato.Num_Habitantes) {
		find(search,nodo.HijoIzquierdo);
		
	}
	}catch(Exception e1) {}
	
}

//RECUPERADOS
public int addBT1(nodo root)  
{  
 if (root == null)  
     return 0;  
 return (root.dato.Casos_Recuperados + addBT(root.HijoIzquierdo) +  
                    addBT(root.HijoDerecho));  
}

//Casos activos
public void printGivenLevel1(nodo root ,int level) 
{ 
    if (root == null) 
        return; 
    if (level == 1) 
       JOptionPane.showMessageDialog(null, "Total de casos activo del pais:" + addBT(root)   );
    else if (level > 1) 
    { 
        printGivenLevel(root.HijoIzquierdo, level-1); 
        printGivenLevel(root.HijoDerecho, level-1); 
    } 
}



public int addBT(nodo root)  
{  
 if (root == null)  
     return 0;  
 return (root.dato.Casos_Activos + addBT(root.HijoIzquierdo) +  
                    addBT(root.HijoDerecho));  
}

//Casos activos
public void printGivenLevel (nodo root ,int level) 
{ 
    if (root == null) 
        return; 
    if (level == 1) 
       JOptionPane.showMessageDialog(null, "Total de casos activo del pais:" + addBT(root)   );
    else if (level > 1) 
    { 
        printGivenLevel(root.HijoIzquierdo, level-1); 
        printGivenLevel(root.HijoDerecho, level-1); 
    } 
} 
public void Evaluar() {

	
}
public void Distancia() {



	JOptionPane.showMessageDialog(null, "La longitud entre los nodos es de " +  findDistance(raiz, 	Canton1, Canton2));
	
	
}


public nodo findLCA(nodo root, int n1,int n2) {
	if (root != null) {
		if ((root.dato.Num_Habitantes==n1 ||(root.dato.Num_Habitantes==n2))) {
			return root;
		}
		nodo left = findLCA(root.HijoIzquierdo, n1, n2);
		nodo right = findLCA(root.HijoDerecho, n1, n2);

		if (left != null && right != null) {
			return root;
		}
		if (left != null) {
			return left;
		}
		if (right != null) {
			return right;
		}
	}
	return null;
}
public nodo minimumElement(nodo root) {
	if (root.HijoIzquierdo== null)
		return root;
	else {
		return minimumElement(root.HijoIzquierdo);
	}
}


public void eli(int value) {
	
	nodo aux=raiz;
	

	remove(value);
	deleteLastNode(aux,value);
	remove(value);
	deleteLastNode(aux,value);
	
	
}
public nodo deleteNode(nodo root, int value) {
	
	
	
	if (root == null)
		return null;
	if (root.dato.Num_Habitantes > value) {
		root.HijoIzquierdo= deleteNode(root.HijoIzquierdo, value);
	} else if (root.dato.Num_Habitantes < value) {
		root.HijoDerecho = deleteNode(root.HijoDerecho, value);

	} else {
		// if nodeToBeDeleted have both children
		if (root.HijoIzquierdo != null && root.HijoDerecho != null) {
			nodo temp = root;
			// Finding minimum element from right
			nodo minNodeForRight = minimumElement(temp.HijoDerecho);
			// Replacing current node with minimum node from right subtree
			root.dato = minNodeForRight.dato;
			// Deleting minimum node from right now
			root.HijoDerecho = deleteNode(root.HijoDerecho, minNodeForRight.dato.Num_Habitantes);

		}
		// if nodeToBeDeleted has only left child
		else if (root.HijoIzquierdo != null) {
			root = root.HijoIzquierdo;
		}
		// if nodeToBeDeleted has only right child
		else if (root.HijoDerecho != null) {
			root = root.HijoDerecho;
		}
		// if nodeToBeDeleted do not have child (Leaf node)
		else
			root = null;
	}
	return root;
}

public void delete3(Integer data) {
	 
    deleteNode3(this.raiz, data);
}

private nodo deleteNode3(nodo root, Integer data) {

    if(root == null) return root;

    if(data < root.dato.Num_Habitantes) {
    	root.HijoIzquierdo=deleteNode(root.HijoIzquierdo, data);
       
    } else if(data > root.dato.Num_Habitantes) {
    	root=deleteNode(root.HijoDerecho, data);
        
    } else {
        // node with no leaf nodes
        if(root.HijoIzquierdo == null && root.HijoDerecho == null) {
            System.out.println("deleting "+data);
            return null;
        } else if(root.HijoIzquierdo == null) {
            // node with one node (no left node)
            System.out.println("deleting "+data);
            return root.HijoDerecho;
        } else if(root.HijoDerecho == null) {
            // node with one node (no right node)
            System.out.println("deleting "+data);
            return root.HijoIzquierdo;
        } else {
            // nodes with two nodes
            // search for min number in right sub tree
            Integer minValue = minValue(root.HijoIzquierdo);
            root.dato.Num_Habitantes=minValue;
          root.HijoDerecho=deleteNode(root.HijoIzquierdo, minValue);
         
      
        }
    }

    return root;
}




    public boolean remove(int key) {

 

        // Start at the top of the tree

 

      nodo focusNode = raiz;

       nodo parent = raiz;

 

        // When searching for a Node this will

        // tell us whether to search to the

        // right or left

 

       boolean isItALeftChild = true;

 

        // While we haven't found the Node

        // keep looking

 

        while (focusNode.dato.Num_Habitantes != key) {

 

            parent = focusNode;

 

           // If we should search to the left

 

            if (key < focusNode.dato.Num_Habitantes) {

 

                isItALeftChild = true;

                // Shift the focus Node to the left child

 

                focusNode = focusNode.HijoIzquierdo;

 

            } else {

 

                // Greater than focus node so go to the right

 

                isItALeftChild = false;

 

                // Shift the focus Node to the right child

 

                focusNode = focusNode.HijoDerecho;

 
            }

 

            // The node wasn't found

 

            if (focusNode == null)

                return false;

 

        }

 

        // If Node doesn't have children delete it

 

        if (focusNode.HijoIzquierdo == null && focusNode.HijoDerecho== null) {

 

            // If root delete it

 
            if (focusNode == raiz)

           raiz = null;

 

            // If it was marked as a left child

            // of the parent delete it in its parent
 

            else if (isItALeftChild)

                parent.HijoIzquierdo = null;

 

            // Vice versa for the right child

 

            else

                parent.HijoDerecho = null;

 

        }

 

        // If no right child

 

        else if (focusNode.HijoDerecho == null) {

 

            if (focusNode == raiz)

               raiz= focusNode.HijoIzquierdo;

 

            // If focus Node was on the left of parent

            // move the focus Nodes left child up to the

           // parent node

 
            else if (isItALeftChild)

                parent.HijoIzquierdo= focusNode.HijoIzquierdo;

 

            // Vice versa for the right child

 

            else

                parent.HijoDerecho= focusNode.HijoIzquierdo;

 

        }

 

        // If no left child

 

        else if (focusNode.HijoIzquierdo == null) {

 

           if (focusNode == raiz)

              raiz = focusNode.HijoDerecho;

 

            // If focus Node was on the left of parent

            // move the focus Nodes right child up to the

            // parent node

 

            else if (isItALeftChild)

                parent.HijoIzquierdo = focusNode.HijoDerecho;

 

            // Vice versa for the left child

 

            else

                parent.HijoDerecho = focusNode.HijoDerecho;

 

        }

 

        // Two children so I need to find the deleted nodes
        // replacement

 

        else {

 

            nodo replacement = getReplacementNode(focusNode);

 

            // If the focusNode is root replace root

            // with the replacement



            if (focusNode == raiz)

                raiz = replacement;

 

            else if (isItALeftChild)

                parent.HijoIzquierdo = replacement;

 

            // Vice versa if it was a right child

 

            else

                parent.HijoDerecho = replacement;

 

           replacement.HijoIzquierdo= focusNode.HijoIzquierdo;

 

        }

 

        return true;

 

    }

 

    public nodo getReplacementNode(nodo replacedNode) {

 

       nodo replacementParent = replacedNode;

       nodo replacement = replacedNode;

 

       nodo focusNode = replacedNode.HijoDerecho;

 

        // While there are no more left children

 

        while (focusNode != null) {

 

            replacementParent = replacement;

 

            replacement = focusNode;

 

            focusNode = focusNode.HijoIzquierdo;

 

        }

 

        // If the replacement isn't the right child

        // move the replacement into the parents

        // leftChild slot and move the replaced nodes

        // right child into the replacements rightChild

 

        if (replacement != replacedNode.HijoDerecho) {



            replacementParent.HijoIzquierdo = replacement.HijoDerecho;

            replacement.HijoDerecho = replacedNode.HijoDerecho;

 

        }

 

        return replacement;

 

    }

   
    
    private boolean NoHijo(nodo index) {//Tiene Hijos
		if (index.HijoDerecho== null && index.HijoIzquierdo == null) {
			return true;
		} else{ 
		return false;
		}
	}//Tiene Hijos 
    

    public boolean Eliminar60(int Nhabitantes){//Eliminar
		nodo actual = raiz;
		nodo padre = raiz ;
		
		
		boolean esIzquierda = true;
		while(actual.dato.Num_Habitantes!= Nhabitantes ){
		padre=actual;
		if(Nhabitantes<actual.dato.Num_Habitantes){
		esIzquierda=true ;
		actual=actual.HijoIzquierdo;
		}else{
		esIzquierda=false ;
		actual=actual.HijoDerecho;
		}
		if(actual== null){	return false;}
		}
		
		if(NoHijo(actual)) {
		if(actual==raiz){
			
		 res = JOptionPane.showConfirmDialog(null, ""+raiz.dato, "Desea Eliminar Estos Datos?", JOptionPane.YES_NO_OPTION);
			if(res == JOptionPane.YES_OPTION){
			raiz=null;
			tamaño--;
			JOptionPane.showMessageDialog(null, "DATOS ELIMINADOS!!");
			return true;
			}
		}else if(esIzquierda){
			res = JOptionPane.showConfirmDialog(null, ""+padre.HijoIzquierdo.dato, "Desea Eliminar Estos Datos?", JOptionPane.YES_NO_OPTION);
			if(res == JOptionPane.YES_OPTION){
			padre.HijoIzquierdo=null;
			tamaño--;
			JOptionPane.showMessageDialog(null, "DATOS ELIMINADOS!!");
			}
		}else{
		 res = JOptionPane.showConfirmDialog(null, ""+padre.HijoDerecho.dato, "Desea Eliminar Estos Datos?", JOptionPane.YES_NO_OPTION);
			if(res == JOptionPane.YES_OPTION){
			padre.HijoDerecho=null;
			tamaño--;
			JOptionPane.showMessageDialog(null, "DATOS ELIMINADOS!!");
			}
			}
			}else if (actual.HijoDerecho== null ) {
				if( actual == raiz ){
					res = JOptionPane.showConfirmDialog(null, ""+raiz.dato, "Desea Eliminar Estos Datos?", JOptionPane.YES_NO_OPTION);
					if(res == JOptionPane.YES_OPTION){
					raiz = raiz.HijoIzquierdo;
					tamaño--;
					JOptionPane.showMessageDialog(null, "DATOS ELIMINADOS!!");
					}
			}else if(esIzquierda ){
		res = JOptionPane.showConfirmDialog(null, ""+padre.HijoIzquierdo.dato, "Desea Eliminar Estos Datos?", JOptionPane.YES_NO_OPTION);
				if(res == JOptionPane.YES_OPTION){
				padre.HijoIzquierdo = actual.HijoIzquierdo;
				tamaño--;
				JOptionPane.showMessageDialog(null, "DATOS ELIMINADOS!!");
				}
			}else{
				int res = JOptionPane.showConfirmDialog(null, ""+raiz.dato, "Desea Eliminar Estos Datos?", JOptionPane.YES_NO_OPTION);
				if(res == JOptionPane.YES_OPTION){
				padre.HijoDerecho = actual.HijoIzquierdo;
				tamaño--;
				JOptionPane.showMessageDialog(null, "DATOS ELIMINADOS!!");
				}
			}
			}
	
			if(actual.HijoIzquierdo == null){
			if(actual==raiz){
			 res = JOptionPane.showConfirmDialog(null, ""+raiz.dato, "Desea Eliminar Estos Datos?", JOptionPane.YES_NO_OPTION);
				if(res == JOptionPane.YES_OPTION){
				raiz=raiz.HijoDerecho;
				tamaño--;
				JOptionPane.showMessageDialog(null, "DATOS ELIMINADOS!!");
				}
			}else if(esIzquierda){
				res = JOptionPane.showConfirmDialog(null, ""+padre.HijoIzquierdo.dato, "Desea Eliminar Estos Datos?", JOptionPane.YES_NO_OPTION);
				if(res == JOptionPane.YES_OPTION){	
			padre.HijoIzquierdo = actual.HijoDerecho;
			tamaño--;
			JOptionPane.showMessageDialog(null, "DATOS ELIMINADOS!!");
				}
			}else{
				try {
				 res = JOptionPane.showConfirmDialog(null, ""+padre.HijoIzquierdo.dato, "Desea Eliminar Estos Datos?", JOptionPane.YES_NO_OPTION);
				}catch(Exception e) {}
				if(res == JOptionPane.YES_OPTION){
			padre.HijoDerecho = actual.HijoDerecho;
			tamaño--;
			JOptionPane.showMessageDialog(null, "DATOS ELIMINADOS!!");
				}
			}
			}else{
				
				nodo sucesor = getSuccessor(actual);
				if(actual == raiz){
					 res = JOptionPane.showConfirmDialog(null, ""+raiz.dato, "Desea Eliminar Estos Datos??", JOptionPane.YES_NO_OPTION);
					if(res == JOptionPane.YES_OPTION){
					raiz = sucesor;
					tamaño--;
					JOptionPane.showMessageDialog(null, "DATOS ELIMINADOS!!");
					}
				}else if( esIzquierda ){
				res = JOptionPane.showConfirmDialog(null, ""+padre.HijoIzquierdo, "Desea Eliminar Estos Datos?", JOptionPane.YES_NO_OPTION);
					if(res == JOptionPane.YES_OPTION){
				padre.HijoIzquierdo = sucesor;
				tamaño--;
				JOptionPane.showMessageDialog(null, "DATOS ELIMINADOS!!");
					}
				}else{
					 res = JOptionPane.showConfirmDialog(null, ""+actual.dato, "Desea Eliminar Estos Datos?", JOptionPane.YES_NO_OPTION);
					if(res == JOptionPane.YES_OPTION){
				padre.HijoDerecho = sucesor;
				sucesor.HijoIzquierdo = actual.HijoIzquierdo;
				tamaño--;
				JOptionPane.showMessageDialog(null, "DATOS ELIMINADOS!!");
			
					}
				}
			
				return true;
				} 
			return esIzquierda;
			
}//Eliminar
    
    


}















