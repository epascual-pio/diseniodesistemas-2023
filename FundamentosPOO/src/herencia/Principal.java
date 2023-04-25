package ds.fundamentos.herencia;

public class Principal {

	public static void main(String[] args) {
		Perro a1 = new Perro("Lola","5kg");
		a1.correr();
		
		Gato a2 = new Gato("Jengibre","4kg");
		a2.correr();
		
		a1.comer();
		a2.comer();
		
		Circulo circulo = new Circulo();
		circulo.setColor("Rojo");
		circulo.dibujar();
		circulo.pintar();
		circulo.mover(10, 10);
		System.out.println(circulo.getColor());
	}

}
