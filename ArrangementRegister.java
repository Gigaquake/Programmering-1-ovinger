import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrangementRegister {
    private List<Arrangement> arrangementer = new ArrayList<>();

    public void registrerArrangement(Arrangement arrangement) {
        arrangementer.add(arrangement);
    }

    public List<Arrangement> finnArrangementerPåSted(String sted) {
        List<Arrangement> resultater = new ArrayList<>();
        for (Arrangement a : arrangementer) {
            if (a.getSted().equalsIgnoreCase(sted)) {
                resultater.add(a);
            }
        }
        return resultater;
    }

    public List<Arrangement> finnArrangementerPåDato(int dato) {
        List<Arrangement> resultater = new ArrayList<>();
        for (Arrangement a : arrangementer) {
            if (a.getTidspunkt() / 10000 == dato) {
                resultater.add(a);
            }
        }
        return resultater;
    }

    public List<Arrangement> finnArrangementerInnenforTidsintervall(long start, long slutt) {
        List<Arrangement> resultater = new ArrayList<>();
        for (Arrangement a : arrangementer) {
            if (a.getTidspunkt() >= start && a.getTidspunkt() <= slutt) {
                resultater.add(a);
            }
        }
        resultater.sort(Comparator.comparingLong(Arrangement::getTidspunkt));
        return resultater;
    }

    public List<Arrangement> getArrangementerSortertEtterSted() {
        List<Arrangement> sortertListe = new ArrayList<>(arrangementer);
        sortertListe.sort(Comparator.comparing(Arrangement::getSted));
        return sortertListe;
    }

    public List<Arrangement> getArrangementerSortertEtterType() {
        List<Arrangement> sortertListe = new ArrayList<>(arrangementer);
        sortertListe.sort(Comparator.comparing(Arrangement::getType));
        return sortertListe;
    }

    public List<Arrangement> getArrangementerSortertEtterTidspunkt() {
        List<Arrangement> sortertListe = new ArrayList<>(arrangementer);
        sortertListe.sort(Comparator.comparingLong(Arrangement::getTidspunkt));
        return sortertListe;
    }

    public List<Arrangement> getAlleArrangementer() {
        return new ArrayList<>(arrangementer);
    }
}
