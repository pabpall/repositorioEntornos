package _03Ejercicios._04genericidad;

import java.util.ArrayList;

public class EquipoGenerico {
	private String nombre;
	private ArrayList<Object> plantilla;
	
	public EquipoGenerico(String nombre) {
		this.nombre = nombre;
		this.plantilla = new ArrayList<>();
	}
	
	public void fichar(Object j) {
		if (plantilla.contains(j)) {
			throw new IllegalArgumentException("Jugador ya esta en la plantilla");
		} else {
			this.plantilla.add(j);
		}
	}

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", plantilla=" + plantilla + "]";
	}
	
	
	
}
