package _03Ejercicios._04genericidad;

import java.util.ArrayList;

public class EquipoBasket {
	private String nombre;
	private ArrayList<JugadorBasket> plantilla;
	
	public EquipoBasket(String nombre) {
		this.nombre = nombre;
		this.plantilla = new ArrayList<>();
	}
	
	public void fichar(JugadorBasket j) {
		if (plantilla.contains(j)) {
			throw new IllegalArgumentException("Jugador ya esta en la plantilla");
		} else {
			this.plantilla.add(j);
		}
	}

	@Override
	public String toString() {
		return "EquipoFutbol [nombre=" + nombre + ", plantilla=" + plantilla + "]";
	}
	
	
	
}
