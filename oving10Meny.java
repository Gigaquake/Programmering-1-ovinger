public class oving10Meny {
    public static void main(String[] args) {
        MenyRegister register = new MenyRegister();

        // Oppretter retter
        Rett rett1 = new Rett("Bruschetta", "Forrett", 59.0, "Tomat, basilikum, brød");
        Rett rett2 = new Rett("Spaghetti Bolognese", "Hovedrett", 129.0, "Spaghetti, kjøttsaus");
        Rett rett3 = new Rett("Tiramisu", "Dessert", 80.0, "Mascarpone, kaffe, kjeks");
        Rett rett4 = new Rett("Fiskesuppe", "Forrett", 80.0, "Tomat, basilikum, brød");
        Rett rett5 = new Rett("Pepperoni Pizza", "Hovedrett", 140.0, "Spaghetti, kjøttsaus");
        Rett rett6 = new Rett("Jordbær sorbe", "Dessert", 40.0, "Mascarpone, kaffe, kjeks");

        // Registrerer retter
        register.registrerRett(rett1);
        register.registrerRett(rett2);
        register.registrerRett(rett3);
        register.registrerRett(rett4);
        register.registrerRett(rett5);
        register.registrerRett(rett6);

        // Oppretter en meny og legger til retter
        Meny meny1 = new Meny();
        meny1.leggTilRett(rett1);
        meny1.leggTilRett(rett2);
        meny1.leggTilRett(rett3);

        Meny meny2 = new Meny();
        meny2.leggTilRett(rett4);
        meny2.leggTilRett(rett5);
        meny2.leggTilRett(rett6);

        // Registrerer meny
        register.registrerMeny(meny1);
        register.registrerMeny(meny2);

        // Tester operasjoner
        System.out.println("Finn rett ved navn 'Spaghetti Bolognese':");
        System.out.println(register.finnRett("Spaghetti Bolognese"));
        System.out.println("Finn rett ved navn 'Apekatter':");
        System.out.println(register.finnRett("Apekatter"));


        System.out.println("\nFinn alle retter av type 'Dessert':");
        for (Rett dessert : register.finnRetterAvType("Dessert")) {
            System.out.println(dessert);
        }

        System.out.println("\nFinn menyer med totalpris mellom 100 og 300:");
        for (Meny meny : register.finnMenyerInnenforPrisIntervall(100, 300)) {
            System.out.println(meny);
        }
    }
}
