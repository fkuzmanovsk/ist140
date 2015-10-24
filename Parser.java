package parser;
import java.util.Scanner;

/*
 * @author Filip Kuzmanovski
 */
public class Parser {
    
   public static void main(String[] args) {
       // Scanner class
       Scanner scnr = new Scanner(System.in);
       // Prompt User
       System.out.print("Enter some digits human: ");
      String commaDigs = scnr.nextLine();
      
      // separating values with commas
      String[] digsArr = commaDigs.split(",");
      int[] intArr = new int[digsArr.length];
      
      //For-loop
      for (int i = 0; i < digsArr.length; i++) {
         String numberAsString = digsArr[i];
         intArr[i] = Integer.parseInt(numberAsString);
      }
      // Print Statements for Integers
      System.out.println("You entered " + intArr.length + " integers human.");
      System.out.println("Each integer is printed below on a separate line human:");
      
      for (int number : intArr) {
         System.out.println(number);
      }
   }
}
