package shapes;

public class Rectangle {
    protected double length;
    protected double width;

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        return (2 * length) + (2 * width);
    }

    public double getPerimeter(){
        return length * width;
    }
}
