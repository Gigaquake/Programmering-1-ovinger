public class Student {
    private String navn;  
    private int antOppg;  

    public Student(String navn) {
        this.navn = navn;
        this.antOppg = 0;
    }

    public String getNavn() {
        return navn;
    }

    public int getAntOppg() {
        return antOppg;
    }

    public void økAntOppg(int økning) {
        if (økning > 0) {
            antOppg += økning;
        }
    }

    @Override
    public String toString() {
        return "Navn: " + navn + ", Antall godkjente oppgaver: " + antOppg;
    }
}
