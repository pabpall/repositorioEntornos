package ordensets;

import java.util.ArrayList;
import java.util.Random;

public class _10ParoImpar {
	public static void main(String[] args) {
		Random r = new Random(1);
		ArrayList<Integer> l = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			l.add(r.nextInt(200));
		}
		System.out.println(l);
		
		//mostrar por pantalla los elementos pares usando el foreach de la clase arraylist
		l.forEach((n) -> {
			if (n%2==0) {
				System.out.println(n);
			}
		});
	}
}
