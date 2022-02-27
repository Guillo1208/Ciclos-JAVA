package Punto_Ocho;

public class Alumno {
	private String nombre;
	private int id;
	private String resultado;
	
	
	
	public Alumno(String nombre, int id, String resultado) {
		this.nombre = nombre;
		this.id = id;
		this.resultado = resultado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getResultado() {
		return resultado;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	
	

}
