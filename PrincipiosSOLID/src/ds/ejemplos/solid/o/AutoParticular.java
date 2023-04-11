package ds.ejemplos.solid.o;

public class AutoParticular extends Auto {

	public AutoParticular(int tipo, String marca, String modelo, String color) {
		super(tipo, marca, modelo, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void acelerar() {
		System.out.println("Acelerando Auto Particular...");
	}

	@Override
	public void frenar() {
		System.out.println("Frenando Auto Particular...");
	}
	
	

}
