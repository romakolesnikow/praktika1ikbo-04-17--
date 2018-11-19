package Praktika;

public class Ball {

    public Ball(double r, String base_color){
        radius = r;
        color = base_color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private double radius;
    private String color;

}
