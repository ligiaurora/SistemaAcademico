package SistemaAcademico;

import java.util.List;

public class Professor extends Pessoa{
	 private List<Disciplina> disciplinas;
	
	public Professor(String nome) {
		super(nome);
	}
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Professor [disciplinas=");
		builder.append(disciplinas);
		builder.append(", getDisciplinas()=");
		builder.append(getDisciplinas());
		builder.append("]");
		return builder.toString();
	}

	
	
}