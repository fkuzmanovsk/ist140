
package scorer;
import java.util.Scanner;

/*
 * @author Filip Kuzmanovski
 */
public class Scorer {
    
    public static void main(String[] args){
             // array declared
             double[][] scores = new double[3][3];
             double[] avg = new double[3];
             
             
             // Scanner initialized
             Scanner scnr = new Scanner(System.in);
             
            // User prompt
            System.out.println("Enter some numbers human: ");
        
            //  nested For loop 
            for(int i=0;i<3;i++)
            {
                avg[i] = 0;
            for(int j=0;j<3;j++)
            {
               scores[i][j] = scnr.nextDouble();
               avg[i] = scores[i][j]/3+avg[i];
            }
        }
            // for loop for outputting average
            for(int i=0;i<3;i++)
            {
           System.out.println("Your average for row "+(i+1)+"  is : "+avg[i]);
            }    
        }
    }
