package _03Ejercicios._04genericidad;

public class JugadorBasket {
	private String nombre;
	private String dorsal;
	private int goles;
	public JugadorBasket(String nombre, String dorsal, int goles) {
		this.nombre=nombre;
		this.dorsal = dorsal;
		this.goles = goles;
	}
	@Override
	public String toString() {
		return "JugadorFutbol [nombre=" + nombre + ", dorsal=" + dorsal + ", goles=" + goles + "]";
	}
	
	
}
