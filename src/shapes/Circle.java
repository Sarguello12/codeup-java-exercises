package shapes;

import static java.lang.Math.PI;

public class Circle {
    private double radius;
    static int totalCircles = 0;

    public double getRadius() {
        return radius;
    }

    public Circle(double radius){
        this.radius = radius;
        totalCircles++;
    }

    public double getArea(){
        return PI * (radius * radius);
    }

    public static void drawCircle(double radius){
        double distanceToCenter;

        for(int i = 0; i <= 2 * radius; i++){
            for(int j = 0; j <= 2 * radius; j++){
                distanceToCenter = Math.sqrt((i - radius) * (i - radius) + (j - radius) * (j - radius));

                if(distanceToCenter > radius - 0.5 && distanceToCenter < radius + 0.5){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

    public double getCircumference(){
        return 2 * PI * radius;
    }
}
