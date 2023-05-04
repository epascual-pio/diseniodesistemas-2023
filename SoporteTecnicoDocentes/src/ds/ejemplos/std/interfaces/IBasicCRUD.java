package ds.ejemplos.std.interfaces;

public interface IBasicCRUD {

	public void listar();
	public boolean agregar();
	public boolean eliminar();
	public boolean modificar();
	public Object ver(Integer id);
	
}
