package ds.ejemplos.std.entidades;

public class Operador extends Usuario {

	private String horario;
	
	public Operador(Integer codigo, String login, String clave, String horario, String nombre, String apellido) {
		super(codigo, login, clave, nombre, apellido);
		this.horario = horario;
	}

	@Override
	public String toString() {
		return "Operador [login="+super.getLogin()+" clave="+ super.getClave()+" horario="+horario+"]";
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}
	

}
