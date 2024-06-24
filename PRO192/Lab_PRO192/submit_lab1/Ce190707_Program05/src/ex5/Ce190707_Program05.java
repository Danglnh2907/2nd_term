/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5;

import java.util.Scanner;

/**
 *
 * @author ADMIN Author: Le Nguyen Hai Dang 
 * Roll Number: CE190707 
 * Class: SE1816
 */
public class Ce190707_Program05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variable declaration
        int n, sum = 1;
        String ans = "S = 1";
        Scanner scanner = new Scanner(System.in);

        //Getting user input
        System.out.print("Please enter positive integer N: ");
        n = scanner.nextInt();

        //Handling exception and calculating
        if (n <= 0) {
            System.out.println("Accept positive number only!");
        } else if (n == 1) {
            System.out.println(ans);
        } else {
            for (int i = 2; i <= n; i++) {
                if (i % 2 == 0) {
                    ans += " - " + i;
                    sum -= i;
                } else {
                    ans += " + " + i;
                    sum += i;
                }
            }
            ans += " = " + Integer.toString(sum);
            System.out.println(ans);
        }
    }

}
