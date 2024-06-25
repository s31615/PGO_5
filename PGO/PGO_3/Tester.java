import java.util.ArrayList;

public class Tester extends Pracownik {
    ArrayList<String> rodzajeTestów = new ArrayList<>();

    public Tester(String imię, String nazwisko, String adres, String email, String pesel, int rokZatrudnienia) {
        super(imię, nazwisko, adres, email, pesel, rokZatrudnienia);
    }

    public void dodajRodzajTestu(String rodzajTestu) {
        rodzajeTestów.add(rodzajTestu);
    }

    @Override
    public int obliczPensję() {
        int pensja = super.obliczPensję();
        pensja += rodzajeTestów.size() * 300;
        return pensja;
    }
}
