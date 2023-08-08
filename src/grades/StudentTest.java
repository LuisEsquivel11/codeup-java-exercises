package grades;

public class StudentTest {

    public static void main(String[] args) {
        Student luis = new Student("Luis");
        luis.addGrade(80);
        luis.addGrade(90);
        luis.addGrade(50);
        System.out.println(luis.getGrades());
        System.out.println(luis.getGradeAverage());
    }
}
