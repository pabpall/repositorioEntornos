package _03Ejercicios._01aulas;

public class AulaMusica extends Aula{
	private boolean piano;
	
	public AulaMusica(int codAula, float longitud, float anchura, boolean piano) {
		super(codAula, longitud, anchura);
		this.piano = piano;
		if (piano) {
			setCapacidad( getCapacidad()-2);
		}
	}
	
	@Override
	public String toString() {
		String res= super.toString()+"\nPiano: ";
		if (piano) {
			res+="Disponible";
		} else res+="No disponible";
		return res;
	}
}
