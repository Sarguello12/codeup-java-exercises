import java.util.Scanner;
import java.util.Random;

public class MethodsExercises {
//1.
    public static int addition(int num1, int num2){
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2){
        return num1 - num2;
    }

//    public static int multiplication(int num1, int num2){
//        return num1 * num2;
//    }

    public static int multiplication(int num1, int num2) {
        int total = 0;
        for (int i = 0; i < num2; ++i) {
            total = num1 + num2;
        }
        return total;
    }

    public static int division(int num1, int num2){
        if(num1 / num2 == 0){
            return 0;
        } else {
            return num1 / num2;
        }
    }

    public static int modulus(int num1, int num2){
        return num1 % num2;
    }

    // TODO: use recursion to print out a given number up through 100
     public static void countTo100(int num) {
        System.out.println(num);

        if(num == 100){
            System.out.println("Finished");
            return;
        }
        countTo100(num + 1);
     }


    // TODO: use recursion to add all numbers up from 1 to a given number
     public static int addNums(int num) {
         if(num == 1){
             return 1;
         }
         return num + addNums(num - 1);
     }
//2.
    public static int getInteger(int min, int max){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number between 1 and 10.");
        int userInput = sc.nextInt();

        if(userInput > 0 && userInput < 11){
            System.out.println("Your input " + userInput + " was accepted.");
            return userInput;
        }
        return getInteger(1, 10);
    }

//3.
    public static void getFactorial(){
        // scanner to take in the users number
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 10.");

        //userInput stores the initial input
        int userInput = sc.nextInt();
        //userFactorial stores the number mutated in the for loop
        long userFactorial = userInput;

        //checks if the users number is 1-10
        if(userInput > 0 && userInput < 11){
            // scanner to get user confirmation
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Would you like to see the factorial of your number? [y/N]");
            String userConfirmation = sc2.nextLine();

            // checks if the user confirms
            if(userConfirmation.equals("y")){
                //initial format of the table
                System.out.print(userInput + "! = ");
                //loops over userFactorial to find factorial and prints addition section of table
                for(int i = 1; i < userInput; ++i){
                    System.out.print(i + " x ");
                    userFactorial *= i;
                }
                //prints the end of the table with final value
                System.out.print(userInput + " = " + userFactorial);

                //if user does not confirm
            } else {
                System.out.println("Try again another time!");
            }
        }
    }

//4.
    public static void rollDice(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("How many sides are on the first die?");
        int val1 = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("How many sides are on the second die?");
        int val2 = sc2.nextInt();

        Random random = new Random();

        int die1 = random.nextInt(val1);
        int die2 = random.nextInt(val2);


        System.out.println("You rolled " + die1 + " and " + die2 + "!");
    }


    public static void main (String[] args){
//        System.out.println(addition(2, 2));
//        System.out.println(subtraction(2, 2));
//        System.out.println(multiplication(2, 2));
//        System.out.println(division(2, 2));
//        System.out.println(modulus(2, 2));
//        countTo100(1);
//        addNums(37);
//        System.out.println(addNums(10));
//        getInteger(1, 10);
//        getFactorial();
//        rollDice();
    }

}
