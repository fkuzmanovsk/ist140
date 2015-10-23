
package minmax;
import java.util.Scanner;

/*
 * @author Filip Kuzmanovski
 */
public class MinMax {

    public static void main(String[] args) {
        //initial variables
        double[] myNums = new double[5];
        
        // Scanner initialized
        Scanner scnr = new Scanner(System.in);
        

        
        // For loop to make sure we only get 5 elements
        for ( int i = 0; i < myNums.length; i++)
            
        {
            /* Hit enter after each value entered and once you enter your 5th and last value,
            you will see your minimum and maximum values
            */
            System.out.print("Enter your desired values: ");
             myNums[i] = scnr.nextDouble();
            
        }
       
        //For loop to get minimum value
        double minimum = myNums[0];
        for ( int i = 1; i < myNums.length; i++)
        {
            if (myNums[i] < minimum)
            {
                minimum = myNums[i];
            }
        }
        //Print minimum value
        System.out.println("Based on the values you chose, the minimum value is " + minimum);
        
        //For loop to get max value
        double maximum = myNums[0];
        for ( int i = 1; i < myNums.length; i++)
        {
            if (myNums[i] > maximum)
            {
                maximum = myNums[i];
            }
        }
        //Print maximum value
        System.out.println("Based on the values you chose, the maximum value is " + maximum);

    }
    
}
