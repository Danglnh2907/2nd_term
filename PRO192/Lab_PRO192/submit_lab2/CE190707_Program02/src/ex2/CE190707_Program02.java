/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.util.Scanner;

/**
 * @author Le Nguyen Hai Dang
 * Roll number CE190707
 * Class SE1816
 */
public class CE190707_Program02 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variable declaration
        String color;
        Scanner scanner = new Scanner(System.in);

        //Getting user input
        System.out.print("Please type a color: ");
        color = scanner.next();

        //Calculating

        /*
		 * Algorithm explain: 
		 * We don't need to handle the first letter, since user has to type something for the program to proceed next 
		 * Meanwhile, there may be a change that the word user enter only has 1 or 2 letters, which means accessing 3rd letter will produce an error
		 * Apparently, there is no color that has only 1 or 2 letters, but handling potential bugs is always a good thing :>
         */
        System.out.println("The first letter is " + color.charAt(0));
        if (color.length() >= 3) {
            System.out.println("The third letter is " + color.charAt(2));
        }
    }

}
