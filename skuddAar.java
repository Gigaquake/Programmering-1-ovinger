import java.util.Scanner;

public class skuddAar {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Skriv inn et år: ");
    int aar = scanner.nextInt();

    if (erSkuddAar(aar)) {
        System.out.println(aar + " er et skuddår.");
    } else {
        System.out.println(aar + " er ikke et skuddår.");
    }

    // Lukker scanneren
    scanner.close();
}

// Sjekke om et år er skuddår
public static boolean erSkuddAar(int aar) {
    // Året er et skuddår hvis det er delelig med 4, men ikke med 100
    // med mindre det også er delelig med 400
    if (aar % 4 == 0) {
        if (aar % 100 == 0) {
            return aar % 400 == 0;
        } else {
            return true;
        }
    } else {
        return false;
    }
}
}

