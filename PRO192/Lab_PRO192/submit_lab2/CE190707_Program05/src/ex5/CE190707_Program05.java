/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5;

import java.util.Scanner;

/**
 * @author Le Nguyen Hai Dang
 * Roll number CE190707
 * Class SE1816
 */
public class CE190707_Program05 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables declaration
        String word, sentence;
        boolean isContain = false;
        Scanner scanner = new Scanner(System.in);

        //Getting user input
        /*
		 * Here we have to use nextLine() instead of next() because next() won't read the '\n' character, 
		 * so we will get error if we try to use nextLine() to read the sentence afterward
		 * We also have to use trim() method to remove all leading and trailing space since nextLine() can read space character 
         */
        System.out.print("Please enter a word: ");
        word = scanner.nextLine();
        word = word.trim();

        System.out.print("Please enter a sentence: ");
        sentence = scanner.nextLine();

        //Calculating
        /*
		 * Algorithm explain:
		 * The idea is to split the sentence into an array of words, then we will compare each word
		 * Java provide a split() method that can split a string based on a delimiter
		 * Java provide a method equalsIgnoreCase() for comparing string (this method will ignore any case of the 2 words)
		 * Using == can cause potential bugs since == compare the reference, not value
         */
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length && !isContain; i++) {
            if (word.equalsIgnoreCase(words[i])) {
                isContain = true;
            }
        }

        if (isContain) {
            System.out.printf("The word '%s' is in the sentence.\n", word);
        } else {
            System.out.printf("The word '%s' is not in the sentence.\n", word);
        }
    }

}
