import java.util.InputMismatchException;
import java.util.Scanner;

public class ParseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter input string: ");
            String userInput = scanner.nextLine();

            if (userInput.equals("q")) {
                break;
            }

            if (userInput.contains(",")) {
                String[] words = userInput.split(",");
                String firstWord = words[0].trim();
                String secondWord = words[1].trim();

                System.out.println("First word: " + firstWord);
                System.out.println("Second word: " + secondWord);
                System.out.println();
                System.out.println();
            } else {
                System.out.println("Error: No comma in string");
            }
        }

        scanner.close();
    }
}
