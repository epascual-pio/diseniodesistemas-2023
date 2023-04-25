package ds.fundamentos.herencia;

public class Gato extends Animal {

	public Gato(String nombre, String peso) {
		super(nombre, peso);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void comer() {
		System.out.println("Gato comiendo...");
		
	}

}
