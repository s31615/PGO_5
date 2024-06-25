import java.util.ArrayList;
import java.util.List;

public class Student {
    public String imie;
    public List<Double> oceny;

    public Student(String imie) {
        this.imie = imie;
        this.oceny = new ArrayList<>();
    }

    public void dodajOcene(double ocena) {
        if (this.oceny.size() >= 20) {
            throw new IllegalArgumentException("Student może mieć maksymalnie 20 ocen.");
        }
        this.oceny.add(ocena);
    }

    public double obliczSrednia() {
        if (this.oceny.isEmpty()) {
            throw new IllegalArgumentException("Student nie ma żadnych ocen.");
        }
        double suma = 0;
        for (double ocena : this.oceny) {
            suma += ocena;
        }
        double srednia = suma / this.oceny.size();
        double[] zaokragloneWartosci = {2, 2.5, 3, 3.5, 4, 4.5, 5};
        double najblizsza = zaokragloneWartosci[0];
        for (double wartosc : zaokragloneWartosci) {
            if (Math.abs(wartosc - srednia) < Math.abs(najblizsza - srednia)) {
                najblizsza = wartosc;
            }
        }
        return najblizsza;
    }
}
