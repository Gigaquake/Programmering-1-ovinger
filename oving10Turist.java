import java.util.List;
import java.util.Scanner;
public class oving10Turist {


    private static ArrangementRegister register = new ArrangementRegister();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean fortsette = true;
        while (fortsette) {
            visMeny();
            int valg = Integer.parseInt(scanner.nextLine());
            switch (valg) {
                case 1 -> registrerNyttArrangement();
                case 2 -> finnArrangementerPåSted();
                case 3 -> finnArrangementerPåDato();
                case 4 -> finnArrangementerInnenforTidsintervall();
                case 5 -> visArrangementerSortertEtterSted();
                case 6 -> visArrangementerSortertEtterType();
                case 7 -> visArrangementerSortertEtterTidspunkt();
                case 0 -> fortsette = false;
                default -> System.out.println("Ugyldig valg, prøv igjen.");
            }
        }
    }

    private static void visMeny() {
        System.out.println("\n1. Registrer nytt arrangement");
        System.out.println("2. Finn arrangementer på et gitt sted");
        System.out.println("3. Finn arrangementer på en gitt dato");
        System.out.println("4. Finn arrangementer innenfor et tidsintervall");
        System.out.println("5. Vis arrangementer sortert etter sted");
        System.out.println("6. Vis arrangementer sortert etter type");
        System.out.println("7. Vis arrangementer sortert etter tidspunkt");
        System.out.println("0. Avslutt");
        System.out.print("Velg handling: ");
    }

    private static void registrerNyttArrangement() {
        System.out.print("Nummer: ");
        int nummer = Integer.parseInt(scanner.nextLine());
        System.out.print("Navn på arrangement: ");
        String navn = scanner.nextLine();
        System.out.print("Sted: ");
        String sted = scanner.nextLine();
        System.out.print("Arrangør: ");
        String arrangør = scanner.nextLine();
        System.out.print("Type: ");
        String type = scanner.nextLine();
        System.out.print("Tidspunkt (eks: 200210301800=30. okt. 2002 kl 18.00): ");
        long tidspunkt = Long.parseLong(scanner.nextLine());

        Arrangement arrangement = new Arrangement(nummer, navn, sted, arrangør, type, tidspunkt);
        register.registrerArrangement(arrangement);
        System.out.println("Arrangement registrert.");
    }

    private static void finnArrangementerPåSted() {
        System.out.print("Oppgi sted: ");
        String sted = scanner.nextLine();
        List<Arrangement> arrangementer = register.finnArrangementerPåSted(sted);
        visArrangementer(arrangementer);
    }

    private static void finnArrangementerPåDato() {
        System.out.print("Oppgi dato (YYYYMMDD): ");
        int dato = Integer.parseInt(scanner.nextLine());
        List<Arrangement> arrangementer = register.finnArrangementerPåDato(dato);
        visArrangementer(arrangementer);
    }

    private static void finnArrangementerInnenforTidsintervall() {
        System.out.print("Startdato (YYYYMMDDHHMM): ");
        long start = Long.parseLong(scanner.nextLine());
        System.out.print("Sluttdato (YYYYMMDDHHMM): ");
        long slutt = Long.parseLong(scanner.nextLine());
        List<Arrangement> arrangementer = register.finnArrangementerInnenforTidsintervall(start, slutt);
        visArrangementer(arrangementer);
    }

    private static void visArrangementerSortertEtterSted() {
        List<Arrangement> arrangementer = register.getArrangementerSortertEtterSted();
        visArrangementer(arrangementer);
    }

    private static void visArrangementerSortertEtterType() {
        List<Arrangement> arrangementer = register.getArrangementerSortertEtterType();
        visArrangementer(arrangementer);
    }

    private static void visArrangementerSortertEtterTidspunkt() {
        List<Arrangement> arrangementer = register.getArrangementerSortertEtterTidspunkt();
        visArrangementer(arrangementer);
    }

    private static void visArrangementer(List<Arrangement> arrangementer) {
        if (arrangementer.isEmpty()) {
            System.out.println("Ingen arrangementer funnet.");
        } else {
            for (Arrangement a : arrangementer) {
                System.out.println(a);
            }
        }
    }
}

