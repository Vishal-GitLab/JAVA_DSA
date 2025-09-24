package src.Practice.Challenge.Challenge_79;

public class Employee {
    public static void main(String[] args) {
        EmployeeTest emp = new EmployeeTest("Vishal",18,2000);
        emp.getEmployeeDetails();
        System.out.println(emp.getEmployeeDetails());
        emp.setName("Ankit");
        System.out.println(emp.getEmployeeDetails());
        emp.setSalary(2400);
        System.out.println(emp.getEmployeeDetails());
    }
}
