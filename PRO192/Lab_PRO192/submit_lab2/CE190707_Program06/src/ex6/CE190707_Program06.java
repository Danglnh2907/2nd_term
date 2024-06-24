/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex6;

import java.util.Scanner;

/**
 * @author Le Nguyen Hai Dang
 * Roll number CE190707
 * Class SE1816
 */
public class CE190707_Program06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables declaration
        String sentence, word;
        Scanner scanner = new Scanner(System.in);

        //Getting user input
        System.out.print("Please enter a sentence: ");
        sentence = scanner.nextLine();
        System.out.print("Please enter a color: ");
        word = scanner.next();

        //Handling error and calculating
        /*
		 * Algorithm explain:
		 * Java String class provide 2 useful methods: contains() and replace()
		 * str1.contains(str2) check whether the string str2 is in the string str1
		 * str1.replace(str2, str3) replace all str2 that appeared in str1 to str3
         */
        if (!sentence.contains("red")) {
            System.out.println("There is no 'red' word in the sentence");
        } else {
            sentence = sentence.replace("red", word);
            System.out.println(sentence);
        }
    }

}
