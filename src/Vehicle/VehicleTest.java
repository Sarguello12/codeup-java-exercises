package Vehicle;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle mazda = new Vehicle();
        mazda.setName("Mazda");
        System.out.print(mazda.getName() + " goes ");
        mazda.makeNoise();

        Boat hellsBay = new Boat();
        hellsBay.setName("Hells Bay Waterman");
        System.out.print(hellsBay.getName() + " goes ");
        hellsBay.makeNoise();
    }


}
