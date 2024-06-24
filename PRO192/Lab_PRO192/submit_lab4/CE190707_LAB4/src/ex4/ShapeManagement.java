package ex4;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

/*
 * Author: Le Nguyen Hai Dang
 * Roll number: CE190707
 * Class: SE1816
 */

public class ShapeManagement {
    //Class attribute

    private ArrayList<Shape> listShapes;
    private Scanner scanner = new Scanner(System.in);

    //Default constructor
    public ShapeManagement() {
        this.listShapes = new ArrayList<Shape>();
    }

    /*Private methods (helper methods)*/
    //search book by ID
    private Shape searchByID(String ID) {
        for (Shape shape : listShapes) {
            if (shape.getID().equals(ID)) {
                return shape;
            }
        }
        return null;
    }

    //Get shape's ID, color, isFilled since they're common attribute of all shapes
    private void getCommonValue(Shape shape) {
        //Variable declaration
        String ID, filled;

        /*Get ID*/
        System.out.print("Input ID: ");
        ID = scanner.next();
        //Handling exception if ID already exist
        while (searchByID(ID) != null) {
            System.out.printf("This %s is already exists!\n", ID);
            System.out.print("Input ID: ");
            ID = scanner.next();
        }
        shape.setID(ID);

        /*Get color*/
        System.out.print("Input color: ");
        shape.setColor(scanner.next());

        /*Get isFilled*/
        System.out.print("Input isFilled (T/F): ");
        filled = scanner.next();
        //handle mismatching value
        while (!filled.equals("T") && !filled.equals("F")) {
            System.out.println("Invalid input value!!! We only accept T or F");
            System.out.print("Input isFilled (T/F)");
            filled = scanner.next();
        }
        shape.setFilled(filled.equals("T"));
    }

    //Find and return list of biggest shape
    private ArrayList<Shape> biggestShapes() {
        double max = 0.0;

        //find max area
        for (Shape shape : listShapes) {
            if (shape.getArea() > max) {
                max = shape.getArea();
            }
        }

        //add all shape that has max area
        ArrayList<Shape> biggest = new ArrayList<>();
        for (Shape shape : listShapes) {
            if (shape.getArea() == max) {
                biggest.add(shape);
            }
        }

        return biggest;
    }

    /*Public methods*/
    //create and add circle to list
    public void addCircle() {
        System.out.println("----- Adds new Circle -----");

        //Variables declaration
        double radius;
        Circle circle = new Circle();

        /*Get circle's ID, color, isFilled*/
        getCommonValue(circle);

        /*Get circle's radius*/
        System.out.print("Input radius: ");
        radius = scanner.nextDouble();
        //Handle invalid input
        while (radius <= 0) {
            System.out.println("Radius must be greater than 0!!!");
            System.out.print("Input radius: ");
            radius = scanner.nextDouble();
        }
        circle.setRadius(radius);

        /*Add circle to list*/
        listShapes.add(circle);
        System.out.println("Circle created and added to list of shape successfully!");
    }

    //create and add triangle to list
    public void addTriangle() {
        System.out.println("----- Adds new Triangle -----");

        //Variables declaration
        double side1, side2, side3;
        Triangle triangle = new Triangle();

        /*Get triangle's ID, color, isFilled*/
        getCommonValue(triangle);

        /*Get triangle's 3 sides*/
        do {
            /*Get triangle's first side*/
            System.out.print("Input first side length: ");
            side1 = scanner.nextDouble();
            //Handle invalid value
            while (side1 <= 0) {
                System.out.println("The side of the triangle must be greater than 0");
                System.out.print("Input first side length: ");
                side1 = scanner.nextDouble();
            }

            /*Get triangle's second side*/
            System.out.print("Input second side length: ");
            side2 = scanner.nextDouble();
            //Handle invalid value
            while (side2 <= 0) {
                System.out.println("The side of the triangle must be greater than 0");
                System.out.print("Input second side length: ");
                side2 = scanner.nextDouble();
            }

            /*Get triangle's third side*/
            System.out.print("Input third side length: ");
            side3 = scanner.nextDouble();
            //Handle invalid value
            while (side3 <= 0) {
                System.out.println("The side of the triangle must be greater than 0");
                System.out.print("Input third side length: ");
                side3 = scanner.nextDouble();
            }

            //If 3 sides cannot form a triangle, print error message
            if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
                System.out.println("There 3 side length cannot form a triangle!!!");
            }
        } while (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1);

        triangle.setSide_1(side1);
        triangle.setSide_2(side2);
        triangle.setSide_3(side3);

        /*Add triangle to list*/
        listShapes.add(triangle);
        System.out.println("Triangle created and added to list of shape successfully!");
    }

    //create and add rectangle to list
    public void addRectangle() {
        System.out.println("----- Adds new Rectangle -----");

        //Variables declaration
        double width, height;
        Rectangle rectangle = new Rectangle();

        /*Get rectangle's ID, color, isFilled*/
        getCommonValue(rectangle);

        /*Get rectangle's width*/
        System.out.print("Input width: ");
        width = scanner.nextDouble();
        //Handle invalid value
        while (width <= 0) {
            System.out.println("The width of rectangle must be greater than 0");
            System.out.print("Input width: ");
            width = scanner.nextDouble();
        }
        rectangle.setWidth(width);

        /*Get rectangle's height*/
        System.out.print("Input height: ");
        height = scanner.nextDouble();
        //Handle invalid value
        while (height <= 0) {
            System.out.println("The rectangle of rectangle must be greater than 0");
            System.out.print("Input height: ");
            height = scanner.nextDouble();
        }
        rectangle.setHeight(height);

        /*Add rectangle to list*/
        listShapes.add(rectangle);
        System.out.println("rectangle created and added to list of shape successfully!");
    }

    //create and add square to list
    public void addSquare() {
        System.out.println("----- Adds new Square -----");

        //Variables declaration
        double width;
        Square square = new Square();

        /*Get square's ID, color, isFilled*/
        getCommonValue(square);

        /*Get square's width*/
        System.out.print("Input width: ");
        width = scanner.nextDouble();
        //Handle invalid value
        while (width <= 0) {
            System.out.println("The width of rectangle must be greater than 0");
            System.out.print("Input width: ");
            width = scanner.nextDouble();
        }
        square.setWidth(width);
        square.setHeight(width);

        /*Add rectangle to list*/
        listShapes.add(square);
        System.out.println("square created and added to list of shape successfully!");
    }

    //Show all shapes
    public void showShapes() {
        System.out.println("----- List of Shapes -----");
        for (Shape shape : listShapes) {
            shape.showInfo();
        }
    }

    //Show the list of biggest shape
    public void showBiggestShape() {
        ArrayList<Shape> biggest = biggestShapes();
        System.out.println("----- List of the biggest Area shape -----");
        for (Shape shape : biggest) {
            shape.showInfo();
        }
    }

    //sort list of shape ascending and print them
    public void sort() {
        ArrayList<Shape> sortedList = new ArrayList<>(listShapes);

        //sort the list
        Collections.sort(sortedList, new Comparator<Shape>() {
            @Override
            public int compare(Shape shape1, Shape shape2) {
                return Double.compare(shape1.getArea(), shape2.getArea());
            }
        });

        //Print the sorted list
        for (Shape shape : sortedList) {
            shape.showInfo();
        }
    }

    //print search shape
    public void showSearchShape() {
        //variable declaration
        String ID;

        //Ask for shape's ID
        System.out.println("Find shape: ");
        System.out.print("Input ID to find: ");
        ID = scanner.next();

        //Find shape
        if (searchByID(ID) == null) {
            System.out.println("Not found!");
        } else {
            searchByID(ID).showInfo();
        }
    }

}
