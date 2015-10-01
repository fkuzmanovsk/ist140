package stringcompare;
import java.util.Scanner;

/**
 * @author Filip Kuzmanovski
 */
public class StringCompare {

    public static void main(String[] args) {
       
        // Initial Strings
        String userInput1; //String 1
        String userInput2; // String 2
        
        //Scanner object scnr defined
        Scanner scnr = new Scanner(System.in);
        
        //User prompt for first string
        System.out.println("Enter the first string: ");
        userInput1 = scnr.nextLine();
        
        //User prompt for second string
        System.out.println("Enter the second string: ");
        userInput2 = scnr.nextLine();
        
        //Comparing two strings
        if(userInput1.equals(userInput2)) {
            System.out.println("The two Strings are equal");
        } else {
            System.out.println("The two Strings are not equal");
        }
        
        //Outputting two strings lexicographically
        System.out.println(userInput1.compareTo(userInput2));
        
                
    }
    
}
