package ua.in.soul.epamprojects;

public class Shape {

    private String color;

    public Shape(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Class = " + this.getClass().getSimpleName() + "; Color = " + color;
    }

    public double calcArea() {
        return 0.0;
    }
}
