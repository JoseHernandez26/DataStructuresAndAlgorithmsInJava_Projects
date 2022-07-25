import javax.swing.JOptionPane;

public class Libro extends Publicacion {

	String Tipo;
	int Numero_Paginas;
	public Libro() {}
	public Libro(String tipo, int numero_Paginas) {
		super();
		Tipo = tipo;
		Numero_Paginas = numero_Paginas;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	public int getNumero_Paginas() {
		return Numero_Paginas;
	}
	public void setNumero_Paginas(int numero_Paginas) {
		Numero_Paginas = numero_Paginas;
	}
	
	public void Ingresar() {
	super.U.Ingresar();
	super.Titulo=JOptionPane.showInputDialog("Ingrese el titulo de la publicacion");
	super.autor=JOptionPane.showInputDialog("Ingrese el autor de la publicacion");
	Tipo=JOptionPane.showInputDialog("Ingrese el tipo de libro(Entretenimiento/Formativo)" );
	Numero_Paginas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de paginas)" ));
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
	                "\nTipo:" + Tipo +
	                "\nNumero de paginas" + Numero_Paginas +
		     		"\nTitulo: " + getTitulo() +
		     		"\nautor: " + getAutor() + 
		     		"\nEditorial: " + Editorial +
		     		"   \nprecio: " + precio + 
		     		"\nCantidad de emisiones:" + CantidadEmisiones +
		     		"\nValor total de adquisicion:" + CalculoAdquisicion()  ;	
		
		
	}
	
	
	
}
