package src.ProgramingChallenge_2.ChallengeCoding.Challeneg79;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("Vishal Chaurasiya", 30, 25000);
        System.out.println(emp.getEmployeeDetails());
        emp.setName("Golu");
        System.out.println(emp.getEmployeeDetails());
    }
}
