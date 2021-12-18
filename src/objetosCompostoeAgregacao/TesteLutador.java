package objetosCompostoeAgregacao;

public class TesteLutador {

	public static void main(String[] args) {

		Lutador l[] = new Lutador[3];

		l[0] = new Lutador("Malaquias", "Azerbaijão", 45, 1.68f, 68.9f, 11, 2, 1);

		l[1] = new Lutador("Escobar", "Colombia", 29, 1.68f, 57.8f, 14, 2, 3);

		l[2] = new Lutador("Queen", "Inglaterra", 35, 1.65f, 79f, 21, 33, 1);

		
		
		Luta UEC01 = new Luta();		
		UEC01.marcarLuta(l[0], l[1]);
		UEC01.lutar();
		l[0].status();
		

	}

}