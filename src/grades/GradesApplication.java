package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Student> students = new HashMap<>();
        Student luis = new Student("Luis");
        Student cesar = new Student("Cesar");
        Student sam = new Student("Sam");
        Student pickleRick = new Student("PickleRick");
        luis.addGrade(99);
        luis.addGrade(95);
        luis.addGrade(93);
        cesar.addGrade(97);
        cesar.addGrade(98);
        cesar.addGrade(99);
        sam.addGrade(95);
        sam.addGrade(94);
        sam.addGrade(97);
        pickleRick.addGrade(99);
        pickleRick.addGrade(99);
        pickleRick.addGrade(99);
        students.put("LuisTheDeveloper", luis);
        students.put("CesarCodesMagic", cesar);
        students.put("SamCanSout", sam);
        students.put("FUImPickleRick", pickleRick);

        System.out.println(students.keySet());
        String again;
        do {
        System.out.println("Which student would you like to learn more about?");
        String userName = scanner.next();

            if (students.containsKey(userName)) {
                Object student = students.get(userName);
                System.out.println("Name: " + ((Student) student).getName() +" Github Username: " + userName + " Grades: " + ((Student) student).getGrades());
            } else {
                System.out.println("No users with that username were found.");
            }
            System.out.println("Would you like to see another student? y|n");
             again = scanner.next();
        } while (again.equalsIgnoreCase("y"));

    }

}
