/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit6problemset;
import java.util.Scanner;

/*
 @author Filip Kuzmanovski
 */
public class Unit6ProblemSet {

    public static void main(String[] args) {
        
        // Call your methods here
        
    }
    
  
    
    // Write your methods below here
     // banner message 
    public static void bannerPrinter() {
        System.out.println("******************************************");
        System.out.println("****** Welcome to my eCommerce app! ******");
        System.out.println("******************************************");
        System.out.println(""); //instructions requested blank line after banner
    }
    
    /* Write a method called productBuilder that takes no parameters and returns an array of Strings.
    In the method body construct and return an array of 5 Strings (call the array products)
    and populate the array with 5 product names. You don't need to get the values from the user, just 
    populate with 5 product names. */
    public static String[] productBuilder() {
        String[] products = {"PS4","iPhone6S","XBOX ONE", "Macbook Pro", "iPod"};
        return products;
    }
    
    
    
}
