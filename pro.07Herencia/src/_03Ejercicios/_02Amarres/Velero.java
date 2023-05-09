package _03Ejercicios._02Amarres;

public class Velero extends Barco{

	private int mastiles;
	
	public Velero(String matricula, float eslora, int anos, int mastiles) {
		super(matricula, eslora, anos);
		this.mastiles = mastiles;
		// TODO Auto-generated constructor stub
	}

	@Override
	public float getFactorAlquiler() {
		return getEslora()*2+mastiles;
	}

	/**
	 * @return the mastiles
	 */
	public int getMastiles() {
		return mastiles;
	}

	/**
	 * @param mastiles the mastiles to set
	 */
	public void setMastiles(int mastiles) {
		this.mastiles = mastiles;
	}
	
	
	
}
