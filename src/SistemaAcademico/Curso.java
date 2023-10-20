package SistemaAcademico;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Curso {
	private String nome;
    private List<Fase> fases;

    public Curso(String nome) {
        this.nome = nome;
        this.fases = new ArrayList<>();
    }
    
    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Fase> getFases() {
		return fases;
	}

	public void setFases(List<Fase> fases) {
		this.fases = fases;
	}

    public void adicionarFase(Fase fase) {
        fases.add(fase);
    }

    public void listarDisciplinasNaFase(int numero) {
        for (Fase fase : fases) {
            if (fase.getNumero() == numero) {
            	System.out.println("---------------------");
            	System.out.println("Informações de Fases por Disciplina do Curso");
            	System.out.println("---------------------");
            	System.out.println("");
                System.out.println("Disciplinas na Fase " + numero + " do curso " + nome + ":");
                for (Disciplina disciplina : fase.getDisciplinas()) {
                    System.out.println(disciplina.getNome());
                }
                return; 
            }
        }
        System.out.println("Fase " + numero + " não encontrada no curso " + nome);
    }
    
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Curso [nome=");
		builder.append(nome);
		builder.append(", fases=");
		builder.append(fases);
		builder.append(", getNome()=");
		builder.append(getNome());
		builder.append(", getFases()=");
		builder.append(getFases());
		builder.append("]");
		return builder.toString();
	}
}
