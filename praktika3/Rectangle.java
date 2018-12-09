public class Rectangle extends Shape {

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }

    protected double width = 0;
    protected double length = 0;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Rectangle() {
        this.width = 2;
        this.length = 3;
    }

    public Rectangle(double width, double lenght) {
        this.width = width;
        this.length = lenght;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    double getArea() {
        if (this.width == 0 || this.length == 0) {
            Square sqr = new Square(this.width);
            return sqr.getArea();
        } else return this.width * this.length;
    }

    double getPerimeter() {
        if (this.width == 0 || this.length == 0) {
            Square sqr = new Square(this.width);
            return sqr.getPerimeter();
        } else return 2 * this.width + 2 * this.length;
    }
}
