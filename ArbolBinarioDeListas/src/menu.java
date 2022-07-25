

import javax.swing.JOptionPane;



public class menu {
	 Lista LI=new Lista();
	 Arbol l=new Arbol();
	
	 public menu(){
	
	
}


public void Menu() {
	
	int op;
	do {
	op=Integer.parseInt(
			JOptionPane.showInputDialog(null, "1.Ingrese el cliente a libro" + "\n2.Ingrese el cliente a Streaming" +  
					"\n3.MostrarPublicacionInOrden" + "\n4.MostrarPublicacionPreOrden" + "\n5.MostrarPublicacionPostOrden" + "\n6.Buscar" + "\n7.Eliminar" + "\n8.Cantidad de Publicaciones" + "\n9.Altura de Nodo" + "\n10.Distancia entre nodos o usuarios" + "\n11.Mostrar caminos entre nodos o usuarios" + "\n12.Imprimir nivel nodo" + "\n13.Numero de nodos Hijos" + "\n14.Salir"));
	
	switch(op) {
	case 1:
IngresarLibro();

break;

	case 2:

break;
	case 3:
		PreOrdenMostrar();

		break;
		
		
	case 4:
	MostrarInOrden();
		break;
	case 5:
		PostOrdenMostrar();
		break;
		
	case 6:
		
	Buscar();
		break;
	case 7:
		Eliminar();
		
		break;
		
	case 8 :
		
	
		break;
		
	case 9:
		

	
	break;

	
	case 10:
		break;
		
	case 11:
		
		break;
		
		
	case 12:
	
	break;
	
	case 13:
		
		

	
	break;
		
	case 14:

	System.exit(0);
	default:
	JOptionPane.showMessageDialog(null, "Error....Opcion Invalida");
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}while(op!=14);
	
	
	
	
	
	
}

public void IngresarLibro() {
	
	Libro L=new Libro();
L.Ingresar();
LI.InsertarNodoInicio(L);

l.insert(LI);
	
}



public void MostrarInOrden() {
l.InOrden(l.raiz);
	
}
public void PreOrdenMostrar() {
l.PreOrden(l.raiz);
	
}
public void PostOrdenMostrar() {
l.PreOrden(l.raiz);
	
}

public void Buscar() {
	
	l.Buscar();
	
	
}

public void Eliminar() {
	
	l.Eliminar();
	
	
}

}