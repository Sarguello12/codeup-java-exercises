package shapes;

public class Square extends Rectangle{

    public Square(double side){
        super.length = side;
        super.width = side;
    }

    public double getPerimeter(){
        return 4 * super.width;
    }

    public double getArea(){
        return super.length * super.width;
    }
}
