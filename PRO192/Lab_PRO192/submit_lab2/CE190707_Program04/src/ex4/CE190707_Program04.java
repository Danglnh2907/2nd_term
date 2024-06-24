/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4;

import java.util.Scanner;

/**
 *
 * @author Le Nguyen Hai Dang
 * Roll number CE190707
 * Class SE1816
 */
public class CE190707_Program04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables declaration
        int num;
        String str;
        Scanner scanner = new Scanner(System.in);

        //Getting user input 
        System.out.print("Please enter a name: ");
        str = scanner.next();
        System.out.print("Please enter a number: ");
        num = scanner.nextInt();

        //Exception handling and calculating
        /*
		 * Algorithm explain: 
		 * String class provide a length() method to get the length of the string
         */
        if (num < 0) {
            System.out.println("Invalid number!!");
        } else if (num >= str.length()) {
            System.out.println("Sorry, that number is to big.");
        } else {
            System.out.printf("The letter at position %d is %c\n", num, str.charAt(num));
        }
    }

}
