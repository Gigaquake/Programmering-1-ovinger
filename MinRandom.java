import java.util.Random;

public class MinRandom {
    private Random random;

    // Konstruktør
    public MinRandom() {
        random = new Random(); // Starter Random-objektet
    }

    // Metode som genererer et tilfeldig heltall i intervallet [nedre, ovre)
    public int nesteHeltall(int nedre, int ovre) {
        if (nedre >= ovre) {
            throw new IllegalArgumentException("Nedre grense må være mindre enn øvre grense.");
        }
        // Bruker random.nextInt(ovre - nedre) for å generere tall fra 0 til ovre - nedre,
        // og deretter legger vi til nedre for å transformere det til ønsket intervall.
        return nedre + random.nextInt(ovre - nedre);
    }

    // Metode som genererer et tilfeldig desimaltall i intervallet [nedre, ovre)
    public double nesteDesimaltall(double nedre, double ovre) {
        if (nedre >= ovre) {
            throw new IllegalArgumentException("Nedre grense må være mindre enn øvre grense.");
        }
        // Bruker random.nextDouble() for å generere et tall mellom 0.0 (inkludert) og 1.0 (ikke inkludert),
        // og deretter transformerer vi det til ønsket intervall [nedre, ovre).
        return nedre + (ovre - nedre) * random.nextDouble();
    }


    public static void main(String[] args) {
        MinRandom minRandom = new MinRandom();

        // Test med heltall i intervallet [10, 20)
        System.out.println("Tilfeldige heltall i intervallet [10, 20):");
        for (int i = 0; i < 10; i++) {
            int tilfeldigHeltall = minRandom.nesteHeltall(10, 20);
            System.out.println(tilfeldigHeltall);
        }

        // Test med desimaltall i intervallet [0.0, 1.0)
        System.out.println("\nTilfeldige desimaltall i intervallet [0.0, 1.0):");
        for (int i = 0; i < 10; i++) {
            double tilfeldigDesimaltall = minRandom.nesteDesimaltall(0.0, 1.0);
            System.out.println(tilfeldigDesimaltall);
        }
    }
}
