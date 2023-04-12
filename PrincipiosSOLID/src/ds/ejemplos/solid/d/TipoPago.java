package ds.ejemplos.solid.d;

public class TipoPago {

	int tipo;
	String nombre;
	
	
	public TipoPago(int tipo, String nombre) {
		super();
		this.tipo = tipo;
		this.nombre = nombre;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
