package ex4;

import java.lang.Math;

/*
 * Author: Le Nguyen Hai Dang
 * Roll number: CE190707
 * Class: SE1816
 */

public abstract class Quadrilateral extends Shape {
    //Class attribute

    protected double width;
    protected double height;

    //Default constructor
    public Quadrilateral() {
        super();
        this.width = 0.0;
        this.height = 0.0;
    }

    //Parametric constructor
    public Quadrilateral(String ID, String color, boolean filled, double width, double height) {
        super(ID, color, filled);
        this.width = width;
        this.height = height;
    }

    /*Getter methods*/
    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    /*Setter methods*/
    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    /*public methods*/
}
