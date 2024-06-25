import java.util.*;

public class Student {
    private static int nextIndexNumber = 1;

    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String phoneNumber;
    private Date dateOfBirth;
    private String indexNumber; // Zmiana typu numeru indeksu na String
    private StudyProgramme studyProgramme;
    private List<Integer> semesters; // Lista semestrów dla studenta
    private int itnCount; // Incomplete Term Notices count
    private String status; // Status: "Candidate", "Student", "Graduate"

    private List<Grade> grades;

    public Student(String firstName, String lastName, String email, String address, String phoneNumber, Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.indexNumber = "s" + nextIndexNumber++; // Formatowanie numeru indeksu
        this.grades = new ArrayList<>();
        this.semesters = new ArrayList<>(); // Inicjalizacja listy semestrów
        this.itnCount = 0;
        this.status = "Candidate"; // Initial status
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void enrollStudent(StudyProgramme studyProgramme) {
        this.studyProgramme = studyProgramme;
        // Inicjalizacja listy semestrów na podstawie programu studiów
        for (int i = 1; i <= studyProgramme.getNumberOfSemesters(); i++) {
            semesters.add(i);
        }
    }

    public void addGrade(int gradeValue, String courseName) {
        if (semesters.size() <= studyProgramme.getNumberOfSemesters()) {
            Grade grade = new Grade(gradeValue, courseName);
            grades.add(grade);
        } else {
            System.out.println("Cannot add grade. Student is on the last semester.");
        }
    }

    public void promoteToNextSemester() {
        if (semesters.size() < studyProgramme.getNumberOfSemesters()) {
            semesters.add(semesters.size() + 1);
            System.out.println("Promoted to semester " + semesters.size());
        } else {
            System.out.println("Student has completed all semesters.");
            setStatus("Graduate");
        }
    }

    public void addITN() {
        itnCount++;
        if (itnCount >= studyProgramme.getMaxITNs()) {
            System.out.println("Exceeded maximum ITNs. Status set to Graduate.");
            setStatus("Graduate");
        }
    }

    public void setStatus(String status) {
        this.status = status;
        if ("Candidate".equals(status)) {
            semesters.clear(); // W przypadku kandydata czyścimy listę semestrów
        } else if ("Graduate".equals(status)) {
            semesters.clear(); // W przypadku absolwenta czyścimy listę semestrów
        }
    }

    public void setSemesters(List<Integer> semesters) {
        this.semesters = semesters;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        String statusDescription;
        if ("Candidate".equals(status)) {
            statusDescription = "Kandydat";
        } else if ("Student".equals(status)) {
            statusDescription = "Student semestrów: " + semesters;
        } else if ("Graduate".equals(status)) {
            statusDescription = "Absolwent";
        } else {
            statusDescription = "Status nieznany";
        }

        return "Student{" +
                "indexNumber='" + indexNumber + '\'' +
                ", fullName='" + getFullName() + '\'' +
                ", email='" + email + '\'' +
                ", status='" + statusDescription + '\'' +
                '}';
    }
}
