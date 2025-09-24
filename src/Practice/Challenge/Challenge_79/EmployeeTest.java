package src.Practice.Challenge.Challenge_79;

public class EmployeeTest {
    private String name;
    private int age;
    private double salary;



    public EmployeeTest(String name, int age, double salary){
                   this.name = name;
                   this.age = age;
                   this.salary = salary;

    }

    String getEmployeeDetails() {
        return "EmployeeDetails: Name: " + name +
                ", age: " + age + ", Salary: " + salary;
    }



    // Getter method for 'name' variable
    // It allows other classes to read the private variable 'name'
    public String getName() {
        return name;           // returns the value stored in 'name'
    }



    // Setter method for 'name' variable
    // It allows other classes to change/update the private variable 'name'
    public void  setName(String name) {
        this.name = name;
    }


    
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }
    public void  setSalary(double salary) {
        this.salary = salary;
    }







}
