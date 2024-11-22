import java.util.InputMismatchException;
import java.util.Scanner;

public class multiplikasjonsTabell {
    public static void main(String[] args) {
        // Opprette et Scanner-objekt for å lese brukerinput
        Scanner scanner = new Scanner(System.in);

        try {
            // Ber brukeren om å skrive inn et tall
            System.out.print("Skriv inn et tall: ");
            int number = scanner.nextInt();

            // Lager multiplikasjonstabellen fra 1 til 10
            for (int i = 1; i <= 10; i++) {
                // Skriver ut multiplikasjonen i formatet "number x i = result"
                System.out.println(number + " x " + i + " = " + (number * i));
            }  
        } catch (InputMismatchException e) {
            System.out.println("Feil: Vennligst skriv inn et gyldig tall.");
        } finally {

        // Lukke Scanner-objektet for å unngå ressurssvikt
        scanner.close();
        }
    }
}