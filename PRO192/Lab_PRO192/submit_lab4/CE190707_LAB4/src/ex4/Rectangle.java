package ex4;

/*
 * Author: Le Nguyen Hai Dang
 * Roll number: CE190707
 * Class: SE1816
 */

public class Rectangle extends Quadrilateral {
    //Default constructor

    public Rectangle() {
        super();
    }

    //Parametric constructor
    public Rectangle(String ID, String color, boolean filled, double width, double height) {
        super(ID, color, filled, width, height);
    }

    /*public methods*/
    @Override
    public double getArea() {
        return this.width * this.height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }

    @Override
    public void showInfo() {
        String format = "| %-15s | %4s | %-8s | %-20s | %5s | %5s | %5s | %5s | %7s | %7s |\n";
        System.out.printf(format, "Rectangle", ID, toString(), color, filled, String.valueOf(width), String.valueOf(height), "_", String.format("%.1f", getArea()), String.format("%.1f", getPerimeter()));
    }
}
