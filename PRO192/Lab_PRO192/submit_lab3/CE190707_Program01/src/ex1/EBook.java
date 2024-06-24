package ex1;

/*
 * @author Le Nguyen Hai Dang
 * Roll number: CE190707
 * Class: SE1816
 */

public class EBook extends Book {
    //Class attribute
    String URL;

    //Default constructor
    public EBook() {
        super();
        this.URL = "";
    }

    //Parametric constructor
    public EBook(String ID, String name, int year, String author, int size, String URL) {
        super(ID, name, year, author, size);
        this.URL = URL;
    }

    //Getter methods
    public String getURL() {
        return this.URL;
    }

    //Setter methods
    public void setURL(String URL) {
        this.URL = URL;
    }
    
    @Override
    public void showInfo(int index) {
        String hyp = "-";
        System.out.printf("| %-3d | %-5s | %-18s | %-4d | %-15s | %5dKB | %-15s |\n", index, getID(), getName(), getYear(), getAuthor(), getSize(), this.URL);
        System.out.printf("+%s+%s+%s+%s+%s+%s+%s+\n", repeat(hyp, 5), repeat(hyp, 7), repeat(hyp, 20), repeat(hyp, 6), repeat(hyp, 17), repeat(hyp, 9), repeat(hyp, 17));
    }

}
