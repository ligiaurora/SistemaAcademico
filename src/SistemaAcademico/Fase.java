package SistemaAcademico;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fase {
	private int numero;
    private List<Disciplina> disciplinas;
    private List<Professor> professor;

    //Construtor
    public Fase(int numero) {
        this.numero = numero;
        this.disciplinas = new ArrayList<>();
        this.professor = new ArrayList<>();
    }
    //Get and Setters
    public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		  if (numero >= 1) {  // Validação para verificar se número é positivo
	            this.numero = numero;
	        } else {
	            System.out.println("Número de fase inválido, insira um valor válido.");
	        }
	}
    
    public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
		
	}
		
		
		
		
	    public List<Professor> getProfessor() {
			return professor;
		}

		public void setProfessor(List<Professor> professor) {
			this.professor = professor;			
	}
	
	//Metodos
		public void adicionarDisciplina(Disciplina disciplina) {
		    disciplinas.add(disciplina);
		}
    
    
    public void listarDisciplinas() {
        System.out.println("Disciplinas na Fase " + numero + " do curso: " + disciplinas.size());
        for (Disciplina disciplina : disciplinas) {
            System.out.println(disciplina.getNome());
        }
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Fase [numero=");
		builder.append(numero);
		builder.append(", disciplinas=");
		builder.append(disciplinas);
		builder.append(", getNumero()=");
		builder.append(getNumero());
		builder.append(", getDisciplinas()=");
		builder.append(getDisciplinas());
		builder.append("]");
		return builder.toString();
	}
}
