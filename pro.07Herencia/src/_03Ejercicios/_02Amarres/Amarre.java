package _03Ejercicios._02Amarres;

public class Amarre {
	private int posicion;
	private Cliente cliente;
	private int numDias;
	private Barco barco;
	
	public Amarre(int posicion, Cliente cliente, int numDias, Barco barco) {
		this.posicion = posicion;
		this.cliente = cliente;
		this.numDias = numDias;
		this.barco = barco;
	}

	/**
	 * @return the posicion
	 */
	public int getPosicion() {
		return posicion;
	}

	/**    
	 * @param posicion the posicion to set
	 */
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * @return the numDias
	 */
	public int getNumDias() {
		return numDias;
	}

	/**
	 * @param numDias the numDias to set
	 */
	public void setNumDias(int numDias) {
		this.numDias = numDias;
	}

	/**
	 * @return the barco
	 */
	public Barco getBarco() {
		return barco;
	}

	/**
	 * @param barco the barco to set
	 */
	public void setBarco(Barco barco) {
		this.barco = barco;
	}

	@Override
	public String toString() {
		return "Amarre [posicion=" + posicion + ", cliente=" + cliente + ", numDias=" + numDias + ", barco=" + barco
				+ "]";
	}
	
	
}
