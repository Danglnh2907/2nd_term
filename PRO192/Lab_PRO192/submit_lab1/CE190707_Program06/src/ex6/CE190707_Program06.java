/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex6;

import java.util.Scanner;

/**
 *
 * @author ADMIN Author: Le Nguyen Hai Dang 
 * Roll Number: CE190707 
 * Class: SE1816
 */
public class CE190707_Program06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variable declaration
        int n;
        long factorial = 1, powerOf2 = 1;
        double sum = 1.0;
        String ans = "S = ";
        Scanner scanner = new Scanner(System.in);

        //Getting user input
        System.out.print("Please enter positive integer N: ");
        n = scanner.nextInt();

        //Handling error and calculating
        if (n <= 0) {
            System.out.println("Accept positive number only!");
        } else if (n == 1) {
            System.out.println("S = 1");
        } else {
            ans += "1!/2^0";
            for (int i = 2; i <= n; i++) {
                factorial *= i;
                powerOf2 *= 2;

                sum += (double) factorial / powerOf2;
                ans += " + " + Integer.toString(i) + "!/2^" + Integer.toString(i - 1);
            }
            ans += " = " + String.format("%.2f", sum);
            System.out.println(ans);
        }
    }

}
