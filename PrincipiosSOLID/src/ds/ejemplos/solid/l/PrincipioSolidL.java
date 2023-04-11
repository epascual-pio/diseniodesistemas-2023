package ds.ejemplos.solid.l;

public class PrincipioSolidL {

	public static void main(String[] args) {
		IAuto auto = null;
		
		int tipo = 2;
		
		if (tipo==1) {
			auto = new AutoComun();
		}else if (tipo==2) {
			auto = new AutoElectrico();
		}
		auto.acelerar();

	}

}
