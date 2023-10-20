package SistemaAcademico;

import java.util.List;

public class Main {
	public static void main(String[] args) {
       
		// Criação de disciplinas
        Disciplina algoritmo = new Disciplina("Algoritmo");
        Disciplina fisica = new Disciplina("Fisica");
        Disciplina calculo = new Disciplina("Calculo");

        // Criação de professores
        Professor prof1 = new Professor("Julio Antônio");
        Professor prof2 = new Professor("Antônio Nunes");
        Professor prof3 = new Professor("Leandra Assis");

        // Associação de professores às disciplinas
        algoritmo.adicionarProfessor(prof1);
        fisica.adicionarProfessor(prof1);
        fisica.adicionarProfessor(prof3);
        calculo.adicionarProfessor(prof2);

        // Criação de cursos
        Curso cursoBCC = new Curso("Ciência da Computação");
       
        // Criação de fases
        Fase fase1 = new Fase(1);
        Fase fase2 = new Fase(2);

        // Adição de fases aos cursos
        cursoBCC.adicionarFase(fase1);
        cursoBCC.adicionarFase(fase2);

        // Adição de disciplinas às fases
        fase1.adicionarDisciplina(algoritmo);
        fase1.adicionarDisciplina(fisica);
        fase2.adicionarDisciplina(calculo);

        // Criação de alunos
        Aluno aluno1 = new Aluno("Leandro Dias");
        Aluno aluno2 = new Aluno("Fabiana Oliveira");
        
        
        // Matrícula de alunos em disciplinas
        aluno1.matricular(algoritmo);
        aluno1.matricular(fisica);
        aluno2.matricular(calculo);

        // Registro de frequência
        calculo.registrarFrequencia(prof1, aluno1);
        fisica.registrarFrequencia(prof1, aluno1);
        fisica.registrarFrequencia(prof2, aluno1);

        // Registro de avaliações
        algoritmo.registrarAvaliacao(prof1, 90);
        fisica.registrarAvaliacao(prof1, 85);
        calculo.registrarAvaliacao(prof2, 95);

        // Listagem das disciplinas nas fases do curso de Engenharia
        cursoBCC.listarDisciplinasNaFase(1);
        cursoBCC.listarDisciplinasNaFase(2);
        
       System.out.println("");
       System.out.println("---------------------");
       System.out.println("Informações do Aluno");
       System.out.println("---------------------"); 
       System.out.println("");
        
        System.out.println("Disciplinas matriculadas " + "e " + "Nome do aluno(a): " + aluno1);
        for (Disciplina disciplina : aluno1.getDisciplinasMatriculadas()) {
            System.out.println(disciplina.getNome());
        }
        System.out.println("");
        System.out.println("Disciplinas matriculadas " + "e " +  "Nome do aluno(a): " + aluno2);
        for (Disciplina disciplina : aluno2.getDisciplinasMatriculadas()) {
            System.out.println(disciplina.getNome());
        }
    }
}
