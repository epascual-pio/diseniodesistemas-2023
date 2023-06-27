package ds.patrones.builder.ejemplo2;

/* Un objeto del tipo sesion estará identificado con
 * un valor unico (id), un usuario, y los sistemas en los cuales
 * tiene permiso 
 */
public class Sesion {

		private final int id = 1;
		int idSession;
		Usuario usuario;
		Boolean sistemaContable;
		Boolean sistemaTango;
		Boolean sistemaAdministracion;
		Boolean sistemaProductos;
		
		
		public Sesion() {
			super();
		}
		public Sesion(Usuario usuario) {
			super();
			this.usuario = usuario;
			this.idSession = idSession + id;
		}
		
		public Sesion(Usuario usuario, int idSession) {
			super();
			this.usuario = usuario;
			this.idSession = idSession + id;
		}
		
		public Usuario getUsuario() {
			return usuario;
		}
		public void setUsuario(Usuario usuario) {
			this.usuario = usuario;
		}
		public int getIdSession() {
			return idSession ;
		}
		public void setIdSession(int idSession) {
			this.idSession = idSession;
		}
		public Boolean getSistemaContable() {
			return sistemaContable;
		}
		public void setSistemaContable(Boolean sistemaContable) {
			this.sistemaContable = sistemaContable;
		}
		public Boolean getSistemaTango() {
			return sistemaTango;
		}
		public void setSistemaTango(Boolean sistemaTango) {
			this.sistemaTango = sistemaTango;
		}
		public Boolean getSistemaAdministracion() {
			return sistemaAdministracion;
		}
		public void setSistemaAdministracion(Boolean sistemaAdministracion) {
			this.sistemaAdministracion = sistemaAdministracion;
		}
		public int getId() {
			return id;
		}
		public Boolean getSistemaProductos() {
			return sistemaProductos;
		}
		public void setSistemaProductos(Boolean sistemaProductos) {
			this.sistemaProductos = sistemaProductos;
		}
		@Override
		public String toString() {
			return "Sesion [id=" + id + ", idSession=" + idSession + ", usuario=" + usuario + ", sistemaContable="
					+ sistemaContable + ", sistemaTango=" + sistemaTango + ", sistemaAdministracion=" + sistemaAdministracion + ", sistemaProductos=" + sistemaProductos
					+ "]";
		}
		
		
}
