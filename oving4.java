import java.util.Scanner;

class Valuta {
    // Valutakurser
    private static final double USD_TO_NOK = 10.58;
    private static final double EUR_TO_NOK = 11.78;
    private static final double JPY_TO_NOK = 7.46;

    // Metoder for å konvertere til eller fra NOK
    public static double convertFromUSD(double amount) {
        return amount * USD_TO_NOK;
    }
    public static double convertToUSD(double amount) {
        return amount / USD_TO_NOK;
    }

    public static double convertFromEUR(double amount) {
        return amount * EUR_TO_NOK;
    }
    public static double convertToEUR(double amount) {
        return amount / EUR_TO_NOK;
    }

    public static double convertFromJPY(double amount) {
        return amount * JPY_TO_NOK;
    }
    public static double convertToJPY(double amount) {
        return amount / JPY_TO_NOK;
    }
}

public class oving4 {
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

            // Velger fra eller til NOK
            System.out.println("Fra eller til norske kroner?");
            System.out.println("1: Til Norske kroner (NOK)");
            System.out.println("2: Fra Norske kroner (NOK)");
            int FraTil = scanner.nextInt();

            // Be om beløp fra brukeren
            System.out.print("Skriv inn beløp: ");
            double belop = scanner.nextDouble();

            // Sjekker om brukeren skulle ha fra eller til NOK
            if (FraTil == 1) {

                // Utfør konvertering basert på brukerens valg ved bruk av switch (i stedet for mange if else setninger)
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
            else if (FraTil == 2) {
                switch (valg) {
                    case 1:
                        System.out.println(belop + " NOK tilsvarer " + Valuta.convertToUSD(belop) + " USD");
                        break;
                    case 2:
                        System.out.println(belop + " NOK tilsvarer " + Valuta.convertToEUR(belop) + " EUR");
                        break;
                    case 3:
                        System.out.println(belop + " NOK tilsvarer " + Valuta.convertToJPY(belop) + " JPY");
                        break;
                    default:
                        System.out.println("Ugyldig valg. Prøv igjen.");
                        break;
                    }
            }
        }

        // Lukker scanner objektet
        scanner.close();
    }
}