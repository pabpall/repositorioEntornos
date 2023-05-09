package _02Ejemplos._01alumnos;

public class Alumno extends Persona {
	private int nia;
	private String grupo;

	public Alumno(String dni, String nombre, int nia) {
		super(dni, nombre);
		this.nia = nia;
	}
	
	@Override
	public String toString() {
		return super.toString()+" y NIA: "+nia;
	}
	
	
}
