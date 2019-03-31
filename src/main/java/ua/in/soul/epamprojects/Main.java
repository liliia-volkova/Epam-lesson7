package ua.in.soul.epamprojects;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Shape[] shapes = {new Rectangle("black", -2, 5), new Rectangle("orange", 9, 4),
                new Rectangle("brown", 15.8, 7), new Rectangle("red", 13, 7),
                new Circle("blue", 0.0), new Circle("yellow", -8.9), new Circle("pink", 15.1),
                new Triangle("white", 0, 6, 8), new Triangle("grey", 7, 11, 6)};
        for (Shape elements : shapes) {
            System.out.println(elements);
            System.out.println("\tSquare " + elements.getClass().getSimpleName() + " = " + elements.calcArea());
        }
        System.out.println("------------------------------------------------------");
        System.out.println("Sum of area of all shapes = " + getSumArea(shapes));
        System.out.println("Sum of area of group of figures = " + Arrays.toString((getSumAreaOfGroupOfFigures(shapes))));
    }

    public static double getSumArea(Shape[] shapes) {
        double result = 0.0;
        for (Shape elements : shapes) {
            result += elements.calcArea();
        }
        return result;
    }

    public static double[] getSumAreaOfGroupOfFigures(Shape[] shapes) {
        double result1 = 0.0;
        double result2 = 0.0;
        double result3 = 0.0;
        for (Shape elements : shapes) {
            if (elements instanceof Rectangle) {
                result1 += elements.calcArea();
            } else if (elements instanceof Circle) {
                result2 += elements.calcArea();
            } else {
                result3 += elements.calcArea();
            }
        }
        double[] sumAreaOfGroupOfFigures = {result1, result2, result3};
        return sumAreaOfGroupOfFigures;
    }
}
