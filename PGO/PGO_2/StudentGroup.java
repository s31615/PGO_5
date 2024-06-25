import java.util.ArrayList;
import java.util.List;

public class StudentGroup {
    public String nazwaGrupy;
    public List<Student> studenci;

    public StudentGroup(String nazwaGrupy) {
        this.nazwaGrupy = nazwaGrupy;
        this.studenci = new ArrayList<>();
    }

    public void dodajStudenta(Student student) {
        if (this.studenci.size() >= 15) {
            throw new IllegalStateException("Grupa może mieć maksymalnie 15 studentów.");
        }
        if (this.studenci.contains(student)) {
            throw new IllegalStateException("Student jest już w grupie.");
        }
        this.studenci.add(student);
    }
}
