/*
 *Very simple tax program
 */
package incometax;
import java.util.Scanner;

/*
 * @author Filip Kuzmanovski
 */
public class IncomeTax {
    
   public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    String maritalStatus;
    System.out.println("Enter your marital status. For Single type 's', for married 'm': ");

    maritalStatus = sc.next();

    System.out.println("What is your annual income?");
    double annualIncome;
    annualIncome = sc.nextDouble();

    double marriedTax = 0;
    double singleTax = 0; 

    if (maritalStatus.equals("m")) {

        if (annualIncome > 0 && annualIncome <= 30000) {
            marriedTax = annualIncome * .12;
        }

        else if (annualIncome > 30000) {
            marriedTax = annualIncome * .20;
        }

      

        System.out.printf("Based on an annual income of " + annualIncome + " your tax is " + marriedTax );
    };


    if (maritalStatus.equals("s")) {

        if (annualIncome > 0 && annualIncome <= 30000) {
            singleTax = annualIncome * .15;
        }

        else if (annualIncome > 30000) {
            singleTax = annualIncome * .25;
        }

        
        
        System.out.printf("Based on an annual income of " + annualIncome + " your tax is " + singleTax);
    };

    sc.close();

}
}