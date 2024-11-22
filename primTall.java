import java.util.Scanner;

public class primTall {
    public static void main(String[] args) {
        // Opprette et Scanner-objekt for å lese brukerinput
        Scanner scanner = new Scanner(System.in);
        String fortsette;

        // En løkke for å kjøre programmet flere ganger
        do {
            // Be brukeren om å skrive inn et tall
            System.out.print("Skriv inn et tall: ");
            int number = scanner.nextInt();

            // Sjekke om tallet er et primtall
            if (isPrime(number)) {
                System.out.println(number + " er et primtall.");
            } else {
                System.out.println(number + " er ikke et primtall.");
            }

            // Spør brukeren om de vil fortsette
            System.out.print("Vil du sjekke et annet tall? (ja/nei): ");
            fortsette = scanner.next();  // Lese input for å fortsette eller stoppe
        } while (fortsette.equalsIgnoreCase("ja"));

        // Lukke Scanner-objektet
        scanner.close();
    }

    // Funksjon som sjekker om et tall er et primtall
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;  // Tall som er mindre eller lik 1 er ikke et primtall
        }

        // Sjekker om tallet har noen divisorer fra 2 til kvadratroten av tallet
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;  // Tallet er ikke et primtall hvis det er delelig med noen av i-ene
            }
        }

        return true;  // Tallet er et primtall
    }
}