package ordensets;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _07TraductorSimple {
	public static void main(String[] args) {
		/*
		 * Crear un map String String
		 * 
		 * abrir el fichero palabras.txt y leer las parejas de palabras guardar en un
		 * map
		 */
		Map<String, String> diccionario = new HashMap<String, String>();
		
		try {
			File archivo = new File("src/parejas.txt");
			Scanner scanner = new Scanner(archivo);

			while (scanner.hasNextLine()) {
				String llave = scanner.next().trim();
				String valor = scanner.nextLine().trim();

				if (!diccionario.containsKey(llave)) {
					diccionario.put(llave, valor);
				}
			}
			scanner.close();
		
			System.out.println(diccionario);
			
			Scanner tec = new Scanner(System.in);
			String[] fraseEsp = tec.nextLine().toLowerCase().split(" "); 
			tec.close();
			
			for (String palabra : fraseEsp) {
				
				if (diccionario.containsKey(palabra)) {
					System.out.print(diccionario.get(palabra)+" "); 
				} else {
					System.out.print(palabra+" ");
				}
				
			}
		
		
		} catch (FileNotFoundException e) {
			System.out.println("El archivo no se ha encontrado.");
		}
		

	}
}
