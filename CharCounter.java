package charcounter;
import java.util.Scanner;

/*
 * @author Filip Kuzmanovski
 */
public class CharCounter {
    
    public static void main(String[] args) {
        // Initial variables declared
        String word;
        String character;
        int count = 0;
        
        
        
        // Scanner object for user input
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter word: "); // user prompt
        word = scnr.nextLine();
        System.out.println("Enter character: "); //user prompt for desired character to track
        character = scnr.nextLine();
        
        int charLength = character.length();
        int index = word.indexOf(character);
        
        // while loop for each position of word String that returns number of times char occurs
        while (index < word.length() && index !=-1)
        {
            index = word.indexOf(character, index + charLength);
            
            count++;
        }
        
      
           // Print statement for number of occurences
         System.out.println("There is " + count + " occurence of " + character + " in " + word + ".");      
    }
}
