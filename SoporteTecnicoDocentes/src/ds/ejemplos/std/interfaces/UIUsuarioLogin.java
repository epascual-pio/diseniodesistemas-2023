package ds.ejemplos.std.interfaces;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import ds.ejempos.std.controladores.ControladorUsuarios;

public class UIUsuarioLogin extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;

	ControladorUsuarios controladorUsuarios ;
	
	private JTextField txtUsuario;
	private JPasswordField txtClave;
	private JLabel lMensaje;
	
	public UIUsuarioLogin(ControladorUsuarios cu) {
		this.controladorUsuarios = cu;
		
		JPanel panel = new JPanel();
		
		setSize(300, 200); //width, height
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //boton de close
		setLocationRelativeTo(null); //ubicacion en mitad de la pantalla
		add(panel);

		panel.setLayout(null);
		
		setTitle("Soporte Tecnico Docente - Login");
		
		
		//Componentes de la ventana
		JLabel lUsuario = new JLabel("Usuario:");
		lUsuario.setBounds(10,20,80,25); //x,y,width,height
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(100,20,150,25);
		
		JLabel lClave = new JLabel("Clave:");
		lClave.setBounds(10,50,80,25);
		
		txtClave = new JPasswordField();
		txtClave.setBounds(100,50,150,25);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(this);
		btnLogin.setBounds(60,90,80,25);

		JButton btnClose = new JButton("Exit");
		btnClose.addActionListener(this);
		btnClose.setBounds(150,90,80,25);

		lMensaje = new JLabel("");
		lMensaje.setBounds(50,120,200,25);  
		lMensaje.setForeground(Color.red);
	
		
		//Creamos un panel y agregamos los componentes
		
		panel.add(lUsuario);
		panel.add(txtUsuario);
		panel.add(lClave);
		panel.add(txtClave);
		panel.add(lMensaje);
		
		panel.add(btnLogin);
		panel.add(btnClose);
		
		setVisible(true);
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {

		System.out.println("Event:"+ e.getActionCommand());
		switch (e.getActionCommand()){
		
			case "Login": //invocamos al controller para el login
				System.out.println("Call ControladorUsuarios...");
				boolean loginOk = controladorUsuarios.login(txtUsuario.getText(), txtClave.getText());
				if (loginOk == true) {
					System.out.println("Login Correcto, pasamos al home...");
					this.dispose();
					new UIPrincipal();
				}else {
					System.out.println("Login Error, vuelve a intentar...");
					this.lMensaje.setText("El usuario o clave es incorrecto");
				}
				break;
				
			case "Exit": //cerramos la ventana
				this.dispose();
				break;
		}
		
	}		
	public static void main(String[] args) throws IOException {
		ControladorUsuarios cu = new ControladorUsuarios();
		cu.preCargaUsuarios();
		new UIUsuarioLogin(cu);

	}	

}
