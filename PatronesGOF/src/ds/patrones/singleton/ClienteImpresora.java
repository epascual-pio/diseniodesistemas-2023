package ds.patrones.singleton;

public class ClienteImpresora {

	public static void main(String[] args) {
		
		ImpresoraSingleton impresora = ImpresoraSingleton.getInstancia();
		impresora.imprimirTrabajo("Esta es una clase singleton");

		ImpresoraSingleton impresora2 = ImpresoraSingleton.getInstancia();
		ImpresoraSingleton impresora3 = ImpresoraSingleton.getInstancia();
		
		impresora2.imprimirTrabajo("Segundo llamado");
		System.out.println(impresora);
		System.out.println(impresora2);
		System.out.println(impresora3);

	}

}
