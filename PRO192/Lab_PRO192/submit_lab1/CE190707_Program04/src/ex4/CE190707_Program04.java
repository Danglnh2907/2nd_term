/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4;

import java.util.Scanner;

/**
 *
 * @author ADMIN Author: Le Nguyen Hai Dang 
 * Roll Number: CE190707 
 * Class: SE1816
 */
public class CE190707_Program04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variable declaration
        int a, b;
        Scanner scanner = new Scanner(System.in);

        //Getting user input
        System.out.print("Please enter the coefficients A: ");
        a = scanner.nextInt();
        System.out.print("Please enter the coefficients B: ");
        b = scanner.nextInt();

        //Handling cases and calculating
        if (a == 0 && b == 0) {
            System.out.println("Every value for X is a solution to the linear equation 0*X + 0 = 0");
        } else if (a == 0) {
            System.out.printf("There is no solution for the linear equation 0*X + %d = 0\n", b);
        } else {
            System.out.printf("The linear equation %d*X + %d = 0 has an unique root is X = %.2f\n", a, b, (double) -b / a);
        }
    }

}
