package Exceptions;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ExceptionStudy {
    public String maybeAnInteger = "42";
    public String certainlyNotAnInteger = "I am not an integer";

    public void askForAnInteger(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer");
        String userInput = scanner.nextLine();
        try {
            int userInputInteger = Integer.parseInt(userInput);
            System.out.println("The integer in your string is " + userInputInteger);
        } catch (NumberFormatException nfx){
            System.out.println("Uh oh, " + nfx.getMessage() + " there is no integer!");
        } finally {
            System.out.println("Thank you for using this complex and useful application.");
            System.out.println("Please come back and visit.");
        }
    }

//    Given the following code, investigate the kinds of exceptions it could throw and write a try-catch structure catching these exceptions and providing the appropriate output messages. Be careful of where exactly you begin your try-catch structure. Optionally, add a finally clause.
//
//    Test your code to make sure that the exceptions are indeed caught. Test the code by entering a null value as the method's String parameter (subListMaker(null) or String sentence = null; subListMaker(sentence)), and by entering negative integers and integers larger than the number of words in the sentence as the user inputs. Try to modify the warning for an improper integer to suggest to the user what range of integers is acceptable.
//
//    To search for what exceptions a method throws, use the following search string: Java + number of your Java JDK + API + name of method. For example, Java 16 API substring.
//            ```
    public void subListMaker(String sentence){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer");
        int firstInt = scanner.nextInt();
        System.out.println("Please enter another integer");
        int secondInt = scanner.nextInt();
        System.out.println(sentence);
        ArrayList<String> wordArrayList = new ArrayList<String>();
        String[] stringArray = sentence.split(" ");
        for (String word : stringArray){
            wordArrayList.add(word);
        }
        try {
            List<String> shorterList =  wordArrayList.subList(firstInt, secondInt);
            String newSentence = String.join(" ", shorterList);
            System.out.println(newSentence);
        } catch(IndexOutOfBoundsException iobe) {
            System.out.println("That input is out of bounds " + iobe);
        } catch(IllegalArgumentException iae) {
            System.out.println("That arguement is illegal " + iae);
        } catch(InputMismatchException ime) {
            System.out.println("Input was not an integer " + ime);
        }

    }
//```
//
//    Option 2 (challenge):
//    Write a method called subsentence that takes a string parameter. It asks the user for two integers, then uses the integers as indexes to create a subsentence from the sentence. Use whatever methods you want (ArrayList methods and String methods are suggested). Investigate all the exceptions your code can throw and write catch statements for them.
}
