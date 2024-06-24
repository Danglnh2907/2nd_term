/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce190707_program02;

import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author ADMIN Le Nguyen Hai Dang 
 * Roll Number: CE190707 
 * Class: SE1816
 */
public class CE190707_Program02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variable declaration
        int r, h;
        double pb, ab, tsa, v;
        Scanner scanner = new Scanner(System.in);

        //Getting user input
        System.out.print("Please enter the base's radius of the cylinder: ");
        r = scanner.nextInt();
        System.out.print("Please enter the height of the cylinder: ");
        h = scanner.nextInt();

        //Handling exception and calculating
        if (h <= 0 || r <= 0) {
            System.out.println("The height and radius of cylinder must be a positive number!");
        } else {
            pb = 2 * r * Math.PI;
            ab = r * r * Math.PI;
            tsa = h * pb + 2 * ab;
            v = h * ab;

            System.out.println("The total surface area of the cylinder is " + tsa);
            System.out.println("The volume of the cylinder is " + v);
        }
    }

}
