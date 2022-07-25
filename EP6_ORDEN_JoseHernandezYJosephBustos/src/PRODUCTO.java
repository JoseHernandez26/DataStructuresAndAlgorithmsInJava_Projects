import javax.swing.JOptionPane;

public class PRODUCTO {

String Codigo;
String nombre;
int PrecioUnitario;
int Cantidad;

public PRODUCTO() {}
public String getCodigo() {
	return Codigo;
}
public void setCodigo(String codigo) {
	Codigo = codigo;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getPrecioUnitario() {
	return PrecioUnitario;
}
public void setPrecioUnitario(int precioUnitario) {
	PrecioUnitario = precioUnitario;
}
public int getCantidad() {
	return Cantidad;
}
public void setCantidad(int cantidad) {
	Cantidad = cantidad;
}
public int CalculoPrecioTotal() {
	
	int Respuesta=getCantidad() *getPrecioUnitario();
	return Respuesta;
	
	
}

public void Ingreso() {
nombre=JOptionPane.showInputDialog("Ingrese el nombre del producto");
Codigo=JOptionPane.showInputDialog("Ingrese el codigo del producto");
PrecioUnitario=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio unitario del producto"));
Cantidad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad total y en existencia del producto"));
	
	
	
}
@Override
public String toString() {
	return "PRODUCTO \nCodigo=" + Codigo + " \nnombre=" + nombre + "\nPrecioUnitario=" + PrecioUnitario + "\nCantidad="
			+ Cantidad ;
}





	
	
	
	
	
}
