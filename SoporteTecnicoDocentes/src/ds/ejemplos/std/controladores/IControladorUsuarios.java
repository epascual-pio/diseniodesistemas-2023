package ds.ejemplos.std.controladores;

import java.util.ArrayList;

import ds.ejemplos.std.entidades.*;

public interface IControladorUsuarios {
	
	public boolean login(String usuario, String clave );
	public ArrayList<Usuario> verUsuarios();
	public boolean agregarUsuario(Usuario u);
	public boolean eliminarUsuario(Integer codigo);
	public boolean modificarUsuario(Usuario u);
	public Usuario verUsuario(Integer codigo);
	

}
