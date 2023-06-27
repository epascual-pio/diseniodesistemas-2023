package ds.patrones.builder.ejemplo1;

public abstract class ConstructorAuto {

	Auto auto;
	
	public void crearAuto() {
		auto = new Auto();
	}
	
	public Auto getAuto() {
		return auto;
	}

	public void setAuto(Auto auto) {
		this.auto = auto;
	}

	public abstract void construirAuto();
	public abstract void construirMotor();
	public abstract void construirCarroceria();
	public abstract void construirAireAcondicionado();
	public abstract void construirDireccionAsistida();
	
}
