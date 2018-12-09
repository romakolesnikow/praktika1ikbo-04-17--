public class Square extends Rectangle {

    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    protected double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    public Square() {
        super(2, 2);
        this.side = 2;
    }

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
        this.side = side;
    }

    public double getArea() {
        return Math.pow(this.side, 2);
    }

    public double getPerimeter() {
        return 4 * this.side;
    }
}
