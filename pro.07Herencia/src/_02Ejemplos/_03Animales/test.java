package _02Ejemplos._03Animales;

import java.util.ArrayList;

public class test {
	public static void main(String[] args) {
		ArrayList<Animal> animales = new ArrayList<>();
		animales.add(new Gato());
		animales.add(new Tigre());
		animales.add(new Gato());
		
		for (Animal animal : animales) {
			animal.saludar();
		}
	}
}
