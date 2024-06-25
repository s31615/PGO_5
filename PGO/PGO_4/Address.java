public class Address {

    public String createAddress(String kraj) {
        return String.format("Kraj: %s", kraj);
    }

    public String createAddress(String kraj, String miasto) {
        return String.format("Kraj: %s, Miasto: %s", kraj, miasto);
    }

    public String createAddress(String kraj, String miasto, String kodPocztowy) {
        return String.format("Kraj: %s, Miasto: %s, Kod pocztowy: %s", kraj, miasto, kodPocztowy);
    }

    public String createAddress(String kraj, String miasto, String kodPocztowy, String ulica) {
        return String.format("Kraj: %s, Miasto: %s, Kod pocztowy: %s, Ulica: %s", kraj, miasto, kodPocztowy, ulica);
    }

    public String createAddress(String kraj, String miasto, String kodPocztowy, String ulica, int numerMieszkania) {
        return String.format("Kraj: %s, Miasto: %s, Kod pocztowy: %s, Ulica: %s, Numer mieszkania: %d", kraj, miasto, kodPocztowy, ulica, numerMieszkania);
    }
}
