import java.sql.SQLOutput;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args){

// 1. Loop Basics
// a.
//        int i = 5;
//        while (i <= 15){
//            System.out.print(i + " ");
//            i++;
//        }

//        for(int i = 5; i <= 15; i++){
//            System.out.print(i + " ");
//        }

// b.
//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        } while(i <= 100);

//        for(int i = 0; i <= 100; i += 2){
//            System.out.println(i);
//        }

//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);

//        for(int i = 100; i >= -10; i -= 5){
//            System.out.println(i);
//        }

//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while(i < 1000000);

//        for(long i = 2; i < 1000000; i *=i){
//            System.out.println(i);
//        }

// 2. FizzBuzz

//        for(int i = 1; i <= 100; i++){
//            if (i % 3 == 0 && i % 5 == 0){
//                System.out.println("Fizz Buzz");
//            } else if (i % 3 == 0){
//                System.out.println("Fizz");
//            } else if (i % 5 == 0){
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

// 3. Display a table of powers.
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("What number would you like to go up to?");
//        int usersNum = sc.nextInt();
//
//        System.out.println("Here is your table!");
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | -----");
//        for(int i = 1; i <= usersNum; i++){
//
//            int squared = i * i;
//            int cubed = i * i * i;
//
//            System.out.println(i + "      | " + squared + "       |" + cubed);
//        }

// 4. Convert given number grades into letter grades.

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number between 0 and 100.");

        int usersNum = sc.nextInt();
        System.out.println(usersNum);


        if(usersNum >= 88){
            System.out.println("Your grade is a: A.");
        } else if (usersNum >= 80){
            System.out.println("Your grade is a: B.");
        } else if (usersNum >= 67){
            System.out.println("Your grade is a: C.");
        } else if (usersNum >= 60){
            System.out.println("Your grade is a: D.");
        } else if (usersNum >= 0){
            System.out.println("Your grade is a: F.");
        }

    }
}
