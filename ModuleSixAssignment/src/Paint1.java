import java.util.InputMismatchException;
import java.util.Scanner;

public class Paint1 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;

        final double squareFeetPerGallons = 350.0;

        boolean validInput = false;
        do {
            try {
                System.out.println("Enter wall height (feet): ");
                wallHeight = scnr.nextDouble();
                if (wallHeight > 0) {
                    validInput = true;
                }
                else {
                    System.out.println("Please enter a positive number.");
                }
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a numeric value.");
                scnr.next(); // clear buffer
            }
        }
        while (!validInput);

        // Reset for next input:
        validInput = false;

        do {
            try {
                System.out.println("Enter wall width (feet): ");
                wallWidth = scnr.nextDouble();
                if (wallWidth > 0) {
                    validInput = true;
                }
                else {
                    System.out.println("Please enter a positive number.");
                }
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a numeric value.");
                scnr.next(); // clear buffer
            }
        }
        while (!validInput);

        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea + " square feet");

        gallonsPaintNeeded = wallArea/squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");

        scnr.close();
    }
}
