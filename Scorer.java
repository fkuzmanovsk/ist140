
package scorer;
import java.util.Scanner;

/*
 * @author Filip Kuzmanovski
 */
public class Scorer {
    
    public static void main(String[] args){
             // array declared
             double[][] scores = new double[3][3];
            
             
             
             // Scanner initialized
             Scanner scnr = new Scanner(System.in);
             
        // User prompt,     
        System.out.println("Enter some numbers human: ");
        
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                
                 scores[i][j] = scnr.nextDouble();
                 
            }
        }

        // Printed the array to show its functionality
        System.out.println("Your two dimensional array is printed below!");
        for (double[] a : scores) {
            for (double i : a) {
                System.out.print(i + "\t");
            }
            System.out.println("\n");
            
        }
        
    }
}

  