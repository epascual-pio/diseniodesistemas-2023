package ds.ejemplos.std.interfaces;

import java.util.ArrayList;

import ds.ejemplos.std.controladores.ControladorUsuarios;
import ds.ejemplos.std.entidades.Usuario;

	public class UIUsuariosListarBase {
	
	public static void main(String[] args) {
		
		ControladorUsuarios cu = new ControladorUsuarios();
		cu.preCargaUsuarios();
		
		ArrayList<Usuario> usuarios = cu.verUsuarios();
		
		for (Usuario u: usuarios) {
			System.out.println(u);
		}
		
		
		
	}
	

}
