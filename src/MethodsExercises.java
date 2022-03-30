public class MethodsExercises {

    public static int addition(int num1, int num2){
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2){
        return num1 - num2;
    }

//    public static int multiplication(int num1, int num2){
//        return num1 * num2;
//    }

    public static int multiplication(int num1, int num2) {
        int total = 0;
        for (int i = 0; i < num2; ++i) {
            total = num1 + num2;
        }
        return total;
    }

    public static int division(int num1, int num2){
        if(num1 / num2 == 0){
            return 0;
        } else {
            return num1 / num2;
        }
    }

    public static int modulus(int num1, int num2){
        return num1 % num2;
    }

    public static void main (String[] args){
        System.out.println(addition(2, 2));
        System.out.println(subtraction(2, 2));
        System.out.println(multiplication(2, 2));
        System.out.println(division(2, 2));
        System.out.println(modulus(2, 2));
    }

}
