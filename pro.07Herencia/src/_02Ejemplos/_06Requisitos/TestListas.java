package _02Ejemplos._06Requisitos;

import java.util.ArrayList;
import java.util.Arrays;

public class TestListas {
	public static void main(String[] args) {
		ArrayList<Alumno> alumnos = new ArrayList<>(Arrays.asList(
				new Alumno("1","a"),
				new Alumno("2","b"),
				new Alumno("3","c")
				));
	}
}
