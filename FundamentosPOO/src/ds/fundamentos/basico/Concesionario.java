package ds.fundamentos.basico;

import java.util.ArrayList;

public class Concesionario {
	
	private String nombre;
	private String direccion;
	private String cuit;
	
	//Relacion con el tipo Coche 1:N
	private ArrayList<Coche> coches;

	public Concesionario(String nombre, String direccion, String cuit) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.cuit = cuit;
		this.coches = new ArrayList<Coche>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public ArrayList<Coche> getCoches() {
		return coches;
	}

	public void setCoches(ArrayList<Coche> coches) {
		this.coches = coches;
	}
	
	public void addCoche(Coche coche) {
		this.coches.add(coche);
	}

	@Override
	public String toString() {
		return "Concesionario [nombre=" + nombre + ", direccion=" + direccion + ", cuit=" + cuit + ", coches=" + coches
				+ "]";
	}
	
	

}
