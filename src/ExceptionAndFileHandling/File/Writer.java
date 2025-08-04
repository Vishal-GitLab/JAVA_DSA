package src.ExceptionAndFileHandling.File;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void main(String[] args) {
        String fileName = "java-course.txt";

        try (FileWriter writer = new FileWriter(fileName)) {                 // try with resource
            writer.write("This is the best Java course\n");
            for (int i = 0; i < 10000; i++) {
                writer.write('*');
            }
            writer.flush();
            System.out.println("File Written successfully");
        } catch (IOException exception) {
            System.out.println("Exception occurred %s\n");
            exception.getMessage();
        }
    }
}
