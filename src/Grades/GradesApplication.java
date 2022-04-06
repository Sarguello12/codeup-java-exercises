package Grades;

import java.util.*;


public class GradesApplication{

    public static void main(String[] args) {
        //creating new students ArrayLists
        Student sam = new Student("Sam");
        sam.addGrade(100);
        sam.addGrade(95);
        sam.addGrade(98);

        Student jen = new Student("Jen");
        jen.addGrade(80);
        jen.addGrade(100);
        jen.addGrade(97);

        Student mia = new Student("Mia");
        mia.addGrade(100);
        mia.addGrade(75);
        mia.addGrade(98);

        Student luke = new Student("Luke");
        luke.addGrade(90);
        luke.addGrade(80);
        luke.addGrade(95);

        //creating a hashMap with userNames and student objects
        HashMap<String, Student> students = new HashMap<>();
        students.put("sarguello12", sam);
        students.put("jenleigh98", jen);
        students.put("miamia78", mia);
        students.put("luker54", luke);

        //program begins with welcome message
        System.out.println("Welcome!");

        //initial declaration of userInput2 to allow do-while loop to function
        String userInput2;

        //do will run once and then continue to run until the user prompts "N"
        do {
            System.out.println("Here are the GitHub usernames of our students:");
            //displays all userNames of students
            for(Map.Entry<String, Student> studentsEntry : students.entrySet()){
                System.out.printf("|%s| ", studentsEntry.getKey());
            }
            //prompts to user to enter a student to view info or see total report card
            System.out.println("\n\nWhat student would you like to see more information on?\nEnter \"Total\" for class report card.");

            //listens to users input
            Scanner sc1 = new Scanner(System.in);
            String userInput1 = sc1.nextLine();

            //if user enters "total" the total report card will be displayed to the console
            if(userInput1.toLowerCase(Locale.ROOT).equals("total")){
                //loops through hashMap to display studentName, grades, and grade average
                for(Map.Entry<String, Student> studentsEntry : students.entrySet()){
                    System.out.println(studentsEntry.getValue().getName() + " : " + studentsEntry.getValue().getGrades() + " = " +studentsEntry.getValue().getGradeAverage(studentsEntry.getValue().getGrades()) + "%");
                }
            }
            //if user enters an individual name students information will be displayed to the console
            else if (students.containsKey(userInput1)) {
                System.out.println("Name: " + students.get(userInput1).getName() + "\nGithub UserName: " + userInput1 + "\nCurrent Average: " + students.get(userInput1).getGradeAverage(students.get(userInput1).getGrades()) + "%" + "\nGrades: " + students.get(userInput1).getGrades());
            } else {
                System.out.println("Sorry no student found");
            }

            //prompts user if they would like to view more information
            System.out.println("Would you like to view another student? [y/N]");
            Scanner sc2 = new Scanner(System.in);
            userInput2 = sc2.nextLine();


        //while user enters "y" code will continue to run
        } while(userInput2.equals("y"));

        //exit message will run once program is terminated
        System.out.println("Goodbye, Have a wonderful day!");
    }
}
