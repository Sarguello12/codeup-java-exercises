package Vehicle;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle mazda = new Vehicle();
        mazda.setName("Mazda");
        System.out.println(mazda.getName());
        mazda.makeNoise();

        Boat hellsBay = new Boat();
        hellsBay.setName("Hells Bay Waterman");
        System.out.println(hellsBay.getName());
        hellsBay.makeNoise();
    }


}
