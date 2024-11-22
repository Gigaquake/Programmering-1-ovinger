import java.util.List;
import java.util.Scanner;

public class oving11 {
    public static void main(String[] args) {
        Eiendomsregister register = new Eiendomsregister();
        Scanner scanner = new Scanner(System.in);
        int valg;

        do {
            System.out.println("\n--- Eiendomsregister for Gloppen kommune ---");
            System.out.println("1. Registrere ny eiendom");
            System.out.println("2. Slette en eiendom");
            System.out.println("3. Vise antall eiendommer");
            System.out.println("4. Finne en eiendom");
            System.out.println("5. Beregne gjennomsnittsareal");
            System.out.println("6. Finne eiendommer med et gitt gårdsnummer");
            System.out.println("7. Skrive ut alle eiendommer");
            System.out.println("8. Avslutte");
            System.out.print("Velg et alternativ: ");

            while (!scanner.hasNextInt()) {
                System.out.print("Ugyldig input. Vennligst skriv inn et tall mellom 1 og 8: ");
                scanner.next();
            }
            valg = scanner.nextInt();
            scanner.nextLine(); // For å konsumere newline

            switch (valg) {
                case 1:
                    // Registrere ny eiendom
                    System.out.print("Kommunenummer: ");
                    int kommunenummer = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Kommunenavn: ");
                    String kommunenavn = scanner.nextLine();
                    System.out.print("Gårdsnummer (gnr): ");
                    int gnr = scanner.nextInt();
                    System.out.print("Bruksnummer (bnr): ");
                    int bnr = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Bruksnavn (la stå tomt hvis ingen): ");
                    String bruksnavn = scanner.nextLine();
                    bruksnavn = bruksnavn.isEmpty() ? null : bruksnavn;
                    System.out.print("Areal: ");
                    double areal = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Eier: ");
                    String eier = scanner.nextLine();

                    Eiendom eiendom = new Eiendom(kommunenummer, kommunenavn, gnr, bnr, bruksnavn, areal, eier);
                    register.registrerEiendom(eiendom);
                    System.out.println("Eiendom registrert.");
                    break;

                case 2:
                    // Slette en eiendom
                    System.out.print("Kommunenummer: ");
                    kommunenummer = scanner.nextInt();
                    System.out.print("Gårdsnummer (gnr): ");
                    gnr = scanner.nextInt();
                    System.out.print("Bruksnummer (bnr): ");
                    bnr = scanner.nextInt();

                    boolean slettet = register.slettEiendom(kommunenummer, gnr, bnr);
                    if (slettet) {
                        System.out.println("Eiendom slettet.");
                    } else {
                        System.out.println("Eiendom ikke funnet.");
                    }
                    break;

                case 3:
                    // Vise antall eiendommer
                    int antall = register.antallEiendommer();
                    System.out.println("Antall eiendommer i registeret: " + antall);
                    break;

                case 4:
                    // Finne en eiendom
                    System.out.print("Kommunenummer: ");
                    kommunenummer = scanner.nextInt();
                    System.out.print("Gårdsnummer (gnr): ");
                    gnr = scanner.nextInt();
                    System.out.print("Bruksnummer (bnr): ");
                    bnr = scanner.nextInt();

                    eiendom = register.finnEiendom(kommunenummer, gnr, bnr);
                    if (eiendom != null) {
                        System.out.println("Eiendom funnet:");
                        System.out.println(eiendom);
                    } else {
                        System.out.println("Eiendom ikke funnet.");
                    }
                    break;

                case 5:
                    // Beregne gjennomsnittsareal
                    double gjennomsnitt = register.gjennomsnittsAreal();
                    System.out.printf("Gjennomsnittsareal: %.2f kvm\n", gjennomsnitt);
                    break;

                case 6:
                    // Finne eiendommer med et gitt gårdsnummer
                    System.out.print("Gårdsnummer (gnr): ");
                    gnr = scanner.nextInt();

                    List<Eiendom> eiendommerMedGnr = register.finnEiendommerMedGnr(gnr);
                    if (!eiendommerMedGnr.isEmpty()) {
                        System.out.println("Eiendommer med gårdsnummer " + gnr + ":");
                        for (Eiendom e : eiendommerMedGnr) {
                            System.out.println(e);
                        }
                    } else {
                        System.out.println("Ingen eiendommer funnet med gårdsnummer " + gnr + ".");
                    }
                    break;

                case 7:
                    // Skrive ut alle eiendommer
                    register.skrivUtAlleEiendommer();
                    break;

                case 8:
                    // Avslutte
                    System.out.println("Avslutter programmet.");
                    break;

                default:
                    System.out.println("Ugyldig valg, prøv igjen.");
            }
        } while (valg != 8);

        scanner.close();
    }
}
