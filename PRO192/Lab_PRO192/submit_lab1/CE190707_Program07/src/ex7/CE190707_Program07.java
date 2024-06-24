/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex7;

import java.util.Scanner;

/**
 *
 * @author ADMIN Author: Le Nguyen Hai Dang 
 * Roll Number: CE190707 
 * Class: SE1816
 */
public class CE190707_Program07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variable declaration
        int n;
        long ans = 1;
        String ansStr = "Result: ";
        Scanner scanner = new Scanner(System.in);

        //Getting user input
        System.out.print("Please enter positive integer N: ");
        n = scanner.nextInt();

        //Handling exception and calculating
        if (n < 0) {
            System.out.println("N must be greater than or equal 0!");
        } else if (n == 0 || n == 1) {
            System.out.println(ansStr + Integer.toString(n) + "! = 1");
        } else {
            ansStr += Integer.toString(n) + "! = 1";
            for (int i = 2; i <= n; i++) {
                ans *= i;
                ansStr += "*" + i;
            }
            ansStr += " = " + Long.toString(ans);
            System.out.println(ansStr);
        }
    }

}
