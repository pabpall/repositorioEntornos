package _02Ejemplos._07ordenacion;

import java.util.ArrayList;
import java.util.Collections;

public class Ordenacion1PorDefecto {
	//Vamos a ordenadr una colleccion de vehiculos ocn la ordenacion por defecto.
	//La ordenacion por defecto es la que marca el metodo compareto del objeto
	//que estamos ordenando (en este caso el compareto de vehiculo)
	
	public static void main(String[] args) {
		ArrayList<Vehiculo> lista = new ArrayList<>();
		lista.add(new Vehiculo("1256BCC","FORD","FIESTA",1200));
		lista.add(new Vehiculo("1256GCC","FORD","FIESTA",1200));
		lista.add(new Vehiculo("1256FCC","FORD","FIESTA",1200));
		lista.add(new Vehiculo("1256ACC","FORD","FIESTA",1200));
		lista.add(new Vehiculo("1256ASC","FORD","FIESTA",1200));
		
		Collections.sort(lista);
		
		for (Vehiculo vehiculo : lista) {
			System.out.println(vehiculo);
		}
	}
}
