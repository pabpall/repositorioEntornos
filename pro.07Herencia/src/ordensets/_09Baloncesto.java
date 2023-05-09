package ordensets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class _09Baloncesto {
	public static void main(String[] args) {
		ArrayList<String> listaJugadoresFalta = new ArrayList<String>();
		 
		listaJugadoresFalta.add("pablo");
		listaJugadoresFalta.add("rober");
		listaJugadoresFalta.add("rober");
		listaJugadoresFalta.add("rober");
		listaJugadoresFalta.add("rober");
		listaJugadoresFalta.add("pablo");
		listaJugadoresFalta.add("pablo");
		listaJugadoresFalta.add("pablo");
		listaJugadoresFalta.add("pablo");
		listaJugadoresFalta.add("rober");
		listaJugadoresFalta.add("rober");
		listaJugadoresFalta.add("fran");
		listaJugadoresFalta.add("fran");
		listaJugadoresFalta.add("fran");
		listaJugadoresFalta.add("fran");
		listaJugadoresFalta.add("fran");

		Map<String, Integer> mapaFaltas = new HashMap<String, Integer>();
		
		for (String jugador : listaJugadoresFalta) {
			if (mapaFaltas.containsKey(jugador)) {
				mapaFaltas.put(jugador, mapaFaltas.get(jugador)+1);
			} else {
				mapaFaltas.put(jugador, 1);
			}
			if (mapaFaltas.get(jugador)==5) {
				System.out.println(jugador);
			}
		}

	}
}
