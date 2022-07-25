import javax.swing.JOptionPane;

public class Usuarios {
int DNI;
String Nombre;
int Edad;
String Pago;


public Usuarios() {
	
	
	
}


public int getDNI() {
	return DNI;
}


public void setDNI(int dNI) {
	DNI = dNI;
}


public String getNombre() {
	return Nombre;
}


public void setNombre(String nombre) {
	Nombre = nombre;
}


public int getEdad() {
	return Edad;
}


public void setEdad(int edad) {
	Edad = edad;
}


public String getPago() {
	return Pago;
}


public void setPago(String pago) {
	Pago = pago;
}
public void Ingresar() {
DNI=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el dni del usuario"));
Nombre=JOptionPane.showInputDialog("Ingrese el nombre del usuario");
Edad=Integer.parseInt(JOptionPane.showInputDialog( null,"Ingrese la edad del usuario"));
Pago=JOptionPane.showInputDialog(null, "Ingrese el tipo de pago(Efectivo/Tarjeta)");
	
}
public String toString() {
	 return  "****************************************"+
     		"\nDNI: " + getDNI() +
     		"\nNombre: " + Nombre + 
     		"\nEdad: " + Edad +
     		"   \nForma de pago: " + Pago  ;
     	
	
	
}




}

