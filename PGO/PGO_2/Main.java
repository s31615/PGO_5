public class Main {
    public static void main(String[] args) {
        // Tworzenie studentów
        Student student1 = new Student("Jan Kowalski");
        Student student2 = new Student("Anna Nowak");

        // Dodawanie ocen
        student1.dodajOcene(4.0);
        student1.dodajOcene(3.5);
        student1.dodajOcene(5.0);

        // Obliczanie średniej ocen
        try {
            System.out.println("Średnia ocen studenta " + student1.imie + ": " + student1.obliczSrednia());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Tworzenie grupy studenckiej
        StudentGroup grupa = new StudentGroup("Grupa A");

        // Dodawanie studentów do grupy
        try {
            grupa.dodajStudenta(student1);
            grupa.dodajStudenta(student2);
            grupa.dodajStudenta(student1);  // To powinno zgłosić wyjątek
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
