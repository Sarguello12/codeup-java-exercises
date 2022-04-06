package Grades;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentName;
    private ArrayList<Integer> grades;

    public Student(String studentName, ArrayList<Integer> grades) {
        this.studentName = studentName;
        this.grades = grades;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // returns the average of the students grades
    public int getGradeAverage(List <Integer> grades) {
        Integer sum = 0;

        for (Integer grade : grades) {
            sum += grade;
        }

        return sum / grades.size();
    }

    // returns the student's name
    public String getName() {
        return studentName;
    }

    // returns the student's grades
    public ArrayList<Integer> getGrades() {
        return grades;
    }
}
