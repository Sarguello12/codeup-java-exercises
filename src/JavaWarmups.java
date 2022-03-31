public class JavaWarmups {
//    ================================= WARM UP
//    Create a Java class, JavaWarmups. Add a main method to test the warmup methods.
//
//    Create a method, returnFirstCapitalLetter, that takes in a string and returns the first capital letter as a char. If no capital letter is found, return a single space character ' '. Assume only letters in the input string and all possible inputs will have at least one letter.
//
//            Examples...
//
//    returnFirstCapitalLetter("hellO") // returns 'O'
//    returnFirstCapitalLetter("hello") // returns ' '
//    returnFirstCapitalLetter("hEllo") // returns 'E'
//    returnFirstCapitalLetter("hELlO") // returns 'E'
//    returnFirstCapitalLetter("H") // returns 'H'

    public static char returnFirstCapitalLetter(String input){
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == Character.toUpperCase(input.charAt(i))){
                return input.charAt(i);
            }
        }
        return ' ';
    }


    public static void main (String[] args){
        System.out.println(returnFirstCapitalLetter("hellO"));// returns 'O'
        System.out.println(returnFirstCapitalLetter("hello"));// returns ' '
        System.out.println(returnFirstCapitalLetter("hEllo"));// returns 'E'
        System.out.println(returnFirstCapitalLetter("hELlO"));// returns 'E'
        System.out.println(returnFirstCapitalLetter("H"));// returns 'H'
    }
}
