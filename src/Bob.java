import java.util.Scanner;

public class Bob {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        System.out.println("Say hello to bob!");

        if(userInput.equals("")){
            System.out.println("Fine. Be that way!!");
        } else {
            char lastChar = userInput.charAt(userInput.length() - 1);

            if(Character.toString(lastChar).matches("[?]")){
                System.out.println("sure...");
            } else if (Character.toString(lastChar).matches("[!]")) {
                System.out.println("Whoa, chill out man!");
            } else {
                System.out.println("whatever...");
            }

        }
    }
}
