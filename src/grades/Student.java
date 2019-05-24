package grades;
import java.util.*;

public class Student {

    private String name;
    private String userName;
    private List<Integer> grades;

    Student(String name, String UserName){
        this.name = name;
        this.grades = new ArrayList<>();
        this.userName = UserName;
    }

    //  For pushing into Git.

    public String getName(){
        return name;
    }

    public String getUserName() {
        return userName;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
        double  total = 0;

        for(int i = 0; i < this.grades.size(); i++){
            total += this.grades.get(i);
        }
        return total / grades.size();
    }

    public static void main(String[] args) {

    }
}
