package ex4;
import java.lang.Math;

/*
 * Author: Le Nguyen Hai Dang
 * Roll number: CE190707
 * Class: SE1816
 */

public class Triangle extends Shape {
    //Class attribute

    private double side_1;
    private double side_2;
    private double side_3;

    //Default constructor
    public Triangle() {
        super();
        this.side_1 = 0.0;
        this.side_2 = 0.0;
        this.side_3 = 0.0;
    }

    //Parametric constructor
    public Triangle(String ID, String color, boolean filled, double side_1, double side_2, double side_3) {
        super(ID, color, filled);
        this.side_1 = side_1;
        this.side_2 = side_2;
        this.side_3 = side_3;
    }

    /*Getter methods*/
    public double getSide_1() {
        return this.side_1;
    }

    public double getSide_2() {
        return this.side_2;
    }

    public double getSide_3() {
        return this.side_3;
    }

    /*Setter methods*/
    public void setSide_1(double side_1) {
        this.side_1 = side_1;
    }

    public void setSide_2(double side_2) {
        this.side_2 = side_2;
    }

    public void setSide_3(double side_3) {
        this.side_3 = side_3;
    }

    /*public methods*/
    public double getArea() {
        double half = (side_1 + side_2 + side_3) / 2;
        return Math.sqrt(half * (half - side_1) * (half - side_2) * (half - side_3));
    }

    public double getPerimeter() {
        return side_1 + side_2 + side_3;
    }

    public void showInfo() {
        String format = "| %-15s | %4s | %-8s | %-20s | %5s | %5s | %5s | %5s | %7s | %7s |\n";
        System.out.printf(format, "Triangle", ID, toString(), color, filled, String.valueOf(side_1), String.valueOf(side_2), String.valueOf(side_3), String.format("%.1f", getArea()), String.format("%.1f", getPerimeter()));
    }
}
