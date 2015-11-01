package averager;
import java.util.Scanner;

/*
 * @author Filip Kuzmanovski
 */
public class Averager {
    
    public static void main(String[] args) {
        
         // Scanner initialized
         Scanner scnr = new Scanner(System.in);
         
        // initial variables
        double[] myNums = new double[5];
        double sum = 0;
        double average = 0;
        
        for (int i = 0; i < myNums.length; i++)
        {
            System.out.print("Enter some numbers human: ");
            myNums[i] = scnr.nextDouble();
            sum = sum + myNums[i];
        }
        average = sum / myNums.length;
        System.out.println("Your average is " + average);
    }
}