/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex7;

import java.util.Scanner;

/**
 * @author Le Nguyen Hai Dang
 * Roll number CE190707
 * Class SE1816
 */
public class CE190707_Program07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables declaration
        String password;
        Scanner scanner = new Scanner(System.in);

        //Getting user input
        System.out.print("Please enter a password: ");
        password = scanner.nextLine();

        //Checking whether the password pass all the requirement
        boolean req1 = password.length() >= 8;
        boolean req2 = !password.contains(" ");
        boolean req3 = password.charAt(0) == 'G';

        //Print error if the fail the requirement
        if (!req1) {
            System.out.println("Your password is too short.");
        }
        if (!req2) {
            System.out.println("Your password contains spaces.");
        }
        if (!req3) {
            System.out.println("Your password does not start with a 'G'.");
        }
        //If both 3 requirement are met, which means our password correct
        if (req1 && req2 && req3) {
            System.out.println("Well done. You entered a valid password.");
        }
    }

}
