package ds.fundamentos.herencia;

public abstract class Animal {
	
	private String nombre;
	private String peso;
	
	public Animal(String nombre, String peso) {
		super();
		this.nombre = nombre;
		this.peso = peso;
	}
	public void caminar() {
		System.out.print("Animal caminando...");
	}
	public void correr() {
		System.out.print("Animal corriendo...");
	}
	public abstract void comer();
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPeso() {
		return peso;
	}
	public void setPeso(String peso) {
		this.peso = peso;
	}

}
