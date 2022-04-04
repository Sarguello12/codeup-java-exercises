package Vehicle;

public class GarageTest {
    public static void main(String[] args) {
        Car Jeep = new Car();
        Jeep.setName("Jeep");
        Car Subaru = new Car();
        Subaru.setName("Subaru");

        Vehicle[] carsInTheGarage = new Vehicle[2];
        carsInTheGarage[0] = Jeep;
        carsInTheGarage[1] = Subaru;
        Garage garage = new Garage();
        garage.vehicles = carsInTheGarage;
        garage.alarmCascade();

    }

}
