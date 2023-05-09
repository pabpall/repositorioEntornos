package _03Ejercicios._04genericidad;

public class Test {
	public static void main(String[] args) {
		EquipoFutbol e1 = new EquipoFutbol("Equipo1");
		JugadorFutbol pablo = new JugadorFutbol("Pablo","19",12);
		e1.fichar(pablo);
		System.out.println(e1);
		
		//equipo
		Equipo<JugadorFutbol> e5=  new Equipo<>("Equipo genericidad");
	}
}
