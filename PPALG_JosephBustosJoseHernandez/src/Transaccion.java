import java.io.Serializable;

public class Transaccion implements Serializable{

	Usuarios U=new Usuarios();
	CAJEROSGUI CG=new CAJEROSGUI();
	String Numero; //Numero de transaccion
	String Fecha;
	String hora;
	int Monto; // Monto tanto de deposito como de retiro
    int SaldoT;
	
	
	
	
	public Transaccion() {
		
		
		
	}



	public Usuarios getU() {
		return U;
	}



	public void setU(Usuarios u) {
		U = u;
	}



	public CAJEROSGUI getCG() {
		return CG;
	}


	public void setCG(CAJEROSGUI cG) {
		CG = cG;
	}
	
	
	
	
	
	
}
