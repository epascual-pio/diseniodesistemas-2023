package ds.ejemplos.solid.s;

import ds.ejemplos.servicios.EmailSender;

public class PrincipioSolid {

	public static void main(String[] args) {
		Producto p1 = new Producto(1, "Caramelos TikTak", "Golosinas", 10);
		Producto p2 = new Producto(2, "Alfajor Jorgito", "Golosinas", 0);
		Producto p3 = new Producto(3, "Chocolate Milka", "Golosinas", 1);
		
		AdministradorProducto adm = new AdministradorProducto();
		adm.agregarProducto(p1);
		adm.agregarProducto(p2);
		adm.agregarProducto(p3);
		
		EmailSender sender = new EmailSender();

		for ( Producto producto : adm.getProductos() ){
			System.out.println("Producto: "+ producto.getNombre());
			if (producto.getStock() <= 0 ){
				sender.enviarMailFaltaStock(p1);
			}
		}
	}

}
