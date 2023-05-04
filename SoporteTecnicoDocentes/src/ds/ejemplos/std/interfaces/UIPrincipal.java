package ds.ejemplos.std.interfaces;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import ds.ejemplos.std.app.Aplicacion;
import ds.ejemplos.std.controladores.ControladorUsuarios;

/* En esta pantalla muestra los botones para acceder a las 
 * funcionalidades del sistema, por el momento son:
 * Usuarios
 * Reservas
 */
public class UIPrincipal extends JFrame implements ActionListener {
	
	public UIPrincipal() {
		JPanel panel = new JPanel();
		
		setSize(300, 300); //width, height
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //boton de close
		setLocationRelativeTo(null); //ubicacion en mitad de la pantalla
		add(panel);

		panel.setLayout(null);
		
		setTitle("Soporte Tecnico Docente - Home");
		
		
		JButton btnLogin = new JButton("Usuarios");
		btnLogin.addActionListener(this);
		btnLogin.setBounds(30,30,100,100);

		JButton btnReserva = new JButton("Reservas");
		btnReserva.addActionListener(this);
		btnReserva.setBounds(150,30,100,100);

		JButton btnExit = new JButton("Salir");
		btnExit.addActionListener(this);
		btnExit.setBounds(90,140,100,100);
		
		//agregamos los componentes
		panel.add(btnLogin);		
		panel.add(btnReserva);		
		panel.add(btnExit);	
		
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Event:"+ e.getActionCommand());
		switch (e.getActionCommand()){
		
			case "Usuarios": //invocamos al controller para el login
				System.out.println("Call Usuarios...");
				new UIUsuarios();
				break;
				
			case "Salir": //cerramos la ventana
				System.out.println("Saliendo...");
				this.dispose();
				break;
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		
		new UIPrincipal();

	}	

}
