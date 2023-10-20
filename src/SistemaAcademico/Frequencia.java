package SistemaAcademico;

public class Frequencia {
    private Professor professor;
    private Aluno aluno;

    public Frequencia(Professor professor, Aluno aluno) {
        this.professor = professor;
        this.aluno = aluno;
    }

	public Pessoa getProfessor() {
		return professor;
	}

	public void setProfessor(Pessoa professor) {
		this.professor = (Professor) professor;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Frequencia [professor=");
		builder.append(professor);
		builder.append(", aluno=");
		builder.append(aluno);
		builder.append(", getProfessor()=");
		builder.append(getProfessor());
		builder.append(", getAluno()=");
		builder.append(getAluno());
		builder.append("]");
		return builder.toString();
	}
}
