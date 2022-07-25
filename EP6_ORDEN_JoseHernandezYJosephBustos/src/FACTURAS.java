import javax.swing.JOptionPane;

public abstract class FACTURAS {
	PRODUCTO P =new PRODUCTO();
String NombreProvedor;	
String Num_Factura;
String Cedula;

String NombreCliente;
int CodigoVendedor;
String NombreProducto;
int CantidadProducto;
int precio;


public FACTURAS() {}
	
public abstract void Ingreso();

public abstract String toString();	

public abstract int Calculo();

public abstract int Total();

public abstract int TotalIV();




}
