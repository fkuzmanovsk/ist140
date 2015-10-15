package averager;
import java.util.Scanner;

/*
 * @author Filip Kuzmanovski
 */
public class Averager {
    
    public static void main(String[] args) {
        
        // initial variables
        double posNums;
        double sum = 0;
        int count = 0;
        
        // Scanner initialized
        Scanner scnr = new Scanner(System.in);
        
        // do-while loop
        do
        {
            System.out.print("Enter positive numbers here: ");
            posNums = scnr.nextDouble();
            sum = sum + posNums;
            count++;
            
        } while (posNums != -1);
        
        // once you enter -1 , your average will be calculated
        System.out.println("average is " + sum / (count - 1));
       
               
    }
    
}
