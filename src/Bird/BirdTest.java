package Bird;

public class BirdTest {
    public static void main(String[] args) {
        Bird cardinal = new Bird();
        cardinal.setName("Cardinal");
        cardinal.setCanFly(true);
        System.out.print(cardinal.getName() + " goes ");
        cardinal.makeNoise();
//        cardinal.move();

        Duck mallard = new Duck();
        mallard.setName("Mallard");
        System.out.print(mallard.getName() + " goes ");
        mallard.makeNoise();

        Finch lesserGoldFinch = new Finch();
        lesserGoldFinch.setName("Lesser Gold Finch");
        System.out.print(lesserGoldFinch.getName() + " goes ");
        lesserGoldFinch.makeNoise();
    }
}
