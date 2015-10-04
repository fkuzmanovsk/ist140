/*
 * Simple program that determines Class based on ticket price code
 */
package seatingcode;
import java.util.Scanner;


/*
 * @author Filip Kuzmanovski
 */
public class SeatingCode {

    public static void main(String[] args) {
        
        // initial variable
        int ticketPriceCode;
        
        // Scanner object for user input
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter Ticket Price Code: "); // user prompt
        ticketPriceCode = scnr.nextInt();
        
        //Switch - Case Statement for user choice
        switch(ticketPriceCode)
        {
            case 1:
                System.out.println("First Class"); //if 1 entered, first class
                
                break;
            
            case 2:
                System.out.println("Business Class"); // if 2 entered, business class
                
                break;
                
            case 3:
                System.out.println("Coach"); // if 3 entered, coach
                
                break;
                
            default:
                System.out.println("Invalid seating code"); // invalid code to prevent endless loop
                
                break;
        }
    }
    
}
