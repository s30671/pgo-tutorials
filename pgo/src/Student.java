import java.util.ArrayList;
import java.util.List;

public class Student {
    public String fname, lname, indexNumber, email, address;
    public List<Double> grades = new ArrayList<>();

    public Student(String fname, String lname, String indexNumber, String email, String address) {
        this.fname = fname;
        this.lname = lname;
        this.indexNumber = indexNumber;
        this.email = email;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", indexNumber='" + indexNumber + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", grades=" + grades +
                '}';
    }

    public void addGrade(double grade) {
        this.grades.add(grade);
    }

    public double obliczSrednia() {
        double average;
        if (grades.isEmpty()) {
            throw new IllegalArgumentException("Brakuje ocen");
        } else if (grades.size() > 20) {
            throw new IllegalArgumentException("Student moze miec maksymalnie 20 ocen");
        } else {
            double suma = 0;
            for (double grade : grades) {
                suma += grade;
            }
            return suma / grades.size();
        }
    }
}

