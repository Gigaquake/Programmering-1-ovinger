public class Brok {
    // Variabler for teller og nevner
    private int teller;
    private int nevner;

    // Tar inn teller og nevner som variabler
    public Brok(int teller, int nevner) {
        if (nevner == 0) {
            // Lager et unntak som kaster vekk hvis nevner er 0
            throw new IllegalArgumentException("Nevner kan ikke være 0.");
        }
        this.teller = teller;
        this.nevner = nevner;
        forkort();
    }

    // Konstruktør som tar kun teller, setter nevner til 1
    public Brok(int teller) {
        this.teller = teller;
        this.nevner = 1;
    }

    // Get-metoder
    public int getTeller() {
        return teller;
    }

    public int getNevner() {
        return nevner;
    }

    // Metode for å summere brøken med en annen brøk
    public void add(Brok annenBrok) {
        this.teller = this.teller * annenBrok.nevner + annenBrok.teller * this.nevner;
        this.nevner = this.nevner * annenBrok.nevner;
        forkort();
    }

    // Metode for å subtrahere en annen brøk fra brøken
    public void subtract(Brok annenBrok) {
        this.teller = this.teller * annenBrok.nevner - annenBrok.teller * this.nevner;
        this.nevner = this.nevner * annenBrok.nevner;
        forkort();
    }

    // Metode for å multiplisere brøken med en annen brøk
    public void multiply(Brok annenBrok) {
        this.teller = this.teller * annenBrok.teller;
        this.nevner = this.nevner * annenBrok.nevner;
        forkort();
    }

    // Metode for å dividere brøken med en annen brøk
    public void divide(Brok annenBrok) {
        if (annenBrok.teller == 0) {
            // Når man deler, så kan heller ikke telleren til den andre brøken man deler på være 0
            throw new IllegalArgumentException("Kan ikke dele med en brøk med teller lik 0.");
        }
        this.teller = this.teller * annenBrok.nevner;
        this.nevner = this.nevner * annenBrok.teller;
        forkort();
    }

    // Privat metode for å forkorte brøken
    private void forkort() {
        int gcd = gcd(Math.abs(teller), Math.abs(nevner));
        this.teller /= gcd;
        this.nevner /= gcd;

        // Sørger for at nevneren er positiv
        if (this.nevner < 0) {
            this.teller = -this.teller;
            this.nevner = -this.nevner;
        }
    }

    // Metode for å finne største felles divisor (Euclids algoritme)
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Overstyrer vanlig formatering i java, som ville ha gitt en double som output i toString() for å vise brøken som tekst
    @Override
    public String toString() {
        return teller + "/" + nevner;
    }

    // Testprogram
    public static void main(String[] args) {
        Brok brok1 = new Brok(1, 2);
        Brok brok2 = new Brok(3, 4);

        brok1.add(brok2); // Legger til brok2 til brok1
        System.out.println("Sum: " + brok1);

        brok1 = new Brok(1, 2);
        brok1.subtract(brok2); // Subtraherer brok2 fra brok1
        System.out.println("Differanse: " + brok1);

        brok1 = new Brok(1, 2);
        brok1.multiply(brok2); // Multipliserer brok1 med brok2
        System.out.println("Produkt: " + brok1);

        brok1 = new Brok(1, 2);
        brok1.divide(brok2); // Dividerer brok1 med brok2
        System.out.println("Kvotient: " + brok1);
    }
}