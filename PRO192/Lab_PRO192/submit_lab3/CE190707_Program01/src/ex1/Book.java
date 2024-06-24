package ex1;

/*
 * @author Le Nguyen Hai Dang
 * Roll number: CE190707
 * Class: SE1816
 */

public class Book {
    //Class attribute
    private String ID;
    private String name;
    private int year;
    private String author;
    private int size;

    //Default Constructor
    public Book() {
        this.ID = "";
        this.name = "";
        this.author = "";
        this.year = 1900;
        this.size = 0;
    }

    //Parametric constructor
    public Book(String ID, String name, int year, String author, int size) {
        this.ID = ID;
        this.name = name;
        this.year = year;
        this.author = author;
        this.size = size;
    }

    /*Getter methods start*/
    
    public String getID() {
        return this.ID;
    }

    public String getName() {
        return this.name;
    }

    public int getYear() {
        return this.year;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getSize() {
        return this.size;
    }

    /*Getter methods end*/

    /*Setter methods start*/
    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setSize(int size) {
        this.size = size;
    }

    /*Setter methods end*/
    
    //protected method (helper method)
    protected String repeat(String str, int n) {
        String ans = "";
        while (n > 0) {
            ans = ans.concat(str);
            n--;
        }
        return ans;
    }

    //public method
    public void showInfo(int index) {
        String hyp = "-";
        System.out.printf("| %-3d | %-5s | %-18s | %-4d | %-15s | %5dKB |\n", index, this.ID, this.name, this.year, this.author, this.size);
        System.out.printf("+%s+%s+%s+%s+%s+%s+\n", repeat(hyp, 5), repeat(hyp, 7), repeat(hyp, 20), repeat(hyp, 6), repeat(hyp, 17), repeat(hyp, 9));

    }
}
