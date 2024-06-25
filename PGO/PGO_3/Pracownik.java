public class Pracownik {
    String imię;
    String nazwisko;
    String adres;
    String email;
    String pesel;
    int rokZatrudnienia;
    int podstawowaPensja = 3000;

    public Pracownik(String imię, String nazwisko, String adres, String email, String pesel, int rokZatrudnienia) {
        this.imię = imię;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.email = email;
        this.pesel = pesel;
        this.rokZatrudnienia = rokZatrudnienia;
    }

    public int obliczPensję() {
        int lataPracy = 2024 - this.rokZatrudnienia; // Zakładamy, że obecny rok to 2024
        return podstawowaPensja + (lataPracy * 1000);
    }
}
