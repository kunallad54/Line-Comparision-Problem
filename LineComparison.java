import java.util.Scanner;

public class LineComparison{

    //main method
    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Problem !!!");
        
        //Calculating length of first Line by calling lengthOfLine method
        System.out.println("Enter First Line Details : ");
        double firstLineLength = lengthOfLine();

        System.out.println();

        //Calculating length of second line by calling lengthOfLine method
        System.out.println("Enter Second Line Details : ");
        double secondLineLength = lengthOfLine();
        
        equalityOfLines(firstLineLength, secondLineLength);
        comparisonOfLines(firstLineLength, secondLineLength);

        System.out.println("Length of the first line is : " + firstLineLength);
        System.out.println("Length of the second line is : " + secondLineLength);
    }
    
    // returns length of line
    public static double lengthOfLine() {

        System.out.println("Enter the start co-ordinates (x1,y1) :");
        int x1 = readInt();
        int y1 = readInt();

        System.out.println("Enter the end co-ordinates (x2,y2) : ");
        int x2 = readInt();
        int y2 = readInt();

        return lengthCalculator(x1, y1, x2, y2);
    }

    // reads user input and returns integer number
    public static int readInt() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    
    // Calculates Length of line by applying formula and returns the value
    public static double lengthCalculator(int x1, int y1, int x2, int y2) {

        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

    }
    
    // Checks equality of Two Lines
    public static void equalityOfLines(double l1, double l2) {

        String line1 = String.valueOf(l1);
        String line2 = String.valueOf(l2);

        if (line1.equals(line2))
            System.out.println("The length of both lines is equal");

        else
            System.out.println("The length of both lines in not equal");

    }

    // Compares Length Of Two Lines
    public static void comparisonOfLines(double l1, double l2) {

        String line1 = String.valueOf(l1);
        String line2 = String.valueOf(l2);

        if (line1.compareTo(line2) == 0)
            System.out.println("Length of Line 1 is equal to Line 2");

        else if (line1.compareTo(line2) < 0)
            System.out.println("Length of Line 1 is less than Line 2");

        else if (line1.compareTo(line2) > 0)
            System.out.println("Length of Line 1 is greater than Line 2");

    }
}
