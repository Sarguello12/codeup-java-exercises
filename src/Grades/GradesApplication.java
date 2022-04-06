package Grades;

import java.util.ArrayList;
import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        Student sam = new Student("Sam", new ArrayList<>());
        sam.addGrade(100);
        sam.addGrade(95);
        sam.addGrade(98);

        Student jen = new Student("Jen", new ArrayList<>());
        jen.addGrade(80);
        jen.addGrade(100);
        jen.addGrade(97);

        Student mia = new Student("Mia", new ArrayList<>());
        mia.addGrade(100);
        mia.addGrade(75);
        mia.addGrade(98);

        Student luke = new Student("Luke", new ArrayList<>());
        luke.addGrade(90);
        luke.addGrade(80);
        luke.addGrade(95);

        HashMap<String, Student> students = new HashMap<>();
        students.put("sarguello12", sam);
        students.put("jenleigh98", jen);
        students.put("miamia78", sam);
        students.put("luker54", luke);

        System.out.println(students);
    }
}
