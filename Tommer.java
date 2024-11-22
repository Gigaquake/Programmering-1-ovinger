import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Tommer {
    public static void main(String[] args) {
        float tilCM = 2.54f;
        String inchesLes = showInputDialog("Hvor mange tommer?");
        double inches = Double.parseDouble(inchesLes);
        double antallCM = inches / tilCM;
        showMessageDialog(null, inchesLes + " tommer er " + antallCM + "cm");
    }
}