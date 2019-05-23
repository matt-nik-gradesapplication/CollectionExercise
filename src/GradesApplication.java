//package grades;
import grades.Student;
import java.util.*;

public class GradesApplication  {

   // Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {
        // HashMap(String, Student) student = new HashMap<>();
        HashMap<String, Student> student = new HashMap<>();
        Student Geo = new Student("Geo");
        Student Joe = new Student("Joe");
        Student Rico = new Student("Rico");
        Student Jerri = new Student("Jerri");

        student.put("Geo1445", Geo);
        student.put("Cri5900", Joe);
        student.put("TreV399", Rico);
        student.put("FDS01", Jerri);

        //HashMap () grades = new HashMap<>();
        //
        //
        //
        //

        System.out.println(student);

    }
    /*
        Student s1 = new Student("Geo");
        Student s2 = new Student("Joe");
        Student s3 = new Student("Rico");
        Student s4 = new Student("Jerri");

        //Student 1 Grades
        s1.addGrade(98);
        s1.addGrade(90);
        s1.addGrade(78);
        s1.addGrade(80);

        //Student 2 Grades
        s2.addGrade(89);
        s2.addGrade(67);
        s2.addGrade(78);
        s2.addGrade(97);

        //Student 3 Grades
        s3.addGrade(88);
        s3.addGrade(77);
        s3.addGrade(81);
        s3.addGrade(72);

        //Student 4 Grades
        s4.addGrade(99);
        s4.addGrade(90);
        s4.addGrade(96);
        s4.addGrade(98);

*/





//    public GradesApplication(String student, String gitUserName, int grade1, int grade2, int grade3) {
//
//        GradesApplication newStudent1 = new GradesApplication("Geo", "Geo1445", 70, 79, 88);
//        GradesApplication newStudent2 = new GradesApplication("Joe", "Cri5900", 89, 67, 45);
//        GradesApplication newStudent3 = new GradesApplication("Rico", "TreV399", 78, 99, 93);
//        GradesApplication newStudent4 = new GradesApplication("Jerri", "FDS01", 78,85,93);
//
//
//
//    }










}
