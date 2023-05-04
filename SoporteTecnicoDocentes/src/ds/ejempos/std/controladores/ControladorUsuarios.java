package ds.ejempos.std.controladores;

import java.util.ArrayList;

import ds.ejemplos.std.entidades.Operador;
import ds.ejemplos.std.entidades.Usuario;

public class ControladorUsuarios implements IControladorUsuarios {

	private ArrayList<Usuario> usuarios;
	
	@Override
	public boolean login(String usuario, String clave) {
		for (Usuario u: this.usuarios) {
			System.out.println(usuario + "-" + clave+ "-" + u.getLogin()+ "-" + u.getClave());
			if (u.getLogin().equals(usuario) && u.getClave().equals(clave)){
				return true;
			}
		}
		return false;
	}

	@Override
	public ArrayList<Usuario> verUsuarios() {
		return this.usuarios;
	}

	@Override
	public boolean agregarUsuario(Usuario u) {
		this.usuarios.add(u);
		return true;
	}

	@Override
	public boolean eliminarUsuario(Integer codigo) {
		Usuario usuarioDel = null;
		
		for (Usuario u: this.usuarios) {
			if (u.getCodigo().equals(codigo)){
				usuarioDel = u;
			}
		}
		if (usuarioDel != null) {
			this.usuarios.remove(usuarioDel);
			return true;
		}
		
		return false;
	}

	@Override
	public boolean modificarUsuario(Usuario userMod) {
		
		for (Usuario u: this.usuarios) {
			if (u.getCodigo().equals(userMod.getCodigo())){
				int i = this.usuarios.indexOf(u);
				this.usuarios.set(i, userMod);
			}
		}
		
		return false;
	}

	@Override
	public Usuario verUsuario(Integer codigo) {
		
		for (Usuario u: this.usuarios) {
			if (u.getCodigo().equals(codigo)){
				return u;
			}
		}
		
		return null;
	}

	public Integer nextId() {
		Usuario last = this.usuarios.get(this.usuarios.size() - 1);
		Integer next = last.getCodigo()+1;
		return next;
	}

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	public void preCargaUsuarios() {
		this.usuarios = new ArrayList<Usuario>();
		
		//Carga en memoria un lista de usuarios por defecto
		Operador u1 = new Operador(1,"jose", "jose","","Jose", "Perez");
		u1.setTipo(2);
		Operador u2 = new Operador(2,"pepe", "pepe","","Pepe", "Rodriguez");
		u2.setTipo(2);
		Operador u3 = new Operador(3,"maria", "maria","","Maria", "Betular");
		u3.setTipo(2);
		this.usuarios.add(u1);
		this.usuarios.add(u2);
		this.usuarios.add(u3);
		
	}	
}
