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

        System.out.println(student);

    }
}
