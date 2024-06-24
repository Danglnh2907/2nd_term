package ex4;

/*
 * Author: Le Nguyen Hai Dang
 * Roll number: CE190707
 * Class: SE1816
 */

public class Square extends Rectangle {
	//Default constructor
	public Square () {
		super();
	}

	//Parametric constructor
	public Square (String ID, String color, boolean filled, double width, double height) {
		super(ID, color, filled, width, height);
	}

	/*Public methods*/
	@Override
	public void showInfo () {
		String format = "| %-15s | %4s | %-8s | %-20s | %5s | %5s | %5s | %5s | %7s | %7s |\n";
		System.out.printf(format, "Square", ID, toString(), color, filled, String.valueOf(width), "_", "_", String.format("%.1f", getArea()), String.format("%.1f", getPerimeter()));
	}
}
