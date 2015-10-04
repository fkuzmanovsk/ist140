/*
 * Simple program that determines the state of a water sample given its temp.
 * Use a decimal number to test accurate temperatures
 */
package h2ostate;
import java.util.Scanner;

/*
 * @author Filip Kuzmanovski
 */
public class H2OState {
    
    public static void main(String[] args) {
        // TODO code application logic here
       
        
        // Scanner object for user input and making sure we have an integer
         Scanner scnr = new Scanner(System.in);
        System.out.println("What is the temperature of your water sample: ");
        if (scnr.hasNextInt())
        {
            int waterTemp = scnr.nextInt();
            
        if (waterTemp <= 0)
        {
            System.out.println("Your sample is a solid.");
        }
        else if (waterTemp >= 100)
        {
            
            System.out.println("Your sample is a gas.");
        }
        else if (waterTemp > 0 && waterTemp < 100 )
        {
            
            System.out.println("Your sample is a liquid.");
        }
        }
        
        else
        {
            System.out.println("Improper input, next time please enter an integer");
        }
       
    
}
}