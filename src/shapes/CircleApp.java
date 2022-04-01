package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input firstInput = new Input();
        Circle firstCircle = new Circle(firstInput.getDouble());

        System.out.println("Your circles area is " + firstCircle.getArea());
        System.out.println("Your circles circumference is " + firstCircle.getCircumference());


        
    }
}
