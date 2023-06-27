package ds.patrones.builder.ejemplo2;

public class ContabilidadSesionBuilder extends SesionBuilder {

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
		this.sesion.setSistemaProductos(false);
		
	}

	@Override
	public void crearSesionAdministracion() {
		this.sesion.setSistemaAdministracion(false);
	}

	


	
}
