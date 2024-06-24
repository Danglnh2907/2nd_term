package ex4;

import java.lang.Math;

/*
 * Author: Le Nguyen Hai Dang
 * Roll number: CE190707
 * Class: SE1816
 */

public class Circle extends Shape {
    //Class attribute

    private double radius;

    //Default constructor
    public Circle() {
        super();
        this.radius = 0.0;
    }

    //Parametric constructor
    public Circle(String ID, String color, boolean filled, double radius) {
        super(ID, color, filled);
        this.radius = radius;
    }

    /*getter methods*/
    public double getRadius() {
        return this.radius;
    }

    /*setter methods*/
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /*public methods*/
    @Override
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * this.radius * Math.PI;
    }

    @Override
    public void showInfo() {
        String format = "| %-15s | %4s | %-8s | %-20s | %5s | %5s | %5s | %5s | %7s | %7s |\n";
        System.out.printf(format, "Circle", ID, toString(), color, filled, String.valueOf(radius), "_", "_", String.format("%.1f", getArea()), String.format("%.1f", getPerimeter()));
    }
}
