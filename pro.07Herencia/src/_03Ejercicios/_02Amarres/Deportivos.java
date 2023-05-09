package _03Ejercicios._02Amarres;

public class Deportivos extends Barco{
	private int potencia;

	public Deportivos(String matricula, float eslora, int anos, int potencia) {
		super(matricula, eslora, anos);
		this.potencia = potencia;
	}
	
	public float getFactorAlquiler() {
		return getEslora()*2+potencia;
	}

	
	
	
}
