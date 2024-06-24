package ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

/*
 * @author Le Nguyen Hai Dang
 * Roll number: CE190707
 * Class: SE1816
 */

public class BookManagement {
    //Class Attribute

    private ArrayList<EBook> listEBook;

    //Default constructor
    public BookManagement() {
        this.listEBook = new ArrayList<EBook>();
    }

    //Getter methods
    public ArrayList<EBook> getListEBook () {
        return this.listEBook;
    }
    
    //Setter methods
    public void setListEBook (ArrayList<EBook> listEBook) {
        this.listEBook = listEBook;
    }
    
    /*Public methods start*/
    
    //get ebook's information and store to database
    public void entryData() {
        //Variables declaration
        Scanner scanner = new Scanner(System.in);
        EBook ebook = new EBook();
        String id, name, author, url;
        int year, size;
        //print message
        System.out.println("----- Add new ebook -----");

        
	 /*Get and handle ID*/
        System.out.print("Input ID: ");
        id = scanner.next();

        //Handling error if user try to enter an ID that has length not equals to 5
        if (id.length() != 5) {
            System.out.println("We only accept an ID of length 5!!! Please try again");
            return;
        }

        //Handling error if user try to input an existed ID
        for (EBook eb : listEBook) {
            if (id.equals(eb.getID())) {
                System.out.println("This ID has already existed in database!!! Please choose another ID");
                return;
            }
        }

        ebook.setID(id);

        /*Get and Handle name*/
        System.out.print("Input name: ");
        scanner.nextLine();
        name = scanner.nextLine();

        //handling erorr if name is an empty string (or a string contains only space characters)
        if (name.trim().isEmpty()) {
            System.out.println("We only accept a non-empty name!!! Please try again");
            return;
        }

        ebook.setName(name);

        /*Get and Handle year*/
        System.out.print("Input year: ");
        year = scanner.nextInt();

        //Handling if year is NOT in range [1900, 2024]
        if (1900 > year || year > 2024) {
            System.out.println("We only accept year in range [1900, 2024]!!! Please try again");
            return;
        }

        ebook.setYear(year);

        /*Get and Handle author*/
        System.out.print("Input authors: ");
        scanner.nextLine();
        author = scanner.nextLine();

        //handling erorr if author is an empty string (or a string contains only space characters)
        if (author.trim().isEmpty()) {
            System.out.println("We only accept a non-empty name!!! Please try again");
            return;
        }

        ebook.setAuthor(author);

        /*Get and Handle size input*/
        System.out.print("Input size (kilobyte): ");
        size = scanner.nextInt();

        //Handling if size <= 0
        if (size <= 0) {
            System.out.println("We only accept a size > 0!!! Please try again");
            return;
        }

        ebook.setSize(size);

        /*Get and Handle url*/
        System.out.print("Input url: ");
        url = scanner.next();

        //handling erorr if url is an empty string (or a string contains only space characters)
        if (url.trim().isEmpty()) {
            System.out.println("We only accept a non-empty name!!! Please try again");
            return;
        }
        ebook.setURL(url);

        //Adding new ebook to list
        listEBook.add(ebook);

        //print message for successfully adding ebook to list
        System.out.println("Ebook created and added to list of ebooks successful!");
    }

    //print all ebooks information in tabular format
    public void printData() {
        int index = 1;
        for (EBook ebook : listEBook) {
            ebook.showInfo(index);
            index++;
        }
    }

    //sort ebooks in descending order based on size and print the sorted ebooks
    /* Algorithm explain: 
        * Since Collectios.sort() is an in-place sort, we want to create a copy of listEBook.
	* We have to use a constructor since Java will pass the reference of the original list, 
	* which means all operations applied to the new list will also reflect on the original list
    */
    public void sort() {
        ArrayList<EBook> sortedList = new ArrayList<EBook>(listEBook);
        Collections.sort(sortedList, new Comparator<EBook>() {
            //@veriding compare method
            public int compare(EBook eb1, EBook eb2) {
                //Since we want to sort in descending order, we have to compare eb2 to eb1
                return Integer.compare(eb2.getSize(), eb1.getSize());
            }
        });
        //Print sorted list
        int index = 1;
        for (EBook ebook : sortedList) {
            ebook.showInfo(index);
            index++;
        }
    }

    //find and return an ebook's index by ID
    public int searchBookByID(String ID) {
        int index = 0;
        for (EBook ebook : listEBook) {
            if (ebook.getID().equalsIgnoreCase(ID)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    //find and return an ebook object using by ID
    public EBook searchBookObjectByID(String ID) {
        int index = searchBookByID(ID);
        if (index != -1) {
            return listEBook.get(index);
        }
        return null;
    }

    //find and return a list consists of ebooks that have biggest size
    public ArrayList<EBook> biggestSize() {
        //Variables declaration
        ArrayList<EBook> biggest = new ArrayList<EBook>();
        EBook maxEBook = listEBook.get(0);
        //Find the maximum ebook's size
        for (EBook ebook : listEBook) {
            if (ebook.getSize() > maxEBook.getSize()) {
                maxEBook = ebook;
            }
        }
        //Add all ebooks that have size equal to maxSize to the list
        for (EBook ebook : listEBook) {
            if (ebook.getSize() == maxEBook.getSize()) {
                biggest.add(ebook);
            }
        }
        return biggest;
    }

    //deleting book by id
    public void deleteBookByID(String ID) {
        int index = searchBookByID(ID);
        if (index != -1) {
            listEBook.remove(index);
            System.out.println("Delete successfully.");
        } else {
            System.out.println("Not found");
        }
    }

    /*public methods end*/
}
