package grades;

import shapes.Square;

import java.util.ArrayList;

public class Student {
    private ArrayList<Integer> grades;
    private String name;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName() {
        return this.name;
    }

    public Integer getGrade(int index) {
        return grades.get(index);
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage() {
        double total = 0;
        for (int i = 0; i < grades.size(); i++) {
            int grade = grades.get(i);
            total += grade;

        }
        return total / grades.size();
    }

}
