package rooter;
import java.util.Scanner;

/*
 * @author Filip Kuzmanovski
 */
public class Rooter {

    public static void main(String[] args) {
        
        // Initial variables
        int start = 0;
        
        
        //Scanner object for user input
        Scanner scnr = new Scanner(System.in);
        System.out.print("Please enter desired number: ");
        start = scnr.nextInt();
        
        // while loop for square root
        while (start >= 1)
        {
           System.out.println(Math.sqrt(start));
           start--;
        }  
    }
}
