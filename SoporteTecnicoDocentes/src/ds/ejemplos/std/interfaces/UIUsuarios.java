package ds.ejemplos.std.interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import ds.ejemplos.std.entidades.Docente;
import ds.ejemplos.std.entidades.Materia;
import ds.ejemplos.std.entidades.Operador;
import ds.ejemplos.std.entidades.Usuario;
import ds.ejempos.std.controladores.ControladorUsuarios;

/* Objetivo:
 * Clase tiene como objetivo presentar al usuario
 * las operaciones basicas de consulta, agregar, modificar o eliminar
 * del tipo de dato Usuario
 * */

public class UIUsuarios extends JFrame implements IBasicCRUD, ActionListener{

	ControladorUsuarios cu ;
	
	JScrollPane jScrollPane;
	JTable table;

	//Componentes
	JTextField txtCodigo;
	JTextField txtLogin;
	JPasswordField txtClave;
	JTextField txtNombre;
	JTextField txtApellido;
	JTextField txtTipo;
	JTextField txtHorario;
	JTextField txtMateria;
	JTextField txtTitulo;
	
	public UIUsuarios() {
		
		//Creamos el controlador de usuarios
		this.cu = new ControladorUsuarios();
		//Obtenemos los usuarios guardados
		cu.preCargaUsuarios();				
		
		iniciarComponentes();
		
	}
	public void iniciarComponentes() {
		//Definimos las propiedades de la ventana
		setSize(500, 400); //width, height
		setLocationRelativeTo(null); //ubicacion en mitad de la pantalla
		setTitle("Soporte Tecnico Docente - Usuarios");
		
		JPanel jPrincipal = new JPanel(); 
		jPrincipal.setPreferredSize(new java.awt.Dimension(450, 180));
		jPrincipal.setLayout(new java.awt.BorderLayout());
        

		//Panel de Campos para agregar o editar
		JPanel pCampos = new JPanel();
		pCampos.setLayout(new java.awt.GridLayout(5,2,10,5));
		pCampos.setPreferredSize(new java.awt.Dimension(450, 120));
		pCampos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de Usuario"));

		JLabel lCodigo = new JLabel("Codigo:");
		txtCodigo = new JTextField();
		txtCodigo.setEnabled(false);
		
		JLabel lLogin = new JLabel("Login:");
		txtLogin = new JTextField();

		JLabel lClave = new JLabel("Clave:");
		txtClave = new JPasswordField();

		JLabel lNombre = new JLabel("Nombre:");
		txtNombre = new JTextField();

		JLabel lApellido = new JLabel("Apellido:");
		txtApellido = new JTextField();

		JLabel lTipo = new JLabel("Tipo:");
		txtTipo = new JTextField();
		
		JLabel lHorario = new JLabel("Horario:");
		txtHorario = new JTextField();

		JLabel lMateria = new JLabel("Materia:");
		txtMateria = new JTextField();

		JLabel lTitulo = new JLabel("Titulo:");
		txtTitulo = new JTextField();

		pCampos.add(lCodigo);
		pCampos.add(txtCodigo);
		pCampos.add(lLogin);
		pCampos.add(txtLogin);
		pCampos.add(lClave);
		pCampos.add(txtClave);
		pCampos.add(lNombre);
		pCampos.add(txtNombre);
		pCampos.add(lApellido);
		pCampos.add(txtApellido);
		pCampos.add(lTipo);
		pCampos.add(txtTipo);
		pCampos.add(lMateria);
		pCampos.add(txtMateria);
		pCampos.add(lTitulo);
		pCampos.add(txtTitulo);
		pCampos.add(lHorario);
		pCampos.add(txtHorario);
		
		jPrincipal.add(pCampos, java.awt.BorderLayout.PAGE_START);

		//Panel de Botones
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(this);
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(this);
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(this);
		JButton btnVer = new JButton("Ver");
		btnVer.addActionListener(this);
		JButton btnExit = new JButton("Salir");
		btnExit.addActionListener(this);

		
		JPanel pBotones = new JPanel();
		pBotones.setPreferredSize(new java.awt.Dimension(450, 60));
		pBotones.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
		pBotones.add(btnAgregar);
		pBotones.add(btnModificar);
		pBotones.add(btnLimpiar);
		pBotones.add(btnVer);
		pBotones.add(btnExit);
		
		jPrincipal.add(pBotones,java.awt.BorderLayout.PAGE_END);


		getContentPane().add(jPrincipal, java.awt.BorderLayout.PAGE_START);

		//Panel con la Grilla de Usuarios
		JPanel pTablaUsuarios = new JPanel();
		pTablaUsuarios.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro de Usuarios"));
		
		jScrollPane = new JScrollPane();
		jScrollPane.setSize(400,150);
		
		table = new JTable();
		table.setSize(380,150);

		table.setModel(new javax.swing.table.DefaultTableModel(
		            new Object [][] {
		            },
		            new String [] {
		            	"Codigo","Login", "Nombre", "Apellido"
		            }
		        ));
		
		jScrollPane.setViewportView(table);
		pTablaUsuarios.add(jScrollPane);
		listar();

		getContentPane().add(pTablaUsuarios, java.awt.BorderLayout.CENTER);
		pack();
		setVisible(true);
		
	}
	
	@Override
	public void listar() {
		DefaultTableModel modelo = (DefaultTableModel)table.getModel();
		Object rowData[] = new Object[4];
		
		modelo.setRowCount(0);
		
		//Obtenemos los usuarios cargados
		ArrayList<Usuario> usuarios = cu.getUsuarios();
		System.out.println(usuarios);
		
		for (int i = 0; i < usuarios.size(); i++) {
			rowData[0] = usuarios.get(i).getCodigo();
			rowData[1] = usuarios.get(i).getLogin();
			rowData[2] = usuarios.get(i).getNombre();
			rowData[3] = usuarios.get(i).getApellido();
			
			modelo.addRow(rowData);
		}
		modelo.fireTableDataChanged();
	}

	@Override
	public boolean agregar() {
		boolean resultado = false;
		Usuario usuario;
		
		String login = this.txtLogin.getText();
		String clave = this.txtClave.getText();

		System.out.println("Tipo de Usuario (1. Docente | 2.Operador): ");
		Integer tipo = Integer.parseInt(this.txtTipo.getText());
		String nombre = this.txtNombre.getText();
		String apellido = this.txtApellido.getText();
		
		Integer codigo = cu.nextId();
		
		if (tipo.equals(1)){
			String titulo = this.txtTitulo.getText();
			Materia materia = new Materia(this.txtMateria.getText());
			ArrayList<Materia> materias = new ArrayList<Materia>();
			materias.add(materia);
			usuario = new Docente(codigo,login,clave,nombre,apellido, materias, titulo);
			
		}else {
			String hora = this.txtHorario.getText();
			usuario = new Operador(codigo,login,clave, hora,nombre,apellido);
		}
		usuario.setTipo(tipo);

		resultado = cu.agregarUsuario(usuario);
		System.out.println(resultado);
		System.out.println(cu.getUsuarios());

		return resultado;
	}

	@Override
	public boolean eliminar() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modificar() {
		boolean resultado = false;
		Usuario usuario;
		
		//obtenemos los datos del usuario del formulario y lo seteamos al user
		Integer codigo = Integer.parseInt(txtCodigo.getText());
		String login = this.txtLogin.getText();
		String clave = this.txtClave.getText();
		Integer tipo = Integer.parseInt(this.txtTipo.getText());
		String nombre = this.txtNombre.getText();
		String apellido = this.txtApellido.getText();
		if (tipo.equals(1)){
			String titulo = this.txtTitulo.getText();
			Materia materia = new Materia(this.txtMateria.getText());
			ArrayList<Materia> materias = new ArrayList<Materia>();
			materias.add(materia);
			usuario = new Docente(codigo,login,clave,nombre,apellido, materias, titulo);
			
		}else {
			String hora = this.txtHorario.getText();
			usuario = new Operador(codigo,login,clave, hora,nombre,apellido);
		}
		usuario.setTipo(tipo);
		resultado = cu.modificarUsuario(usuario);

		return resultado;
	}

	@Override
	public Object ver(Integer row) {
		limpiarCampos();
		
		DefaultTableModel modelo = (DefaultTableModel)table.getModel();
		
		//obtenemos los datos del usuario
		Usuario u = cu.verUsuario((Integer)modelo.getValueAt(row, 0));
		
		//Seteamos el valor en los campos del formulario
		txtCodigo.setText(u.getCodigo().toString());
		txtLogin.setText(u.getLogin());
		txtClave.setText(u.getClave());
		txtNombre.setText(u.getNombre());
		txtApellido.setText(u.getApellido());
		if (u.getTipo()==1) {
			Docente docente = (Docente)u;
			txtTitulo.setText(docente.getTitulo());
			txtMateria.setText(docente.getMaterias().get(0).getNombre());
		}else {
			Operador ope = (Operador)u;
			txtHorario.setText(ope.getHorario());
		}
		txtTipo.setText(u.getTipo().toString());
		return u;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Event:"+ e.getActionCommand());
		switch (e.getActionCommand()){
		
			case "Agregar": 
				System.out.println("Agregar...");
				agregar();
				JOptionPane.showMessageDialog(jScrollPane, "Se agrego el usuario con exito");
				limpiarCampos();
				listar();
				break;
			case "Modificar": 
				System.out.println("Modificar...");
				modificar();
				JOptionPane.showMessageDialog(jScrollPane, "Se modificado el usuario con exito");
				listar();
				break;
			case "Limpiar": 
				System.out.println("Limpiar...");
				limpiarCampos();
				break;
			case "Ver": 
				System.out.println("Ver...");
				ver(table.getSelectedRow());
				break;
			case "Refresh": 
				System.out.println("Refresh...");
				break;
				
			case "Salir": //cerramos la ventana
				System.out.println("Saliendo...");
				this.dispose();
				break;
		}		
	}
	
	public void limpiarCampos() {
		txtCodigo.setText("");
		txtLogin.setText("");
		txtClave.setText("");
		txtNombre.setText("");
		txtApellido.setText("");
		txtTipo.setText("");
		txtMateria.setText("");
		txtTitulo.setText("");
		txtHorario.setText("");
	}
	
	public static void main(String[] args) throws IOException {

		new UIUsuarios();

	}		

}
