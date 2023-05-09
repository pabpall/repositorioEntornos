package ordensets;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _06Maps {
	
	static Scanner tec= new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//En un juego los jugadores tienen 5 puntos,.
		//cada vez que un jugador pierde la partida se le resta uno
		//el primero que llega a 0 pierde el juego
		
		
		Map<String, Integer> puntuaciones = new LinkedHashMap<>();
		puntuaciones.put("Pablo", 5);
		puntuaciones.put("Rober", 5);
		puntuaciones.put("Alvaro", 5);

		//put:
		//Si la clave no existe, inserta la pareja y devuelve null
				
		boolean juegoEnCurso = true;
		String perdedor = "";
		
		while (juegoEnCurso) {
			System.out.println("\n"+puntuaciones);
			
			System.out.println("Quien ha perdido?");
			perdedor = tec.next();
			try {
				puntuaciones.put(perdedor, (puntuaciones.get(perdedor)-1) );
				
				if (puntuaciones.get(perdedor) == 0) {
					juegoEnCurso = false;
					System.out.println("\nTermina el juego. \nPuntuacion: "+puntuaciones);
				}
			} catch (NullPointerException e) {
				System.out.println("El nombre no existe");
			}
		}
		
		
		String mayorString="";
		int mayorPuntos=0;
		for(Map.Entry<String, Integer> entry : puntuaciones.entrySet()) {
		    if (entry.getValue()>mayorPuntos) {
				mayorString=entry.getKey();
				mayorPuntos=entry.getValue();
			}
		}

		
		System.out.println("Ganador: "+	mayorString+"\nPuntos: "+mayorPuntos);
		
	}
}
