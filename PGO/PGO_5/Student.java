import java.util.Date;

public class Student {
    private static int nextIndexNumber = 1;
    private String indexNumber;
    private String imię;
    private String nazwisko;
    private Date dataUrodzenia;
    private String email;
    private String adres;
    private StudyProgramme programStudiow;
    private int bieżącySemestr;
    private String status;

    public Student(String imię, String nazwisko, String email, String adres, Date dataUrodzenia) {
        this.indexNumber = "s" + nextIndexNumber++;
        this.imię = imię;
        this.nazwisko = nazwisko;
        this.email = email;
        this.adres = adres;
        this.dataUrodzenia = dataUrodzenia;
        this.bieżącySemestr = 1;
        this.status = "kandydat";
    }

    // Getters and setters for all fields

    public void enrollStudent(StudyProgramme program) {
        this.programStudiow = program;
        this.status = "student";
    }

    public void addGrade(int grade, String subject) {
        // Implementacja dodawania oceny
    }

    public void promoteToNextSemester() {
        if (this.bieżącySemestr < this.programStudiow.getNumberOfSemesters()) {
            this.bieżącySemestr++;
        } else {
            this.status = "absolwent";
        }
    }

    // Inne metody
}
