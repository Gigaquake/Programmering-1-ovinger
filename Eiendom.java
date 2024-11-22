public class Eiendom {
    private int kommunenummer;
    private String kommunenavn;
    private int gnr;
    private int bnr;
    private String bruksnavn;
    private double areal;
    private String eier;

    // Konstruktør
    public Eiendom(int kommunenummer, String kommunenavn, int gnr, int bnr, String bruksnavn, double areal, String eier) {
        this.kommunenummer = kommunenummer;
        this.kommunenavn = kommunenavn;
        this.gnr = gnr;
        this.bnr = bnr;
        this.bruksnavn = bruksnavn;
        this.areal = areal;
        this.eier = eier;
    }

    // Get- og set-metoder
    public int getKommunenummer() {
        return kommunenummer;
    }

    public void setKommunenummer(int kommunenummer) {
        this.kommunenummer = kommunenummer;
    }

    public String getKommunenavn() {
        return kommunenavn;
    }

    public void setKommunenavn(String kommunenavn) {
        this.kommunenavn = kommunenavn;
    }

    public int getGnr() {
        return gnr;
    }

    public void setGnr(int gnr) {
        this.gnr = gnr;
    }

    public int getBnr() {
        return bnr;
    }

    public void setBnr(int bnr) {
        this.bnr = bnr;
    }

    public String getBruksnavn() {
        return bruksnavn;
    }

    public void setBruksnavn(String bruksnavn) {
        this.bruksnavn = bruksnavn;
    }

    public double getAreal() {
        return areal;
    }

    public void setAreal(double areal) {
        this.areal = areal;
    }

    public String getEier() {
        return eier;
    }

    public void setEier(String eier) {
        this.eier = eier;
    }

    // toString-metode
    @Override
    public String toString() {
        return kommunenummer + "-" + gnr + "/" + bnr;
    }
}
