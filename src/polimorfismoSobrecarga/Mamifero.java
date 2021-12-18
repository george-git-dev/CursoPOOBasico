package polimorfismoSobrecarga;

public class Mamifero extends Animal {

	private String corPelo;

	@Override
	public void emitirSom() {		
		System.out.println("Som do mamífero");
	}

}
