package src.Practice.Challenge.Challenge_70;

public class StudentToString {

    // Instance variables (attributes of Student)
    String name;
        String age;
        String rollNum;
        String house;


    // Constructor: used to initialize the object when created
        public StudentToString(String name, String age, String rollNum, String house) {
            // "this" keyword refers to current object
            this.name = name;
            this.age = age;
            this.rollNum = rollNum;
            this.house = house;
        }


    // Overriding the toString() method of Object class
    // This will define how the object should be displayed when printed
    @Override
    public String toString(){
            return "Student details: {name: " + name
                    +  " ,age: " + age +
                " , rollNum: " + rollNum + " ,house: " +house + " } ";

    }

    public static void main(String[] args) {
        // Creating a new StudentToString object with values
        StudentToString sb = new  StudentToString("Vishal", "18","45","Shivaji");
        System.out.println(sb);
    }

    }

