package ds.ejempos.std.controladores;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import ds.ejemplos.std.entidades.Docente;
import ds.ejemplos.std.entidades.EstadoReserva;
import ds.ejemplos.std.entidades.Operador;
import ds.ejemplos.std.entidades.Recurso;
import ds.ejemplos.std.entidades.Reserva;

public class ControladorReservas implements IControladorReservas {

	private ArrayList<Reserva> reservas;
	
	@Override
	public boolean agregar() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean verReserva() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean anularReserva() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Reserva> verReservas() {
		return this.reservas;
	}

	@Override
	public boolean atenderReserva() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void precargar() {
		this.reservas = new ArrayList<Reserva>();
		
		Operador u1 = new Operador(1,"jose", "jose","","Jose", "Perez");
		u1.setTipo(2);
		Docente d1 = new Docente(2, "eli", "eli","elizabeth","pascual",null,"");
		d1.setTipo(2);
		
		Recurso r1 = new Recurso("Proyector");

		Reserva reserva1 = new Reserva(d1,u1,r1, "10/05/2023", "12:00", EstadoReserva.ABIERTA);
		Reserva reserva2 = new Reserva(d1,u1,r1, "12/05/2023", "12:00", EstadoReserva.ABIERTA);
		Reserva reserva3 = new Reserva(d1,u1,r1, "15/05/2023", "12:00", EstadoReserva.ABIERTA);
		Reserva reserva4 = new Reserva(d1,u1,r1, "18/05/2023", "12:00", EstadoReserva.ABIERTA);
		Reserva reserva5 = new Reserva(d1,u1,r1, "20/05/2023", "12:00", EstadoReserva.ABIERTA);
		
		this.reservas.add(reserva1);
		this.reservas.add(reserva2);
		this.reservas.add(reserva3);
		this.reservas.add(reserva4);
		this.reservas.add(reserva5);
		
	}

}
