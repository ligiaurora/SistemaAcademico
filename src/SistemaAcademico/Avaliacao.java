package SistemaAcademico;

public class Avaliacao {
	  private Professor professor;
	    private int nota;

	    public Avaliacao(Professor professor, int nota) {
	        this.professor = professor;
	        this.nota = nota;
	    }

	    public Professor getProfessor() {
	        return professor;
	    }

	    public int getNota() {
	        return nota;
	    }

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Avaliacao [professor=");
			builder.append(professor);
			builder.append(", nota=");
			builder.append(nota);
			builder.append(", getProfessor()=");
			builder.append(getProfessor());
			builder.append(", getNota()=");
			builder.append(getNota());
			builder.append("]");
			return builder.toString();
		}
}
