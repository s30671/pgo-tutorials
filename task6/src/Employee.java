public class Employee{
    //protected String name;
    public String name;
    public String surname;
    public String address;
    public String email;
    public String PESEL;
    public int yearOfEmployment;

    public Employee(String name, String surname, String address, String email, String PESEL, int yearOfEmployment) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.email = email;
        this.PESEL = PESEL;
        this.yearOfEmployment = yearOfEmployment;
    }

    public Employee(String name, int bonus) {
    }
    public int calculateSalary() {
        int salary = 3000 + (2024 - yearOfEmployment) * 1000;
        return salary;
    }
}



