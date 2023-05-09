package _03Ejercicios._04genericidad;

import java.util.ArrayList;

public class EquipoFutbol {
	private String nombre;
	private ArrayList<JugadorFutbol> plantilla;
	
	public EquipoFutbol(String nombre) {
		this.nombre = nombre;
		this.plantilla = new ArrayList<>();
	}
	
	public void fichar(JugadorFutbol j) {
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
