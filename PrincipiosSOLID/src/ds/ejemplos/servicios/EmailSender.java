package ds.ejemplos.servicios;

import ds.ejemplos.solid.s.Producto;

//Clase Servicio de Envio de Mails
public class EmailSender {

	public void enviarMailFaltaStock(Producto p) {
		System.out.println("Falta stock de producto: " + p.getNombre());
		System.out.println("Enviando mail....");
	}
}
