import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        ProgramStudy programStudy = new ProgramStudy("IT", "AAA", 7, 5);
        Students students = new Students();

        Student student1 = new Student("Jan", "Kowalski", new Date(), "jan.kowalski@example.com", "ul. Kwiatowa 1, 00-001 Warszawa", programStudy);
        Student student2 = new Student("Anna", "Nowak", new Date(), "anna.nowak@example.com", "ul. Ogrodowa 2, 00-002 Warszawa", programStudy);

        students.addStudent(student1);
        students.addStudent(student2);


        students.promoteAllStudents();
        students.displayInfoAboutAllStudents();
    }
}