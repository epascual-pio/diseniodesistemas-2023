package ds.patrones.builder.ejemplo2;

public class Usuario {
	
	private String usuario;
	private String clave;
	private int tipo; //1. Contable 2.Ventas 3.Sistemas
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Usuario [usuario=" + usuario + ", clave=" + clave + ", tipo=" + tipo + "]";
	}
	
	

}
