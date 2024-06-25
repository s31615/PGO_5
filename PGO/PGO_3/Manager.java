import java.util.ArrayList;

public class Manager extends Pracownik {
    ArrayList<Cel> cele = new ArrayList<>();

    public Manager(String imię, String nazwisko, String adres, String email, String pesel, int rokZatrudnienia) {
        super(imię, nazwisko, adres, email, pesel, rokZatrudnienia);
    }

    public void dodajCel(Cel cel) {
        cele.add(cel);
    }

    @Override
    public int obliczPensję() {
        int pensja = super.obliczPensję();
        for (Cel cel : cele) {
            // Zakładając, że bieżący miesiąc to październik 2024
            if (cel.rok == 2024 && cel.miesiąc == 10) {
                pensja += cel.premia;
            }
        }
        return pensja;
    }
}
