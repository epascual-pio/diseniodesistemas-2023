package ds.patrones.builder.ejemplo2;

public class VentasSesionBuilder extends SesionBuilder {
	
	@Override
	public void crearSesionContable() {
		this.sesion.setSistemaContable(false);
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
		this.sesion.setSistemaAdministracion(false);
		
	}

	
}
