package ds.ejemplos.solid.o;

public class AutoCarreras extends Auto {

	private boolean hayCombustibleGas;
	
	public AutoCarreras(int tipo, String marca, String modelo, String color, boolean hayCombustible) {
		super(tipo, marca, modelo, color);
		this.hayCombustibleGas = hayCombustible;
	}

	@Override
	public void acelerar() {
		
		System.out.println("Acelerando desde AutoCarreras...");
		if (hayCombustibleGas == true) {
			inyectarGas();
		}else {
			System.out.println("No hay gas");
			super.acelerar();
		}
		
	}
	
	public void inyectarGas() {
		System.out.println("Inyectando gas....");
	}

	public boolean isHayCombustibleGas() {
		return hayCombustibleGas;
	}

	public void setHayCombustibleGas(boolean hayCombustibleGas) {
		this.hayCombustibleGas = hayCombustibleGas;
	}
	
	

}
