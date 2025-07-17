package src.ProgramingChallenge_2;

public class StudentToString {
    String name;
    String age;
    String rollNumber;
    String house;

    public StudentToString( String name,String age, String rollNumber, String house ) {
        this.name = name;
        this.age = age;
        this.rollNumber =  rollNumber;
        this.house =  house;
    }

    @Override
    public String toString() {
        return "Student Details: {name:" + name
              +  ", age:" + age
                + ", roll number:" + rollNumber
              +  ", house:" + house + " }";
    }

    public static void main(String[] args) {
        StudentToString stu = new StudentToString("Vishal",
                "18", "45", "Shivaji");
        System.out.println(stu);
    }
}
