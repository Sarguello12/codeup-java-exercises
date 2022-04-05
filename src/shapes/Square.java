package shapes;

public class Square extends Quadrilateral implements Measurable{
    public Square(double side) {
        super.length = side;
        super.width = side;
    }

    @Override
    void setLength(double length) {
        this.length = length;
    }

    @Override
    void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 4 * super.width;
    }

    @Override
    public double getArea() {
        return super.length * super.width;
    }
//
//    public Square(double side){
//        super.length = side;
//        super.width = side;
//    }
//
//    public double getPerimeter(){
//        return 4 * super.width;
//    }
//
//    public double getArea(){
//        return super.length * super.width;
//    }
}
