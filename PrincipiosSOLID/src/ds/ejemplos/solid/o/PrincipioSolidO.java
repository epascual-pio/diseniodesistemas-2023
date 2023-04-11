package ds.ejemplos.solid.o;

public class PrincipioSolidO {

	public static void main(String[] args) {
		
		Auto autoCarrera1 = new AutoCarreras(1, "Ferrari", "F1", "Rojo", false);
		Auto autoParticular = new AutoParticular(2, "Renault", "Clio", "Azul");
		Auto autoTransporte = new AutoTransporte(3, "Mercedes", "Colectivo", "Blanco");
		
		autoCarrera1.acelerar();
		autoParticular.acelerar();
		autoTransporte.acelerar();

	}

}
