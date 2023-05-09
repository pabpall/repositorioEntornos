package _03Ejercicios._02Amarres;

public class Yate extends Barco{
	private int potencia;
	private int camarotes;
	
	
	public Yate(String matricula, float eslora, int anos, int potencia, int camarotes) {
		super(matricula, eslora, anos);
		this.potencia = potencia;
		this.camarotes = camarotes;
	}


	public float getFactorAlquiler() {
		return potencia*camarotes;
	}
}
