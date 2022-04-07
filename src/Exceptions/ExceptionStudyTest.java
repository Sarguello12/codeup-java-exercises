package Exceptions;

public class ExceptionStudyTest {
    public static void main(String[] args) {

//        ExceptionStudy exceptionStudy = new ExceptionStudy();
//        exceptionStudy.askForAnInteger();

        ExceptionStudy subList = new ExceptionStudy();
        subList.subListMaker("this is a sentence");

//Mini-exercise: Investigate the substring method for String objects in the Java API. Find out what kind of exception it throws. Create a test class with a main method. Set up a try-catch block that defines a string and finds its length. Once you have the length of your string, modify your program so it creates a substring from your original string, but give it an index that doesn't exist so you get the error message.
//
//Optional: play with the .getMessage and .printStackTrace methods.
//
//Optional: what are some other ways you can get the same exception? Try to set up your program so as to produce and catch these exceptions.
//        try {
//            ExceptionStudy study = new ExceptionStudy();
//            System.out.println(Integer.parseInt(study.maybeAnInteger));
//            System.out.println(Integer.parseInt(study.certainlyNotAnInteger));
//        } catch (NumberFormatException nfe) {
//            System.out.println("Got an exception " + nfe);
//            nfe.printStackTrace();
//        }
//        String hello = "HelloWorld";
//
//        try {
//            System.out.println(hello.length());
//            System.out.println(hello.substring(7,11));
//        } catch(StringIndexOutOfBoundsException iobe){
//            System.out.println("Got an exception " + iobe);
//        }
    }
}
