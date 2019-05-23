package grades;

import java.util.*;

public class Student {
    //Student objects
    private String studentName;     // Actual student name
    private String studentUserName; // GitHub Username
    private int studentGrade;       // Student Grade passed to an array
    private double studentAverage;  // Student Average based on studentGrade

    // Set requirements to access constructor
    public Student(String name, String userName, double avg) {
        this.studentName = name;
        this.studentUserName = userName;
        this.studentAverage = avg;
    }
    // Create a student from Object
    public static Student createAStudent(String name, String username, double avg) {
        Student newStudent = new Student(name, username, avg);
        return newStudent;
    }
    // Main Method to print out students
    public static void main(String[] args) {
       Student renderStudent = createAStudent("Nikho", "NVR202", 90.5);
        System.out.println(renderStudent);
    }

}