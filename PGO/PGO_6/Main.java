public class Main {
    public static void main(String[] args) {
        Samochod samochod = new Samochod("Toyota", "Corolla", 2018, 15000, 500);
        Ciezarowka ciezarowka = new Ciezarowka("Mercedes", "Actros", 2020, 8000, 1000, 5);

        System.out.println("Efektywność paliwowa samochodu: " + samochod.obliczEfektywnoscPaliwowa() + " mpg");
        System.out.println("Efektywność paliwowa ciężarówki: " + ciezarowka.obliczEfektywnoscPaliwowa() + " mpg");
    }
}
