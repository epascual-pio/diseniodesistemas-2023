package ds.fundamentos.herencia;

public class Perro extends Animal {

	public Perro(String nombre, String peso) {
		super(nombre, peso);
	}
	
	public void correr() {
		System.out.println("Perro corriendo...");
	}

	@Override
	public void comer() {
		System.out.println("Perro comiendo...");
		
	}

}
