package util;


import java.util.Scanner;

public class Input {
    private final Scanner scanner = new Scanner(System.in);

    public String getString(){
        System.out.println("Please enter a string.");
        return scanner.next();
    }

    public boolean yesNo(){
        System.out.println("enter [y/N]");
        String userInput = scanner.next();
        return userInput.equals("y".toLowerCase());
    }

    public int getInt(int min, int max){
        System.out.println("Please enter a number between " + min + " and " + max + ".");
        int userInput = scanner.nextInt();

        if(userInput > min && userInput < max){
            System.out.println("Your input " + userInput + " was accepted.");
            return userInput;
        }
        return getInt(1, 10);
    }

    public int getInt(){
        System.out.println("Please enter a numerical value.");
        return scanner.nextInt();
    }

    public double getDouble(double min, double max){
        System.out.println("Please enter a decimal between " + min + " and " + max + ".");
        double userInput = scanner.nextDouble();

        if(userInput > min && userInput < max){
            System.out.println("Your input " + userInput + " was accepted.");
            return userInput;
        }
        return getDouble(1, 10);
    }

    public double getDouble(){
        System.out.println("Please enter a decimal value.");
        return scanner.nextDouble();
    }


}

class InputTest {
    public static void main(String[] args) {
        Input firstPrompt = new Input();
//        firstPrompt.getString();
//        firstPrompt.yesNo();
//        firstPrompt.getInt(1, 10);
//        firstPrompt.getDouble(1, 10);
    }
}