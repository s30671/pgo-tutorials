

import java.util.ArrayList;

//ctrl + o do nadpisywania metod. Wymagany aktywny kursor na nazwie klasy
public class Tester extends Employee{
    private ArrayList<String> testTypes;
    public Tester(String name, String surname, String address, String email, String PESEL, int yearOfEmployment) {
        super(name, surname, address, email, PESEL, yearOfEmployment);
        this.testTypes = new ArrayList<>();
    }
    public void addTestType(String testType){
        testTypes.add(testType);
    }

    @Override
    public int calculateSalary() {
        int baseSalary = super.calculateSalary();
        int bonus = testTypes.size() * 300;
        return baseSalary + bonus;
    }
}



