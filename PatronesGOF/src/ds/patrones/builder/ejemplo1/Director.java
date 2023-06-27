package ds.patrones.builder.ejemplo1;

public class Director {

	public void construirAuto(ConstructorAuto ca) {
		ca.crearAuto();
		ca.construirAuto();
		ca.construirMotor();
		ca.construirCarroceria();
		ca.construirAireAcondicionado();
		ca.construirDireccionAsistida();
		
	}
}
