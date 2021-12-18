package heranca;

// Funcionario herda os atributos e m�todos de Pessoa
public class Funcionario extends Pessoa {
	// Atributos

	private String setor;
	private boolean trabalhando;

	// M�todos
	public void mudatrabalho() {
		this.trabalhando = !this.trabalhando;
	}

	// M�todos especiais
	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public boolean getTrabalhando() {
		return trabalhando;
	}

	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}

}
