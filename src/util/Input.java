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
        try {
            return Integer.valueOf(getString());
        } catch(NumberFormatException nfe){
            System.out.println("That is not a number " + nfe);
        }
        return getInt();
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

    public double getDouble2(){
        try {
            return Double.valueOf(getString());
        } catch(NumberFormatException nfe){
            System.out.println("That is not a double " + nfe);
        }
        return getDouble();
    }

    public int getBinary(){
        return Integer.valueOf(getString(), 2);
    }

    public long getHex(){
        return Long.valueOf(getString(), 16);
    }


}

