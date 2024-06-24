/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex8;

import java.util.Scanner;

/**
 *
 * @author ADMIN Author: Le Nguyen Hai Dang 
 * Roll Number: CE190707 
 * Class: SE1816
 */


/*
Create a method with static keyword allow us to invoke that method without having to create an instance of that class
Which mean, instead of:
	Prime prime = new Prime();
	prime.isPrime();
we can just directly invoke the method: Prime.isPrime();
 */
class Solution {
    public static void printArray(int[] arr, int mode) {
        if (mode != 0 && mode != 1) {
            System.out.println("Wrong argument");
            return;
        }
        int len = arr.length;
        if (mode == 0) {
            for (int i = 0; i < len - 1; i++) {
                System.out.printf("%d, ", arr[i]);
            }
            System.out.println(arr[len - 1]);
        } else {
            for (int i = len - 1; i > 0; i--) {
                System.out.printf("%d, ", arr[i]);
            }
            System.out.println(arr[0]);
        }
    }

    public static int findMinMax(int[] arr, int mode) {
        int minVal = arr[0], maxVal = arr[0], len = arr.length;
        for (int i = 1; i < len; i++) {
            if (minVal > arr[i]) {
                minVal = arr[i];
            }
            if (maxVal < arr[i]) {
                maxVal = arr[i];
            }
        }
        return mode == 0 ? minVal : maxVal;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        boolean ans = true;
        for (int i = 2; i * i <= n && ans; i++) {
            if (n % i == 0) {
                ans = false;
            }
        }
        return ans;
    }
}

public class CE190707_Program08 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variable declaration
        int n, minVal, maxVal;
        Scanner scanner = new Scanner(System.in);

        //Getting array size and handling exception
        System.out.print("How many element of numeric array? ");
        n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("The number of element of numeric array must be greater than 0!");
            return;
        }

        //Initialize array
        int[] arr = new int[n];

        //Getting the value of each element in the array
        System.out.println("Please enter value for 10 elements:");
        for (int i = 1; i <= n; i++) {
            System.out.print("Value of the ");
            if (i == 1) {
                System.out.print(i + "st");
            } else if (i == 2) {
                System.out.print(i + "nd");
            } else if (i == 3) {
                System.out.print(i + "rd");
            } else {
                System.out.print(i + "th");
            }
            System.out.print(" element is: ");
            arr[i - 1] = scanner.nextInt();
        }

        System.out.println("*********************************");

        //Print array
        System.out.print("1. The entered array is: ");
        Solution.printArray(arr, 0);

        //Print reverse array
        System.out.print("2. The reverse array is: ");
        Solution.printArray(arr, 1);

        //Find minimum value
        minVal = Solution.findMinMax(arr, 0);
        System.out.println("3. The minimum value of the numeric array is " + minVal);

        //Find maximum value
        maxVal = Solution.findMinMax(arr, 1);
        System.out.println("4. The maximum value of the numeric array is " + maxVal);

        //Find all prime
        System.out.print("5. All the prime numbers in the array is/are ");
        for (int i = 0; i < n; i++) {
            if (Solution.isPrime(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
