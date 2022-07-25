import javax.swing.JOptionPane;

public class Ventas extends FACTURAS {



public Ventas() {
	
	
	
	
	
}



public String getNum_Factura() {
	return Num_Factura;
}



public void setNum_Factura(String num_Factura) {
	Num_Factura = num_Factura;
}



public String getNombreCliente() {
	return NombreCliente;
}



public void setNombreCliente(String nombreCliente) {
	NombreCliente = nombreCliente;
}



public int getCodigoVendedor() {
	return CodigoVendedor;
}



public void setCodigoVendedor(int codigoVendedor) {
	CodigoVendedor = codigoVendedor;
}



public String getNombreProducto() {
	return NombreProducto;
}



public void setNombreProducto(String nombreProducto) {
	NombreProducto = nombreProducto;
}



public int getCantidadProducto() {
	return CantidadProducto;
}



public void setCantidadProducto(int cantidadProducto) {
	CantidadProducto = cantidadProducto;
}



public int getPrecio() {
	return precio;
}



public void setPrecio(int precio) {
	this.precio = precio;
}

public void Ingreso() {
	Num_Factura=JOptionPane.showInputDialog("Ingrese el numero de factura");
	NombreCliente=JOptionPane.showInputDialog("Ingrese el nombre del cliente");
	CodigoVendedor=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo de vendedor"));
	NombreProducto=JOptionPane.showInputDialog("Ingrese el nombre del producto");
	CantidadProducto=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad del producto"));
	precio=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio"));
	
	
}

public int Total() {
	int Respuesta=CantidadProducto*precio;
	return Respuesta;
	
}

public int TotalIV() {
	
	int Respuesta=CantidadProducto*precio;
	int Total=(int) (Respuesta+(Respuesta*0.15));
	return Total;
	
}

public int Calculo() {
	return CantidadProducto;
	
	
}

@Override
public String toString() {
	return "Ventas \nNumero de Factura=" + Num_Factura + "\nNombre del Cliente=" + NombreCliente + "\nCodigoVendedor="
			+ CodigoVendedor + "\nNombre Producto=" + NombreProducto + "\nCantidadProducto=" + CantidadProducto
			+ "\nprecio=" + precio + "\nTotal sin IV=" + Total() + "\nTotal con IV=" + TotalIV();
}
public void Mostrar() {
	
	JOptionPane.showMessageDialog(null, toString());
	
	
}






























	
}
