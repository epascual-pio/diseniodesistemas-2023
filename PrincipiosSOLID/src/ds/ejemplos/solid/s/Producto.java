package ds.ejemplos.solid.s;

public class Producto {
	
	private int id;
	private String nombre;
	private String tipo;
	private int stock;
	
	public Producto() {
		super();
	}
	public Producto(int id, String nombre, String tipo, int stock) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.stock = stock;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
}
