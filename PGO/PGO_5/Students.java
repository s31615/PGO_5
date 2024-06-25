import java.util.*;

public class Students {
    private static List<Student> students = new ArrayList<>();

    public static void addStudent(Student student) {
        students.add(student);
    }

    public static void promoteAllStudents() {
        for (Student student : students) {
            student.promoteToNextSemester();
        }
    }

    public static void addITNToAllStudents() {
        for (Student student : students) {
            student.addITN();
        }
    }

    public static void displayInfoAboutAllStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
