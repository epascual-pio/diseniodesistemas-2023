package ds.ejemplos.basicos;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main extends JFrame implements ActionListener{

	JTextField txtLogin;
	JTextField txtClave;
	
	public Main() {
		
		setSize(400,400);
		setTitle("Demo");
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		add(panel);
		
		
		JLabel mensaje = new JLabel("Bienvenidos a Diseño de Sistemas!!!!");
		mensaje.setBounds(25, 25, 250, 25);
		
		JLabel labelLogin = new JLabel("Login:");
		labelLogin.setBounds(100, 120, 80, 25);
		
		JLabel labelClave = new JLabel("Clave:");
		labelClave.setBounds(100, 160, 80, 25);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(200, 120, 80, 25);
		txtLogin.addActionListener(this);
		
		txtClave = new JTextField();
		txtClave.setBounds(200, 160, 80, 25);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.setBounds(100, 200, 100, 25);
		btnIngresar.addActionListener(this);

		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(220, 200, 100, 25);
		btnSalir.addActionListener(this);
		

		panel.add(mensaje);
		panel.add(labelLogin);
		panel.add(labelClave);
		panel.add(txtLogin);
		panel.add(txtClave);
		panel.add(btnIngresar);
		panel.add(btnSalir);
		
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Main();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String evento = e.getActionCommand();
		
		String login = txtLogin.getText();
		String clave = txtClave.getText();
		
		if (e.getActionCommand().equals("Ingresar")){
			if (login.equals("eli") && clave.equals("eli")) {
				System.out.println("Login OK");
			}else {
				System.out.println("Login Error");
				JOptionPane.showMessageDialog(this, "Login Error");
				txtLogin.setText("");
				txtClave.setText("");
			}
		}
		if (e.getActionCommand().equals("Salir")){
			dispose();
		}
	}

}
