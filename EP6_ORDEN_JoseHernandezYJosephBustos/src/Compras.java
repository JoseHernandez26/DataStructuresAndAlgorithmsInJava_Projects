import javax.swing.JOptionPane;

public class Compras extends FACTURAS{
	PRODUCTO P =new PRODUCTO();

	
public Compras() {
	
	
	
}


public PRODUCTO getP() {
	return P;
}


public void setP(PRODUCTO p) {
	P = p;
}


public String getNombreProvedor() {
	return NombreProvedor;
}


public void setNombreProvedor(String nombreProvedor) {
	NombreProvedor = nombreProvedor;
}


public String getNum_Factura() {
	return Num_Factura;
}


public void setNum_Factura(String num_Factura) {
	Num_Factura = num_Factura;
}



public void Ingreso() {
	Num_Factura=JOptionPane.showInputDialog("Ingrese el numero de factura");
	NombreProvedor=JOptionPane.showInputDialog("Ingrese el nombre del proveedor");
	Cedula=JOptionPane.showInputDialog("Ingrese el numero de cècula juridica");
	
	P.Ingreso();
	
	
	
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
	int Respuesta=P.CalculoPrecioTotal();
if(Respuesta>25000) {
	
	Respuesta=(int) (P.CalculoPrecioTotal()-(P.CalculoPrecioTotal()*0.05));
}
if(Respuesta>50000) {
	
	Respuesta=(int) (P.CalculoPrecioTotal()-(P.CalculoPrecioTotal()*0.10));
}
return Respuesta;
	
}


@Override
public String toString() {
	return P.toString() + "\nCompras \nNombreProvedor=" + NombreProvedor + "\nNumero de factura=" + Num_Factura + "\nCedula=" + Cedula + "\nTotal factura sin descuento:" + 
P.CalculoPrecioTotal() + "\nTotal de factura con descuento:" + Calculo();
}
	
	
	
	
}
