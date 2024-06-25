public class Ciezarowka extends Pojazd {
    private double przejechaneMile;
    private double zuzytePaliwo;
    private double wagaLadunku;

    public Ciezarowka(String marka, String model, int rokProdukcji, double przejechaneMile, double zuzytePaliwo, double wagaLadunku) {
        super(marka, model, rokProdukcji);
        this.przejechaneMile = przejechaneMile;
        this.zuzytePaliwo = zuzytePaliwo;
        this.wagaLadunku = wagaLadunku;
    }

    @Override
    public double obliczEfektywnoscPaliwowa() {
        return przejechaneMile / (zuzytePaliwo + (wagaLadunku * 0.5));
    }
}
