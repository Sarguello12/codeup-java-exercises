package Vehicle;

public class Garage extends Vehicle{
    public Vehicle[] vehicles;

    public void alarmCascade(){
        for (Vehicle vehicle : vehicles){
            System.out.println(vehicle.getName() + " goes whoo whoo");
        }
    }
}
