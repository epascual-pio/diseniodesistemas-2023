package ds.ejemplos.solid.o;

public class Auto {

	private int tipo;
	private String marca;
	private String modelo;
	private String color;
	
	
	public Auto(int tipo, String marca, String modelo, String color) {
		super();
		this.tipo = tipo;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}
	
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	public void acelerar() {
		System.out.println("Acelerar desde Auto....");
	}
	
	public void frenar() {
		System.out.println("Acelerar desde Auto....");
	}
	
}
