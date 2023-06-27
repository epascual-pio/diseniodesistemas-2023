package ds.patrones.builder.ejemplo1;

public class Auto {
	
	private String nombre;
	private String modelo;
	private String marca;
	private String motor;
	private String carroceria;
	private Boolean aireAcondicionado;
	private Boolean direccionAsistida;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	public String getCarroceria() {
		return carroceria;
	}
	public void setCarroceria(String carroceria) {
		this.carroceria = carroceria;
	}
	public Boolean getAireAcondicionado() {
		return aireAcondicionado;
	}
	public void setAireAcondicionado(Boolean aireAcondicionado) {
		this.aireAcondicionado = aireAcondicionado;
	}
	public Boolean getDireccionAsistida() {
		return direccionAsistida;
	}
	public void setDireccionAsistida(Boolean direccionAsistida) {
		this.direccionAsistida = direccionAsistida;
	}
	@Override
	public String toString() {
		return "Auto [nombre=" + nombre + ", modelo=" + modelo + ", marca=" + marca + ", motor=" + motor
				+ ", carroceria=" + carroceria + ", aireAcondicionado=" + aireAcondicionado + ", direccionAsistida="
				+ direccionAsistida + "]";
	}
	

}
