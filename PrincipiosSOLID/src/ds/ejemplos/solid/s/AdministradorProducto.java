package ds.ejemplos.solid.s;

import java.util.ArrayList;

public class AdministradorProducto {

	private ArrayList<Producto> productos;
	
	private Producto producto;
	
	
	public AdministradorProducto() {
		super();
		this.productos = new ArrayList<Producto>();
	}

	public void consultarProductos() {}
	
	public void agregarProducto(Producto p) {
		this.productos.add(p);
	}
	
	public void eliminarProducto(Producto p) {}
	
	public void modificarProducto(Producto p) {}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	
}
