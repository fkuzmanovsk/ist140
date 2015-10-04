/*
 * Simple program for checking password
 * IST140 Unit3 Quiz Problem #3
 */
package passwordchecker;
import java.util.Scanner;

/**
 * @author Filip Kuzmanovski
 */
public class PasswordChecker 
{  
    public static void main(String[] args) 
    {  
        Scanner scnr = new Scanner(System.in);  
        System.out.print("Enter your desired password: ");  
        String password = scnr.next();  
        if (isValid(password)) 
        {  
            System.out.println("Good Password");  
        } 
        else 
        {  
            System.out.println("Please try again");  
        }  
    }  
    public static boolean isValid(String password) {  
        //will return true if the pass has 3 characters, 1 upperCase character, and a Digit
        
        if (password.length() > 3) {   
            return false;  
        } else {      
            char F;
            boolean isUpperCase = false;
            int count = 0;   
            for (int i = 0; i < password.length(); i++) {  
            F = password.charAt(i);  
            if (Character.isUpperCase(F)) {          
                return true;  
            } else if (Character.isDigit(F)) {  
                count++;     
            }  
        }  
        if (count > 1)   {     
            return false;  
        }  
    }  
    return true;  
}  
}


