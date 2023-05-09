package _03Ejercicios._01aulas;

public class AulaInformatica extends Aula{
	int ordenadores;
	
	public AulaInformatica(int cod, float lon, float anch, int ord) {
		super(cod,lon,anch);
		this.ordenadores = ord;
		setCapacidad(ord*2);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\n Numero de ordenadores: "+ordenadores;
	}
}
