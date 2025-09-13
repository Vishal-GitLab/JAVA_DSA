package src.Practice.Challenge.Challenge_52;

public class Course {
    static int maxCapacity;
    // Instance variables (unique for each course object)
    String courseName ;
    int enrollments;

    String[] enrolledStudent;  // Array to store names of enrolled students


    // Constructor to initialize a Course object
    Course(String courseName) {
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrolledStudent = new String[maxCapacity];  // allocate array of size = maxCapacity

    }


    // Static method to set maximum capacity for ALL courses
    static void setMaxCapacity( int maxCapacity){
        Course.maxCapacity = maxCapacity;  // assigns to static variable
    }
    // Method to enroll a student in this course
    void EnrolledStudent(String StudentName) {
        enrolledStudent[enrollments] = StudentName;   // put student in next free slot
        enrollments++;
    }
    // Method to unenroll (remove) a student
    void unenrollStudent(String Student) {
        System.out.println("Student removed");
        enrollments--;
    }


}
