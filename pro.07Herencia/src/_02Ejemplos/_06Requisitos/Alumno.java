package _02Ejemplos._06Requisitos;

public class Alumno {
	private String dni;
	private String nombre;

	public Alumno(String dni, String nombre) {
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
