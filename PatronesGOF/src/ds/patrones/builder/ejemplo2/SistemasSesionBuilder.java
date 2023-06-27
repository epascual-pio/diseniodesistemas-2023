package ds.patrones.builder.ejemplo2;

public class SistemasSesionBuilder extends SesionBuilder {

	@Override
	public void crearSesionContable() {
		this.sesion.setSistemaContable(true);
		System.out.println("Se inicia sesion en sistema contable");
	}

	@Override
	public void crearSesionTango() {
		this.sesion.setSistemaTango(true);
		System.out.println("Se inicia sesion en sistema tango");
		
	}

	@Override
	public void crearSesionProductos() {
		this.sesion.setSistemaProductos(true);
		System.out.println("Se inicia sesion en sistema productos");
		
	}

	@Override
	public void crearSesionAdministracion() {
		this.sesion.setSistemaAdministracion(true);
		System.out.println("Se inicia sesion en sistema administracion");
		
	}


}
