package grades;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        Map<String, Student> students = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        // Create Student Objects with at least 3 grades
        Student Geo = new Student("Geo", "Geo1445");
        Student Joe = new Student("Joe", "Cri5900");
        Student Rico = new Student("Rico", "TreV399");
        Student Jerri = new Student("Jerri", "FDS01");

        Geo.addGrade(60);
        Geo.addGrade(78);
        Geo.addGrade(67);
        Geo.addGrade(30);

        Joe.addGrade(55);
        Joe.addGrade(90);
        Joe.addGrade(98);
        Joe.addGrade(98);

        Rico.addGrade(52);
        Rico.addGrade(98);
        Rico.addGrade(63);
        Joe.addGrade(98);

        Jerri.addGrade(99);
        Jerri.addGrade(99);
        Jerri.addGrade(99);

        students.put("Geo1445", Geo);
        students.put("Cri5900", Joe);
        students.put("TreV399", Rico);
        students.put("FDS01", Jerri);




        /* Control Statement */
        System.out.println("____    __    ____  _______  __        ______   ______   .___  ___.  _______ \n" +
                "\\   \\  /  \\  /   / |   ____||  |      /      | /  __  \\  |   \\/   | |   ____|\n" +
                " \\   \\/    \\/   /  |  |__   |  |     |  ,----'|  |  |  | |  \\  /  | |  |__   \n" +
                "  \\            /   |   __|  |  |     |  |     |  |  |  | |  |\\/|  | |   __|  \n" +
                "   \\    /\\    /    |  |____ |  `----.|  `----.|  `--'  | |  |  |  | |  |____ \n" +
                "    \\__/  \\__/     |_______||_______| \\______| \\______/  |__|  |__| |_______|!");

        String promptUser;

        do {
            System.out.println("Get student average grade from usernames below:");
            System.out.println("|---------|---------|---------|-------|");
            System.out.format("| %s | %s | %s | %s", Geo.getUserName(), Joe.getUserName(), Rico.getUserName(), Jerri.getUserName() + '\n');
            System.out.println("|---------|---------|---------|-------|");

            String userGradeRequested = scan.nextLine();

            if (students.containsKey(userGradeRequested)) {
                System.out.println("________________________");
                System.out.println("| Student Name: " + students.get(userGradeRequested).getName());
                System.out.println("| GitHub User : " + students.get(userGradeRequested).getUserName());
                System.out.println("| Current Avg : " + students.get(userGradeRequested).getGradeAverage());
                System.out.println("________________________");

            } else {
                System.out.format("No user named %s found \n ", userGradeRequested);
            }
            System.out.println("Would you like to see user grades? Yes / No");
            promptUser = scan.nextLine();
        } while(promptUser.equalsIgnoreCase("yes"));
    }
}