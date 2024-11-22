public class ArbTaker {
    private final Person personalia;
    private final int arbtakernr;
    private final int ansettelsesår;
    private double månedslønn;
    private double skatteprosent;

    public ArbTaker(Person personalia, int arbtakernr, int ansettelsesår, double månedslønn, double skatteprosent) {
        this.personalia = personalia;
        this.arbtakernr = arbtakernr;
        this.ansettelsesår = ansettelsesår;
        this.månedslønn = månedslønn;
        this.skatteprosent = skatteprosent;
    }

    public Person getPersonalia() {
        return personalia;
    }

    public int getArbtakernr() {
        return arbtakernr;
    }

    public int getAnsettelsesår() {
        return ansettelsesår;
    }

    public double getMånedslønn() {
        return månedslønn;
    }

    public double getSkatteprosent() {
        return skatteprosent;
    }


    
    public void setMånedslønn(double månedslønn) {
        this.månedslønn = månedslønn;
    }

    public void setSkatteprosent(double skatteprosent) {
        this.skatteprosent = skatteprosent;
    }

    public double skattPerMåned() {
        return månedslønn * (skatteprosent / 100);
    }

    public double bruttolønnPerÅr() {
        return månedslønn * 12;
    }

    public double skattetrekkPerÅr() {
        return (månedslønn * 10.5) * (skatteprosent / 100);
    }

    public String navn() {
        return personalia.getEtternavn() + ", " + personalia.getFornavn();
    }

    public int alder(int nåværendeÅr) {
        return nåværendeÅr - personalia.getFødselsår();
    }

    public int antallÅrAnsatt(int nåværendeÅr) {
        return nåværendeÅr - ansettelsesår;
    }

    public boolean ansattLengerEnn(int antallÅr, int nåværendeÅr) {
        return antallÅrAnsatt(nåværendeÅr) > antallÅr;
    }

    @Override
    public String toString() {
        return "Navn: " + navn() + "\n" +
               "Månedslønn: " + månedslønn + "\n" +
               "Skatteprosent: " + skatteprosent + "%\n";
    }
}
