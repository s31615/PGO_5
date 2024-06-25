import java.util.*;

public class Main {
    private static List<StudyProgramme> studyProgrammes = new ArrayList<>();

    public static void main(String[] args) {
        initializeStudyProgrammes();

        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        while (running) {
            System.out.println("Co chcesz zrobić?");
            System.out.println("1. Dodaj nowego studenta");
            System.out.println("2. Wyświetl listę studentów");
            System.out.println("3. Zakończ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline character after nextInt()

            switch (choice) {
                case 1:
                    addNewStudent(scanner);
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
                    running = false;
                    break;
                default:
                    System.out.println("Nieprawidłowy wybór. Spróbuj ponownie.");
            }
        }

        scanner.close();
    }

    private static void initializeStudyProgrammes() {
        studyProgrammes.add(new StudyProgramme("Informatyka", "Program studiów związany z informatyką", 7, 5));
        studyProgrammes.add(new StudyProgramme("Zarządzanie informacją", "Program studiów związany z zarządzaniem informacją", 6, 4));
        studyProgrammes.add(new StudyProgramme("Projektowanie graficzne", "Program studiów związany z projektowaniem graficznym", 8, 6));
    }

    private static void addNewStudent(Scanner scanner) {
        System.out.println("Wprowadź dane nowego ucznia:");
        System.out.print("Imię: ");
        String firstName = scanner.nextLine();

        System.out.print("Nazwisko: ");
        String lastName = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Adres: ");
        String address = scanner.nextLine();

        System.out.print("Numer telefonu: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Data urodzenia (RRRR-MM-DD): ");
        String dobString = scanner.nextLine();
        Date dateOfBirth = parseDateOfBirth(dobString);

        // Wyświetlamy dostępne programy studiów do wyboru
        System.out.println("Dostępne programy studiów:");
        for (int i = 0; i < studyProgrammes.size(); i++) {
            System.out.println((i + 1) + ". " + studyProgrammes.get(i).getName());
        }

        System.out.print("Wybierz numer programu studiów: ");
        int programmeChoice = scanner.nextInt();
        scanner.nextLine(); // consume newline character after nextInt()

        if (programmeChoice < 1 || programmeChoice > studyProgrammes.size()) {
            System.out.println("Nieprawidłowy wybór programu studiów.");
            return;
        }

        StudyProgramme selectedProgramme = studyProgrammes.get(programmeChoice - 1);

        // Tworzymy nowego studenta na podstawie wprowadzonych danych
        Student newStudent = new Student(firstName, lastName, email, address, phoneNumber, dateOfBirth);
        newStudent.enrollStudent(selectedProgramme); // Przypisanie studenta do wybranego programu studiów

        // Ustawienie statusu studenta
        String status = chooseStatus(scanner);
        newStudent.setStatus(status);

        // Jeśli student ma status "Student", prosimy o wprowadzenie listy semestrów
        if ("Student".equals(status)) {
            setSemesters(scanner, newStudent);
        }

        // Dodanie studenta do listy
        Students.addStudent(newStudent);

        System.out.println("Nowy student dodany:");
        System.out.println(newStudent);
    }

    private static String chooseStatus(Scanner scanner) {
        System.out.println("Wybierz status studenta:");
        System.out.println("1. Kandydat");
        System.out.println("2. Student");
        System.out.println("3. Absolwent");

        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline character after nextInt()

        switch (choice) {
            case 1:
                return "Candidate";
            case 2:
                return "Student";
            case 3:
                return "Graduate";
            default:
                System.out.println("Nieprawidłowy wybór. Wybrano domyślnie status 'Kandydat'.");
                return "Candidate";
        }
    }

    private static void setSemesters(Scanner scanner, Student student) {
        System.out.println("Wprowadź listę semestrów oddzielonych spacjami (np. '1 2 3'): ");
        String input = scanner.nextLine();
        String[] semesterStrings = input.split(" ");
        List<Integer> semesters = new ArrayList<>();

        for (String semesterString : semesterStrings) {
            try {
                int semester = Integer.parseInt(semesterString);
                semesters.add(semester);
            } catch (NumberFormatException e) {
                System.out.println("Nieprawidłowy format semestru: " + semesterString);
            }
        }

        student.setSemesters(semesters);
    }

    private static void displayStudents() {
        System.out.println("Lista studentów:");
        Students.displayInfoAboutAllStudents();
    }

    private static Date parseDateOfBirth(String dobString) {
        // Tutaj można dodać parsowanie daty urodzenia z Stringa do obiektu Date
        // Na potrzeby tego przykładu można zwrócić null lub użyć domyślnych wartości
        return null;
    }
}
