package ds.ejemplos.std.app;

import java.util.Scanner;

import ds.ejemplos.std.interfaces.UIUsuarioLogin;
import ds.ejemplos.std.interfaces.UIUsuarios;
import ds.ejempos.std.controladores.ControladorUsuarios;

public class Aplicacion {
	
	public static void init() {
	
		//Inicializamos los controladores e invocamos los metodos de precarga...
		ControladorUsuarios cu = new ControladorUsuarios();
		cu.preCargaUsuarios();
		
		//Punto de Entrada a la aplicación: UIusuarioLogin
		UIUsuarioLogin uiLogin = new UIUsuarioLogin(cu);
		
		
	}

}
