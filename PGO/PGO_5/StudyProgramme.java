public class StudyProgramme {
    private String nazwa;
    private String opis;
    private int liczbaSemestrow;
    private int maxITN;

    public StudyProgramme(String nazwa, String opis, int liczbaSemestrow, int maxITN) {
        this.nazwa = nazwa;
        this.opis = opis;
        this.liczbaSemestrow = liczbaSemestrow;
        this.maxITN = maxITN;
    }

    // Getters and setters for all fields

    public int getNumberOfSemesters() {
        return liczbaSemestrow;
    }

    public int getMaxITN() {
        return maxITN;
    }
}
