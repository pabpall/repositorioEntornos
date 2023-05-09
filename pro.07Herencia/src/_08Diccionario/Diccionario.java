package _08Diccionario;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Diccionario {
	public static void main(String[] args) {
		Map<String, Set<String>> diccionario = new TreeMap<>();

		anyadirTraduccion(diccionario, "Casa", "Home");
		anyadirTraduccion(diccionario, "Casa", "Home");
		anyadirTraduccion(diccionario, "Casa", "House");
		anyadirTraduccion(diccionario, "Casa", "HouseHome");

		anyadirTraduccion(diccionario, "Gato", "Cat");
		anyadirTraduccion(diccionario, "Perro", "dog");
		anyadirTraduccion(diccionario, "Gato", "Cat");

		System.out.println(diccionario);
	}

	public static boolean anyadirTraduccion(Map<String, Set<String>> dic, String cast, String val) {

		if (dic.containsKey(cast)) {
			return dic.get(cast).add(val);
		} else {
			Set<String> set = new HashSet<String>();
			set.add(val);

			dic.put(cast, set);
			return true;
		}
	}

	public static boolean quitarTraduccion(Map<String, Set<String>> dic, String cast, String val) {

		Set<String> set = dic.get(cast);
		if (set == null) {
			return false;
		} else {
			boolean eliminado = set.remove(cast);
		}

		dic.put(cast, set);
		return true;

	}

}
//teorico: herencia polimorfismo y genericidad
//practico: herencia polimorfismo genericidad colecciones y ficheros 