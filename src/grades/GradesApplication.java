package grades;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {

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



    }
}
