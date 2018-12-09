public class Circle extends Shape{

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public Circle()
    {
        this.radius = 0.5;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    protected double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * Math.pow(this.radius,2);
    }

    double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }
}
