package _03Ejercicios._02Genericos;

public class Genericos {
	public static void main(String[] args) {
		String[] v1 = {"a","b","c","a","a"};
		System.out.println(num);
		
		String[] v2 = {1,2,3,1,1,1};


	}

	
	public static <T> int numVeces(T v[], T x) {
		int cont = 0;
		for (int i = 0; i < v.length; i++) {
			if (v[i].equals(x)) {
				cont++;
			}
		}
		return cont;
	}

}
