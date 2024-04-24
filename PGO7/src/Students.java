import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Students {
    private List<Student> studentList;

    public Students() {
        this.studentList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void promoteAllStudents() {
        for (Student student : studentList) {
            student.promoteToNextSemester();
        }
    }

    public void displayInfoAboutAllStudents() {
        for (Student student : studentList) {
            System.out.println("Student: " + student.getFirstName() + " " + student.getLastName() + ", Current Semester: " + student.getCurrentSemester());
        }
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}