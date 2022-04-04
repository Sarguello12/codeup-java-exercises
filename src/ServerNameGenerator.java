import java.util.Random;

public class ServerNameGenerator {

    public static String[] adjectives = {"charming", "cruel", "fantastic", "gentle", "huge", "perfect", "rough", "sharp", "tasty", "zealous"};
    public static String[] nouns = {"king", "city", "country", "planet", "animal", "father", "chair", "cow", "apple", "flower"};

    public static String nameGenerator(String[] adjectives, String[] nouns){
        Random random1 = new Random();
        Random random2 = new Random();

        int randomAdjective = random1.nextInt(adjectives.length);
        int randomNoun = random2.nextInt(nouns.length);

        return "Your random server name is " + adjectives[randomAdjective] + " " + nouns[randomNoun];
    }

    public static void main(String[] args) {
        System.out.println(nameGenerator(adjectives, nouns));
    }
}
