package polimorfismo;

public class TesteAnimal {

	public static void main(String[] args) {
		// Animal n = new Animal();

		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		/*
		m.setPeso(35.3f);
		m.setCorPelo("Marrom");
		m.alimentar();
		m.locomover();
		m.emitirSom();
		*/
		
		a.locomover();
		p.locomover();
		r.locomover();

	}

}
