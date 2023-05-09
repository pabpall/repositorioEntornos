package _02Ejemplos._07ordenacion;

import java.util.Comparator;

public class ComparadorPorCilindradaMayor implements Comparator<Vehiculo> {

	@Override
	public int compare(Vehiculo o1, Vehiculo o2) {
		if (o1.getCilindrada() > o2.getCilindrada()) {
			return -1;
		} else if (o1.getCilindrada() < o2.getCilindrada()) {
			return 1;
		} else
			return 0;
	}

}
