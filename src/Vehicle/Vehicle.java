package Vehicle;

public class Vehicle {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void makeNoise(){
        System.out.println("Vroom Vroom");
    }
}
