import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){
//        double pi = 3.14159;
//        System.out.printf("The value of pis is approximately %.2f", pi);

        Scanner sc = new Scanner(System.in);

//        System.out.println("Please enter your favorite number.");
//        int favNum = sc.nextInt();
//        System.out.println("Your favorite number is: " + favNum);

//        System.out.print("Please enter your first, middle, and last names.");
//        String firstName = sc.next();
//        String middleName = sc.next();
//        String lastName = sc.next();
//        System.out.printf("Your full name is: %s %s %s!", firstName, middleName, lastName);

//        System.out.println("Please enter a sentence");
//        String sentence = sc.nextLine();
//        System.out.println(sentence);

        System.out.println("Please enter the length of your classroom.");
        float length = Float.parseFloat(sc.nextLine());
        System.out.println("Please enter the width of your classroom.");
        float width = Float.parseFloat(sc.nextLine());

        float area = length * width;
        float parameter = (length * 2) + (width * 2);

        System.out.printf("The area of the classroom is: %.2f.%nThe parameter of the classroom is %.2f.", area, parameter);
    }
}
