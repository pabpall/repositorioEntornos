package _03Ejercicios._02Amarres;

public abstract class Barco {
	private String matricula;
	private float eslora;
	private int anos;
	
	public float getFactorAlquiler() {
		return eslora*2;
	}

	public Barco(String matricula, float eslora, int anos) {
		this.matricula = matricula;
		this.eslora = eslora;
		this.anos = anos;
	}

	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	/**
	 * @return the eslora
	 */
	public float getEslora() {
		return eslora;
	}

	/**
	 * @param eslora the eslora to set
	 */
	public void setEslora(float eslora) {
		this.eslora = eslora;
	}

	/**
	 * @return the anos
	 */
	public int getAnos() {
		return anos;
	}

	/**
	 * @param anos the anos to set
	 */
	public void setAnos(int anos) {
		this.anos = anos;
	}
	
	
	
	
}
