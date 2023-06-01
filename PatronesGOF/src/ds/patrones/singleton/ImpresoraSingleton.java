package ds.patrones.singleton;

public class ImpresoraSingleton {
	
	private static ImpresoraSingleton instancia;
	
	public static ImpresoraSingleton getInstancia() {
		
		if (instancia == null) {
			instancia = new ImpresoraSingleton();
		}
		return instancia;
	}
	
	public void imprimirTrabajo(String mensaje) {
		System.out.println(mensaje);
	}

}
