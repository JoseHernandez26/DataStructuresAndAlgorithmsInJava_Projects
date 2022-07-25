import javax.swing.JOptionPane;

public class Canton extends CRCOVID19{




public Canton() {
	
	
	
}
public Canton(String nombre, int num_Habitantes, int casos_Activos, int casos_Recuperados, int total, int tDA) {
	super();
	this.nombre = nombre;
	Num_Habitantes = num_Habitantes;
	Casos_Activos = casos_Activos;
	Casos_Recuperados = casos_Recuperados;
	Total = total;
	TDA = tDA;
}


public void Ingresar() {
nombre=JOptionPane.showInputDialog("Digite el nombre del canton");
Num_Habitantes=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de habitantes del cantón"));
Casos_Activos =Integer.parseInt(JOptionPane.showInputDialog("Ingrese los casos activos"));
Casos_Recuperados =Integer.parseInt(JOptionPane.showInputDialog("Ingrese los casos recuperados"));
	
	
	
	
	
}
@Override
public String toString() {
	return "Canton \nnombre=" + nombre + "\nNum_Habitantes=" + Num_Habitantes + "\nCasos_Activos=" + Casos_Activos
			+ "\nCasos_Recuperados=" + Casos_Recuperados  ;
}



	
	
	
	
	
}
