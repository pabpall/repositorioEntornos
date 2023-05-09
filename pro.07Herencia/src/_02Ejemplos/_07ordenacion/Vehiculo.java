package _02Ejemplos._07ordenacion;

public class Vehiculo implements Comparable<Vehiculo>{
	private String matricula;
	private String marca;
	private String modelo;
	private int cilindrada;

	public Vehiculo(String matricula, String marca, String modelo, int cilindrada) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.cilindrada = cilindrada;
	}

	@Override
	public boolean equals(Object obj) {
		return this == obj || obj instanceof Vehiculo && this.matricula.equals(((Vehiculo) obj).matricula);
	}

	@Override
	public String toString() {
		return matricula + " - " + marca + " - " + modelo + " - " + cilindrada;
	}
	
	public int compareTo(Vehiculo v) {
		String letras1 = this.matricula.substring(4);
		String letras2 = v.matricula.substring(4);
		if (letras1.compareTo(letras2)<0) return -1;
		else if (letras1.compareTo(letras2)>0)return 1;
		else return this.matricula.compareTo(v.matricula);
	
	}

	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @return the cilindrada
	 */
	public int getCilindrada() {
		return cilindrada;
	}


}
