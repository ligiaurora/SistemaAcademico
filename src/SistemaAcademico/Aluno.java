package SistemaAcademico;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Aluno extends Pessoa{
	private List<Curso> cursoMatriculado;
    private List<Disciplina> disciplinasMatriculadas;

    //Construtor
	public Aluno(String nome) {
		super(nome);
		this.cursoMatriculado = new ArrayList<>();
        this.disciplinasMatriculadas = new ArrayList<>();

	}
	
	public List<Disciplina> getDisciplinasMatriculadas() {
		return disciplinasMatriculadas;
	}

	public void setDisciplinasMatriculadas(List<Disciplina> disciplinasMatriculadas) {
		this.disciplinasMatriculadas = disciplinasMatriculadas;
	}
	
	//Listar Disciplina que o aluno está matriculado
	public List<Disciplina> listarMateriasMatriculadas() {
        return disciplinasMatriculadas;
    }

	
	//Metodo para o aluno se matricular na materia
    public void matricular(Disciplina disciplina) {
        disciplinasMatriculadas.add(disciplina);
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("");
		builder.append(getNome());
		return builder.toString();
	}
}
