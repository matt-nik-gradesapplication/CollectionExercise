package grades;

import java.util.*;

public class Student {
    //Student objects
    private String studentName;     // Actual student name
    private String studentUserName; // GitHub Username
    private int studentGrade;       // Student Grade passed to an array
    private double studentAverage;  // Student Average based on studentGrade

    // Set requirements to access constructor
    //public Student(String name, String userName, double avg)
    public Student(String name) {
        this.studentName = name;
        //this.studentUserName = userName;
        //this.studentAverage = avg;
    }

    // Main Method to print out students
    public static void main(String[] args) {

    }

    public static double addGrade() {
        return 0;
    }

}
