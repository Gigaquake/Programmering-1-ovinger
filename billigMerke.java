public class billigMerke {
    public static void main(String[] args) {
        // Definerer prisene og vekten for merke A og B
        double prisA = 35.90;
        double vektA = 450; // gram

        double prisB = 39.50;
        double vektB = 500; // gram

        // Beregner prisen per gram for begge merkene
        double prisPerGramA = prisA / vektA;
        double prisPerGramB = prisB / vektB;

        // Sjekker hvilket merke som er billigst
        if (prisPerGramA < prisPerGramB) {
            System.out.println("Merke A er billigst.");
        } else if (prisPerGramB < prisPerGramA) {
            System.out.println("Merke B er billigst.");
        } else {
            System.out.println("Begge merkene har samme pris per gram.");
        }

        // Vis pris per gram for begge merkene
        System.out.printf("Pris per gram for Merke A: %.4f kr\n", prisPerGramA);
        System.out.printf("Pris per gram for Merke B: %.4f kr\n", prisPerGramB);
    }
}

