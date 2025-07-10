package src.ProgramingChallenge_2;

public class Course {
    static int maxCapacity = 100;
    String courseName;
    int enrollments;

    String[] enrolledStudents;

    Course(String courseName) {
        this.courseName = courseName;
        this.enrollments = 0;
       this.enrolledStudents = new String[maxCapacity];
    }


   static void setMaxCapacity(int  maxCapacity) {
                           // nam ka conflict hota hai aur hme instance variable use karna hai to hm  this ka use karte hai ,,,,
                           // aur agr nam conflict hai aur  static variable hai to hm class ke nam ka use karte hai
            Course.maxCapacity = maxCapacity;
   }

   void enrollStudents(String studentName) {
        enrolledStudents[enrollments] = studentName;
        enrollments++;
   }
   void unenrollStudent(String studentName) {
       System.out.println("Student removed");
       enrollments--;
   }
   
}
