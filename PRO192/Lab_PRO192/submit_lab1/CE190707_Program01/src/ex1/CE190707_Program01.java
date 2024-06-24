/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author ADMIN Le Nguyen Hai Dang 
 * Roll Number: CE190707 
 * Class: SE1816
 */
public class CE190707_Program01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variable declaration
        int a, b, c, perimeter;
        double half, area;
        Scanner scanner = new Scanner(System.in);

        //Getting user input
        System.out.print("Please enter the first edge of triangle: ");
        a = scanner.nextInt();
        System.out.print("Please enter the second edge of triangle: ");
        b = scanner.nextInt();
        System.out.print("Please enter the third edge of triangle: ");
        c = scanner.nextInt();

        //Handling exception and calculating
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("These three numbers must be a positive number!");
        } else if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("three numbers do not make a triangle!");
        } else {
            perimeter = (a + b + c);
            half = (double) perimeter / 2;
            area = Math.sqrt(half * (half - a) * (half - b) * (half - c));

            System.out.println("The perimeter of the triangle is " + perimeter);
            System.out.printf("The area of the triangle is %.6f\n", area);
        }
    }
}
