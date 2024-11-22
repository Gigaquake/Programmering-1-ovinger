import java.util.Scanner;

class Valuta {
    // Valutakurser
    private static final double USD_TO_NOK = 10.58;
    private static final double EUR_TO_NOK = 11.78;
    private static final double JPY_TO_NOK = 7.46;

    // Metoder for å konvertere til NOK
    public static double convertFromUSD(double amount) {
        return amount * USD_TO_NOK;
    }

    public static double convertFromEUR(double amount) {
        return amount * EUR_TO_NOK;
    }

    public static double convertFromJPY(double amount) {
        return amount * JPY_TO_NOK;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            // Menyvalg
            System.out.println("Velg valuta:");
            System.out.println("1: Dollar (USD)");
            System.out.println("2: Euro (EUR)");
            System.out.println("3: Japansk yen (JPY)");
            System.out.println("4: Avslutt program");
            System.out.print("Ditt valg: ");
            int valg = scanner.nextInt();

            // Avslutt programmet hvis brukeren velger 4
            if (valg == 4) {
                System.out.println("Avslutter programmet...");
                running = false;
                continue;
            }

            // Be om beløp fra brukeren
            System.out.print("Skriv inn beløp: ");
            double belop = scanner.nextDouble();

            // Utfør konvertering basert på brukerens valg
            switch (valg) {
                case 1:
                    System.out.println(belop + " USD tilsvarer " + Valuta.convertFromUSD(belop) + " NOK");
                    break;
                case 2:
                    System.out.println(belop + " EUR tilsvarer " + Valuta.convertFromEUR(belop) + " NOK");
                    break;
                case 3:
                    System.out.println(belop + " JPY tilsvarer " + Valuta.convertFromJPY(belop) + " NOK");
                    break;
                default:
                    System.out.println("Ugyldig valg. Prøv igjen.");
                    break;
            }
        }

        scanner.close();
    }
}
