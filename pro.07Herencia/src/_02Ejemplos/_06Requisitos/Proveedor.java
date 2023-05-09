package _02Ejemplos._06Requisitos;

public class Proveedor {
	private String dni;
	private String nombre;

	public Proveedor(String dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String toString() {
		return dni + " " + nombre;
	}
}
