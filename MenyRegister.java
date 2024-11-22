import java.util.ArrayList;
import java.util.List;

public class MenyRegister {
    private List<Rett> retter;
    private List<Meny> menyer;

    public MenyRegister() {
        retter = new ArrayList<>();
        menyer = new ArrayList<>();
    }

    public void registrerRett(Rett rett) {
        retter.add(rett);
    }

    public Rett finnRett(String navn) {
        for (Rett rett : retter) {
            if (rett.getNavn().equalsIgnoreCase(navn)) {
                return rett;
            }
        }
        return null; // Returnerer null hvis retten ikke finnes
    }

    public List<Rett> finnRetterAvType(String type) {
        List<Rett> retterAvType = new ArrayList<>();
        for (Rett rett : retter) {
            if (rett.getType().equalsIgnoreCase(type)) {
                retterAvType.add(rett);
            }
        }
        return retterAvType;
    }

    public void registrerMeny(Meny meny) {
        menyer.add(meny);
    }

    public List<Meny> finnMenyerInnenforPrisIntervall(double minPris, double maxPris) {
        List<Meny> menyerInnenforIntervall = new ArrayList<>();
        for (Meny meny : menyer) {
            double totalPris = meny.getTotalPris();
            if (totalPris >= minPris && totalPris <= maxPris) {
                menyerInnenforIntervall.add(meny);
            }
        }
        return menyerInnenforIntervall;
    }

    public List<Meny> getAlleMenyer() {
        return new ArrayList<>(menyer);
    }
}
