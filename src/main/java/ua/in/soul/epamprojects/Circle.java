package ua.in.soul.epamprojects;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString() + "; Radius = " + radius;
    }

    @Override
    public double calcArea() {
        if (radius > 0) {
            return Math.PI * (radius * radius);
        } else return 0.0;
    }
}
