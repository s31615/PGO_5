public abstract class Pojazd {
    protected String marka;
    protected String model;
    protected int rokProdukcji;

    public Pojazd(String marka, String model, int rokProdukcji) {
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
    }

    public abstract double obliczEfektywnoscPaliwowa();
}
