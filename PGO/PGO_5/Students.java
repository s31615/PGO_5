import java.util.ArrayList;
import java.util.List;

public class Students {
    private static List<Student> studentsList = new ArrayList<>();

    public static void addStudent(Student student) {
        studentsList.add(student);
    }

    public static void promoteAllStudents() {
        for (Student student : studentsList) {
            student.promoteToNextSemester();
        }
    }

    public static void displayInfoAboutAllStudents() {
        for (Student student : studentsList) {
            System.out.println(student);
        }
    }

    // Inne metody zarządzania studentami
}
