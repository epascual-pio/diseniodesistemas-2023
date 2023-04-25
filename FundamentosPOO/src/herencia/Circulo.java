package ds.fundamentos.herencia;

public class Circulo extends Figura implements IFigura, IPantalla {

	@Override
	public void dibujar() {
		System.out.println("Circulo dibujando...");
	}

	@Override
	public void pintar() {
		System.out.println("Circulo pintando...");
	}

	@Override
	public void mover(int x, int y) {
		System.out.println("Moviendo Circulo a x:"+x+" y:"+y);
	}

}
