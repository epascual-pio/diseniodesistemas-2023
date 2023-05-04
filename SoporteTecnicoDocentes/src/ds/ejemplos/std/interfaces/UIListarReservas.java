package ds.ejemplos.std.interfaces;

import java.io.IOException;
import java.util.ArrayList;

import ds.ejemplos.std.controladores.ControladorReservas;
import ds.ejemplos.std.entidades.Reserva;

public class UIListarReservas {
	
	public static void main(String[] args) throws IOException {
		
		ControladorReservas cr = new ControladorReservas();
		cr.precargar();
		
		ArrayList<Reserva> reservas = cr.verReservas();
		
		for (Reserva r: reservas) {
			System.out.println(r);
		}

	}

}
