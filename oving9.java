public class oving9 {
        public static void main(String[] args) {
            Student student = new Student("Bjarne");
            System.out.println(student);
    
            student.økAntOppg(3);
            System.out.println(student);
    
            System.out.println("Navn: " + student.getNavn());
            System.out.println("Antall oppgaver: " + student.getAntOppg());
        


            Oppgaveoversikt oversikt = new Oppgaveoversikt(5);
    
            oversikt.registrerStudent("Even Eielsen");
            oversikt.registrerStudent("Simen Eielsen");
            oversikt.registrerStudent("Simen Eielsen"); // Siden det er en student som finnes, returnerer Oppgaveoversikt.registrerStudent false
            oversikt.registrerStudent("Tore");
            oversikt.registrerStudent("Heidi");
            oversikt.registrerStudent("Grete");
            oversikt.registrerStudent("Jan"); // Siden maxAntStudenter er satt til 5 vil ikke Jan komme med

            System.out.println(oversikt);
    
            oversikt.økAntOppgaver("Even Eielsen", 3);
            oversikt.økAntOppgaver("Simen Eielsen", 5);
    
            System.out.println("Antall oppgaver for Ola: " + oversikt.getAntOppgaver("Ola Nordmann")); // Ola Nordmann eksisterer ikke so student, så denne returnerer dermed -1
            System.out.println("Antall oppgaver for Even: " + oversikt.getAntOppgaver("Even Eielsen"));
            System.out.println("Antall oppgaver for Even: " + oversikt.getAntOppgaver("Simen Eielsen"));
            
            System.out.println("Antall studenter: " + oversikt.getAntStudenter());

            System.out.println(oversikt);
        }
    }
