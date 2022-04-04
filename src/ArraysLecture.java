import java.util.Arrays;

public class ArraysLecture {
    public static void main(String[] args) {
        int[] numbers;
        numbers = new int[5];
        numbers[0] = 78;
        numbers[1] = 90;
        numbers[2] = 24;
        numbers[3] = 63;
        numbers[4] = 19;

        System.out.println(numbers[0]);
        Arrays.sort(numbers);
        System.out.println(numbers[0]);

        String[] synonymsOfWeird = {"strange", "bizarre", "uncanny", "odd", "peculiar", "uncommon"};
        System.out.println(synonymsOfWeird[2]);
        synonymsOfWeird[0] = "extraordinary";
        System.out.println(synonymsOfWeird[0]);

        for(int i = 0; i < numbers.length; i++){
            System.out.println("The String at index " + i + " is " + synonymsOfWeird[i]);
        }

        for (String synonymOfWeird : synonymsOfWeird){
            System.out.println(synonymOfWeird);
        }

        byte[] arrayOfBytes = {23, 45, 31, 87, 52};
        for(byte byteOfArray : arrayOfBytes){
            System.out.println(byteOfArray);
        }
    }
}


