package _02Ejemplos._05InterfaceGenerico;

public class Test {
	public static void main(String[] args) {
		Alumno a1 = new Alumno("1", "Pablo");
		Alumno a2=new Alumno("2", "Bober");
		
		System.out.println(a1.compareTo(a2));
		
		Profesor p1 = new Profesor("20", "Javier");
		Profesor p2 = new Profesor("17", "Esther");
		
		System.out.println(p1.compareTo(p2));
	}
}
