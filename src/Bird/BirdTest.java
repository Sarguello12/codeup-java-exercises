package Bird;

public class BirdTest {
    public static void main(String[] args) {
        Bird cardinal = new Bird();
        cardinal.setName("Cardinal");
        cardinal.setCanFly(true);
        cardinal.makeNoise();
        cardinal.move();
    }
}
