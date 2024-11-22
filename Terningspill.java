import java.util.Random;
import java.util.Scanner;

class Spiller {
    private String navn;
    private int poengsum;
    private Random terning;

    // Oppretter spillerne, poengsummen og terningkast
    public Spiller(String navn) {
        this.navn = navn;
        this.poengsum = 0;
        this.terning = new Random();
    }

    // Metode for å få poengsummen
    public int getSumPoeng() {
        return poengsum;
    }

    // Metode for å kaste terningen
    public int kastTerningen() {
        int terningkast = terning.nextInt(6) + 1;  // Genererer et tall mellom 1 og 6
        System.out.println(navn + " kastet: " + terningkast);

        if (terningkast == 1) {
            System.out.println(navn + " mistet alle poengene!");
            poengsum = 0;  // Setter poengsummen til 0 hvis terningen viser 1
        } else {
            poengsum += terningkast;  // Legger terningkastet til poengsummen
        }

        return terningkast;
    }

    // Metode for å sjekke om spilleren har vunnet
    public boolean erFerdig() {
        return poengsum >= 100;
    }
}

public class Terningspill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Spiller spillerA = new Spiller("Spiller A");
        Spiller spillerB = new Spiller("Spiller B");
        int runde = 1;

        while (true) {

            // Sjekk om spillerne vil fortsette, slik at det føles ut som et spill.
            System.out.println("Fortsette?");
            System.out.println("1: Ja");
            System.out.println("2: Nei");
            int Fortsette = scanner.nextInt();

            if (Fortsette == 1) {
                
                System.out.println("Runde " + runde + ":");
                
                // Spiller A kaster terningen
                spillerA.kastTerningen();
                System.out.println("Poengsum til Spiller A: " + spillerA.getSumPoeng());

                // Sjekk om Spiller A har vunnet
                if (spillerA.erFerdig()) {
                    System.out.println("Spiller A har vunnet spillet!");
                    break;
                }

                // Spiller B kaster terningen
                spillerB.kastTerningen();
                System.out.println("Poengsum til Spiller B: " + spillerB.getSumPoeng());

                // Sjekk om Spiller B har vunnet
                if (spillerB.erFerdig()) {
                    System.out.println("Spiller B har vunnet spillet!");
                    break;
                }

                runde++;
                System.out.println("-----------------------------");
            }
            else {
                scanner.close();
                System.out.println("Spillet ble avsluttet, ingen vinner!");
                break;
            }
        }
    }
}