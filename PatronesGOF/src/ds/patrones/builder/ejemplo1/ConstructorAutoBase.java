package ds.patrones.builder.ejemplo1;

public class ConstructorAutoBase extends ConstructorAuto {

	
	@Override
	public void construirAuto() {
		this.auto.setNombre("Auto Base");
		this.auto.setMarca("PIOIX");
	}

	@Override
	public void construirMotor() {
		this.auto.setMotor("Motor potencia 1.4");

	}

	@Override
	public void construirCarroceria() {
		this.auto.setCarroceria("Carroceria Auto Base");
	}

	@Override
	public void construirAireAcondicionado() {
		this.auto.setAireAcondicionado(false);
	}

	@Override
	public void construirDireccionAsistida() {
		this.auto.setDireccionAsistida(false);
	}

}
