import java.util.ArrayList;
import java.util.List;

public class StudentGroup {
    public String name;
    public List<Student> students = new ArrayList<>();

    public StudentGroup(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        if(students.size() >= 15) {
            throw new IllegalStateException("Nie można dodać dodatkowych osób do grupy, ograniczenie to 15 osób.");
        }
        if(students.contains(student)) {
            throw new IllegalStateException("Student jest już w grupie.");
        }
        students.add(student);
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}
