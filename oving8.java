import java.util.Scanner;

public class oving8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person("Even", "Eielsen", 1999);
        ArbTaker arbTaker = new ArbTaker(person, 12345, 2017, 10000, 25);

        while (true) {
            System.out.println("\nMeny:");
            System.out.println("1. Vis navn");
            System.out.println("2. Vis skatt per måned");
            System.out.println("3. Vis bruttolønn per år");
            System.out.println("4. Vis skattetrekk per år");
            System.out.println("5. Vis alder");
            System.out.println("6. Vis antall år ansatt");
            System.out.println("7. Endre månedslønn");
            System.out.println("8. Endre skatteprosent");
            System.out.println("9. Sjekk om ansatt lenger enn et gitt antall år");
            System.out.println("0. Avslutt");
            System.out.print("Velg et alternativ: ");

            int valg = scanner.nextInt();

            switch (valg) {
                case 1:
                    System.out.println("Navn: " + arbTaker.navn());
                    break;
                case 2:
                    System.out.printf("Skatt per måned: %.2f kr%n", arbTaker.skattPerMåned());
                    break;
                case 3:
                    System.out.printf("Bruttolønn per år: %.2f kr%n", arbTaker.bruttolønnPerÅr());
                    break;
                case 4:
                    System.out.printf("Skattetrekk per år: %.2f kr%n", arbTaker.skattetrekkPerÅr());
                    break;
                case 5:
                    System.out.println("Alder: " + arbTaker.alder(2024) + " år");
                    break;
                case 6:
                    System.out.println("Antall år ansatt: " + arbTaker.antallÅrAnsatt(2024));
                    break;
                case 7:
                    System.out.print("Ny månedslønn: ");
                    double nyMånedslønn = scanner.nextDouble();
                    arbTaker.setMånedslønn(nyMånedslønn);
                    System.out.println("Månedslønn endret.");
                    break;
                case 8:
                    System.out.print("Ny skatteprosent: ");
                    double nySkatteprosent = scanner.nextDouble();
                    arbTaker.setSkatteprosent(nySkatteprosent);
                    System.out.println("Skatteprosent endret.");
                    break;
                case 9:
                    System.out.print("Sjekk om ansatt lenger enn (år): ");
                    int år = scanner.nextInt();
                    boolean lengerEnn = arbTaker.ansattLengerEnn(år, 2024);
                    System.out.println(lengerEnn ? "Ja, ansatt lenger." : "Nei, ansatt kortere.");
                    break;
                case 0:
                    System.out.println("Avslutter programmet.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Ugyldig valg, prøv igjen.");
            }
        }
    }
}
