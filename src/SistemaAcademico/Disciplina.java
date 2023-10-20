package SistemaAcademico;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Disciplina {
    private String nome;
    private List<Professor> professores;
    private List<Frequencia> registrosFrequencia;
    private List<Avaliacao> avaliacoes;

    //Construtor
    public Disciplina (String nome) {
    	this.nome = nome;
        this.professores = new ArrayList<>();
        this.registrosFrequencia = new ArrayList<>();
        this.avaliacoes = new ArrayList<>();
        
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//Metodo para associar os professores as disciplinas 
	public void adicionarProfessor(Professor professor) {
	    professores.add(professor);
	}

	public List<Professor> listarProfessores() {
	        return this.professores;
	}
	
	//Metodo de Frequência
    public void registrarFrequencia(Professor professor, Aluno aluno) {
        registrosFrequencia.add(new Frequencia(professor, aluno));
    }

    public List<Frequencia> listarTodasFrequencias() {
        return registrosFrequencia;
    }

    public List<Frequencia> listarFrequenciasPorProfessor(Professor professor) {
        List<Frequencia> frequenciasDoProfessor = new ArrayList<>();
        for (Frequencia frequencia : registrosFrequencia) {
            if (frequencia.getProfessor() == professor) {
                frequenciasDoProfessor.add(frequencia);
            }
        }
        return frequenciasDoProfessor;
    }
    
    // Registro avaliação na disciplina
    public void registrarAvaliacao(Professor professor, int nota) {
        Avaliacao avaliacao = new Avaliacao(professor, nota);
        avaliacoes.add(avaliacao);
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Disciplina [nome=");
		builder.append(nome);
		builder.append(", getNome()=");
		builder.append(getNome());
		builder.append("]");
		return builder.toString();
	}  
}