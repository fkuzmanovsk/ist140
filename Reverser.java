package reverser;
import java.util.Scanner;

/**
 * @author Filip Kuzmanovski
 */
public class Reverser {

    public static void main(String[] args) {
        
        // User Prompt
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter a word that you would liked to be reversed Human: ");
        
        String userInput = scnr.nextLine();
        for (int i = userInput.length() - 1; i >= 0; i--) {
        System.out.print(userInput.charAt(i));

    }
}
}
