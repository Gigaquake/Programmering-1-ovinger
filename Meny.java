import java.util.ArrayList;
import java.util.List;

public class Meny {
    private List<Rett> retter;

    public Meny() {
        this.retter = new ArrayList<>();
    }

    public void leggTilRett(Rett rett) {
        retter.add(rett);
    }

    public double getTotalPris() {
        double total = 0;
        for (Rett rett : retter) {
            total += rett.getPris();
        }
        return total;
    }

    public List<Rett> getRetter() {
        return new ArrayList<>(retter);
    }

    @Override
    public String toString() {
        StringBuilder menyStreng = new StringBuilder("Meny:\n");
        for (Rett rett : retter) {
            menyStreng.append(rett.toString()).append("\n");
        }
        menyStreng.append("Total pris: ").append(getTotalPris());
        return menyStreng.toString();
    }
}
