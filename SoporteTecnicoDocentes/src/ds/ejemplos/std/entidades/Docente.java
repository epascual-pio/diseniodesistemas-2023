package ds.ejemplos.std.entidades;

import java.util.ArrayList;

public class Docente extends Usuario {

	private String titulo;
	private ArrayList<Materia> materias;
		
	public Docente(Integer codigo, String login, String clave, String nombre, String apellido, ArrayList<Materia> materias, String titulo) {
		super(codigo,login, clave, nombre, apellido);
		this.materias = materias;
		this.setTitulo(titulo);
	}

	public Docente(Integer codigo, String login, String clave, String nombre, String apellido) {
		super(codigo, login, clave,nombre,apellido);
	}

	public ArrayList<Materia> getMaterias() {
		return materias;
	}

	public void setMaterias(ArrayList<Materia> materias) {
		this.materias = materias;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Docente [nombre=" + super.getNombre() + ", apellido=" + super.getApellido() + ", titulo=" + titulo + ", materias=" + materias
				+ "]";
	}

}
