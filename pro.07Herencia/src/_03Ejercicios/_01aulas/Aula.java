package _03Ejercicios._01aulas;

public class Aula {
	private int codAula;
	private float longitud;
	private float anchura;
	private int capacidad;
	
	
	public Aula(int codAula, float longitud, float anchura) {
		this.codAula = codAula;
		this.longitud = longitud;
		this.anchura = anchura;
		this.capacidad = (int) (longitud*anchura/1.4);
	}


	/**
	 * @return the codAula
	 */
	public int getCodAula() {
		return codAula;
	}


	/**
	 * @param codAula the codAula to set
	 */
	public void setCodAula(int codAula) {
		this.codAula = codAula;
	}


	/**
	 * @return the longitud
	 */
	public float getLongitud() {
		return longitud;
	}


	/**
	 * @param longitud the longitud to set
	 */
	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}


	/**
	 * @return the anchura
	 */
	public float getAnchura() {
		return anchura;
	}


	/**
	 * @param anchura the anchura to set
	 */
	public void setAnchura(float anchura) {
		this.anchura = anchura;
	}


	/**
	 * @return the capacidad
	 */
	public int getCapacidad() {
		return capacidad;
	}


	/**
	 * @param capacidad the capacidad to set
	 */
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
	@Override
	public String toString() {
		return "Codigo: "+codAula+"\nSuperficie: "+anchura*longitud+"\nCapacidad: "+capacidad;
	}
}
