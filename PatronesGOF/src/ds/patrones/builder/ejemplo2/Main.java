package ds.patrones.builder.ejemplo2;

public class Main {

	public static void main(String[] args) {
		
		Usuario u = new Usuario();
		u.setUsuario("eli");
		u.setClave("1234");
		u.setTipo(3);
		
		//Creamos el director
		SingleSingOnDirector director = new SingleSingOnDirector();
		SesionBuilder sesionBuilder = null;
		
		//Creamos el constructor de acuerdo al tipo de usuario
		if (u.getTipo()== 1) {
			sesionBuilder = new ContabilidadSesionBuilder();
		}else if(u.getTipo()== 2) {
			sesionBuilder = new VentasSesionBuilder();
		}else if(u.getTipo()== 3) {
			sesionBuilder = new SistemasSesionBuilder();
		}
		
		director.iniciarSesion(sesionBuilder, u);
		
		Sesion sesion = sesionBuilder.getSesion();
				
		System.out.print(sesion.toString());
		
		

	}

}
