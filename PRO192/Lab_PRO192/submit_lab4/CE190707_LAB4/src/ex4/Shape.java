package ex4;

import java.util.Date;
import java.text.SimpleDateFormat;

/*
 * Author: Le Nguyen Hai Dang
 * Roll number: CE190707
 * Class: SE1816
 */

public abstract class Shape {
    //Class attribute

    protected String ID;
    protected String color;
    protected boolean filled;
    protected Date dateCreated;

    //Default constructor
    public Shape() {
        this.ID = "";
        this.color = "";
        this.filled = true;
        this.dateCreated = new Date();
    }

    //Parametric constructor 
    public Shape(String ID, String color, boolean filled) {
        this.ID = ID;
        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date();
    }

    /*Getter methods*/
    public String getID() {
        return this.ID;
    }

    public String getColor() {
        return this.color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    /*Setter methods*/
    public void setID(String ID) {
        this.ID = ID;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    /*public methods*/
    public String toString() {
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yy");
        return formatter.format(dateCreated);
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract void showInfo();
}
