public class Oppgaveoversikt {
    private Student[] studenter;
    private int antStud;

    public Oppgaveoversikt(int maxAntStudenter) {
        this.studenter = new Student[maxAntStudenter];
        this.antStud = 0;
    }

    public int getAntStudenter() {
        return antStud;
    }

    public int getAntOppgaver(String navn) {
        Student student = finnStudent(navn);
        return (student != null) ? student.getAntOppg() : -1; // Returnerer -1 hvis student ikke finnes
    }

    public boolean registrerStudent(String navn) {
        if (finnStudent(navn) != null || antStud >= studenter.length) {
            return false; // Studenten eksisterer allerede, eller det er ikke plass
        }
        studenter[antStud++] = new Student(navn);
        return true;
    }

    public boolean økAntOppgaver(String navn, int økning) {
        Student student = finnStudent(navn);
        if (student != null) {
            student.økAntOppg(økning);
            return true;
        }
        return false;
    }

    private Student finnStudent(String navn) {
        for (int i = 0; i < antStud; i++) {
            if (studenter[i].getNavn().equals(navn)) {
                return studenter[i];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Oppgaveoversikt:\n");
        for (int i = 0; i < antStud; i++) {
            sb.append(studenter[i].toString()).append("\n");
        }
        return sb.toString();
    }
}
