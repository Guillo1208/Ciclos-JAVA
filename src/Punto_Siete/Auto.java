package Punto_Siete;

public class Auto {
	private String nombre;
	private int telefono;
	private String placa;
	private String marca;
	
	
	
	public Auto(String nombre, int telefono, String placa, String marca) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.placa = placa;
		this.marca = marca;
	}
	
	public Auto(String placa) {
		this.nombre = "";
		this.telefono = 0;
		this.placa = placa;
		this.marca = "";
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

}
