package stringslicer;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * @author Filip Kuzmanovski
 */
public class StringSlicer {

    public static void main(String[] args) {
        
        // initial declarations
        String word = "";
        
        //Scanner initialization
        Scanner scnr = new Scanner(System.in);
       
        
        //array list of character data
         ArrayList<Character> charNames = new ArrayList<>();
         
         //User input
        System.out.println("Enter a string human: ");
         
         // prompt for string
         word = scnr.nextLine();
         
        // for loop for outputting chars
        for (int i = 0; i < word.length(); i++ )
        {
            charNames.add(word.charAt(i));
            
            // prints each character on a separate line
            System.out.println(word.charAt(i));
        }
          
    }
    
}
