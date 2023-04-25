package ds.fundamentos.basico;

public class Coche {
	
	private int codigo;
	private String modelo;
	//Relacion con el tipo Marca
	private Marca marca;
	
	
	public Coche(int codigo, String modelo, Marca marca) {
		super();
		this.codigo = codigo;
		this.modelo = modelo;
		this.marca = marca;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	@Override
	public String toString() {
		return "Coche [codigo=" + codigo + ", modelo=" + modelo + ", marca=" + marca + "]";
	}
	
}
