package ds.patrones.builder.ejemplo2;

public abstract class SesionBuilder {

	protected Sesion sesion;
		
	public Sesion getSesion() {
		return sesion;
	}

	public void setSesion(Sesion sesion) {
		this.sesion = sesion;
	}
	public void crearSesion(Usuario u) {
		System.out.println("Iniciando sesion en el sistema central");
		this.sesion = new Sesion(u);
	}
	
	public abstract void crearSesionContable();
	public abstract void crearSesionTango();
	public abstract void crearSesionProductos();
	public abstract void crearSesionAdministracion();

	
}
