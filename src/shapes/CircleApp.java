package shapes;
import util.Input;

import static shapes.Circle.drawCircle;
import static shapes.Circle.totalCircles;

class create {
    public static void createCircle(){
        Input creationInput = new Input();
        System.out.println("Would you like to create a circle?");
        boolean userInput = creationInput.yesNo();


        if(!userInput){
            System.out.println("Thanks for playing! You created " + totalCircles + " circles.");
            return;
        }

            Input firstInput = new Input();
            Circle firstCircle = new Circle(firstInput.getDouble());
            drawCircle(firstCircle.getRadius());

            System.out.printf("Your circles area is %.1f\n",firstCircle.getArea());
            System.out.printf("Your circles circumference is %.1f\n", firstCircle.getCircumference());

            createCircle();
    }
}



public class CircleApp {
    public static void main(String[] args) {
        create.createCircle();
    }
}
