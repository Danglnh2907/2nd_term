/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.util.Scanner;

/**
 * @author Le Nguyen Hai Dang 
 * Roll number CE190707
 * Class SE1816
 */
public class CE190707_Program01 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variable declaration
        String str;
        Scanner scanner = new Scanner(System.in);

        //Getting user input
        System.out.print("Please enter a word: ");
        str = scanner.next();

        /*
		 * Algorithm explain: String in java does not allow direct accessing like in C or C++, which means str[0] is not allowed
		 * Instead, String class provide a method for accessing elenment in a string called charAt()
         */
        
        if (str.charAt(0) == 'a') {
            System.out.println("Yes, it starts with a lower case 'a'.");
        } else if (str.charAt(0) == 'A') {
            System.out.println("Yes, it starts with an upper case 'A'.");
        } else {
            System.out.println("No, it does not start with upper or lower case 'a'.");
        }
    }

}
