package _02Ejemplos._01alumnos;

import java.util.Objects;

public class Persona {
	private String dni;
	private String nombre;
	
	public Persona(String dni,String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return nombre+" con DNI: "+dni;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null)
			return false;
		if (getClass() != o.getClass())
			return false;
		Persona other = (Persona) o;
		return Objects.equals(dni, other.dni);
	}
	
	
}
