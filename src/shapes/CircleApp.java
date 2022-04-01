package shapes;
import util.Input;

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

            System.out.println("Your circles area is " + firstCircle.getArea());
            System.out.println("Your circles circumference is " + firstCircle.getCircumference());
            createCircle();
    }
}



public class CircleApp {
    public static void main(String[] args) {
            Input firstInput = new Input();
//            Circle firstCircle = new Circle(firstInput.getDouble());
//
//            System.out.println("Your circles area is " + firstCircle.getArea());
//            System.out.println("Your circles circumference is " + firstCircle.getCircumference());
        create.createCircle();
    }
}
