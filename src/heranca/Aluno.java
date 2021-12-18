package heranca;

// Aluno herda os atributos e m�todos de Pessoa
public class Aluno extends Pessoa {
	// Atributos
	private int mat;
	private String curso;

	// M�todos
	public void cancelarMatr() {
		System.out.println("Matr�cula ser� cancelada");
	}

	// M�todos especiais
	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

}
