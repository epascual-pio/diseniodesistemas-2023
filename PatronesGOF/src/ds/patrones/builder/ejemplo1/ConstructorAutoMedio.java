package ds.patrones.builder.ejemplo1;

public class ConstructorAutoMedio extends ConstructorAuto {

	
	@Override
	public void construirAuto() {
		this.auto.setNombre("Auto Gama Media");
		this.auto.setMarca("PIOIX");
	}

	@Override
	public void construirMotor() {
		this.auto.setMotor("Motor potencia 1.6");

	}

	@Override
	public void construirCarroceria() {
		this.auto.setCarroceria("Carroceria Auto Gama Media");
	}

	@Override
	public void construirAireAcondicionado() {
		this.auto.setAireAcondicionado(true);
	}

	@Override
	public void construirDireccionAsistida() {
		this.auto.setDireccionAsistida(true);
	}

}
