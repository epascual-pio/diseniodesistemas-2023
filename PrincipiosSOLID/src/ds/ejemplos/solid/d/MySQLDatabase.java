package ds.ejemplos.solid.d;

public class MySQLDatabase implements Database{
	
	public void guardar(Producto p, TipoPago tp) {
		System.out.println("Guardando el producto " + p.getNombre() + " con pago " + tp.getNombre() + " en la base de datos MySQL...");
	}

}
