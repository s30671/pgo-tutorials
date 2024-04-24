import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student {
    private static int nextStudentNumber = 1;

    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String email;
    private String address;
    private String studentNumber;
    private ProgramStudy programStudy;
    private int currentSemester;
    private int itnCount;
    private String status;

    public Student(String firstName, String lastName, Date dateOfBirth, String email, String address, ProgramStudy programStudy) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.address = address;
        this.programStudy = programStudy;
        this.currentSemester = 1;
        this.itnCount = 0;
        this.status = "kandydat";
        generateStudentNumber();
    }

    private void generateStudentNumber() {
        this.studentNumber = "s" + nextStudentNumber++;
    }


    public void promoteToNextSemester() {
        if (currentSemester < programStudy.getNumberOfSemesters()) {
            if (itnCount > programStudy.getItnLimit()) {
                System.out.println("Student " + firstName + " " + lastName + " has too many ITN's to be promoted.");
            } else {
                currentSemester++;
                itnCount = 0;
                System.out.println("Student " + firstName + " " + lastName + " has been promoted to semester " + currentSemester);
            }
        } else {
            status = "Graduate";
            System.out.println("Student " + firstName + " " + lastName + " has graduated.");
        }
    }

    // Gettery i settery dla wszystkich pól
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public ProgramStudy getProgramStudy() {
        return programStudy;
    }

    public void setProgramStudy(ProgramStudy programStudy) {
        this.programStudy = programStudy;
    }

    public int getCurrentSemester() {
        return currentSemester;
    }

    public void setCurrentSemester(int currentSemester) {
        this.currentSemester = currentSemester;
    }

    public int getItnCount() {
        return itnCount;
    }

    public void setItnCount(int itnCount) {
        this.itnCount = itnCount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}