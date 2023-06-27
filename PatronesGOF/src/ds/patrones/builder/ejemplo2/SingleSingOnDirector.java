package ds.patrones.builder.ejemplo2;

public class SingleSingOnDirector {

	public void iniciarSesion(SesionBuilder builder, Usuario u) {
		builder.crearSesion(u);
		builder.crearSesionContable();
		builder.crearSesionProductos();
		builder.crearSesionTango();
		builder.crearSesionAdministracion();
	}
}
