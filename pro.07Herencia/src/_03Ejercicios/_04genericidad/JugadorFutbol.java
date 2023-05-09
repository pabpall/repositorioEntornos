package _03Ejercicios._04genericidad;

public class JugadorFutbol {
	private String nombre;
	private String dorsal;
	private int estatura;
	
	public JugadorFutbol(String nombre, String dorsal, int estatura) {
		this.nombre=nombre;
		this.dorsal = dorsal;
		this.estatura = estatura;
	}
	@Override
	public String toString() {
		return "JugadorFutbol [nombre=" + nombre + ", dorsal=" + dorsal + ", estatura=" + estatura + "]";
	}
	
	
}
