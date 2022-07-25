
public abstract class Publicacion {
	String Titulo;
	String autor;
	String Editorial;
	double precio;
	int CantidadEmisiones;
	
	Usuarios U=new Usuarios();
	public Publicacion() {
		
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return Editorial;
	}

	public void setEditorial(String editorial) {
		Editorial = editorial;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public abstract void Ingresar();
	public abstract double CalculoAdquisicion();
	public abstract String toString();
	
	
	
	
	
	

	
	

}
