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

//10. Create an interface named Companion. The Companion interface should specify an instance method named snuggle that has no arguments and returns a String. Change your PetDog class so it implements the Companion interface. The implementation of the snuggle method on the PetDog class should return "name wants to snuggle", where name is the inherited instance property.
//11. Create a PetDogTest class, instantiate a PetDog, and verify that the snuggle method works correctly.
//12. In your Practice class, create a static method named multiplyAll. It should accept an integer and an ArrayList of integers. It should take the ArrayList argument and multiply all its elements by the value of the integer argument.
//12b. In your Pet class, create a static method named allSnuggle. It should accept an ArrayList of PetDog objects and output the result of calling the snuggle method on all of them. Create an ArrayList with at least three PetDog instances in the PetDogTest class. Call the allSnuggle method and pass it the ArrayList. Verify that the allSnuggle method works correctly.

}
