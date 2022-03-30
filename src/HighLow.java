import com.sun.security.jgss.GSSUtil;

import java.util.Random;
import java.util.Scanner;

public class HighLow {

    public static void playGame(int num, int guess){
        int counter = guess - 1;
        if(counter == 0){
            System.out.println("Game over...");
            return;
        }

        System.out.println("===== Guess No: " + counter + " =====");

        Scanner sc = new Scanner(System.in);
        System.out.println("Guess a number?");
        int userInput = sc.nextInt();

        if(num == userInput){
            System.out.println("GOOD GUESS!!");
            return;
        }
        if(num > userInput){
            System.out.println("HIGHER");
        }
        if(num < userInput){
            System.out.println("LOWER");
        }

        playGame(num, counter);
    }



    public static void main(String[] args){
        Random random = new Random();
        int randomNum = random.nextInt(100);
        System.out.println(randomNum);

        playGame(randomNum, 11);
    }

}


