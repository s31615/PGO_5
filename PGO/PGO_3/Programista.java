import java.util.ArrayList;

public class Programista extends Pracownik {
    ArrayList<Technologia> technologie = new ArrayList<>();

    public Programista(String imię, String nazwisko, String adres, String email, String pesel, int rokZatrudnienia) {
        super(imię, nazwisko, adres, email, pesel, rokZatrudnienia);
    }

    public void dodajTechnologię(Technologia technologia) {
        technologie.add(technologia);
    }

    @Override
    public int obliczPensję() {
        int pensja = super.obliczPensję();
        for (Technologia technologia : technologie) {
            pensja += technologia.premia;
        }
        return pensja;
    }
}
