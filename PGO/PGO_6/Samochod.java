public class Samochod extends Pojazd {
    private double przejechaneMile;
    private double zuzytePaliwo;

    public Samochod(String marka, String model, int rokProdukcji, double przejechaneMile, double zuzytePaliwo) {
        super(marka, model, rokProdukcji);
        this.przejechaneMile = przejechaneMile;
        this.zuzytePaliwo = zuzytePaliwo;
    }

    @Override
    public double obliczEfektywnoscPaliwowa() {
        return przejechaneMile / zuzytePaliwo;
    }
}
