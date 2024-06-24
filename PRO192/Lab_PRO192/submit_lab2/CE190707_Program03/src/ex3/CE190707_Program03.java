/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

import java.util.Scanner;

/**
 *
 * @author Le Nguyen Hai Dang
 * Roll number CE190707
 * Class SE1816
 */
public class CE190707_Program03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables declaration
        String firstName, lastName;
        char fn, ln;
        Scanner scanner = new Scanner(System.in);

        //Getting user input
        System.out.print("Please enter your first name: ");
        firstName = scanner.next();
        System.out.print("Please enter your last name: ");
        lastName = scanner.next();

        //Calculating
        /*
		 * Algorithm explain:
		 * Character class provide a toUpperCase() method. 
         */
        fn = firstName.charAt(0);
        ln = lastName.charAt(0);
        System.out.printf("Result: %c.%c.\n", Character.toUpperCase(fn), Character.toUpperCase(ln));
    }

}
