package ds.ejemplos.solid.i;

public class PrincipioSolidI {

	public static void main(String[] args) {
		
		Zapato bota = new Zapato();
		Caramelos tictac = new Caramelos();
		
		System.out.println(bota.getTipo());
		
		System.out.println(tictac.getTipo());
		System.out.println(tictac.getGusto());

	}

}
