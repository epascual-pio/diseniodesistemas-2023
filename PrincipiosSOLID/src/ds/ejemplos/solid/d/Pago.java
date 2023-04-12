package ds.ejemplos.solid.d;

public class Pago {

	Database database;
	
	public Pago(Database database) {
		this.database = database;
	}

	public void pagar(Producto producto, TipoPago tipoPago) {
		database.guardar(producto, tipoPago);
	}
	
}
