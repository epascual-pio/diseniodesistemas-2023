package ds.ejempos.std.controladores;

import java.util.ArrayList;

import ds.ejemplos.std.entidades.Reserva;

public interface IControladorReservas {

	public boolean agregar();
	public boolean verReserva();
	public boolean anularReserva();
	public ArrayList<Reserva> verReservas();
	public boolean atenderReserva();
	public void precargar();
	
}
