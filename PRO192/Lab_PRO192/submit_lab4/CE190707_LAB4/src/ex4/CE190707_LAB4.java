package ex4;
import java.util.Scanner;

/*
 * Author: Le Nguyen Hai Dang
 * Roll number: CE190707
 * Class: SE1816
 */

public class CE190707_LAB4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Print menu
        System.out.println("----- SHAPE MANAGEMENT -----");
        System.out.println("1. Adds new Circle.");
        System.out.println("2. Adds new Triangle.");
        System.out.println("3. Adds new Rectangle.");
        System.out.println("4. Adds new Square.");
        System.out.println("5. Shows all Shapes.");
        System.out.println("6. The biggest area shape.");
        System.out.println("7. Sort ascending by shape area.");
        System.out.println("8. Search a shape.");
        System.out.println("9. Quit.");

        //Ask for user option
        int option;
        boolean isRunning = true;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please select a function: ");
        option = scanner.nextInt();

        //Create manager
        ShapeManagement manager = new ShapeManagement();

        //Run program infinitely until user choose to quit
        while (isRunning) {
            switch (option) {
                case 1: {
                    manager.addCircle();
                    //Ask for user's option
                    System.out.print("Please select a function: ");
                    option = scanner.nextInt();
                    break;
                }
                case 2: {
                    manager.addTriangle();
                    //Ask for user's option
                    System.out.print("Please select a function: ");
                    option = scanner.nextInt();
                    break;
                }
                case 3: {
                    manager.addRectangle();
                    //Ask for user's option
                    System.out.print("Please select a function: ");
                    option = scanner.nextInt();
                    break;
                }
                case 4: {
                    manager.addSquare();
                    //Ask for user's option
                    System.out.print("Please select a function: ");
                    option = scanner.nextInt();
                    break;
                }
                case 5: {
                    manager.showShapes();
                    //Ask for user's option
                    System.out.print("Please select a function: ");
                    option = scanner.nextInt();
                    break;
                }
                case 6: {
                    manager.showBiggestShape();
                    //Ask for user's option
                    System.out.print("Please select a function: ");
                    option = scanner.nextInt();
                    break;
                }
                case 7: {
                    manager.sort();
                    //Ask for user's option
                    System.out.print("Please select a function: ");
                    option = scanner.nextInt();
                    break;
                }
                case 8: {
                    manager.showSearchShape();
                    //Ask for user's option
                    System.out.print("Please select a function: ");
                    option = scanner.nextInt();
                    break;
                }
                case 9: {
                    System.out.println("THANK FOR USING OUR APPLICATION!\nSEE YOU AGAIN!");
                    isRunning = false;
                    break;
                }
                default: {
                    System.out.println("The function of application must be from 1 to 9!");
                    //Ask for user's option
                    System.out.print("Please select a function: ");
                    option = scanner.nextInt();
                    break;
                }
            }
        }
    }
}
