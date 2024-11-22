import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Sekunder {
    public static void main(String[] args) {
        String hoursLest = showInputDialog("Hvor mange timer? ");
        String minutesLest = showInputDialog("Hvor mange minutter? ");
        String secondsLest = showInputDialog("Hvor mange sekunder? ");
        double hours = Double.parseDouble(hoursLest);
        double minutes = Double.parseDouble(minutesLest);
        double seconds = Double.parseDouble(secondsLest);
        double timeTilSekund = 3600;
        double minuttTilSekund = 60;
        double antallSekund = hours * timeTilSekund + minutes * minuttTilSekund + seconds;
        showMessageDialog(null,"Dine timer, minutter og sekunder er totalt: " + antallSekund + " sekunder!");
    }

}
