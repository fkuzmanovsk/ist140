package finder;
import java.util.Arrays;
import java.util.Scanner;

/*
 * @author Filip Kuzmanovski
 */
public class Finder {
    
    public static void main(String[] args) {
        // array declaration
        String[] names = new String[5];
        
        //Scanner initiated
        Scanner scnr = new Scanner(System.in);
        
        //For-loop for names
       for (int i = 0; i < names.length; i++)
       {
           // Make sure you enter 5 values and hit enter after each one
           System.out.print("Enter string values human: ");
           names[i] = scnr.nextLine();
       }
       // Search term 
        System.out.print("Enter a string to search for: ");
        String searchTerm = scnr.nextLine();
            if (Arrays.asList(names).contains(searchTerm))
            {
            System.out.print("Search term found");
            }
       else
        {
            System.out.print("Search term not found");
        }      
    }
}
