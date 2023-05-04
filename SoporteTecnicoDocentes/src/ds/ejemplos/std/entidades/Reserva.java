package ds.ejemplos.std.entidades;

public class Reserva {

	private Docente docente;
	private Operador operador;
	private Recurso recurso;
	private String fecha;
	private String hora;
	private EstadoReserva estado;
	
	public Reserva(Docente docente, Operador operador, Recurso recurso, String fecha, String hora,
			EstadoReserva estado) {
		super();
		this.docente = docente;
		this.operador = operador;
		this.recurso = recurso;
		this.fecha = fecha;
		this.hora = hora;
		this.estado = estado;
	}
	public Docente getDocente() {
		return docente;
	}
	public void setDocente(Docente docente) {
		this.docente = docente;
	}
	public Operador getOperador() {
		return operador;
	}
	public void setOperador(Operador operador) {
		this.operador = operador;
	}
	public Recurso getRecurso() {
		return recurso;
	}
	public void setRecurso(Recurso recurso) {
		this.recurso = recurso;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public EstadoReserva getEstado() {
		return estado;
	}
	public void setEstado(EstadoReserva estado) {
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "Reserva [docente=" + docente + ", operador=" + operador + ", recurso=" + recurso + ", fecha=" + fecha
				+ ", hora=" + hora + ", estado=" + estado + "]";
	}
	
	
}
