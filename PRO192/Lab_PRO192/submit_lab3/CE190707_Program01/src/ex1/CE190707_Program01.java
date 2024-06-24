package ex1;

import java.util.Scanner;
import java.util.ArrayList;

/*
 * @author Le Nguyen Hai Dang
 * Roll number: CE190707
 * Class: SE1816
 */

public class CE190707_Program01 {
    //Private methods (Helper methods)
    private static String repeat(String str, int n) {
        String ans = "";
        while (n > 0) {
            ans = ans.concat(str);
            n--;
        }
        return ans;
    }
    
    private static void printTableHeader() {
        String hyp = "-";
        System.out.println("+" + repeat(hyp, 36) + "BOOK MANAGEMENT" + repeat(hyp, 36) + "+");
        System.out.printf("| %3s | %-5s | %-18s | %-4s | %-15s | %-7s | %-15s |\n", "No.", "ID", "Name", "Year", "Author", "Size", "URL");
        System.out.printf("+%s+%s+%s+%s+%s+%s+%s+\n", repeat(hyp, 5), repeat(hyp, 7), repeat(hyp, 20), repeat(hyp, 6), repeat(hyp, 17), repeat(hyp, 9), repeat(hyp, 17));
    }

    public static void main(String[] args) {
        //Variables declaration	
        int option;
        boolean isRunning = true;
        Scanner scanner = new Scanner(System.in);

        //Print menu
        System.out.println("----- BOOK MANAGEMENT -----");
        System.out.println("1. Adds new book.");
        System.out.println("2. Shows all books.");
        System.out.println("3. The biggest size book.");
        System.out.println("4. Search a book by ID.");
        System.out.println("5. Sort the list of books ascending by size.");
        System.out.println("6. Delete a book by ID.");
        System.out.println("7. Quit.");

        //Ask for user option
        System.out.print("Please select a function: ");
        option = scanner.nextInt();

        /*Start running the program*/
        BookManagement manager = new BookManagement();
        //Do an infinite loop until user choose to exit the program
        while (isRunning) {
            switch (option) {
                case 1: {
                    manager.entryData();
                    //Ask for user option
                    System.out.print("Please select a function: ");
                    option = scanner.nextInt();
                    break;
                }
                case 2: {
                    printTableHeader();
                    manager.printData();
                    //Ask for user option
                    System.out.print("Please select a function: ");
                    option = scanner.nextInt();
                    break;
                }
                case 3: {
                    ArrayList<EBook> biggest = manager.biggestSize();
                    //print table
                    printTableHeader();
                    int index = 1;
                    for (EBook eb : biggest) {
                        eb.showInfo(index);
                        index++;
                    }
                    //Ask for user option
                    System.out.print("Please select a function: ");
                    option = scanner.nextInt();
                    break;
                }
                case 4: {
                    String ID;
                    //Ask user for ebook's id
                    System.out.print(">>> Please enter book's ID to search: ");
                    ID = scanner.next();
                    //Search for desired book
                    EBook ebook = manager.searchBookObjectByID(ID);
                    //Print book (if found)
                    if (ebook != null) {
                        System.out.println("Search results: ");
                        printTableHeader();
                        ebook.showInfo(1);
                    } else {
                        System.out.println("Search results: Not Found");
                    }
                    //Ask for user option
                    System.out.print("Please select a function: ");
                    option = scanner.nextInt();
                    break;
                }
                case 5: {
                    printTableHeader();
                    manager.sort();
                    //Ask for user option
                    System.out.print("Please select a function: ");
                    option = scanner.nextInt();
                    break;
                }
                case 6: {
                    String ID;
                    //Ask user for book's id
                    System.out.print("Please enter book's ID: ");
                    ID = scanner.next();
                    //Deleting book (if exist)
                    manager.deleteBookByID(ID);
                    //Ask for user option
                    System.out.print("Please select a function: ");
                    option = scanner.nextInt();
                    break;
                }
                case 7: {
                    //Print thanks you message
                    System.out.println("THANK FOR USING OUR APPLICATION!");
                    System.out.println("SEE YOU AGAIN!");
                    //Stop the program
                    isRunning = false;
                    break;
                }
                default: {
                    //Print alert message for invalid option
                    String mess = "The function of application must be from 1 to 7!\n";
                    System.out.print(mess);
                    System.out.print("Please select a function: ");
                    option = scanner.nextInt();
                }
            }
        }
    }
}
