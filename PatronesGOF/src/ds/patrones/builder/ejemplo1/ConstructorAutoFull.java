package ds.patrones.builder.ejemplo1;

public class ConstructorAutoFull extends ConstructorAuto {

	
	@Override
	public void construirAuto() {
		this.auto.setNombre("Auto Full");
		this.auto.setMarca("PIOIX");
	}

	@Override
	public void construirMotor() {
		this.auto.setMotor("Motor potencia 2.0");

	}

	@Override
	public void construirCarroceria() {
		this.auto.setCarroceria("Carroceria Auto FULL");
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
