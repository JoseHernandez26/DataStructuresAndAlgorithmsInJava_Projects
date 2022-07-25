import javax.swing.JOptionPane;

import javax.swing.JOptionPane;

public class Streaming extends Publicacion {

int TimeRep;
String Tipo_Plataforma;

public Streaming() {}

public int getTimeRep() {
	return TimeRep;
}

public void setTimeRep(int timeRep) {
	TimeRep = timeRep;
}

public String getTipo_Plataforma() {
	return Tipo_Plataforma;
}

public void setTipo_Plataforma(String tipo_Plataforma) {
	Tipo_Plataforma = tipo_Plataforma;
}


public void Ingresar() {
	super.U.Ingresar();
	super.Titulo=JOptionPane.showInputDialog("Ingrese el titulo de la publicacion");
	super.autor=JOptionPane.showInputDialog("Ingrese el autor de la publicacion");
	TimeRep=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tiempo de reproduccion"));
	Tipo_Plataforma=JOptionPane.showInputDialog("Ingrese la plataforma(Descarga, En línea, Difusa)");
	super.Editorial=JOptionPane.showInputDialog("Ingrese la editorial de la publicacion")	;
	super.precio=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio de la publicacion"));
	super.CantidadEmisiones=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de emisiones"));
	
}
public double CalculoAdquisicion() {
	double Operacion=(super.precio*CantidadEmisiones)+((super.precio*CantidadEmisiones)*0.10);
	return Operacion;
	
	
}

public String toString() {
	 return  "****************************************"+
             super.U.toString()+
             "\nTiempo de reproduccion:" + TimeRep +
             "\nTipo de plataforma" + Tipo_Plataforma +
	     		"\nTitulo: " + getTitulo() +
	     		"\nautor: " + getAutor() + 
	     		"\nEditorial: " + Editorial +
	     		"   \nprecio: " + precio + 
	     		"\nCantidad de emisiones:" + CantidadEmisiones +
	     		"\nValor total de adquisicion:" + CalculoAdquisicion()  ;		
	
	
}
	
	
	
}
