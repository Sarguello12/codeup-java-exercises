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

//    public static char returnFirstCapitalLetter(String input){
//        for(int i = 0; i < input.length(); i++){
//            if(input.charAt(i) == Character.toUpperCase(input.charAt(i))){
//                return input.charAt(i);
//            }
//        }
//        return ' ';
//    }
//
//
//    public static void main (String[] args){
//        System.out.println(returnFirstCapitalLetter("hellO"));// returns 'O'
//        System.out.println(returnFirstCapitalLetter("hello"));// returns ' '
//        System.out.println(returnFirstCapitalLetter("hEllo"));// returns 'E'
//        System.out.println(returnFirstCapitalLetter("hELlO"));// returns 'E'
//        System.out.println(returnFirstCapitalLetter("H"));// returns 'H'
//    }

//    # Java Assessment Practice Problems
//
//1. Create a class called Practice with a main method.
//2. Create a public static method in main called *subtractTen* that takes one integer argument and returns that number minus 10.
//3. Create a public static method *average* that takes an array of integers and returns their average as a double.
//4. Create a class called Pet with two String instance variables, name and type.
//5. Create getters and setters for the properties as well as a constructor that takes two strings and sets the name and type.
//6. Create a PetDog class that inherits from Pet.
//7. In PetDog, create a boolean instance variable, trained.
//8. Write a constructor for PetDog that sets its name, type, and trained properties.
//9. Write an instance method in PetDog  called isTrained that returns the boolean value of the trained property.

   class Practice {
        public static void main(String[] args) {



        }

       public static int subtractTen(int num){
           return num - 10;
       }

       public static double average(int[] nums){
            double sum = 0;

            for(Integer num : nums){
                sum += num;
            }
            return sum / nums.length;
       }
    }

    class pet {
       private String name;
       private String type;

       public pet(){};

        public pet(String name, String type) {
            this.name = name;
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public String getType() {
            return type;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setType(String type) {
            this.type = type;
        }
    }

    class PetDog extends pet {
       private boolean isTrained;

        public PetDog(String name, String type, boolean isTrained) {
            super(name, type);
            this.isTrained = isTrained;
        }


    }

}
