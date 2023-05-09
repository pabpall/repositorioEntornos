package _02Ejemplos._07ordenacion;

import java.util.ArrayList;
import java.util.Collections;

public class Ordenacion2PorCilindrada {
	//Vamos a ordenadr una colleccion de vehiculos ocn la ordenacion por defecto.
	//La ordenacion por defecto es la que marca el metodo compareto del objeto
	//que estamos ordenando (en este caso el compareto de vehiculo)
	
	public static void main(String[] args) {
		ArrayList<Vehiculo> lista = new ArrayList<>();
		lista.add(new Vehiculo("1256BCC","FORD","FIESTA",1300));
		lista.add(new Vehiculo("1256GCC","FORD","FIESTA",200));
		lista.add(new Vehiculo("1256FCC","FORD","FIESTA",2200));
		lista.add(new Vehiculo("1256ACC","FORD","FIESTA",1400));
		lista.add(new Vehiculo("1256ASC","FORD","FIESTA",700));
		
		Collections.sort(lista, new ComparadorPorCilindrada());
		
		for (Vehiculo vehiculo : lista) {
			System.out.println(vehiculo);
		}
		
		//ordenando por cilindrada de mayor a menor
		Collections.sort(lista, new ComparadorPorCilindradaMayor());
	
		for (Vehiculo vehiculo : lista) {
			System.out.println(vehiculo);
		}
	
	}
}
