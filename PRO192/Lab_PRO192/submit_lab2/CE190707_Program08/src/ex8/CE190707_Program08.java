/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex8;

import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;

/**
 *
 * @author Le Nguyen Hai Dang
 * Roll number CE190707
 * Class SE1816
 */

class Solution {

    /*
	 * Algorithm explain
	 * Since there is multiple task we have to complete, creating methods will help the code more structure
	 * We define all the methods with static keyword, which allows us to invoke the method directly from te class instead of creating a new object
     */

    //Static method for printing the array list
    public static void printList(ArrayList<String> contestants) {
        int index = 1;
        for (String contestant : contestants) {
            System.out.printf("%d. %s\n", index, contestant);
            index++;
        }
    }

    //Static method for printing the player's name that has the last name equals "Nguyen"
    public static void printLastName(ArrayList<String> contestants) {
        int index = 1;
        for (String contestant : contestants) {
            String[] words = contestant.split(" ");
            if (words[0].equalsIgnoreCase("Nguyen")) {
                System.out.printf("%d. %s\n", index, contestant);
                index++;
            }
        }
    }

    //Static method for printing the player's name that has the first name equals "Dung"
    public static void printFirstName(ArrayList<String> contestants) {
        int index = 1;
        for (String contestant : contestants) {
            String[] words = contestant.split(" ");
            if (words[words.length - 1].equalsIgnoreCase("Dung")) {
                System.out.printf("%d. %s\n", index, contestant);
                index++;
            }
        }
    }

    //Static method for getting a random player from the array list
    /*
	 * Algorithm explain:
	 * The Math class provide random() method that return a pseudo random number in range [0, 1)
     */
    public static void printLuckyPlayer(ArrayList<String> contestants) {
        int rand = (int) (Math.random() * contestants.size());
        System.out.println(contestants.get(rand));
    }
}

public class CE190707_Program08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables declaration
        ArrayList<String> contestants = new ArrayList<String>();
        String str = "";
        int index;
        Scanner scanner = new Scanner(System.in);

        //Getting user input
        while (!str.equalsIgnoreCase("quit")) {
            System.out.print("Please enter a name (quit to exit!): ");
            str = scanner.nextLine();
            if (!str.equalsIgnoreCase("quit")) {
                contestants.add(str);
            }
        }

        //Handling cases and calculating
        if (contestants.size() == 0) {
            System.out.println("The player list is empty!");
            return;
        }

        //Print out list of player
        System.out.println("List of players:");
        Solution.printList(contestants);

        //print out the list of player with the last name "Nguyen"
        System.out.println("#. List of players with the last name 'Nguyen':");
        Solution.printLastName(contestants);

        //Print out the list of player with the first name "Dung"
        System.out.println("#. List of players named 'Dung':");
        Solution.printFirstName(contestants);

        //Print out lucky player
        System.out.println("#. The name of the lucky winner:");
        Solution.printLuckyPlayer(contestants);
    }

}
