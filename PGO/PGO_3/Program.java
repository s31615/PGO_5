import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList<Pracownik> pracownicy = new ArrayList<>();

        // Tworzenie i dodawanie programistów
        Programista programista = new Programista("Jan", "Kowalski", "Warszawa", "jan@kowalski.com", "123456789", 2020);
        Technologia technologia = new Technologia("Java", 800);
        programista.dodajTechnologię(technologia);
        pracownicy.add(programista);

        // Tworzenie i dodawanie testerów
        Tester tester = new Tester("Anna", "Nowak", "Kraków", "anna@nowak.com", "987654321", 2021);
        tester.dodajRodzajTestu("UI/UX");
        pracownicy.add(tester);

        // Tworzenie i dodawanie managerów
        Manager manager = new Manager("Piotr", "Wiśniewski", "Gdańsk", "piotr@wisniewski.com", "1122334455", 2019);
        Cel cel = new Cel(2024, 10, 15, "Implementacja logowania przez FB", 1000);
        manager.dodajCel(cel);
        pracownicy.add(manager);

        // Obliczanie całkowitej kwoty do wypłaty
        int całkowitaKwota = 0;
        for (Pracownik pracownik : pracownicy) {
            całkowitaKwota += pracownik.obliczPensję();
        }

        System.out.println("Całkowita kwota do wypłaty w tym miesiącu: " + całkowitaKwota + " PLN");
    }
}
