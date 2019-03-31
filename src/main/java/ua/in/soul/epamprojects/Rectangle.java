package ua.in.soul.epamprojects;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double heidht) {
        super(color);
        this.width = width;
        this.height = heidht;
    }

    @Override
    public String toString() {
        return super.toString() + "; Width = " + width + "; Height = " + height;
    }

    @Override
    public double calcArea() {
        if (width > 0 && height > 0) {
            return width * height;
        } else return 0.0;
    }
}
