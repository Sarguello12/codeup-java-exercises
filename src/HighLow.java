import java.util.Random;
import java.util.Scanner;

public class HighLow {

    public static void playGame(int num, int guess){
        int counter = guess - 1;
        if(counter == 0){
            System.out.println("Game over...");
            return;
        }

        System.out.println("===== Guesses Remaining: " + counter + " =====");

        Scanner sc = new Scanner(System.in);
        System.out.println("        Guess a number?");
        int userInput = sc.nextInt();

        if(num == userInput){
            System.out.println("===== GOOD GUESS!! =====");
            return;
        }
        if(num > userInput){
            System.out.println("------ HIGHER ------");
        }
        if(num < userInput){
            System.out.println("----- LOWER -----");
        }

        playGame(num, counter);
    }



    public static void main(String[] args){
        Random random = new Random();
        int randomNum = random.nextInt(100);

        playGame(randomNum, 11);
    }

}


