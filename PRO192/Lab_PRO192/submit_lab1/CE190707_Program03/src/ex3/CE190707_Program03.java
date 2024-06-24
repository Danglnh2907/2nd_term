/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

import java.util.Scanner;

/**
 *
 * @author ADMIN Author: Le Nguyen Hai Dang 
 * Roll Number: CE190707 
 * Class: SE1816
 */
public class CE190707_Program03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variable declaration
        int a, b;
        Scanner scanner = new Scanner(System.in);

        //Getting user input
        System.out.print("Please enter dividend: ");
        a = scanner.nextInt();
        System.out.print("Please enter divisor: ");
        b = scanner.nextInt();

        //Handling exception and calculating
        if (b == 0) {
            System.out.println("The divisor can't be zero!");
        } else {
            if (a % b == 0) {
                System.out.printf("%d is a multiple of %d\n", a, b);
            } else {
                System.out.printf("%d is not a multiple of %d\n", a, b);
            }
        }
    }

}
