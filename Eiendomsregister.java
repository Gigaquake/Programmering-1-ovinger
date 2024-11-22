import java.util.ArrayList;
import java.util.List;

public class Eiendomsregister {
    private List<Eiendom> eiendommer;

    public Eiendomsregister() {
        eiendommer = new ArrayList<>();
    }

    // Metode for å registrere en eiendom
    public void registrerEiendom(Eiendom eiendom) {
        eiendommer.add(eiendom);
    }

    // Metode for å slette en eiendom
    public boolean slettEiendom(int kommunenummer, int gnr, int bnr) {
        Eiendom eiendom = finnEiendom(kommunenummer, gnr, bnr);
        if (eiendom != null) {
            eiendommer.remove(eiendom);
            return true;
        }
        return false;
    }

    // Metode for å returnere antall eiendommer
    public int antallEiendommer() {
        return eiendommer.size();
    }

    // Metode for å finne en eiendom basert på kommunenummer, gnr og bnr
    public Eiendom finnEiendom(int kommunenummer, int gnr, int bnr) {
        for (Eiendom eiendom : eiendommer) {
            if (eiendom.getKommunenummer() == kommunenummer && eiendom.getGnr() == gnr && eiendom.getBnr() == bnr) {
                return eiendom;
            }
        }
        return null;
    }

    // Metode for å beregne gjennomsnittsareal
    public double gjennomsnittsAreal() {
        if (eiendommer.isEmpty()) {
            return 0;
        }
        double totalAreal = 0;
        for (Eiendom eiendom : eiendommer) {
            totalAreal += eiendom.getAreal();
        }
        return totalAreal / eiendommer.size();
    }

    // Metode for å finne eiendommer med et gitt gårdsnummer
    public List<Eiendom> finnEiendommerMedGnr(int gnr) {
        List<Eiendom> resultat = new ArrayList<>();
        for (Eiendom eiendom : eiendommer) {
            if (eiendom.getGnr() == gnr) {
                resultat.add(eiendom);
            }
        }
        return resultat;
    }

    // Metode for å skrive ut alle eiendommer
    public void skrivUtAlleEiendommer() {
        for (Eiendom eiendom : eiendommer) {
            System.out.println(eiendom);
        }
    }
}
