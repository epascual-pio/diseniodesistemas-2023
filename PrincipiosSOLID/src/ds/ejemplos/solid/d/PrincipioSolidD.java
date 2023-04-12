package ds.ejemplos.solid.d;

public class PrincipioSolidD {

	public static void main(String[] args) {
		
		//Obtenemos de una propiedad el tipo de base de datos, este paso puede ser
		//optimizado leyendo de un archivo de properties el tipo o motor de base de datos
		//y crear la instancia correspondiente
		Database db = new MySQLDatabase();
		
		//Creamos los productos
		Producto p1 = new Producto("Tik Tak Naranja");
		Producto p2 = new Producto("Tik Tak Frutilla");
		Producto p3 = new Producto("Tik Tak Multifruta");
		
		//Creamos las formas de Pago
		TipoPago tpEfectivo = new TipoPago(1,"Efectivo");
		TipoPago tpTarjeta = new TipoPago(2,"Tarjeta");
		
		//Pagamos, el pago recibe como argumento la base de datos 
		Pago pago = new Pago(db);
		pago.pagar(p1, tpEfectivo);
		pago.pagar(p2, tpTarjeta);
		pago.pagar(p3, tpEfectivo);

	}

}
